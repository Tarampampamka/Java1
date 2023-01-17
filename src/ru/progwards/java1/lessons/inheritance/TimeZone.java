package ru.progwards.java1.lessons.inheritance;

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
class ZonedTime extends Time {
    TimeZone zone;
    public ZonedTime(int hours, int minutes, int seconds){
        super(hours, minutes, seconds);
        new TimeZone(0,0);
    }
    public ZonedTime(int hours, int minutes, int seconds, TimeZone zone){
        super(hours, minutes, seconds);
        this.zone = zone;
    }
    @Override
    public TimeZone getTimeZone(){
        return zone;
    }
    @Override
    public int secondsBetween(ru.progwards.java1.lessons.inheritance.Time time){
        if (time.getTimeZone() != null) {
            return this.secondsBetween(time);
        }
        return 0;
    }
    public static void main(String[] args){
        ru.progwards.java1.lessons.inheritance.Time time0=new ru.progwards.java1.lessons.inheritance.Time(12,45,16);

        Time time1=new ZonedTime(12,46,19);
        System.out.println(time0.secondsBetween(time1));

    }
}
