package ie.atu;

public class OrderOnlineSystemApp {
    public static void main(String[] args){
        //Array or list of MenuItem objects
        MenuItem[] menuItems = new MenuItem[]{
                //Add menu items
        };

        //Display details of each menu item
        for (MenuItem menuItem : menuItems){
            //Print out the name, description and price for each item
        }

        //Calculate and display the total cost of the order
        double totalCost = 0;
        for (MenuItem menuItem : menuItems){
            //totalCost of all menuItem prices in an order
        }

        System.out.printf("Total Cost: €" + totalCost);

    }
}
