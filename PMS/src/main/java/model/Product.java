package model;

import java.util.Date;

public class Product {
    public Product() {
    }
    public Product(String name) {
        this.name = name;
    }
    public Product(int productId,String name, Date dateSupplied, int quantityInStock, double unitPrice) {
        this.name = name;
        this.dateSupplied = dateSupplied;
        this.quantityInStock = quantityInStock;
        UnitPrice = unitPrice;
    }
    public void setProductId(int productId) {
        this.productId = productId;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setDateSupplied(Date dateSupplied) {
        this.dateSupplied = dateSupplied;
    }
    public void setQuantityInStock(int quantityInStock) {
        this.quantityInStock = quantityInStock;
    }
    public void setUnitPrice(double unitPrice) {
        UnitPrice = unitPrice;
    }
    public String getName() {
        return name;
    }
    public int getProductId() {
        return productId;
    }
    public Date getDateSupplied() {
        return dateSupplied;
    }
    public int getQuantityInStock() {
        return quantityInStock;
    }
    public double getUnitPrice() {
        return UnitPrice;
    }
    private int productId;
    private String name;
    private Date dateSupplied;
    private int quantityInStock;
    private  double  UnitPrice;
}
