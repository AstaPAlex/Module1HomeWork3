package org.example.homework.third.extwo;

public abstract class OperationalSystem {
    protected String name;
    private static final String INFO_OS = "Операционная система: %s\n";

    public String getName() {
        return name;
    }

    public void info() {
        System.out.printf(INFO_OS, name);
    }
}
