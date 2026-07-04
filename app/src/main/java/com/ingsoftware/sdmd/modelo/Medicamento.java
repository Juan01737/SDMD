package com.ingsoftware.sdmd.modelo;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Medicamento {

    private String idMedicamento;
    private String nombre;
    private String descripcion;
    private String categoria;
    private Double precio;
    private Integer stock;
    private Boolean requiereReceta;
    private Double peso;
    private String imagen;
    private String farmacia;

}