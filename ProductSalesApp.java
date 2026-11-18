/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.product;

/**
 *
 * @author Student
 */
import java.util.Scanner;

public class ProductSalesApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        
        // The Single dimensional arrays
        
        
        String[] products = {"Cozy Nights Monarch", "Restonic Barbados", "Sealy Phuket"};
        // Q1.1: Two dimensional array [3 products][3 months]
        int[][] sales = new int[3][3];

        // This Captures - matches the Sample Screenshot exactly
        
        
        
        for (int i = 0; i < products.length; i++) {
            for (int month = 0; month < 3; month++) {
                System.out.print("Enter number of sales for month " + (month+1) + " for " + products[i] + " mattress: ");
                sales[i][month] = sc.nextInt();
            }
        }

       // We use Product class for logic
        
        Product productReport = new Product(sales, products);
        PrintProduct printer = new PrintProduct();

        int total = productReport.GetTotalProductsSold();
        double average = productReport.GetAverageProductsSold();
        String popular = productReport.GetMostPopularProduct();

        // Final Report - matches screenshot
        System.out.println("\n");
        System.out.println("PRODUCT SALES REPORT - 2026");
        System.out.println("");
        printer.printTotalProductSales(total);
        printer.printAverageProductSales(average);
        printer.printMostPopularProduct(popular);
    }
}
