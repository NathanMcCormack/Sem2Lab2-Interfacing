package ie.atu;

public class Burger implements MenuItem{
    private String name;
    private String ingredients;
    private double price;

    public Burger(String name, double price, String ingredients){
        this.name = name;
        this.price = price;
        this.ingredients = ingredients;
    }

    @Override
    public String getName() {
        return null;
    }

    @Override
    public double getPrice() {
        return 0;
    }

    @Override
    public String getDescription() {
        return null;
    }
}
