package org.patterns.structural.facade.subsystem;

public class Memory {
    public void loadKernel(String kernelAddress) {
        System.out.println("  Memory: Loading OS kernel into address " + kernelAddress + "...");
    }
    public void clear() {
        System.out.println("  Memory: Clearing all data...");
    }
}