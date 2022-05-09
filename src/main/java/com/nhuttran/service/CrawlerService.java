/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.nhuttran.service;

import com.nhuttran.pojos.Product;
import java.util.List;

/**
 *
 * @author Asus
 */
public interface CrawlerService {
    List<Product> crawData(String keyword);
    boolean addDataByCrawing(List<Product> productList);
}
