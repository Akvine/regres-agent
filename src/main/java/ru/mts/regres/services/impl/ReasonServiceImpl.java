package ru.mts.regres.services.impl;

import ru.mts.regres.domain.entities.Reason;
import ru.mts.regres.repositories.ReasonRepository;
import ru.mts.regres.services.ReasonService;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import java.util.List;

@ApplicationScoped
public class ReasonServiceImpl implements ReasonService {
    @Inject
    ReasonRepository reasonRepository;

    @Override
    public List<Reason> findAll() {
        return reasonRepository.findAll().list();
    }

    @Override
    public Reason findById(Long id) {
        return reasonRepository.findById(id);
    }

    @Override
    public boolean deleteById(Long id) {
        return reasonRepository.deleteById(id);
    }
}
