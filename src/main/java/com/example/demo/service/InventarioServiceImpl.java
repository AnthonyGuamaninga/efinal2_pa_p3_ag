package com.example.demo.service;

import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.modelo.Bodega;
import com.example.demo.modelo.Inventario;
import com.example.demo.modelo.Producto;
import com.example.demo.repository.IBodegaRepo;
import com.example.demo.repository.IInventarioRepo;
import com.example.demo.repository.IProductoRepo;

@Service
public class InventarioServiceImpl implements IInventarioService {

	@Autowired
	private IInventarioRepo iInventarioRepo;
	@Autowired
	private IBodegaRepo bodegaRepo;
	@Autowired
	private IProductoRepo iProductoRepo;
	@Override
	public void ingresarInventario(String numeroBodega, Integer codigoProducto, Integer cantidad) {
		// TODO Auto-generated method stub
		Inventario inventario = new Inventario();
		Bodega bodega= this.bodegaRepo.buscarNumero(numeroBodega);
		Producto producto = this.iProductoRepo.buscarCodigo(codigoProducto);
		Random rd = new Random();
		inventario.setBodega(bodega);
		inventario.setProducto(producto);
		
		Integer codigoIndividual = producto.getCodigoBarrasMaestro()+rd.nextInt(0, 10000);
		inventario.setCodigoBarrasIndividual(codigoIndividual);
		
		inventario.setCantidad(cantidad);
		this.iInventarioRepo.insertar(inventario);
	}

}
