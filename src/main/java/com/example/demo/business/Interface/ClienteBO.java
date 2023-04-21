package com.example.demo.business.Interface;

import com.example.demo.entity.ClienteTO;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface ClienteBO {

    Optional<ClienteTO> getById(Long id);

    List<ClienteTO> getAll();

    ClienteTO save(ClienteTO clienteTO);

    void delete(Long id);
}
