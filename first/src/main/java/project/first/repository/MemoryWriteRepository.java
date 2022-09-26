package project.first.repository;

import project.first.domain.Write;

import java.util.List;
import java.util.Optional;

//세션 미부여. 비회원도 글쓰기 가능

public class MemoryWriteRepository implements WriteRepository{

    private static long sequence_ID = 0L;

    @Override
    public Write save(Write write) {
        write.setId(++sequence_ID);
        write.setTitle(write.getTitle());
        write.setDetail(write.getDetail());
        return write;
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
