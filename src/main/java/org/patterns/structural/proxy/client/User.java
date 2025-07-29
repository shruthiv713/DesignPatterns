package org.patterns.structural.proxy.client;

public class User {
    private String username;
    private Role role; // Now uses the Role enum

    public User(String username, Role role) {
        this.username = username;
        this.role = role;
    }

    public String getUsername() {
        return username;
    }

    public Role getRole() { // Returns Role enum
        return role;
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", role=" + role + // Enum prints nicely
                '}';
    }
}
