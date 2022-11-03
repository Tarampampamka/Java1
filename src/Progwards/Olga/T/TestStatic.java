package Progwards.Olga.T;

public class TestStatic {
    static String s = "I`m a static string";

    static void f(String s) {
        TestStatic.s = s;
    }

    static void p(String s) {
        s = s;
    }

    public static void main(String[] args) {
        f("123");
        p("345");
        System.out.println(s);
    }
}
