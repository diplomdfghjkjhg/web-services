package com.example.stockservice.controller;

import com.example.stockservice.entity.Stock;
import com.example.stockservice.service.StockService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import javax.swing.plaf.synth.SynthRootPaneUI;
import java.util.List;

@RestController
@RequestMapping("/stocks")
@Slf4j
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class StockController {

    @Autowired
    private StockService stockService;

    @PostMapping("/")
    @Transactional
    public Stock saveStock(@RequestBody Stock stock) {
        log.info("Inside saveStock of StockController");
        return stockService.saveStock(stock);
    }

    @GetMapping("/{id}")
    @Transactional
    public Stock getUserWithDepartment(@PathVariable("id") Long stockId){
        log.info("Inside getUserWithDepartment of UserController");
        return stockService.findByStockId(stockId);
    }

    @GetMapping("/all")
    @Transactional
    public List<Stock> getAllStocks() {
        log.info("Inside getAllDepartments method of DepartmentController");
        return stockService.getAllStocks();
    }

}