package com.example.fornecedores.Service;

import com.example.fornecedores.Model.FornecedoresModel;
import com.example.fornecedores.Repository.FornecedoresRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FornecedoresService {

    @Autowired
    private FornecedoresRepository fornecedoresRepository;

    public List<FornecedoresModel> findAll(){
        return fornecedoresRepository.findAll();
    }

    public Optional<FornecedoresModel> buscarPorId(Long id){
        return fornecedoresRepository.findById(id);
    }

    public FornecedoresModel criarFornecedor(FornecedoresModel fornecedor){
        return fornecedoresRepository.save(fornecedor);
    }

    public void deletarFornecedor(Long id){
        fornecedoresRepository.deleteById(id);
    }
}