/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clinica.ApiDisponibilidadMedico;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import java.time.LocalDate;
import java.time.LocalTime;



/**
 *
 * @author broncake
 */
@Entity
public class DisponibilidadMedico {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String codMedico;
    private String fec;
    private String horIni;
    private String horFin;

    public DisponibilidadMedico() {
    }

    public DisponibilidadMedico(Long id, String codMedico, String fec, String horIni, String horFin) {
        this.id = id;
        this.codMedico = codMedico;
        this.fec = fec;
        this.horIni = horIni;
        this.horFin = horFin;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCodMedico() {
        return codMedico;
    }

    public void setCodMedico(String codMedico) {
        this.codMedico = codMedico;
    }

    public String getFec() {
        return fec;
    }

    public void setFec(String fec) {
        this.fec = fec;
    }

    public String getHorIni() {
        return horIni;
    }

    public void setHorIni(String horIni) {
        this.horIni = horIni;
    }

    public String getHorFin() {
        return horFin;
    }

    public void setHorFin(String horFin) {
        this.horFin = horFin;
    }

}
