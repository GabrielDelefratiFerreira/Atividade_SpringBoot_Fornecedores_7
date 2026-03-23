package com.example.fornecedores.Controller;

import com.example.fornecedores.Model.FornecedoresModel;
import com.example.fornecedores.Service.FornecedoresService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "/fornecedores")
public class FornecedoresController {

    @Autowired
    private FornecedoresService fornecedoresService;

    @GetMapping
    public List<FornecedoresModel> listAll(){
        return fornecedoresService.findAll();
    }

    @GetMapping("/{id}")
    public Optional<FornecedoresModel> buscarPorId(@PathVariable Long id){
        return fornecedoresService.buscarPorId(id);
    }

    @PostMapping
    public FornecedoresModel criarForncedor(@RequestBody FornecedoresModel fornecedor){
        return fornecedoresService.criarFornecedor(fornecedor);
    }

    @DeleteMapping
    public void deletarFornecedor(@PathVariable Long id){
        fornecedoresService.deletarFornecedor(id);
    }
}