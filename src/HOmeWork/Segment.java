package HOmeWork;

public class Segment extends Figure {
    String name="отрезок";

    public Segment(String name) {
        super (name);
    }
    public Segment() {

        this("отрезок");
    }
    public static void main(String[] args) {
        Segment figure = new Segment();
        System.out.println(figure.name);
        Figure figure1 = new Figure();
        System.out.println(figure1.name);
    }
    }

