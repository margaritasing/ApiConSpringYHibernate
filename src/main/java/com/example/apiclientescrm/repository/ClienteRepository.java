package com.example.apiclientescrm.repository;

import com.example.apiclientescrm.entities.ClienteEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ClienteRepository extends JpaRepository<ClienteEntity, Integer>{

    List<ClienteEntity> findClientesByEmpresa(String empresa);

    List<ClienteEntity> findClientesByNombreContaining(String nombre);

}
