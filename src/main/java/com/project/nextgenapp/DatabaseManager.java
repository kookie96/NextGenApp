package com.project.nextgenapp;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class DatabaseManager {
    DatabaseManager() {
        // Default Constructor
    }

    // ** Get ApplicationDataContainer to access data from JSON File (Serialization)
    public ApplicationData getDataContainer() throws IOException {
        ObjectMapper om = new ObjectMapper().enable(SerializationFeature.INDENT_OUTPUT);
        // om.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        File jsonFile = new File("src/main/resources/database/projectdatabase.json");

        String jsonString = readJsonFile();
        ApplicationData appDataContainer = om.readValue(jsonString, ApplicationData.class);

        return appDataContainer;
    }

    //** Write Java objects to JSON File (Deserialization)
    public void writeJsonFile(ApplicationData appDataContainer) throws IOException {
        ObjectMapper om = new ObjectMapper().enable(SerializationFeature.INDENT_OUTPUT);
        File jsonFile = new File("src/main/resources/database/projectdatabase.json");
        om.writeValue(jsonFile, appDataContainer);
    }

    // ** Test
    public void test(ApplicationData appDataContainer) throws IOException {
        ObjectMapper om = new ObjectMapper().enable(SerializationFeature.INDENT_OUTPUT);
        File jsonFile = new File("src/main/resources/database/testdata.json");
        om.writeValue(jsonFile, appDataContainer);
    }

    // ** Read JSON File into string
    public String readJsonFile() throws FileNotFoundException {
        File newFile = new File("src/main/resources/database/projectdatabase.json");
        Scanner reader = new Scanner(newFile);
        String input = "";
        while (reader.hasNextLine()) {
            input += reader.nextLine();
        }
        return input;
    }
}
