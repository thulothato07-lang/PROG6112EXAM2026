/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.product;

/**
 *
 * @author Student
 */
public class Product implements IProduct {
    

    private int[][] salesData; // [product][month]
    private String[] productNames;

    public Product(int[][] salesData, String[] productNames) {
        this.salesData = salesData;
        this.productNames = productNames;
    }

    @Override
    public int GetTotalProductsSold() {
        int total = 0;
        for (int i = 0; i < salesData.length; i++) {
            for (int j = 0; j < salesData[i].length; j++) {
                total += salesData[i][j];
            }
        }
        return total;
    }

    @Override
    public double GetAverageProductsSold() {
        int totalEntries = salesData.length * salesData[0].length; // 3x3 =9
        return (double) GetTotalProductsSold() / totalEntries;
    }

    @Override
    public String GetMostPopularProduct() {
        int maxTotal = -1;
        String popular = "";
        for (int i = 0; i < salesData.length; i++) {
            int productTotal = 0;
            for (int j = 0; j < salesData[i].length; j++) {
                productTotal += salesData[i][j];
            }
            if (productTotal > maxTotal) {
                maxTotal = productTotal;
                popular = productNames[i];
            }
        }
        return popular;
    }
    
    // Helper for PrintProduct
    
    public int getProductTotal(int productIndex){
        int total=0;
        for(int j=0;j<salesData[productIndex].length;j++) total+=salesData[productIndex][j];
        return total;
    }
}

