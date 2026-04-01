public class Pizza {
    private String size;
    private String crust;
    private String sauce;
    private String toppings;
    private double price;

    // Constructor
    public Pizza(String size, String crust, String sauce, String toppings, double price) {
        this.size = size;
        this.crust = crust;
        this.sauce = sauce;
        this.toppings = toppings;
        this.price = price;
    }

    // Empty constructor
    public Pizza() {}

    // Getters & Setters
    public String getSize() { return size; }
    public void setSize(String size) { this.size = size; }

    public String getCrust() { return crust; }
    public void setCrust(String crust) { this.crust = crust; }

    public String getSauce() { return sauce; }
    public void setSauce(String sauce) { this.sauce = sauce; }

    public String getToppings() { return toppings; }
    public void setToppings(String toppings) { this.toppings = toppings; }

    public double getPrice() { return price; }
    public void setPrice(double price) { this.price = price; }

    @Override
    public String toString() {
        return "Pizza{" +
                "size='" + size + '\'' +
                ", crust='" + crust + '\'' +
                ", sauce='" + sauce + '\'' +
                ", toppings='" + toppings + '\'' +
                ", price=" + price +
                '}';
    }
}

