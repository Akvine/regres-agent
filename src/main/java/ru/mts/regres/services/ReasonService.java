package ru.mts.regres.services;

import ru.mts.regres.domain.entities.Reason;

import java.util.List;

public interface ReasonService {
    List<Reason> findAll();

    Reason findById(Long id);

    boolean deleteById(Long id);
}
