package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.modelo.Bodega;
import com.example.demo.modelo.Inventario;
import com.example.demo.service.IBodegaService;
import com.example.demo.service.IInventarioService;

@Controller
@RequestMapping("/inventarios")
public class InventarioController {
	
	@Autowired
	private IInventarioService iInventarioService;
	
	@GetMapping("/ingresarInventario")
	public String ingresarInventario(Bodega bodega) {
		return "vistaIngresarInventario";
	}
	
	@PostMapping("/insertar")
	public String insertar(Inventario inventario) {
		this.iInventarioService.ingresarInventario(inventario.getBodega().getNumero(), inventario.getProducto().getCodigoBarrasMaestro(), inventario.getCantidad());
		return "vistaGuardado";
	}


}
