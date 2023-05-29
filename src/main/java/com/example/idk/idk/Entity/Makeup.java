package com.example.idk.idk.Entity;

import jakarta.persistence.*;

@Entity
@Table(name = "makeup")
public class Makeup {
    @Id
    @GeneratedValue
    @Column(name = "idmakeup")
    Long idmakeup;

    @Column(name = "pret")
    Double pret;

    @Column(name = "tip")
    String tip;

    @Column(name = "firma")
    String firma;

    @Column(name = "imagine")
    String imagine;

    public Long getIdmakeup() {
        return idmakeup;
    }

    public void setIdmakeup(Long idmakeup) {
        this.idmakeup = idmakeup;
    }

    public Double getPret() {
        return pret;
    }

    public void setPret(Double pret) {
        this.pret = pret;
    }

    public String getTip() {
        return tip;
    }

    public void setTip(String tip) {
        this.tip = tip;
    }

    public String getFirma() {
        return firma;
    }

    public void setFirma(String firma) {
        this.firma = firma;
    }

    public String getImagine() {
        return imagine;
    }

    public void setImagine(String imagine) {
        this.imagine = imagine;
    }
}
