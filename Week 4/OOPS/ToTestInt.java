interface Test {
    int square(int n);
}

class Arithmetic implements Test {
    @Override
    public int square(int n) {
        return n * n;
    }
}

class ToTestInt {
    public static void main(String[] args) {
        Arithmetic obj = new Arithmetic();

        System.out.println("===== Program 1: Interface =====");
        System.out.println("Square of 5  = " + obj.square(5));
        System.out.println("Square of 9  = " + obj.square(9));
        System.out.println("Square of 12 = " + obj.square(12));
    }
}