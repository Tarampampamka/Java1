package experience;

//Берет 2 целых числа (2 и 5), складывает как строки 25.И меняет тип на строку.
public class Nothing {
    static int addAsStrings(int n1, int n2) {
        /* 1-ый вариант
        String str1 = Integer.toString(n1);
        String str2 = Integer.toString(n2);
        String str3 = str1 + str2;*/
       /* 2-й вариант
        String str = String.valueOf(n1)+String.valueOf(n2);*/
        String str = ""+n1+n2;
        int s = Integer.valueOf(str);
        return s;
    }

    public static void main(String[] args) {
        /*int i = (int)765.567;
        System.out.println(i);*/

        /*byte b = (byte)12345;
        System.out.println(b);*/

        /*int i = (int) 999999.999999;
        System.out.println(i);*/

        /*short i = (short) 256567.789;
        System.out.println(i);*/

        System.out.println(addAsStrings(48, 1));

    }
}
