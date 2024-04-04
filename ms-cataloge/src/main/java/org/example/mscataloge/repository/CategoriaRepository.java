package org.example.mscataloge.repository;

import org.example.mscataloge.entity.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoriaRepository extends JpaRepository<Categoria,Integer> {

}
