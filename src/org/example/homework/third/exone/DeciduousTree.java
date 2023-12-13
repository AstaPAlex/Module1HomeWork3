package org.example.homework.third.exone;

//Лиственное

public abstract class DeciduousTree extends Tree {
    protected boolean hasLeaves;

    public DeciduousTree(int age) {
        super(age);
        hasLeaves = true;
    }

    public void flowering() {
        System.out.println("Происходит цветение!");
        hasLeaves = true;
    }

    public void fallingLeaves() {
        System.out.println("Опадают листья!");
        hasLeaves = false;
    }
}
