package com.ipartek.repositorio;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.ipartek.modelo.Tarea;

@Repository
public interface TareasRepositorio extends JpaRepository<Tarea, Integer>{
	@Query(value = "SELECT * FROM tareas",nativeQuery = true)
	List<Tarea> obtenerTodasTareas();
}