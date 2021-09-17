package ru.mts.regres.domain.entities;

import javax.persistence.*;
import java.math.BigInteger;

@Entity
public class Reason {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private BigInteger id;

    public Reason() {}

    public Reason(String reasonType, String reasonDate, Equipment equipment) {
        this.reasonType = reasonType;
        this.reasonDate = reasonDate;
        this.equipment = equipment;
    }

    @Column(name = "reason_type")
    private String reasonType; // Тип основания

    @Column(name = "reason_date")
    private String reasonDate; // Дата основания

    @ManyToOne
    private Equipment equipment;

    public Equipment getEquipment() {
        return equipment;
    }

    public void setEquipment(Equipment equipment) {
        this.equipment = equipment;
    }

    public String getReasonType() {
        return reasonType;
    }

    public void setReasonType(String reasonType) {
        this.reasonType = reasonType;
    }

    public String getReasonDate() {
        return reasonDate;
    }

    public void setReasonDate(String reasonDate) {
        this.reasonDate = reasonDate;
    }
}
