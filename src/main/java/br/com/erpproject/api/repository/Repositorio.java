package br.com.erpproject.api.repository;

import org.springframework.data.repository.CrudRepository;

import br.com.erpproject.api.model.Client;


public interface Repositorio extends CrudRepository<Client, Long>{
    
}
