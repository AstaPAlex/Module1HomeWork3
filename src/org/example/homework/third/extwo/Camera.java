package org.example.homework.third.extwo;

public abstract class Camera {
    protected String zoom;
    private static final String INFO_ZOOM = "Камера с зумом: %s\n";

    public void info() {
        System.out.printf(INFO_ZOOM, zoom);
    }

}
