import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        //Aufgabe 1 und 2 vom 19.09.2024

        //Deklaration und Definition der Einwohner
        double aachenEinwohner = 252769;
        double rechnung = 100000;

        //Umrechnung der Einwhonerzahl für die nachfolgende Indizberechnung
        double nAachenEinwohner = aachenEinwohner/rechnung;

        //Scanner setzen
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nenn uns die 7-Tage-Fallzahl...");

        //Eingabe Scanner
        String fallzahl = scanner.nextLine();
        scanner.close();

        //Den eingegebene String parsen in Double
        double fallz = Double.parseDouble(fallzahl);

        //Berechnung des neuen Ergebnisses der Inzidenz
        double ergebnis = fallz/nAachenEinwohner;

        //Ausgabe der neuen Information
        System.out.println("Die neue 7-Tage Fallinzidenz ist: " + ergebnis + ".");
    }
}
