package com.todotic.demospringboots3.modelo;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Transient;

@Entity
@Data
@NoArgsConstructor
 public class Curso {
    @Id
    @GeneratedValue
    private Integer id;
    private String titulo,imagenPath;
    @Transient
    private String imagenUrl;

}
