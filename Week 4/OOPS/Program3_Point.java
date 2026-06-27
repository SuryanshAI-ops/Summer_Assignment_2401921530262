class Point {
    private int x, y;

    public Point() {
        this.x = 0;
        this.y = 0;
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void setX(int x)            { this.x = x; }
    public void setY(int y)            { this.y = y; }
    public void setXY(int x, int y)    { this.x = x; this.y = y; }

    public void display() {
        System.out.println("Point => X: " + x + ", Y: " + y);
    }
}

class Program3_Point {
    public static void main(String[] args) {
        System.out.println("===== Program 3: Point Class =====");

        Point p1 = new Point();
        System.out.print("Default Constructor -> ");
        p1.display();

        Point p2 = new Point(10, 20);
        System.out.print("Parameterized Constructor -> ");
        p2.display();

        p2.setX(99);
        System.out.print("After setX(99) -> ");
        p2.display();

        p2.setY(55);
        System.out.print("After setY(55) -> ");
        p2.display();

        p2.setXY(7, 8);
        System.out.print("After setXY(7,8) -> ");
        p2.display();
    }
}