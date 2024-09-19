package com.cita.oladent.controller;

import com.cita.oladent.model.Cita;
import com.cita.oladent.service.CitaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class ViewController {

    private final CitaService citaService;

    @Autowired
    public ViewController(CitaService citaService) {
        this.citaService = citaService;
    }

    // Obtener todas las citas para mostrarlas en la vista
    @GetMapping("/citas")
    public String getAllCitas(Model model) {
        List<Cita> citas = citaService.getAllCitas();
        model.addAttribute("citas", citas);
        return "citas";
    }

    // Mostrar el formulario para crear una nueva cita
    @GetMapping("/citas/new")
    public String createCitaForm(Model model) {
        model.addAttribute("cita", new Cita());
        return "create_cita";
    }
}
