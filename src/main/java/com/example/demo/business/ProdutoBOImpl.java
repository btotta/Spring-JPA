package com.example.demo.business;

import com.example.demo.business.Interface.ProdutoBO;
import com.example.demo.entity.ProdutoTO;
import com.example.demo.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProdutoBOImpl implements ProdutoBO{

    @Autowired
    private ProdutoRepository produtoRepository;

    @Override
    public List<ProdutoTO> getAll() {
        return produtoRepository.findAll();
    }

    @Override
    public Optional<ProdutoTO> getById(Long id) {
        return produtoRepository.findById(id);
    }

    @Override
    public ProdutoTO save(ProdutoTO produto) {
        return produtoRepository.save(produto);
    }

    @Override
    public void delete(Long id) {
        produtoRepository.deleteById(id);
    }
}
