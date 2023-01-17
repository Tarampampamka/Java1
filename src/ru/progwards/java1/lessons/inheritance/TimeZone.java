package ru.progwards.java1.lessons.inheritance;

import ru.progwards.java1.lessons.classes1.Time;

public class TimeZone {
    int hours;     //часовой сдвиг, может быть отрицательным
    int minutes;   //сдвиг в минутах
    //устанавливает сдвиг в часах, минуты = 0
    public TimeZone(int hours){
        this.hours=hours;
        this.minutes=0;
    }
    //устанавливает сдвиг в часах и минутах.
    //Если сдвиг, например -3;15, то надо передавать как TimeZone(-3, 15), т.е. минус передается только в часы
    public TimeZone(int hours, int minutes){
        this.hours=hours;
        this.minutes=minutes;
    }

    }
