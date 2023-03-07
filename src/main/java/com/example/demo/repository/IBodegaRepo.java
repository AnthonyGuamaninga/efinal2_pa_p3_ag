package com.example.demo.repository;

import com.example.demo.modelo.Bodega;

public interface IBodegaRepo {
	
	public void insertar(Bodega bodega);
	public void actualizar(Bodega bodega);
	public Bodega buscar(Integer id);
	public void eliminar(Integer id);
	
	public Bodega buscarNumero(String numero);

}
