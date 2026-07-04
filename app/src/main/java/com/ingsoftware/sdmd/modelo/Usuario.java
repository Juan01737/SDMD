package com.ingsoftware.sdmd.modelo;


import com.google.firebase.Timestamp;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Usuario {

    private String idUsuario;
    private String nombres;
    private String apellidos;
    private String correo;
    private String telefono;
    private String direccion;
    private String rol;
    private Timestamp fechaRegistro;

}