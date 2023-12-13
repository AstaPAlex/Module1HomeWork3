package org.example.homework.third.extwo;

public class CameraIphone extends Camera {
    private final boolean hasFlash;
    private static final String INFO_FLASH = "Наличие вспышки: %b\n";

    public CameraIphone() {
        this.zoom = "20x";
        hasFlash = true;
    }

    @Override
    public void info() {
        super.info();
        System.out.printf(INFO_FLASH, hasFlash);
    }
}
