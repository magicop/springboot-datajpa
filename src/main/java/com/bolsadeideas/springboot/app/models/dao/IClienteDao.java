package com.bolsadeideas.springboot.app.models.dao;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.repository.CrudRepository;

import com.bolsadeideas.springboot.app.models.entity.Cliente;

@Qualifier("IClienteDao2")
public interface IClienteDao extends CrudRepository<Cliente, Long>{


}
