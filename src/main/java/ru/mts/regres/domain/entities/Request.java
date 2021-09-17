package ru.mts.regres.domain.entities;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.math.BigInteger;
import java.util.List;

@Entity
public class Request {
    @Id
    @NotNull
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private BigInteger id;

    @Column(name = "name")
    private String name;

    @Column(name = "claim_id")
    private String claimId;

    @Column(name = "status_rkn")
    private String processingStatusMTS;

    public Request() {}

    @OneToMany(mappedBy = "request")
    private List<Equipment> equipments;

    public BigInteger getId() {
        return id;
    }

    public void setId(BigInteger id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClaimId() {
        return claimId;
    }

    public void setClaimId(String claimId) {
        this.claimId = claimId;
    }

    public String getProcessingStatusMTS() {
        return processingStatusMTS;
    }

    public void setProcessingStatusMTS(String processingStatusMTS) {
        this.processingStatusMTS = processingStatusMTS;
    }
}
