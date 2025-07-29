package org.patterns.structural.proxy.client;

import org.patterns.structural.proxy.commoninterface.DataAccess;
import org.patterns.structural.proxy.proxy.DataAccessProxy;

import java.util.HashMap;
import java.util.Map;

public class ProxyPatternDemo {
    public static void main(String[] args) {
        User admin = new User("shru", Role.ADMIN);

        // Define the required roles for each operation using the Role enum
        Map<String, Role> operationRoles = new HashMap<>();
        operationRoles.put("fetchData", Role.USER);
        operationRoles.put("fetchAllData", Role.ANALYST);
        operationRoles.put("updateData", Role.EDITOR);
        operationRoles.put("deleteData", Role.ADMIN);

        // --- Setup Users with Different Roles (using Role enum) ---
        User adminUser = new User("Alice", Role.ADMIN);
        User editorUser = new User("Bob", Role.EDITOR);
        User analystUser = new User("Charlie", Role.ANALYST);
        User regularUser = new User("David", Role.USER);
        User guestUser = new User("Eve", Role.GUEST); // Example new user with a different role

        System.out.println("\n--- Admin User Operations ---");
        DataAccess adminDataAccess = new DataAccessProxy(adminUser, operationRoles);
        adminDataAccess.fetchData("users");
        adminDataAccess.fetchAllData();
        adminDataAccess.updateData("users_settings", "new_config");
        adminDataAccess.deleteData("old_logs");

        DataAccess analystDataAccess = new DataAccessProxy(analystUser, operationRoles);
        analystDataAccess.deleteData("old");
    }
}
