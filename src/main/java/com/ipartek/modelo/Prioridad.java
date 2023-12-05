package com.ipartek.modelo;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "prioridades")
public class Prioridad {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private int id;

	@Column(name="prioridad")
	private String prioridad;

	public Prioridad(int id, String prioridad) {
	super();
	this.id = id;
	this.prioridad = prioridad;
	}

	public Prioridad() {
	super();
	this.id = 0;
	this.prioridad = "";
	}

	public int getId() {
	return id;
	}

	public void setId(int id) {
	this.id = id;
	}

	public String getPrioridad() {
	return prioridad;
	}
	
	
	
	
}
