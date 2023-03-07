package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.modelo.Producto;
import com.example.demo.service.IProductoService;

@Controller
@RequestMapping("/productos")
public class ProductoController {
	
	@Autowired
	private IProductoService iProductoService;
	
	@GetMapping("/nuevoProducto")
	public String nuevaBodega(Producto producto) {
		return "vistaNuevoProducto";
	}
	
	@PostMapping("/insertar")
	public String insertar(Producto producto) {
		this.iProductoService.crearProducto(producto);
		return "vistaGuardado";
	}


}
