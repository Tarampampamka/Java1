package ru.progwards.java1.lessons.interfaces1;

public class Circle implements Area {
    double diameter;

    Circle(double diameter) {
        this.diameter = diameter;
    }

    @Override
    public double getArea() {

        return Math.PI*diameter*diameter;
    }
    public static void main(String[] args){
        Circle q=new Circle(2.3);
        System.out.println(q.getArea());
    }
}
