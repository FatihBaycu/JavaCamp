package ECommerce.Entities.Concretes;

import ECommerce.Core.Entities.Entity;

public class Product implements Entity {
    private int id;
    private int categoryId;
    private String productName;
    private int unitsInStock;
    private double unitPrice;

    public Product() {}

    public Product(int id, int categoryId, String productName, int unitsInStock, double unitPrice) {
        this.id = id;
        this.categoryId = categoryId;
        this.productName = productName;
        this.unitsInStock = unitsInStock;
        this.unitPrice = unitPrice;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getUnitsInStock() {
        return unitsInStock;
    }

    public void setUnitsInStock(int unitsInStock) {
        this.unitsInStock = unitsInStock;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }
}
