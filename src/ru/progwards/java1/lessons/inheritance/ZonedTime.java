package ru.progwards.java1.lessons.inheritance;

public class ZonedTime extends Time{
    TimeZone zone;
    public ZonedTime(int hours, int minutes, int seconds){
        super(hours, minutes, seconds);
        //;
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
        if (time.getTimeZone() != null) {
            return this.secondsBetween(time);
        }
        return 0;
    }
    public static void main(String[] args){
        Time time0=new Time(12,45,16);

        Time time1=new ZonedTime(12,46,19);
        System.out.println(time0.secondsBetween(time1));

    }
}
