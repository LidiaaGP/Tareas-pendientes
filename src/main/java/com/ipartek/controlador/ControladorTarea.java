package com.ipartek.controlador;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ipartek.modelo.Tarea;
import com.ipartek.repositorio.TareasRepositorio;

@Controller
public class ControladorTarea {
	@Autowired
	private TareasRepositorio tareaRepositorio;
	
	@RequestMapping("/guardarTarea")
	public String agregarTarea(Tarea tarea)
	{

		tareaRepositorio.save(tarea);
		
		
		return "redirect:mostrar";
	}
	
	
	
	@PostMapping("/borrarTarea")
    public String borrarTarea(Tarea tarea) {

		tareaRepositorio.deleteById(tarea.getId());

        return "redirect:/mostrar";
    }
}