package com.ipartek.repositorio;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.ipartek.modelo.Prioridad;

public interface PrioridadesRepositorio extends JpaRepository<Prioridad, Integer>{
	@Query(value = "SELECT * FROM prioridades",nativeQuery = true)
	List<Prioridad> obtenerTodasPrioridades();
}
