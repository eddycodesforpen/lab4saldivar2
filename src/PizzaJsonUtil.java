

import com.fasterxml.jackson.databind.ObjectMapper;

public class PizzaJsonUtil {
    private static final ObjectMapper mapper = new ObjectMapper();

    public static String toJson(Pizza pizza) throws Exception {
        return mapper.writeValueAsString(pizza);
    }

    public static Pizza fromJson(String json) throws Exception {
        return mapper.readValue(json, Pizza.class);
    }
}