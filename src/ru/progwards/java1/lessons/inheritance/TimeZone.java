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
        int timeShift=0,c,d,r,y;
        if (time.getTimeZone() == null) {c=0;
            d=0;}
        else {c=time.getTimeZone().hours*60*60;d=time.getTimeZone().minutes*60;}
        if (getTimeZone() == null){r=0;
            y=0;}
        else {r=getTimeZone().hours*60*60;y=getTimeZone().minutes*60;}
        int a=r+y,
                b=c+d;
        if ((time.toSeconds()-b)-(toSeconds()-a)>0) {
            timeShift=(time.toSeconds()-b)-(toSeconds()-a);}
        else timeShift=(toSeconds()-a)-(time.toSeconds()-b);

        return timeShift;
    }
    public static void main(String[] args){
        /*Time time1=new Time(15,41,1);
        Time time2=new ZonedTime(15,40,1);*/
        ZonedTime zt = new ZonedTime(5, 53, 29, new TimeZone(2));
        ZonedTime zt7 = new ZonedTime(8, 19, 31, new TimeZone(0));
        System.out.println(zt.secondsBetween(zt7));
        //System.out.println(zt1.zone.minutes);
        ZonedTime zt3 = new ZonedTime(14, 19, 6, new TimeZone(1, 39));
        Time t1 = new Time(14, 3, 44);
        System.out.println(zt3.secondsBetween(t1));
        ZonedTime zt1 = new ZonedTime(7, 0, 13, new TimeZone(3));
        ZonedTime zt2 = new ZonedTime(23, 1, 37, new TimeZone(-1));
        System.out.println(zt1.secondsBetween(zt2));
    }
}
