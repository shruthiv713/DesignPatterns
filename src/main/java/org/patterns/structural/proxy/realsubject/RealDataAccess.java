package org.patterns.structural.proxy.realsubject;

import org.patterns.structural.proxy.commoninterface.DataAccess;

import java.util.HashMap;
import java.util.Map;

public class RealDataAccess implements DataAccess {

    public RealDataAccess() {
        System.out.println("RealDataAccess: Initializing database connection...");
        try {
            Thread.sleep(500); // Simulate connection setup time
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            e.printStackTrace();
        }
        System.out.println("RealDataAccess: Database connection established.");
    }
    @Override
    public String fetchData(String query) {
        System.out.println("RealDataAccess: Executing query '" + query + "' from database...");
        try {
            Thread.sleep(1500); // Simulate heavy database query
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            e.printStackTrace();
        }
        String result = "Data for query: " + query + " (from DB)";
        System.out.println("RealDataAccess: Query '" + query + "' executed.");
        return result;
    }

    @Override
    public Map<String, String> fetchAllData() {
        System.out.println("RealDataAccess: Fetching ALL data from database...");
        try {
            Thread.sleep(3000); // Simulate very heavy database operation
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            e.printStackTrace();
        }
        Map<String, String> allData = new HashMap<>();
        allData.put("key1", "value1_from_DB");
        allData.put("key2", "value2_from_DB");
        allData.put("key3", "value3_from_DB");
        System.out.println("RealDataAccess: ALL data fetched.");
        return allData;
    }

    @Override
    public void updateData(String query, String newData) {
        System.out.println("RealDataAccess: Updating data for query '" + query + "' with '" + newData + "'...");
        try {
            Thread.sleep(1000); // Simulate update delay
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            e.printStackTrace();
        }
        System.out.println("RealDataAccess: Data updated for query '" + query + "'.");
    }

    @Override
    public void deleteData(String query) {
        System.out.println("RealDataAccess: Deleting data for query '" + query + "'...");
        try {
            Thread.sleep(1000); // Simulate delete delay
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            e.printStackTrace();
        }
        System.out.println("RealDataAccess: Data deleted for query '" + query + "'.");

    }
}


