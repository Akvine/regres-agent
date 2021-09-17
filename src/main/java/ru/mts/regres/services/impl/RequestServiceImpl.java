package ru.mts.regres.services.impl;

import ru.mts.regres.domain.entities.Request;
import ru.mts.regres.repositories.RequestRepository;
import ru.mts.regres.services.RequestService;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import java.util.List;

@ApplicationScoped
public class RequestServiceImpl implements RequestService {
    @Inject
    RequestRepository requestRepository;

    @Override
    public List<Request> findAll() {
        return requestRepository.findAll().list();
    }

    @Override
    public Request findById(Long id) {
        return requestRepository.findById(id);
    }

    @Override
    public boolean deleteById(Long id) {
        return requestRepository.deleteById(id);
    }
}
