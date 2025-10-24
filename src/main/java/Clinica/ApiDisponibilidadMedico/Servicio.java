/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clinica.ApiDisponibilidadMedico;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author broncake
 */
@Service
public class Servicio {

    @Autowired
    private Repositorio repo;

    public DisponibilidadMedico grabar(DisponibilidadMedico dis) {
        return repo.save(dis);
    }

    public DisponibilidadMedico buscar(Long id) {
        return repo.findById(id).orElse(null);
    }

    public List<DisponibilidadMedico> listar() {
        return repo.findAll();
    }

    public DisponibilidadMedico actualizar(Long id, DisponibilidadMedico dis) {
        return repo.findById(id).map(existing -> {
        existing.setCodMedico(dis.getCodMedico());
        existing.setFec(dis.getFec());
        existing.setHorIni(dis.getHorIni());
        existing.setHorFin(dis.getHorFin());
        return repo.save(existing);
        }).orElse(null);
    }

    public void eliminar(Long id) {
        repo.deleteById(id);
    }
}
