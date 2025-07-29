package org.patterns.structural.proxy.commoninterface;

import java.util.Map;

/**
 * Subject interface, implemented by both proxy and real subject
 * Assume that data is stored as key-value pairs
 * */
public interface DataAccess {

    String fetchData(String key);
    Map<String,String> fetchAllData();
    void updateData(String key, String updatedData);
    void deleteData(String key);
}
