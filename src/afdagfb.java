public class afdagfb {
    /*static void myprint(int x){
       System.out.print("x="+x);

    }
    public static void main(String[] args) {
       myprint (5);
     }
}*/
    public static String sayHello(String greeting, String name) {
        String a = greeting + ", " + name + "!";
        System.out.println(a);
        return a;
    }

    public static void main(String[] args) {
        sayHello("Привет", "Долли");
    }
}
