package ie.atu;

public class OrderOnlineSystemApp {
    public static void main(String[] args){
        //Array or list of MenuItem objects
        MenuItem[] menuItems = new MenuItem[]{
                //Add menu items
                new Burger("Cheese Burger", 10.99, "Cheese, Beef, Tomato"),
                new Pizza("Pepperoni", 12.99, "Cheese, Pepperoni, Tomato"),
                new Salad("Caesar Salad", 8.99, "Lettuce, Chicken, Caesar Sauce"),
                new Desert("Chocolate brownie", 3.99, "Eggs, Flour, Cocoa Powder, Sugar")
        };

        //Display details of each menu item
        for (MenuItem menuItem : menuItems){
            //Print out the name, description and price for each item
            System.out.println("Name: " + menuItem.getName());
            System.out.println("Price: " + menuItem.getPrice());
            System.out.println("Description: " + menuItem.getDescription());
            System.out.println();
        }

        //Calculate and display the total cost of the order
        double totalCost = 0;
        for (MenuItem menuItem : menuItems){
            //totalCost of all menuItem prices in an order
            totalCost+= menuItem.getPrice();
        }

        System.out.printf("Total Cost: €" + totalCost);

    }
}
