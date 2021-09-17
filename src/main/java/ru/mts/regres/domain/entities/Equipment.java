package ru.mts.regres.domain.entities;

import javax.persistence.*;
import java.math.BigInteger;
import java.util.List;

@Entity
public class Equipment {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private BigInteger id;

    @Column(name = "factory_number")
    private String factoryNumber; // Заводской (серийны, учётный) номер

    @Column(name = "additional_info")
    private String additionalInfo;

    public Equipment() {}

    @ManyToOne
    private Request request;

    @OneToMany(mappedBy = "equipment")
    private List<Reason> reasons;

    public String getFactoryNumber() {
        return factoryNumber;
    }

    public void setFactoryNumber(String factoryNumber) {
        this.factoryNumber = factoryNumber;
    }

    public String getAdditionalInfo() {
        return additionalInfo;
    }

    public void setAdditionalInfo(String additionalInfo) {
        this.additionalInfo = additionalInfo;
    }
}
