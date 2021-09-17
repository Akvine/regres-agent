package ru.mts.regres.services;

import ru.mts.regres.domain.entities.Request;

import java.util.List;

public interface RequestService {
    List<Request> findAll();

    Request findById(Long id);

    boolean deleteById(Long id);
}
