package org.example.homework.third.extwo;

public abstract class Motherboard {
    private static final String INFO_MOTHERBOARD = "Материнская плата: %s\n"
            + "Размеры материнской планы: %d x %d x %d\n";
    protected String name;
    protected int height;
    protected int length;
    protected int width;

    public void info() {
        System.out.printf(INFO_MOTHERBOARD, name, length, width, length);
    }
}
