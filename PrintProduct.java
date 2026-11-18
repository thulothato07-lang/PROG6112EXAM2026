/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.product;

/**
 *
 * @author Student
 */
public class PrintProduct {
    public void printTotalProductSales(int total) {
        System.out.println("TOTAL PRODUCT SALES: " + total);
    }
    public void printAverageProductSales(double average) {
        // Cast to int if you want 17 not 17.0 to match screenshot
        System.out.println("AVERAGE PRODUCT SALES: " + (int)average);
    }
    public void printMostPopularProduct(String product) {
        System.out.println("MOST POPULAR PRODUCT: " + product);
    }
}
