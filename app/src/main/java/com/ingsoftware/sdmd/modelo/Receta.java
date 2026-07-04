package com.ingsoftware.sdmd.modelo;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Receta {

    private String idReceta;
    private String idPedido;
    private String idUsuario;
    private String archivo;
    private String estado;
    private String observacion;

}