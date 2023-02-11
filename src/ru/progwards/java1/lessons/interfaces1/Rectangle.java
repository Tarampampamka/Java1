package ru.progwards.java1.lessons.interfaces1;

public class Rectangle implements Area {
    double width,length;

    Rectangle(double width, double length) {
        this.width = width;
        this.length=length;
    }

    @Override
    public double getArea() {
        return width*length;
    }

    public static void main(String[] args) {
        Rectangle q = new Rectangle(2.3,1.1);
        System.out.println(q.getArea());
    }
}
