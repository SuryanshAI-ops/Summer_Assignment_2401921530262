import java.util.Random;

abstract class Compartment {
    public abstract String notice();
}

class FirstClass extends Compartment {
    @Override
    public String notice() {
        return "FIRST CLASS COMPARTMENT: Premium seating, AC enabled. Please carry valid first-class ticket.";
    }
}

class Ladies extends Compartment {
    @Override
    public String notice() {
        return "LADIES COMPARTMENT: Reserved exclusively for women passengers. Men are not allowed.";
    }
}

class General extends Compartment {
    @Override
    public String notice() {
        return "GENERAL COMPARTMENT: Open for all passengers. Unreserved seating, first come first serve.";
    }
}

class Luggage extends Compartment {
    @Override
    public String notice() {
        return "LUGGAGE COMPARTMENT: For parcels and goods only. Passengers are not permitted to travel.";
    }
}

public class TestCompartment {
    public static void main(String[] args) {

        Compartment[] coaches = new Compartment[10];
        Random rand = new Random();

        for (int i = 0; i < coaches.length; i++) {
            int type = rand.nextInt(4) + 1; // random number between 1 and 4

            switch (type) {
                case 1:
                    coaches[i] = new FirstClass();
                    break;
                case 2:
                    coaches[i] = new Ladies();
                    break;
                case 3:
                    coaches[i] = new General();
                    break;
                case 4:
                    coaches[i] = new Luggage();
                    break;
            }
        }

        // Polymorphic behavior check
        System.out.println("===== Train Coach Notices =====\n");
        for (int i = 0; i < coaches.length; i++) {
            System.out.println("Coach " + (i + 1) + " [" + coaches[i].getClass().getSimpleName() + "]: ");
            System.out.println(coaches[i].notice());
            System.out.println();
        }
    }
}