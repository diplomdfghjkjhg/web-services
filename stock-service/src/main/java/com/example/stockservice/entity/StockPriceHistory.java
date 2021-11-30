package com.example.stockservice.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class StockPriceHistory {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long HistoryId;
    private String date;
    private Integer price;
    private Integer StockId;
}
