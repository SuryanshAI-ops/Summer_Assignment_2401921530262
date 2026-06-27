class Box {
    private double length;
    private double breadth;

    public Box(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public double getLength()  { return length; }
    public double getBreadth() { return breadth; }

    public double area() {
        return length * breadth;
    }

    public void display() {
        System.out.println("Length  : " + length);
        System.out.println("Breadth : " + breadth);
        System.out.println("Area    : " + area());
    }
}

class Box3D extends Box {
    private double height;

    public Box3D(double length, double breadth, double height) {
        super(length, breadth);
        this.height = height;
    }

    public double volume() {
        return getLength() * getBreadth() * height;
    }

    @Override
    public void display() {
        System.out.println("Length  : " + getLength());
        System.out.println("Breadth : " + getBreadth());
        System.out.println("Height  : " + height);
        System.out.println("Area    : " + area());
        System.out.println("Volume  : " + volume());
    }
}

class Program4_Box {
    public static void main(String[] args) {
        System.out.println("===== Program 4: Box & Box3D =====");

        System.out.println("\n-- 2D Box --");
        Box box = new Box(10, 5);
        box.display();

        System.out.println("\n-- 3D Box --");
        Box3D box3d = new Box3D(10, 5, 3);
        box3d.display();
    }
}