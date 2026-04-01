import java.net.Socket;
import java.io.*;

public class PizzaSender {

    public static void main(String[] args) {
        try {
            Socket socket = new Socket("localhost", 5000);
            System.out.println("Connected to receiver.");

            PrintWriter writer = new PrintWriter(socket.getOutputStream(), true);

            // Create Pizza object
            Pizza pizza = new Pizza("Large", "Thin", "Tomato", "Cheese", 12.99);

            // Send flat file string
            String flatData = PizzaFlatFileUtil.toFixedFormatString(pizza);
            writer.println(flatData);
            System.out.println("Sent FLAT: " + flatData);

            // Send JSON string
            String jsonData = PizzaJsonUtil.toJson(pizza);
            writer.println(jsonData);
            System.out.println("Sent JSON: " + jsonData);

            socket.close();
            System.out.println("Connection closed.");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}