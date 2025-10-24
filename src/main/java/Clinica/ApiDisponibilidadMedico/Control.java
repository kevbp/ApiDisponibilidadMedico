/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clinica.ApiDisponibilidadMedico;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author broncake
 */
@RestController
@RequestMapping("/disponibilidad")
public class Control {
    
    @Autowired
    private Servicio serv;
    
    @PostMapping("/grabar")
    public DisponibilidadMedico grabar(@RequestBody DisponibilidadMedico dis) {
        return serv.grabar(dis);
    }

    @GetMapping("/buscar/{id}")
    public DisponibilidadMedico buscar(@PathVariable Long id) {
        return serv.buscar(id);
    }

    @GetMapping("/listar")
    public List<DisponibilidadMedico> listar() {
        return serv.listar();
    }

    @PostMapping("/actualizar/{id}")
    public DisponibilidadMedico actualizar(@PathVariable Long id, @RequestBody DisponibilidadMedico dis) {
        return serv.actualizar(id, dis);
    }

    @DeleteMapping("/eliminar/{id}")
    public void eliminar(@PathVariable Long id) {
        serv.eliminar(id);;
    }
    
}
