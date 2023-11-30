package com.project.nextgenapp;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.*;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class DatabaseManager {
    DatabaseManager() {
        // Default Constructor
    }

    // ** Get ApplicationDataContainer to access data from JSON File (Serialization)
    public ApplicationData getDataContainer() throws IOException {
        ObjectMapper om = new ObjectMapper().enable(SerializationFeature.INDENT_OUTPUT);
        ApplicationData appDataContainer = new ApplicationData();

        try {
            appDataContainer.users = om.readValue(new File("src/main/resources/database/" +
                            "users.json"),
                    om.getTypeFactory().constructCollectionType(List.class, User.class));
            appDataContainer.inventory = om.readValue(new File("src/main/resources/database/" +
                            "inventory.json"),
                    om.getTypeFactory().constructCollectionType(List.class, Inventory.class));
            appDataContainer.sales = om.readValue(new File("src/main/resources/database/" +
                            "sales.json"),
                    om.getTypeFactory().constructCollectionType(List.class, Sale.class));
            appDataContainer.shippingTypes = om.readValue(new File("src/main/resources/database/" +
                            "shippingTypes.json"),
                    om.getTypeFactory().constructCollectionType(List.class, ShippingType.class));
        } catch (IOException ioe) {
            System.out.println(ioe.getMessage());
        }

        return appDataContainer;
    }

    //** Write Java objects to JSON File (Deserialization)
    public void writeJsonFile(ApplicationData appDataContainer) throws IOException {
        ObjectMapper om = new ObjectMapper().enable(SerializationFeature.INDENT_OUTPUT);

        try {
            om.writeValue(new File("src/main/resources/database/users.json"),
                    appDataContainer.users);
            om.writeValue(new File("src/main/resources/database/inventory.json"),
                    appDataContainer.inventory);
            om.writeValue(new File("src/main/resources/database/sales.json"),
                    appDataContainer.sales);
        } catch (IOException ioe) {
            System.out.println(ioe.getMessage());
        }
    }

    // ** Test
    public void test(ApplicationData appDataContainer) throws IOException {
        ObjectMapper om = new ObjectMapper().enable(SerializationFeature.INDENT_OUTPUT);
        ObjectWriter ow = om.writerWithDefaultPrettyPrinter();
        File jsonFile = new File("src/main/resources/database/testdata.json");
        om.writeValue(jsonFile, appDataContainer);
    }
}
