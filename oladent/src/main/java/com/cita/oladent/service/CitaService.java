package com.cita.oladent.service;

import com.cita.oladent.model.Cita;
import com.cita.oladent.repository.CitaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CitaService {

    private final CitaRepository citaRepository;

    @Autowired
    public CitaService(CitaRepository citaRepository) {
        this.citaRepository = citaRepository;
    }

    public List<Cita> getAllCitas() {
        return citaRepository.findAll();
    }

    public Cita saveCita(Cita cita) {
        return citaRepository.save(cita);
    }

    public void deleteCita(Long id) {
        citaRepository.deleteById(id);
    }
}
