package experience;

import java.util.TimeZone;
//Напишите метод с сигнатурой public int diffWithMoscow(String strtz), который возвращает
// разницу между московским временем и зоной, имя которой передано в strtz
public class TimeZone_diffWithMoscow {
    public static int diffWithMoscow(String strtz) {
        TimeZone temp1 = TimeZone.getTimeZone("Europe/Moscow");
        TimeZone temp2 = TimeZone.getTimeZone(strtz);
        int l = temp1.getRawOffset()-temp2.getRawOffset();
        return l;
    }

    public static void main(String[] args) {
       String strtz = "Africa/Algiers";
        System.out.println(diffWithMoscow(strtz));
    }
}
