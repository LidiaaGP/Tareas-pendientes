package com.ipartek.controlador;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import com.ipartek.modelo.Prioridad;
import com.ipartek.modelo.Tarea;
import com.ipartek.repositorio.PrioridadesRepositorio;
import com.ipartek.repositorio.TareasRepositorio;


@Controller
public class ControladorMenu {
	@Autowired
	private TareasRepositorio tareaRepositorio;
	
	@Autowired
	private PrioridadesRepositorio prioridadesRepositorio;
	
	@RequestMapping("/")
	public String cargarInicio(Tarea tarea, Prioridad prioridad, Model model) {
		List<Prioridad> listaprioridades=prioridadesRepositorio.obtenerTodasPrioridades();
		System.out.println(listaprioridades);
		model.addAttribute("prioridades",listaprioridades);
		return "agregar";
	}
	
	@RequestMapping("/mostrar")
	public String cargarMostrar(Model model) {
		List<Tarea> tareas=tareaRepositorio.obtenerTodasTareas();
		model.addAttribute("tareas",tareas);
		return "mostrar";
	}
	
	@RequestMapping("/agregar")
	public String cargarAgregar(Tarea tarea, Prioridad prioridad, Model model) {
		List<Prioridad> listaprioridades=prioridadesRepositorio.obtenerTodasPrioridades();
		System.out.println(listaprioridades);
		model.addAttribute("prioridades",listaprioridades);
		return "agregar";
	}
	

}
