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
        this.zone= new TimeZone(0);
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
    public int secondsBetween(Time time){
        int timeShift;
        if (time.getTimeZone() != null) {
            if (time.hours>hours){
                timeShift=time.toSeconds()-toSeconds();}
            else timeShift=toSeconds()-time.toSeconds();
            return timeShift;
        }
        else
        return 0;
    }
    public static void main(String[] args){
        Time time1=new Time(15,41,1);
        Time time2=new ZonedTime(15,40,1);
        System.out.println(time1.secondsBetween(time2));

    }
}
