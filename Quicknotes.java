public class Quicknotes {

    static void berechneFlaeche(double laenge) {
        System.out.println("Der Flascheninhalt beträgt "+(laenge*laenge));
    }

    static void berechneFlaeche(double laenge, double breite) {
        System.out.println("Der Flächeninhalt beträgt "+(laenge*breite));
    }

    public static void main(String[] args) {
        berechneFlaeche(22.5);
        berechneFlaeche(49,17.5);
    }

}
