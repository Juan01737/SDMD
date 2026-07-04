package com.ingsoftware.sdmd.modelo;


import com.google.firebase.firestore.GeoPoint;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Farmacia {

    private String idFarmacia;
    private String nombre;
    private String direccion;
    private String telefono;
    private String correo;
    private GeoPoint ubicacion;

}