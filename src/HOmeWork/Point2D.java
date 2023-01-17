package HOmeWork;

class Point2D {
    int x;
    int y;

    public Point2D (int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString(){
        return ""+x+","+y;
    }
}
class Point3D extends Point2D {
    private int z;
    Point3D (int x, int y,int z){
        super (x,y);
        this.z=z;
    }
    @Override
    public String toString() {

        return super.toString()+","+z;
    }
    public static void main(String[] args) {
        System.out.println(new Point3D(41, 19, 34).toString());

    }
}
