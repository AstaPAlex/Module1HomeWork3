package org.example.homework.third.exone;

//Береза

public class Birch extends DeciduousTree {
    public Birch(int age) {
        super(age);
    }

    @Override
    public void flowering() {
        super.flowering();
        spreadAllergens();
    }

    private void spreadAllergens() {
        System.out.println("Истощает аллергены!");
    }
}
