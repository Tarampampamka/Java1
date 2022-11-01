public class ReverseDigits {
    public static int reverseDigits (int number) {
        int a = number % 10;
        int b = number/10 % 10;
        int c = number/100 % 10;
        int Res = a*100 + b*10 + c;
        System.out.println("Ввели число: " + number);
        System.out.println("Полученное число: " + Res);
        return Res;
    }
    public static void main(String[] args) {
        ReverseDigits.reverseDigits(123);
    }
}
