package idat.com.demo.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "productos")
public class Productos {
	@Id
	@Column(name="id")
	private int id;
	@Column(name = "nombreProducto")
	private String nombreProducto;
	@ManyToOne(optional = false)
	@JoinColumn(name = "idProveedor",referencedColumnName = "idProveedor")
	private Proveedores idProveedor;
	@ManyToOne(optional = false)
	@JoinColumn(name = "idCategoria",referencedColumnName = "idcategoria")
	private Categorias idCategoria;
	@Column(name = "cantidadPorUnidad")
	private String cantidadPorUnidad;
	@Column(name = "precioUnidad")
	private Double precioUnidad;

	public Productos() {
		super();
	}

	public Productos(int id, String nombreProducto, Proveedores idProveedor, Categorias idCategoria,
			String cantidadPorUnidad, Double precioUnidad) {
		super();
		this.id = id;
		this.nombreProducto = nombreProducto;
		this.idProveedor = idProveedor;
		this.idCategoria = idCategoria;
		this.cantidadPorUnidad = cantidadPorUnidad;
		this.precioUnidad = precioUnidad;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombreProducto() {
		return nombreProducto;
	}

	public void setNombreProducto(String nombreProducto) {
		this.nombreProducto = nombreProducto;
	}

	public Proveedores getIdProveedor() {
		return idProveedor;
	}

	public void setIdProveedor(Proveedores idProveedor) {
		this.idProveedor = idProveedor;
	}

	public Categorias getIdCategoria() {
		return idCategoria;
	}

	public void setIdCategoria(Categorias idCategoria) {
		this.idCategoria = idCategoria;
	}

	public String getCantidadPorUnidad() {
		return cantidadPorUnidad;
	}

	public void setCantidadPorUnidad(String cantidadPorUnidad) {
		this.cantidadPorUnidad = cantidadPorUnidad;
	}

	public Double getPrecioUnidad() {
		return precioUnidad;
	}

	public void setPrecioUnidad(Double precioUnidad) {
		this.precioUnidad = precioUnidad;
	}

	@Override
	public String toString() {
		return "Productos [id=" + id + ", nombreProducto=" + nombreProducto + ", idProveedor=" + idProveedor
				+ ", idCategoria=" + idCategoria + ", cantidadPorUnidad=" + cantidadPorUnidad + ", precioUnidad="
				+ precioUnidad + "]";
	}

}
