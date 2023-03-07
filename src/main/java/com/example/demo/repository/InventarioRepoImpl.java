package com.example.demo.repository;

import org.springframework.stereotype.Repository;

import com.example.demo.modelo.Inventario;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
@Repository
@Transactional
public class InventarioRepoImpl implements IInventarioRepo {

	@PersistenceContext
	private EntityManager entityManager;
	@Override
	public void insertar(Inventario inventario) {
		// TODO Auto-generated method stub
		this.entityManager.persist(inventario);
	}

	@Override
	public void actualizar(Inventario inventario) {
		// TODO Auto-generated method stub
		this.entityManager.merge(inventario);
	}

	@Override
	public Inventario buscar(Integer codigo) {
		// TODO Auto-generated method stub
		return this.entityManager.find(Inventario.class, codigo);
	}

	@Override
	public void eliminar(Integer codigo) {
		// TODO Auto-generated method stub
		this.entityManager.remove(this.buscar(codigo));
	}

}
