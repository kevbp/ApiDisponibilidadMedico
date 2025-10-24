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
    private LocalDate fec;
    private LocalTime horIni;
    private LocalTime horFin;

    public DisponibilidadMedico() {
    }

    public DisponibilidadMedico(Long id, String codMedico, LocalDate fec, LocalTime horIni, LocalTime horFin) {
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

    public LocalDate getFec() {
        return fec;
    }

    public void setFec(LocalDate fec) {
        this.fec = fec;
    }

    public LocalTime getHorIni() {
        return horIni;
    }

    public void setHorIni(LocalTime horIni) {
        this.horIni = horIni;
    }

    public LocalTime getHorFin() {
        return horFin;
    }

    public void setHorFin(LocalTime horFin) {
        this.horFin = horFin;
    }
    
    
}
