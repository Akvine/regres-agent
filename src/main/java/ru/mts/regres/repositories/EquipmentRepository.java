package ru.mts.regres.repositories;

import io.quarkus.hibernate.orm.panache.PanacheRepository;
import ru.mts.regres.domain.entities.Equipment;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class EquipmentRepository implements PanacheRepository<Equipment> {
}
