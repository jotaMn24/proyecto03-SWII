package idat.com.demo.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "proveedores")
public class Proveedores {
	@Id
    @Column(name ="idProveedor")
	private int idProveedor;
	@Column(name = "nombreCompania")
	private String nombreCompania;
	@Column(name = "nombrecontacto")
	private String nombrecontacto;
	@Column(name = "cargocontacto")
	private String cargocontacto;
	@Column(name = "direccion")
	private String direccion;
	@Column(name = "ciudad")
	private String ciudad;
	@Column(name = "region")
	private String region;
	@Column(name = "codPostal")
	private String codPostal;
	@Column(name = "pais")
	private String pais;
	@Column(name = "telefono")
	private String telefono;
	@Column(name = "fax")
	private String fax;
	@Column(name = "paginaprincipal")
	private String paginaprincipal;

	public Proveedores() {
		super();
	}

	public Proveedores(int idProveedor, String nombreCompania, String nombrecontacto, String cargocontacto,
			String direccion, String ciudad, String region, String codPostal, String pais, String telefono, String fax,
			String paginaprincipal) {
		super();
		this.idProveedor = idProveedor;
		this.nombreCompania = nombreCompania;
		this.nombrecontacto = nombrecontacto;
		this.cargocontacto = cargocontacto;
		this.direccion = direccion;
		this.ciudad = ciudad;
		this.region = region;
		this.codPostal = codPostal;
		this.pais = pais;
		this.telefono = telefono;
		this.fax = fax;
		this.paginaprincipal = paginaprincipal;
	}

	public int getIdProveedor() {
		return idProveedor;
	}

	public void setIdProveedor(int idProveedor) {
		this.idProveedor = idProveedor;
	}

	public String getNombreCompania() {
		return nombreCompania;
	}

	public void setNombreCompania(String nombreCompania) {
		this.nombreCompania = nombreCompania;
	}

	public String getNombrecontacto() {
		return nombrecontacto;
	}

	public void setNombrecontacto(String nombrecontacto) {
		this.nombrecontacto = nombrecontacto;
	}

	public String getCargocontacto() {
		return cargocontacto;
	}

	public void setCargocontacto(String cargocontacto) {
		this.cargocontacto = cargocontacto;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	public String getCodPostal() {
		return codPostal;
	}

	public void setCodPostal(String codPostal) {
		this.codPostal = codPostal;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getFax() {
		return fax;
	}

	public void setFax(String fax) {
		this.fax = fax;
	}

	public String getPaginaprincipal() {
		return paginaprincipal;
	}

	public void setPaginaprincipal(String paginaprincipal) {
		this.paginaprincipal = paginaprincipal;
	}

}
