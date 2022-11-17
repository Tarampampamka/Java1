package ru.progwards.java1.lessons.basics;

public class Astronomy {
    static double pi = 3.14;
        public static Double sphereSquare(Double r) {
            Double s = 4 * pi * (r*r);
            return s;
        }
        public static Double earthSquare() {
            Double r = 6371.2;
            Double eSq = Astronomy.sphereSquare( r );
            return eSq;
        }
        public static Double mercurySquare(){
            Double r = 2439.7;
            Double mSq = Astronomy.sphereSquare( r );
            return mSq;
        }
        public static Double jupiterSquare(){
            Double r = 71492.0;
            Double jSq = Astronomy.sphereSquare( r );
            return jSq;
        }
        public static Double earthVsMercury(){
            Double eaVsMer = Astronomy.earthSquare()/Astronomy.mercurySquare();
            return eaVsMer;
        }
        public static Double earthVsJupiter(){
            Double eaVsJup = Astronomy.earthSquare()/ Astronomy.jupiterSquare();
            return eaVsJup;
        }

        /*public static void main(String[] args) {
            System.out.println(Astronomy.earthSquare());
            System.out.println(Astronomy.mercurySquare());
            System.out.println(Astronomy.jupiterSquare());
            System.out.println(Astronomy.earthVsMercury());
            System.out.println(Astronomy.earthVsJupiter());
        }*/
    }

