package com.ingsoftware.sdmd.modelo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class DetallePedido {

    private String idMedicamento;
    private String nombre;
    private Integer cantidad;
    private Double precio;
    private Double subtotal;

}