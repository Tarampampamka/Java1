package Progwards.Olga.T;

public class Base1 {
    public static void printJava(){
        String a = "Хорошо идут дела";
        String b = "Изучаю Java я!";
        String c = " ";
        System.out.println(a);
        System.out.println(b);
        System.out.print(a);
        System.out.println(c+b);
        System.out.print(b);
        System.out.println(c+a);

    }
    public static void printJava(String java1, String java2){
        System.out.println(java1);
        System.out.println(java2+"!");
        System.out.println(java1+", "+java2+"!");
        System.out.println(java2+", "+java1+"!");
    }
    public static String plusJava(String message){
        String m = "Java - "+ message +" язык программирования";
        return m;
    }
    public static void main(String[] args) {
        printJava();
        printJava("Чтобы Java понимать","Надо функции писать" );
        printJava("Буду, буду программистом","Код пишу я чисто, чисто");
        String str = plusJava("самый популярный");
        System.out.println("str = "+ str);
        str = plusJava("объектно-ориентированный");
        System.out.println("str = "+ str);
        System.out.println(plusJava("очень интересный"));
    }
}
