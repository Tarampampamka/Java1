public class Astronomy {
    public static Double sphereSquare(Double r) {
        double pi = 3.14;
        Double s = 4 * pi * (r*r);
        return s;
    }
    public static Double earthSquare() {
        Double r = 6371.2;
        Double eSq = Astronomy.sphereSquare( r );
        System.out.println( "Радиус Земли = " + r);
        System.out.println("Площадь поверхности Земли = " + eSq );
        return eSq;
    }
    public static Double mercurySquare(){
        Double r = 2439.7;
        Double mSq = Astronomy.sphereSquare( r );
        System.out.println( "Радиус Меркурия = " + r );
        System.out.println("Площадь поверхности Меркурия = " + mSq );
        return mSq;
    }
    public static Double jupiterSquare(){
        Double r = 71492.0;
        Double jSq = Astronomy.sphereSquare( r );
        System.out.println( "Радиус Юпитера = " + r);
        System.out.println("Площадь поверхности Юпитера = " + jSq);
        return jSq;
    }
    public static Double earthVsMercury(){
        Double eaVsMer = Astronomy.earthSquare()/Astronomy.mercurySquare();
        System.out.println("Отношение площади поверхности Земли к площади поверхности Меркурия = " + eaVsMer);
        return eaVsMer;
    }
    public static Double earthVsJupiter(){
        Double eaVsJup = Astronomy.earthSquare()/ Astronomy.jupiterSquare();
        System.out.println("Отношение площади поверхности Земли к площади поверхности Юпитера = " + eaVsJup );
        return eaVsJup;
    }

    public static void main(String[] args) {
        Astronomy.earthSquare();
        Astronomy.mercurySquare();
        Astronomy.jupiterSquare();
        Astronomy.earthVsMercury();
        Astronomy.earthVsJupiter();
    }
}
