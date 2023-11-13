package com.example.crudEntity.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "tbl-autor")
public class Autor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long autorID;
    private String nombre;
    @Column(unique = true,nullable = false)
    private String contacto;

}
