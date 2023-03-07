package com.example.demo.modelo;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name="producto")
public class Producto {
	
	@Id
	@SequenceGenerator(name="seq_prod", sequenceName = "seq_prod", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_prod")
	@Column(name="prod_id")
	private Integer id;
	@Column(name="prod_nombre")
	private String nombre;
	@Column(name="prod_codigo_barras_maestro")
	private Integer codigoBarrasMaestro; //no es la clave la primaria)
	@Column(name="prod_categoria")
	private String categoria;
	
	@OneToMany(mappedBy = "producto")
	private List<Inventario> inventarios;
	
	@Override
	public String toString() {
		return "Producto [id=" + id + ", nombre=" + nombre + ", codigoBarraMaestro=" + codigoBarrasMaestro
				+ ", categoria=" + categoria + "]";
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Integer getCodigoBarrasMaestro() {
		return codigoBarrasMaestro;
	}
	public void setCodigoBarrasMaestro(Integer codigoBarraMaestro) {
		this.codigoBarrasMaestro = codigoBarraMaestro;
	}
	public String getCategoria() {
		return categoria;
	}
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	public List<Inventario> getInventarios() {
		return inventarios;
	}
	public void setInventarios(List<Inventario> inventarios) {
		this.inventarios = inventarios;
	}
	
	
	
	
	
	
	
}
