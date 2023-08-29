package org.launchcode;

public class MenuItem {
    private String name;
    private String description;
    private String category;
    private double price;
    private boolean isNew = false;

    public MenuItem(String name, String description, String category, double price, boolean isNew) {
        this.name = name;
        this.description = description;
        this.category = category;
        this.price = price;
        this.isNew = isNew;
    }

    public String getName() {
        return name;
    }
    public String getDescription() {
        return description;
    }
    public String getCategory() {
        return category;
    }


    public void setName(String name) {
        this.name = name;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public void setCategory(String category) {
        this.category = category;
    }

    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public boolean isNew() {
        return isNew;
    }


}



//Each menu item has a price, description, and category (appetizer, main course, or dessert)
//It should be possible to display whether a menu item is new or not

//4 fields: name string, price double, description string,  category string , new boolean

//fields private, getters public, setters default (needed by main & menu?)

//4 getters

//3 setters, new: other method (when item is added?)
