package com.example.mspedidoservice.dto;

import lombok.Data;

@Data
public class Client {
    private Integer id;
    private String nombre;
    private String dni;
    private String direccion;
    private Integer telefono;
}
