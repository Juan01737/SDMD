package com.ingsoftware.sdmd.modelo;


import com.google.firebase.Timestamp;
import com.google.firebase.firestore.GeoPoint;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Seguimiento {

    private String idSeguimiento;
    private String idPedido;
    private GeoPoint ubicacion;
    private Double velocidad;
    private Timestamp fechaHora;

}