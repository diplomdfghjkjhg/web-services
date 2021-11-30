package com.example.stockservice.service;

import com.example.stockservice.entity.Stock;
import com.example.stockservice.repository.StockRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class StockService {

    @Autowired
    private StockRepository stockRepository;

    public Stock saveStock(Stock stock) {
        log.info("Inside saveStock of StockService");
        return stockRepository.save(stock);
    }

    public Stock findByStockId(Long stockId){
        log.info("Inside findByStockId of StockService");
        return stockRepository.findByStockId(stockId);
    }

    public List<Stock> getAllStocks() {
        log.info("Inside getAllStocks of StockService");
        return (List<Stock>) stockRepository.findAll();
    }

    public Iterable<Stock> findAll() {
        return stockRepository.findAll();
    }
    public Stock findByStockNameShort(String stockNameShort){
        log.info("Inside findByStockId of StockService");
        return stockRepository.findByStockNameShort(stockNameShort);
    }
}
