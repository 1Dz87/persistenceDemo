package com.example.demo.persistence;

import com.example.demo.model.Cabriolet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CabrioletRepository extends JpaRepository<Cabriolet, Long> {
}
