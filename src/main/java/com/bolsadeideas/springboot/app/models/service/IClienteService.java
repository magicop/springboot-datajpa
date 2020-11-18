package com.bolsadeideas.springboot.app.models.service;

import java.util.List;

import org.springframework.context.annotation.Primary;

import com.bolsadeideas.springboot.app.models.entity.Cliente;

@Primary
public interface IClienteService {
	
	public List<Cliente> findAll();

	public void save(Cliente cliente);
	
	public Cliente findOne(Long id);
	
	public void delete(Long id);
	
}
