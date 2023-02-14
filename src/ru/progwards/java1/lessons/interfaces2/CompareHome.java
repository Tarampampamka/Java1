package ru.progwards.java1.lessons.interfaces2;

public class CompareHome {
    public static boolean sameHome(Home h1, Home h2) {
        boolean ok = false;
        if (h1.getHome().equals(h2.getHome())) {
            ok = true;
        }
        System.out.println("Результат сравнения " + h1.getClass().getSimpleName() + " и " + h2.getClass().getSimpleName() + " равен " + ok);
        return ok;
    }

    public static void main(String[] args) {
        sameHome(new Cow("asd"),new Duck("asg"));
        sameHome(new Cow("asd"),new Hamster("asg"));
        sameHome(new Cow("asd"),new Hawk());
        sameHome(new Duck("asd"),new Hamster("asg"));
        sameHome(new Duck("asd"),new Hawk());
        sameHome(new Hamster("asd"),new Hawk());
    }
}



