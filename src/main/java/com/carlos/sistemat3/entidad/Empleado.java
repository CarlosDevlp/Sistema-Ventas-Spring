package com.carlos.sistemat3.entidad;
/*
 * @author Carlos Chavez Laguna
 * */

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="empleados")
public class Empleado {
	@Id
	@GeneratedValue
	@Column(name="idempl")
	private String id;
	
	@Column(name="nombreempl")
	private String nombres;
	
	@Column(name="apellidopaternoempl")
	private String apellidoPaterno;
	
	@Column(name="apellidomaternoempl")
	private String apellidoMaterno;
	
	@Column(name="dniempl")
	private String dni;
	
	@Column(name="sueldoempl")
	private float sueldo;
	
	@Column(name="telefonoempl")
	private String telefono;
	
	@Column(name="tipoempleados_idtipe")
	private int tipoEmpleadosId;
	
	@ManyToOne
	@JoinColumn(name="user_iduser")
	private User user;
	
	@Column(name="estadostablas_idestadostabla")
	private int estadoId;

	
	
	/**
	 * 
	 */
	public Empleado() {
		super();
	}



	/**
	 * @param id
	 * @param nombres
	 * @param apellidoPaterno
	 * @param apellidoMaterno
	 * @param dni
	 * @param sueldo
	 * @param telefono
	 * @param tipoEmpleadosId
	 * @param user
	 * @param estadoId
	 */
	public Empleado(String id, String nombres, String apellidoPaterno, String apellidoMaterno, String dni, float sueldo,
			String telefono, int tipoEmpleadosId, User user, int estadoId) {
		super();
		this.id = id;
		this.nombres = nombres;
		this.apellidoPaterno = apellidoPaterno;
		this.apellidoMaterno = apellidoMaterno;
		this.dni = dni;
		this.sueldo = sueldo;
		this.telefono = telefono;
		this.tipoEmpleadosId = tipoEmpleadosId;
		this.user = user;
		this.estadoId = estadoId;
	}



	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}



	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}



	/**
	 * @return the nombres
	 */
	public String getNombres() {
		return nombres;
	}



	/**
	 * @param nombres the nombres to set
	 */
	public void setNombres(String nombres) {
		this.nombres = nombres;
	}



	/**
	 * @return the apellidoPaterno
	 */
	public String getApellidoPaterno() {
		return apellidoPaterno;
	}



	/**
	 * @param apellidoPaterno the apellidoPaterno to set
	 */
	public void setApellidoPaterno(String apellidoPaterno) {
		this.apellidoPaterno = apellidoPaterno;
	}



	/**
	 * @return the apellidoMaterno
	 */
	public String getApellidoMaterno() {
		return apellidoMaterno;
	}



	/**
	 * @param apellidoMaterno the apellidoMaterno to set
	 */
	public void setApellidoMaterno(String apellidoMaterno) {
		this.apellidoMaterno = apellidoMaterno;
	}



	/**
	 * @return the dni
	 */
	public String getDni() {
		return dni;
	}



	/**
	 * @param dni the dni to set
	 */
	public void setDni(String dni) {
		this.dni = dni;
	}



	/**
	 * @return the sueldo
	 */
	public float getSueldo() {
		return sueldo;
	}



	/**
	 * @param sueldo the sueldo to set
	 */
	public void setSueldo(float sueldo) {
		this.sueldo = sueldo;
	}



	/**
	 * @return the telefono
	 */
	public String getTelefono() {
		return telefono;
	}



	/**
	 * @param telefono the telefono to set
	 */
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}



	/**
	 * @return the tipoEmpleadosId
	 */
	public int getTipoEmpleadosId() {
		return tipoEmpleadosId;
	}



	/**
	 * @param tipoEmpleadosId the tipoEmpleadosId to set
	 */
	public void setTipoEmpleadosId(int tipoEmpleadosId) {
		this.tipoEmpleadosId = tipoEmpleadosId;
	}



	/**
	 * @return the user
	 */
	public User getUser() {
		return user;
	}



	/**
	 * @param user the user to set
	 */
	public void setUser(User user) {
		this.user = user;
	}



	/**
	 * @return the estadoId
	 */
	public int getEstadoId() {
		return estadoId;
	}



	/**
	 * @param estadoId the estadoId to set
	 */
	public void setEstadoId(int estadoId) {
		this.estadoId = estadoId;
	}
	
	
	
}
