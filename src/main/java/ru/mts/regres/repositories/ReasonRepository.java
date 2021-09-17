package ru.mts.regres.repositories;

import io.quarkus.hibernate.orm.panache.PanacheRepository;
import ru.mts.regres.domain.entities.Reason;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class ReasonRepository implements PanacheRepository<Reason> {
}
