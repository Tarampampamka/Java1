public class AccuracyDoubleFloat {
    public static double volumeBallDouble(double radius){
        double pi = 3.14;
        double volBD = 4.0/3.0 * pi * (radius*radius*radius);
        System.out.println( "Объём шара с радиусом radius, который основан на типе double = " + volBD );
        return  volBD;
    }
    public static float volumeBallFloat(float radius){
        float pi = 3.14f;
        float volBF = 4.0f/3.0f * pi * (radius*radius*radius);
        System.out.println( "Объём шара с радиусом radius, который основан на типе float = " + volBF );
        return volBF;
    }
    public static double calculateAccuracy(double radius){
        float a = (float) radius;
        double diff = AccuracyDoubleFloat.volumeBallDouble (radius) - AccuracyDoubleFloat.volumeBallFloat (a);
        System.out.println( "Разница между функциями volumeBallDouble и volumeBallFloat = " + diff );
        return diff;
    }
    public static void main (String[] args){
        AccuracyDoubleFloat.volumeBallDouble (6371.2);
        AccuracyDoubleFloat.volumeBallFloat(6371.2f);
        AccuracyDoubleFloat.calculateAccuracy( 6371.2);
    }
}
