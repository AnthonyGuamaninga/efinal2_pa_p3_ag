package com.example.demo.modelo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name="inventario")
public class Inventario {
	@Id
	@SequenceGenerator(name="seq_inve", sequenceName = "seq_inve", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_inve")
	@Column(name="inve_codigo_barras_individual")
	private Integer codigoBarrasIndividual;
	@Column(name="inve_cantidad")
	private Integer cantidad;
	
	@ManyToOne
	@JoinColumn(name = "inve_id_producto")
	private Producto producto;
	
	@ManyToOne
	@JoinColumn(name = "inve_id_bodega")
	private Bodega bodega;

	
	
	@Override
	public String toString() {
		return "Inventario [codigoBarrasIndividual=" + codigoBarrasIndividual + ", producto=" + producto + ", bodega="
				+ bodega + "]";
	}

	public Integer getCodigoBarrasIndividual() {
		return codigoBarrasIndividual;
	}

	public void setCodigoBarrasIndividual(Integer codigoBarrasIndividual) {
		this.codigoBarrasIndividual = codigoBarrasIndividual;
	}

	public Producto getProducto() {
		return producto;
	}

	public void setProducto(Producto producto) {
		this.producto = producto;
	}

	public Bodega getBodega() {
		return bodega;
	}

	public void setBodega(Bodega bodega) {
		this.bodega = bodega;
	}

	public Integer getCantidad() {
		return cantidad;
	}

	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}
	
	

}
