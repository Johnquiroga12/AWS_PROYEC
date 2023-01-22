package com.todotic.demospringboots3.repositoryo;

import com.todotic.demospringboots3.modelo.Curso;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CursoRepositoryo extends JpaRepository<Curso, Integer> {
}
