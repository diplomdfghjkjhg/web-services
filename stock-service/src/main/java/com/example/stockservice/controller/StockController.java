package com.example.stockservice.controller;

import com.example.stockservice.entity.Stock;
import com.example.stockservice.repository.StockRepository;
import com.example.stockservice.service.StockService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import javax.swing.plaf.synth.SynthRootPaneUI;
import java.util.List;
import java.util.Map;



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

    /*
    @GetMapping("/{id}")
    @Transactional
    public Stock getUserWithDepartment(@PathVariable("id") Long stockId){
        log.info("Inside getUserWithDepartment of UserController");
        return stockService.findByStockId(stockId);
    }*/
    @GetMapping("/all")
    @Transactional
    public List<Stock> getAllStocks() {
        log.info("Inside getAllDepartments method of DepartmentController");
        //@RequestParam(name = "stockNameShort", required = true, defaultValue = "B") String name;
        //Map<String, Object> model
        return stockService.getAllStocks();
    }
    @GetMapping("getModel")
    public String getModel(@RequestParam(name = "stockNameShort", required = true, defaultValue = "B") String name,
                           Map<String, Object> model
    ){
        model.put("stockNameShort", name);
    return "getModel";
    }

    @PostMapping
    public String add(@RequestParam String stockNameLong, @RequestParam String stockNameShort, @RequestParam Long price){
        Stock stock = new Stock(stockNameLong, stockNameShort, price);
        stockService.saveStock(stock);
        Iterable<Stock> stocks = stockService.findAll();
        //model.put("stocks", stocks);
        return "main";
    }

    @PostMapping("filter")
    public String Filter(@RequestParam String filter, Map<String, Object> model ){
        Iterable<Stock> stocks;

        if (filter != null && filter.isEmpty()){
            stocks = (Iterable<Stock>) stockService.findByStockNameShort(filter);
        }else{
            stocks = stockService.findAll();
        }
        model.put("stocks", stocks);
        return "main";
    }

}