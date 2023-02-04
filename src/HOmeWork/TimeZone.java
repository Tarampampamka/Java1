package HOmeWork;

public class TimeZone {
    int hours;  //часовой сдвиг, может быть отрицательным
    int minutes;  //сдвиг в минутах

    public TimeZone(int hours) {
        this.hours = hours;
        minutes = 0;
    }

    public TimeZone(int hours, int minutes) {
        this.hours = hours;
        this.minutes = minutes;
    }
}


class ZonedTime extends Time {
    TimeZone zone;

    public ZonedTime(int hours, int minutes, int seconds) {
        super(hours, minutes, seconds);
        zone = new TimeZone(0, 0);
    }

    public ZonedTime(int hours, int minutes, int seconds, TimeZone zone) {
        super(hours, minutes, seconds);
        this.zone = zone;
    }

    @Override
    public TimeZone getTimeZone() {
        return zone;
    }

    @Override
    public int secondsBetween(Time time) {
        int seconds1ByGMT;
        int seconds2ByGMT;

        if (getTimeZone() == null) {
            seconds1ByGMT = toSeconds();
        } else {
            if (getTimeZone().hours < 0) {
                seconds1ByGMT = toSeconds() - getTimeZone().hours * 3600 + getTimeZone().minutes * 60;
            } else {
                seconds1ByGMT = toSeconds() - getTimeZone().hours * 3600 - getTimeZone().minutes * 60;
            }
        }

        if (time.getTimeZone() == null) {
            seconds2ByGMT = time.toSeconds();
        } else {
            if (time.getTimeZone().hours < 0) {
                seconds2ByGMT = time.toSeconds() - (time.getTimeZone().hours * 3600 + time.getTimeZone().minutes * 60);
            } else {
                seconds2ByGMT = time.toSeconds() - (time.getTimeZone().hours * 3600 - time.getTimeZone().minutes * 60);
            }
        }
        return Math.abs(seconds1ByGMT - seconds2ByGMT);
    }

    public static void main(String[] args) {
        ZonedTime zt1 = new ZonedTime(7, 0, 13, new TimeZone(3));
        ZonedTime zt2 = new ZonedTime(23, 1, 37, new TimeZone(1));
        System.out.println(zt1.secondsBetween(zt2));
    }
}
