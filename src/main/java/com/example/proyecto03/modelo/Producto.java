package com.example.proyecto03.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="producto")
public class Producto {
	

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;	
	@Column (name="nombreProducto" , length = 50)
	private String nombreProducto;
	@Column (name="idProveedor" , length = 50)
	private String idProveedor;
	@Column (name="idCategoria" , length = 50)
	private String idCategoria;
	@Column (name="cantidadPorUnidad" , length = 50)
	private String cantidadPorUnidad;
	@Column (name="precioUnidad" , length = 50)
	private String precioUnidad;
	
	

	
	public Producto() {

	}

	public Producto(int id, String nombreProducto, String idProveedor, String idCategoria, String cantidadPorUnidad, String precioUnidad) {
		super();
		this.id = id;
		this.nombreProducto = nombreProducto;
		this.idProveedor = idProveedor;
		this.idCategoria = idCategoria;
		this.cantidadPorUnidad = cantidadPorUnidad;
		this.precioUnidad = precioUnidad;
		
	}

	public int getIdproducto() {
		return id;
	}

	public void setN_cuenta(int id) {
		this.id = id;
	}

	public String getNombreProducto() {
		return nombreProducto;
	}

	public void setNombreProducto(String nombreProducto) {
		this.nombreProducto = nombreProducto;
	}
	
	public String getIdProveedor() {
		return idProveedor;
	}

	public void setIdProveedor(String idProveedor) {
		this.idProveedor = idProveedor;
	}
	
	public String getIdCategoria() {
		return idCategoria;
	}

	public void setIdCategoria(String idCategoria) {
		this.idCategoria = idCategoria;
	}
	
	public String getCantidadPorUnidad() {
		return cantidadPorUnidad;
	}

	public void setCantidadPorUnidad(String cantidadPorUnidad) {
		this.cantidadPorUnidad = cantidadPorUnidad;
	}
	
	public String getPrecioUnidad() {
		return cantidadPorUnidad;
	}

	public void setPrecioUnidad(String precioUnidad) {
		this.precioUnidad = precioUnidad;
	}


}
