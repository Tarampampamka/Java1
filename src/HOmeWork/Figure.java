package HOmeWork;

class Figure {
    String name;

    public Figure(String name) {
        this.name = name;
    }

    public Figure() {

        this("фигура");
    }
    public static void main(String[] args) {
        Figure f=new Figure();
        System.out.println(f.name);
    }
}

