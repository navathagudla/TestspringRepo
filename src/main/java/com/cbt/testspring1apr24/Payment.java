package com.cbt.testspring1apr24;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.time.LocalDate;

@Entity
@Table(name = "payment")
public class Payment {
    @Id
    @Column(name = "bookingid", nullable = false)
    private Integer id;

    @Column(name = "paymentamount")
    private Integer paymentamount;

    @Column(name = "paymentdate")
    private LocalDate paymentdate;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getPaymentamount() {
        return paymentamount;
    }

    public void setPaymentamount(Integer paymentamount) {
        this.paymentamount = paymentamount;
    }

    public LocalDate getPaymentdate() {
        return paymentdate;
    }

    public void setPaymentdate(LocalDate paymentdate) {
        this.paymentdate = paymentdate;
    }

}