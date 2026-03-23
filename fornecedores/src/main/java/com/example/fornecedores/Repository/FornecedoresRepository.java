package com.example.fornecedores.Repository;

import com.example.fornecedores.Model.FornecedoresModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FornecedoresRepository extends JpaRepository<FornecedoresModel, Long> {
}
