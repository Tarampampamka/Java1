package HOmeWork;

public class GunCompare {
    static class Gun {
        String model;
        double caliber;

        public Gun(String model, double caliber) {
            this.model = model;
            this.caliber = caliber;
        }

        int compareTo(Gun gun) {

            return Double.compare(caliber, gun.caliber);
        }
        public static void sortGuns(Gun gun1, Gun gun2){
if (gun1.compareTo(gun2)>=0)
    System.out.println(gun2.model+","+gun1.model);
else  System.out.println(gun1.model+","+gun2.model);
        }

        public static void main(String[] args) {
            Gun d1 =new Gun("Vasya",123.1);
            Gun d2 = new Gun("Pol",45.15);
            sortGuns(d1,d2);
        }
    }
}