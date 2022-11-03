package Progwards.Olga.T;

public class StaticTest {
    public static String str = "Не желаете?";
    public static void main(String[] args) {
        System.out.println(str);
        {
            String str = "В капучино";
            System.out.println(str);
        }
        {
            String str = "Эспрессо";
            PrinfCoffe(str);
        }
    }
        public static void PrinfCoffe (String str){
            str = "Я предпочитаю без кофеина";
            System.out.println(str);
        }
    }

