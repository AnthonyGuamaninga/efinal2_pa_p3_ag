package com.example.demo.repository;

import com.example.demo.modelo.Producto;

public interface IProductoRepo {
	
	public void insertar(Producto producto);
	public void actualizar(Producto producto);
	public Producto buscar(Integer id);
	public void eliminar(Integer id);
	
	public Producto buscarCodigo(Integer codigo);

}
