public class Task2 {
    public static void printJava () {
        String first = "Хорошо идут дела";
        String second = "Изучаю Java я!";
        String third = " ";

        System.out.println(first);
        System.out.println(second);
        System.out.println(first+third+second);
        System.out.println(second+third+first);
    }
    public static int subtraction (int x, int y) {
        int z =x-y;
        System.out.println("Вызвана функция subtraction() с параметрами x = "+ x +", y = "+ y);
        return z;
    }
    public static int addition(int x, int y) {
        int w = x+y;
        System.out.println("Вызвана функция addition() с параметрами x = " + x + ", y = " + y);
        return w;

    }
    public static int multiplication(int x, int y) {
        int r = x*y;
        System.out.println("Вызвана функция multiplication() с параметрами x = " + x + ", y = "+ y);
        return r;
    }
    public static void calculation() {
        int a;
        int b;
        int c;
        a = 34;
        b = 55;
        System.out.println("a = "+ a);
        System.out.println("b = "+ b);
        c = Task2.addition(a,b);
        System.out.println("a + b = " + c);
        c = Task2.subtraction(a,b);
        System.out.println("a - b = " + c);
        c = Task2.multiplication(a,b);
        System.out.println("a * b = " + c);
    }


    public static void main (String[] args){
        Task2.printJava();

        Task2.subtraction(45,12);
        Task2.subtraction(23,55);

        Task2.addition(128,787);
        Task2.addition(528,387);

        Task2.multiplication(124,87);
        Task2.multiplication(1528,3);
    }
}
