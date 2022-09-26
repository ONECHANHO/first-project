package project.first.repository;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import project.first.domain.Write;

import javax.sql.DataSource;
import java.util.List;
import java.util.Optional;

@Repository
public class JdbcTemplateWriteRepository implements WriteRepository{

    private JdbcTemplate JdbcTemplate;

    public JdbcTemplateWriteRepository(DataSource dataSource) {
        JdbcTemplate = new JdbcTemplate(dataSource);
    }


    @Override
    public Write save(Write Write) {
        return null;
    }

    @Override
    public Optional<Write> findByCategory(Long category) {
        return Optional.empty();
    }

    @Override
    public List<Write> findAll() {
        return null;
    }

    @Override
    public List<Write> findByTitle() {
        return null;
    }
}
