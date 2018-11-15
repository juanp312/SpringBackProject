package com.BackProject.BackProject.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Identification")
public class Identification {

    @Id
    @Column(name = "risk_id")
    private String risk_id;

    @Column(name = "risk")
    private String risk;

    @Column(name = "code")
    private String code;

    @Column(name = "procedure")
    private String procedure;

    @Column(name = "DESCRIPCION")
    private String descripcion;

    @Column(name = "cause")
    private String cause;

    @Column(name = "description")
    private String description;

    @Column(name = "related_risks")
    private String related_risks;

    @Column(name = "risk_factors")
    private String risk_factors;


    public String getRisk_id() {
        return risk_id;
    }

    public void setRisk_id(String risk_id) {
        this.risk_id = risk_id;
    }

    public String getRisk() {
        return risk;
    }

    public void setRisk(String risk) {
        this.risk = risk;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getProcedure() {
        return procedure;
    }

    public void setProcedure(String procedure) {
        this.procedure = procedure;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getCause() {
        return cause;
    }

    public void setCause(String cause) {
        this.cause = cause;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getRelated_risks() {
        return related_risks;
    }

    public void setRelated_risks(String related_risks) {
        this.related_risks = related_risks;
    }

    public String getRisk_factors() {
        return risk_factors;
    }

    public void setRisk_factors(String risk_factors) {
        this.risk_factors = risk_factors;
    }

    @Override
    public String toString() {
        return "Identification{" +
                "risk_id='" + risk_id + '\'' +
                ", risk='" + risk + '\'' +
                ", code='" + code + '\'' +
                ", procedure='" + procedure + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", cause='" + cause + '\'' +
                ", description='" + description + '\'' +
                ", related_risks='" + related_risks + '\'' +
                ", risk_factors='" + risk_factors + '\'' +
                '}';
    }
}




