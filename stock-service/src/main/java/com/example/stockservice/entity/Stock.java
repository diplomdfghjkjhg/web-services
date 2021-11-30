package com.example.stockservice.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;
import java.util.Map;

@Entity
@Data
@AllArgsConstructor
//@NoArgsConstructor
public class Stock {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long stockId;
    private String stockNameLong;
    private String stockNameShort;
    private Long price;

    public Stock() {}

    public Stock(String stockNameLong, String stockNameShort, Long price) {
        this.stockNameLong = stockNameLong;
        this.stockNameShort = stockNameShort;
        this.price = price;
    }

    public Long getStockId() {
        return stockId;
    }

    public void setStockId(Long stockId) {
        this.stockId = stockId;
    }

    public String getStockNameLong() {
        return stockNameLong;
    }

    public void setStockNameLong(String stockNameLong) {
        this.stockNameLong = stockNameLong;
    }

    public String getStockNameShort() {
        return stockNameShort;
    }

    public void setStockNameShort(String stockNameShort) {
        this.stockNameShort = stockNameShort;
    }

    public Long getPrice() {
        return price;
    }

    public void setPrice(Long price) {
        this.price = price;
    }
}
