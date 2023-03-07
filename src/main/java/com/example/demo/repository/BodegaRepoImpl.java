package com.example.demo.repository;

import javax.management.Query;

import org.springframework.stereotype.Repository;

import com.example.demo.modelo.Bodega;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class BodegaRepoImpl implements IBodegaRepo {

	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public void insertar(Bodega bodega) {
		// TODO Auto-generated method stub
		this.entityManager.persist(bodega);
	}

	@Override
	public void actualizar(Bodega bodega) {
		// TODO Auto-generated method stub
		this.entityManager.merge(bodega);
	}

	@Override
	public Bodega buscar(Integer id) {
		// TODO Auto-generated method stub
		return this.entityManager.find(Bodega.class, id);
	}

	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		this.entityManager.remove(this.buscar(id));
	}

	@Override
	public Bodega buscarNumero(String numero) {
		// TODO Auto-generated method stub
		TypedQuery<Bodega> query = this.entityManager.createQuery("select b from Bodega b where b.numero=:datoNumero",Bodega.class);
		query.setParameter("datoNumero", numero);
		return query.getSingleResult();
	}

}
