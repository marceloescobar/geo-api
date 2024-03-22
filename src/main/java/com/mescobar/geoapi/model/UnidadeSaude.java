package com.mescobar.geoapi.model;

import com.vividsolutions.jts.geom.Point;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity(name = "TBL_UBS")
public class UnidadeSaude {
    @Id
    @Column(name = "id")
    private long id;

    @Column(name = "`ENDERECO`")
    private String endereco;

    @Column(name = "`REGIONAL`")
    private String regional;

    @Column(columnDefinition = "geometry(Point,4326)")
    private Point geom;
}
