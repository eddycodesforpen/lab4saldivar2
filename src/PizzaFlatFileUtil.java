public class PizzaFlatFileUtil {

    // Convert Pizza → Fixed-width string
    public static String toFixedFormatString(Pizza pizza) {
        return String.format("%-10s%-10s%-10s%-20s%-10.2f",
                pizza.getSize(),
                pizza.getCrust(),
                pizza.getSauce(),
                pizza.getToppings(),
                pizza.getPrice());
    }

    // Convert Fixed-width string → Pizza
    public static Pizza fromFixedFormatString(String line) {
        String size = line.substring(0, 10).trim();
        String crust = line.substring(10, 20).trim();
        String sauce = line.substring(20, 30).trim();
        String toppings = line.substring(30, 50).trim();
        double price = Double.parseDouble(line.substring(50, 60).trim());

        return new Pizza(size, crust, sauce, toppings, price);
    }
}