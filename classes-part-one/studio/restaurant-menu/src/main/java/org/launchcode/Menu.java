package org.launchcode;
import java.util.ArrayList;
import java.util.Date;

public class Menu {
    private Date dateUpdated;
    private String restaurantName;
    private ArrayList<MenuItem> menuItems;

    public Menu(String restaurantName) {
        this.restaurantName = restaurantName;
    }


    public Date getDateUpdated() {
        return dateUpdated;
    }
    public String getRestaurantName() {
        return restaurantName;
    }
    public void setRestaurantName(String restaurantName) {
        this.restaurantName = restaurantName;
    }

    public ArrayList<MenuItem> getMenuItems() {
        return menuItems;
    }


}



//The menu consists of several menu items

//The app should know when the menu was last updated

//name, date updated, categories for menu items

//Date class for dateUpdated setter
//Date() : Creates date object representing current date and time.
//Date(int year, int month, int date)
