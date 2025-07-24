package org.patterns.structural.facade.subsystem;

// Subsystem 4: Operating System
public class OperatingSystem {
    public void boot() {
        System.out.println("  OperatingSystem: Booting up...");
    }
    public void shutDown() {
        System.out.println("  OperatingSystem: Shutting down gracefully...");
    }
}