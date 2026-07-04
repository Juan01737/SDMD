package com.ingsoftware.sdmd.modelo;


import com.google.firebase.Timestamp;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Pedido {

    private String idPedido;
    private String idUsuario;
    private Timestamp fecha;
    private String direccionEntrega;
    private Double total;
    private Double pesoTotal;
    private String estado;
    private String idDrone;
    private Boolean requiereReceta;

}