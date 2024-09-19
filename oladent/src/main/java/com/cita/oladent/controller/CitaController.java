package com.cita.oladent.controller;

import com.cita.oladent.model.Cita;
import com.cita.oladent.service.CitaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/citas")
public class CitaController {

    private final CitaService citaService;

    @Autowired
    public CitaController(CitaService citaService) {
        this.citaService = citaService;
    }

    // Guardar una nueva cita
    @PostMapping
    public String saveCita(@ModelAttribute("cita") Cita cita) {
        citaService.saveCita(cita);
        return "redirect:/citas";
    }

    // Eliminar una cita
    @GetMapping("/delete/{id}")
    public String deleteCita(@PathVariable Long id) {
        citaService.deleteCita(id);
        return "redirect:/citas";
    }
}
