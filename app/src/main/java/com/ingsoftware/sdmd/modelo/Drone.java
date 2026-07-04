package com.ingsoftware.sdmd.modelo;

import com.google.firebase.firestore.GeoPoint;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Drone {

    private String idDrone;
    private String codigo;
    private Double capacidadPeso;
    private Integer bateria;
    private String estado;
    private GeoPoint ubicacion;

}