import java.net.ServerSocket;
import java.net.Socket;
import java.io.*;

public class PizzaReceiver {

    public static void main(String[] args) {
        try (ServerSocket server = new ServerSocket(5000)) {
            System.out.println("Receiver running on port 5000...");

            Socket socket = server.accept();
            System.out.println("Sender connected.");

            BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));

            // Read flat file string
            String flatData = reader.readLine();
            Pizza pizzaFromFlat = PizzaFlatFileUtil.fromFixedFormatString(flatData);
            System.out.println("Received FLAT: " + pizzaFromFlat);

            // Read JSON string
            String jsonData = reader.readLine();
            Pizza pizzaFromJson = PizzaJsonUtil.fromJson(jsonData);
            System.out.println("Received JSON: " + pizzaFromJson);

            socket.close();
            System.out.println("Connection closed.");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}