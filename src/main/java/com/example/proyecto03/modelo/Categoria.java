package com.example.proyecto03.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="categoria")
public class Categoria {


	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idcategoria;	
	@Column (name="nombrecategoria" , length = 50)
	private String nombrecategoria;
	@Column (name="descripcion" , length = 50)
	private String descripcion;

	
	public Categoria() {

	}

	public Categoria(int idcategoria, String nombrecategoria, String descripcion) {
		super();
		this.idcategoria = idcategoria;
		this.nombrecategoria = nombrecategoria;
		this.descripcion = descripcion;
	
	}

	public int getIdcategoria() {
		return idcategoria;
	}

	public void setN_cuenta(int idcategoria) {
		this.idcategoria = idcategoria;
	}

	public String getNombrecategoria() {
		return nombrecategoria;
	}

	public void setNombre(String nombrecategoria) {
		this.nombrecategoria = nombrecategoria;
	}
	
	public String getDescripcion() {
		return descripcion;
	}

	public void setApellido(String descripcion) {
		this.descripcion = descripcion;
	}


}
