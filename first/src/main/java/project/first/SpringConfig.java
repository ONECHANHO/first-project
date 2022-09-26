package project.first;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import project.first.repository.JdbcTemplateWriteRepository;
import project.first.repository.MemberRepository;
import project.first.repository.MemoryMemberRepository;
import project.first.repository.WriteRepository;
import project.first.service.MemberService;
import project.first.service.MemberServiceIplm;
import project.first.service.WriteService;

import javax.sql.DataSource;

@Configuration
public class SpringConfig {

    private DataSource dataSource;

    @Autowired
    public SpringConfig(DataSource dataSource){
        this.dataSource = dataSource;
    }

    @Bean
    public MemberService memberService(){
        return new MemberService(MemberRepository());
    }

    @Bean
    public MemberRepository memberRepository(){
//        return new MemoryMemberRepository();
        return new MemoryMemberRepository(dataSource);
    }

    @Bean
    public WriteService writeService(){
        return new WriteService(WriteRepository());
    }

    @Bean
    public WriteRepository writeRepository(){
        return new JdbcTemplateWriteRepository(dataSource);
    }
}
