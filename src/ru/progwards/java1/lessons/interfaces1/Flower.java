package ru.progwards.java1.lessons.interfaces1;

import static ru.progwards.java1.lessons.interfaces1.IColor.Color.WHITE;

public class Flower implements IColor {

    @Override
    public Color getColor() {
        return WHITE;
    }

    public static void main(String[] args) {
        System.out.println(new Flower().getColor());
    }
}
