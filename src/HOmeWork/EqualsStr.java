package HOmeWork;

public class EqualsStr {
    public static void main(String[] args) {
        String str11 = "Лондон";
        String str22 = new String("Лондон");
        String str33 = new String("Лондон");
        System.out.println(compare3str(str11,str22,str33));

    }
    public static boolean compare3str(String str1, String str2, String str3){
        return  ((str1.equals(str2)) && (str1.equals(str3))&&(str2.equals(str3)));

    }
}
class Boat{
    double weight;
    public Boat(double weight){

        this.weight=weight;
    }
int compareTo(Boat b){

        return Double.compare(weight, b.weight);
}
    public static void main(String[] args) {
        Boat b1=new Boat(356.8);
        Boat b2=new Boat(12.3);
        System.out.println(b1.compareTo(b2));
    }
}
