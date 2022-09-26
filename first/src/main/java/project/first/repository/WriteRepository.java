package project.first.repository;

import project.first.domain.Write;

import java.util.List;
import java.util.Optional;

public interface WriteRepository {
    Write save(Write Write);

    Optional<Write> findByCategory(Long category);

    List<Write> findAll();

    List<Write> findByTitle();
}
