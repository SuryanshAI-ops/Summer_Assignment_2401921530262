class Outer {
    void display() {
        System.out.println("I am display() of OUTER class!");
    }

    class Inner {
        void display() {
            System.out.println("I am display() of INNER class!");
        }
    }
}

class Program2_InnerClass {
    public static void main(String[] args) {
        System.out.println("===== Program 2: Inner Class =====");

        Outer outerObj = new Outer();
        outerObj.display();

        Outer.Inner innerObj = outerObj.new Inner();
        innerObj.display();
    }
}