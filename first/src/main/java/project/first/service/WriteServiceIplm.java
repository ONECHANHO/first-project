package project.first.service;

import project.first.domain.Write;
import org.springframework.stereotype.Service;
import project.first.repository.WriteRepository;

@Service
public class WriteServiceIplm implements WriteService{

    private final WriteRepository writeRepository;

    public WriteServiceIplm(WriteRepository writeRepository) {
        this.writeRepository = writeRepository;
    }


    @Override
    public void submit(Write write) {
        writeRepository.save(write);
    }
}
