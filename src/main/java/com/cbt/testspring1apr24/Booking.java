package com.cbt.testspring1apr24;

import jakarta.persistence.*;
import org.hibernate.annotations.ColumnDefault;

import java.time.LocalDate;

@Entity
@Table(name = "booking")
public class Booking {
    @Id
    @Column(name = "bookingnumber", nullable = false)
    private Integer bookingnumber;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "busnumber", nullable = false)
    private Busroutestation busnumber;

    @Column(name = "bookingdate", nullable = false)
    private LocalDate bookingdate;

    @Column(name = "source", nullable = false, length = 200)
    private String source;

    @Column(name = "destination", nullable = false, length = 200)
    private String destination;

    @ColumnDefault("1")
    @Column(name = "numberofseats", nullable = false)
    private Integer numberofseats;

    @ColumnDefault("PENDING")
    @Column(name = "status", length = 50)
    private String status;

    public Integer getBookingnumber() {
        return bookingnumber;
    }

    public void setBookingnumber(Integer bookingnumber) {
        this.bookingnumber = bookingnumber;
    }

    public Busroutestation getBusnumber() {
        return busnumber;
    }

    public void setBusnumber(Busroutestation busnumber) {
        this.busnumber = busnumber;
    }

    public LocalDate getBookingdate() {
        return bookingdate;
    }

    public void setBookingdate(LocalDate bookingdate) {
        this.bookingdate = bookingdate;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public Integer getNumberofseats() {
        return numberofseats;
    }

    public void setNumberofseats(Integer numberofseats) {
        this.numberofseats = numberofseats;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

}