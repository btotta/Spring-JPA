package com.example.demo.business;

import com.example.demo.business.Interface.ClienteBO;
import com.example.demo.entity.ClienteTO;
import com.example.demo.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClienteBOImpl implements ClienteBO {

    @Autowired
    private ClienteRepository clienteRepository;

    @Override
    public Optional<ClienteTO> getById(Long id) {
        return clienteRepository.findById(id);
    }

    @Override
    public List<ClienteTO> getAll() {
        return clienteRepository.findAll();
    }

    @Override
    public ClienteTO save(ClienteTO clienteTO) {
        return clienteRepository.save(clienteTO);
    }

    @Override
    public void delete(Long id) {
        clienteRepository.deleteById(id);
    }


}
