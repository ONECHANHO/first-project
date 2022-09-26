package project.first.repository;

import project.first.domain.Write;

import java.util.List;
import java.util.Optional;

public class JdbcWriteRepository implements WriteRepository{
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
