package com.cbt.testspring1apr24;

import jakarta.persistence.*;
import org.hibernate.annotations.ColumnDefault;

@Entity
@Table(name = "busroutestation")
public class Busroutestation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @ColumnDefault("nextval('busroutestation_busid_seq'")
    @Column(name = "busid", nullable = false)
    private Integer id;

    @Column(name = "busnumber", nullable = false)
    private Integer busnumber;

    @Column(name = "source", length = 200)
    private String source;

    @Column(name = "destination", length = 200)
    private String destination;

    @Column(name = "price")
    private Integer price;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getBusnumber() {
        return busnumber;
    }

    public void setBusnumber(Integer busnumber) {
        this.busnumber = busnumber;
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

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

}