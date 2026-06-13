interface Playable {
    void play();
}

class Veena implements Playable {
    @Override
    public void play() {
        System.out.println("Playing Veena.");
    }
}

class Saxophone implements Playable {
    @Override
    public void play() {
        System.out.println("Playing Saxophone.");
    }
}

class App {
    public static void main(String[] args) {

        System.out.println("Veena Instance");
        Veena veena = new Veena();
        veena.play();

        System.out.println("\nSaxophone Instance");
        Saxophone saxophone = new Saxophone();
        saxophone.play();

        System.out.println("\nPlayable Interface Reference");
        Playable p1 = new Veena();
        p1.play();

        Playable p2 = new Saxophone();
        p2.play();
    }
}