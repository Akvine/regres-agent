package ru.mts.regres.services;

import ru.mts.regres.domain.entities.Equipment;

import java.util.List;

public interface EquipmentService {
    List<Equipment> findAll();

    Equipment findById(Long id);

    boolean deleteById(Long id);
}
