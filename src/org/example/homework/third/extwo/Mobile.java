package org.example.homework.third.extwo;

public abstract class Mobile {
    private static final String MODEL = "Модель телефона: %s\n";
    protected OperationalSystem os;
    protected Motherboard motherboard;
    protected Camera camera;

    protected void info() {
        System.out.printf(MODEL, this.getClass().getSimpleName());
        os.info();
        motherboard.info();
        camera.info();
        System.out.println();
    }

    protected void addOs(OperationalSystem os) {
        this.os = os;
    }

    protected void addMotherboard(Motherboard motherboard) {
        this.motherboard = motherboard;
    }

    protected void addCamera(Camera camera) {
        this.camera = camera;
    }
}
