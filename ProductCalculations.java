/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.product;

/**
 *
 * @author Student
 */
public class ProductCalculations implements IProductCalculations {
    private double price;
    public ProductCalculations(double price) {
        this.price = price;
    }
    public double GetVat() {
        return price * 0.15;
    }
    public double GetCommission() {
        return price * 0.05;
    }
    public double GetTotal() {
        return price + GetVat() + GetCommission();
    }
}
