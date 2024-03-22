package com.mescobar.geoapi.resource;

import com.mescobar.geoapi.model.UnidadeSaude;
import com.mescobar.geoapi.service.UnidadeSaudeService;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("unidades")
@AllArgsConstructor
public class UnidadeSaudeResource {

    private final UnidadeSaudeService service;

    @GetMapping
    public Page<UnidadeSaude> getCityPage(Pageable pageable) {
        return service.findAll(pageable);
    }
}
