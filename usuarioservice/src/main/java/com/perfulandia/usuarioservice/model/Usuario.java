package com.perfulandia.usuarioservice.model;

//Imports
import jakarta.persistence.*;
import lombok.*;


@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder //Me permite generar constructores más flexibles
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;
    private String correo;
    private String rol; //Tipos de rol: ADMIN, GERENTE, UN USUARIO
}
