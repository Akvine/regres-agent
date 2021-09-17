package ru.mts.regres.repositories;

import io.quarkus.hibernate.orm.panache.PanacheRepository;
import ru.mts.regres.domain.entities.Request;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class RequestRepository implements PanacheRepository<Request> {
    public RequestRepository() {
        Request request = new Request();
        request.setClaimId("4");
        request.setName("testName");

        this.persist(request);
    }
}
