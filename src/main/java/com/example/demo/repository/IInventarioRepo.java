package com.example.demo.repository;

import com.example.demo.modelo.Inventario;

public interface IInventarioRepo {
	
	public void insertar(Inventario inventario);
	public void actualizar(Inventario inventario);
	public Inventario buscar(Integer codigo);
	public void eliminar(Integer codigo);

}
