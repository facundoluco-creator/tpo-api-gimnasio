package com.uade.tpo.marketplace_Deportivo.repository;

import com.uade.tpo.marketplace_Deportivo.entity.Producto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductoRepository extends JpaRepository<Producto, Long> {
}