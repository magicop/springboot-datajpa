package com.bolsadeideas.springboot.app.models.dao;

import java.util.List;
import java.util.Optional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.bolsadeideas.springboot.app.models.entity.Cliente;

/* Bean de acceso a datos */


public class ClienteDaoImpl implements IClienteDao {

	/* Realiza todas las peticiones a la base de datos a través de objetos */
	@PersistenceContext
	private EntityManager em;
	
	/* Recomendado por Eclipse */
	@SuppressWarnings("unchecked")
	/* Método transaccional y solo de lectura ya que es una consulta, si es insert se puede omitir */
	@Transactional(readOnly=true)
	/* Método de la interfaz que es obligatorio */
	@Override
	public List<Cliente> findAll() {
		// TODO Auto-generated method stub
		return em.createQuery("from Cliente").getResultList();
	}

	@Override
	public <S extends Cliente> S save(S entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Cliente> Iterable<S> saveAll(Iterable<S> entities) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<Cliente> findById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean existsById(Long id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Iterable<Cliente> findAllById(Iterable<Long> ids) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public long count() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void deleteById(Long id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Cliente entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll(Iterable<? extends Cliente> entities) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub
		
	}


}
