package com.example.apiclientescrm.service;

import com.example.apiclientescrm.entities.ClienteEntity;
import com.example.apiclientescrm.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteService {

    private final ClienteRepository clienteRepository;

    @Autowired
    public ClienteService(ClienteRepository clienteRepository) {
        this.clienteRepository = clienteRepository;
    }

    public List<ClienteEntity> getClientes(){
        return clienteRepository.findAll();
    }

    public List<ClienteEntity> buscarClientesPorEmpresa(String empresa){
        return clienteRepository.findClientesByEmpresa(empresa);
    }

    public List<ClienteEntity> findClientesByNombreContaining(String nombre){
        return clienteRepository.findClientesByNombreContaining(nombre);
    }

    public ClienteEntity buscarPorID(Integer id){
        return clienteRepository.findById(id).orElse(null);
    }

}
