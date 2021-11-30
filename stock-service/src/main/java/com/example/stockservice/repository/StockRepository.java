package com.example.stockservice.repository;

import com.example.stockservice.entity.Stock;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StockRepository extends CrudRepository<Stock, Long> {

    Stock findByStockId(Long stockId);
    Stock findByStockNameShort(String stockNameShort);
}
