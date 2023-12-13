package org.example.homework.third.extwo;

public class Factory {
    public void assemblePhone(SamsungGalaxy phone) {
        phone.addCamera(new CameraSamsung());
        phone.addMotherboard(new MotherBoardJ108());
        phone.addOs(new Android());
        phone.info();
    }

    public void assemblePhone(Iphone15 phone) {
        phone.addCamera(new CameraIphone());
        phone.addMotherboard(new Motherboard7uik());
        phone.addOs(new Ios());
        phone.info();
    }
}
