package com.mescobar.geoapi.service;

import com.mescobar.geoapi.model.UnidadeSaude;
import com.mescobar.geoapi.repository.UnidadeSaudeRepository;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class UnidadeSaudeService {

    private final UnidadeSaudeRepository repository;

    public Page<UnidadeSaude> findAll(Pageable page) {
        return repository.findAll(page);
    }
}
