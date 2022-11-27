package experience;

public class Factorial {
    static long factorial(long n){
        long fact=1L;
        for (int i = 1; i <= n; i++) {
            fact = fact * i;
        }
        return fact;
    }

    public static void main(String[] args) {
        System.out.println(factorial(3));
    }
}
