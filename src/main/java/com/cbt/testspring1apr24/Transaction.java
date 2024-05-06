package com.cbt.testspring1apr24;

import jakarta.persistence.*;
import org.hibernate.annotations.ColumnDefault;

import java.time.LocalTime;

@Entity
@Table(name = "transaction")
public class Transaction {
    @Id
    @Column(name = "transactionid", nullable = false)
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "busnumber")
    private Busroutestation busnumber;

    @ColumnDefault("20")
    @Column(name = "totalseats", nullable = false)
    private Integer totalseats;

    @Column(name = "availableseats")
    private Integer availableseats;

    @ColumnDefault("0")
    @Column(name = "bookedseats", nullable = false)
    private Integer bookedseats;

    @Column(name = "lastupdated", nullable = false)
    private LocalTime lastupdated;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Busroutestation getBusnumber() {
        return busnumber;
    }

    public void setBusnumber(Busroutestation busnumber) {
        this.busnumber = busnumber;
    }

    public Integer getTotalseats() {
        return totalseats;
    }

    public void setTotalseats(Integer totalseats) {
        this.totalseats = totalseats;
    }

    public Integer getAvailableseats() {
        return availableseats;
    }

    public void setAvailableseats(Integer availableseats) {
        this.availableseats = availableseats;
    }

    public Integer getBookedseats() {
        return bookedseats;
    }

    public void setBookedseats(Integer bookedseats) {
        this.bookedseats = bookedseats;
    }

    public LocalTime getLastupdated() {
        return lastupdated;
    }

    public void setLastupdated(LocalTime lastupdated) {
        this.lastupdated = lastupdated;
    }

}