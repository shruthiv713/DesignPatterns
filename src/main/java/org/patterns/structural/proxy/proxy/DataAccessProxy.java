package org.patterns.structural.proxy.proxy;

import org.patterns.structural.proxy.commoninterface.DataAccess;
import org.patterns.structural.proxy.client.Role;
import org.patterns.structural.proxy.client.User;
import org.patterns.structural.proxy.realsubject.RealDataAccess;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class DataAccessProxy implements DataAccess {

    private RealDataAccess realDataAccess;
    private Map<String, String> dataCache;
    private Map<String, String> allDataCache;

    private User currentUser;
    // Map to define required roles for each operation, now using Role enum's name()
    private final Map<String, Role> requiredRoles; // Changed value type to Role enum

    public DataAccessProxy(User user, Map<String, Role> requiredRoles) { // Changed parameter type
        this.currentUser = user;
        this.dataCache = new HashMap<>();
        this.allDataCache = null;
        this.requiredRoles = Collections.unmodifiableMap(new HashMap<>(requiredRoles));
        log("PROXY: DataAccessProxy created for user: " + user.getUsername() + " (Role: " + user.getRole() + ")");
    }

    private RealDataAccess getRealDataAccess() {
        if (realDataAccess == null) {
            log("PROXY: Initializing RealDataAccess (Lazy Loading)...");
            realDataAccess = new RealDataAccess();
        }
        return realDataAccess;
    }

    private void log(String message) {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();
        System.out.println(dtf.format(now) + " " + message);
    }

    // --- Authorization Helper ---
    private boolean hasPermission(String operationName) {
        if (currentUser == null) {
            log("PROXY: ERROR - No user logged in for " + operationName + " operation. Access Denied.");
            return false;
        }

        // Admin role always has access
        if (currentUser.getRole() == Role.ADMIN) { // Direct enum comparison
            log("PROXY: Authorization Granted (ADMIN)! User '" + currentUser.getUsername() + "' can perform " + operationName + ".");
            return true;
        }

        Role requiredRole = requiredRoles.get(operationName); // Get Role enum directly
        if (requiredRole == null) {
            log("PROXY: ERROR - No required role defined for operation '" + operationName + "'. Access Denied.");
            return false;
        }

        // Direct enum comparison
        if (currentUser.getRole() != requiredRole) {
            log("PROXY: Authorization Denied! User '" + currentUser.getUsername() + "' with role '" + currentUser.getRole() + "' needs role '" + requiredRole + "' for " + operationName + ".");
            return false;
        }

        log("PROXY: Authorization Granted for user '" + currentUser.getUsername() + "' to perform " + operationName + ".");
        return true;
    }

    @Override
    public String fetchData(String query) {
        log("PROXY: Attempting to fetch data for query: '" + query + "'");
        if (!hasPermission("fetchData")) {
            return "ACCESS DENIED for query: " + query;
        }

        if (dataCache.containsKey(query)) {
            log("PROXY: Cache Hit! Returning cached data for query: '" + query + "'");
            return dataCache.get(query);
        }

        log("PROXY: Cache Miss. Delegating to RealDataAccess for query: '" + query + "'");
        String result = getRealDataAccess().fetchData(query);
        dataCache.put(query, result);
        log("PROXY: Data for query '" + query + "' cached.");
        return result;
    }

    @Override
    public Map<String, String> fetchAllData() {
        log("PROXY: Attempting to fetch ALL data.");
        if (!hasPermission("fetchAllData")) {
            return new HashMap<>();
        }

        if (allDataCache != null) {
            log("PROXY: Cache Hit! Returning cached ALL data.");
            return allDataCache;
        }

        log("PROXY: Cache Miss. Delegating to RealDataAccess for ALL data.");
        Map<String, String> result = getRealDataAccess().fetchAllData();
        allDataCache = new HashMap<>(result);
        log("PROXY: ALL data cached.");
        return result;
    }

    @Override
    public void updateData(String query, String newData) {
        log("PROXY: Attempting to update data for query: '" + query + "' with '" + newData + "'");
        if (!hasPermission("updateData")) {
            return;
        }

        getRealDataAccess().updateData(query, newData);
        log("PROXY: Update operation delegated for query: '" + query + "'.");
        dataCache.remove(query);
        allDataCache = null;
        log("PROXY: Cache invalidated for query '" + query + "'.");
    }

    @Override
    public void deleteData(String query) {
        log("PROXY: Attempting to delete data for query: '" + query + "'");
        if (!hasPermission("deleteData")) {
            return;
        }

        getRealDataAccess().deleteData(query);
        log("PROXY: Delete operation delegated for query: '" + query + "'.");
        dataCache.remove(query);
        allDataCache = null;
        log("PROXY: Cache invalidated for query '" + query + "'.");
    }
}