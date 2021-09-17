package ru.mts.regres.services.impl;

import ru.mts.regres.domain.entities.Equipment;
import ru.mts.regres.repositories.EquipmentRepository;
import ru.mts.regres.services.EquipmentService;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import java.util.List;

@ApplicationScoped
public class EquipmentServiceImpl implements EquipmentService {
    @Inject
    EquipmentRepository equipmentRepository;

    @Override
    public List<Equipment> findAll() {
        return equipmentRepository.findAll().list();
    }

    @Override
    public Equipment findById(Long id) {
        return equipmentRepository.findById(id);
    }

    @Override
    public boolean deleteById(Long id) {
        return equipmentRepository.deleteById(id);
    }
}
