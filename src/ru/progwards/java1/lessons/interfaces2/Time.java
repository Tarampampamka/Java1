package ru.progwards.java1.lessons.interfaces2;

public class Time implements ToString{
    int hours;
    int minutes;
    int seconds;
    public Time(int hours, int minutes, int seconds){
        this.hours=hours;
        this.minutes=minutes;
        this.seconds=seconds;
    }
    public String toString(){
        String to_Str, str1, str2,str3;
        if (hours<10)
            str1 = "0"+Integer.toString(hours);
        else str1 = Integer.toString(hours);
        if (minutes<10)
            str2 = "0"+Integer.toString(minutes);
        else str2 = Integer.toString(minutes);
        if (seconds<10)
            str3 = "0"+Integer.toString(seconds);
        else str3 = Integer.toString(seconds);
        return to_Str = str1+":"+str2+":"+str3;
    }
    public int toSeconds(){
        int to_Sec = hours*60*60+minutes*60+seconds;
        return to_Sec;
    }
    //возвращает количество секунд между 2-мя точками времени.(this и time)
    //При этом результат всегда должен быть положительный
    public int secondsBetween(Time time){
        int v;
        if (time.hours>hours)
            v=time.toSeconds()-toSeconds();
        else v=toSeconds()-time.toSeconds();
        return v;
    }

    @Override
    public String getString() {
        return toString();
    }

    /*public static void main(String[] args) {
        Time t=new Time(5,52,56);
        System.out.println(t.secondsBetween(new Time(2, 13, 60)));
    }*/
}
