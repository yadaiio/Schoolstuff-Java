import java.util.Scanner;

public class Weizenkornlegende {
    public static void main(String[] args) {

        //Abfrage Anzahl der Körner und geschätztes Gewicht (Anzahl der Körner ist die Nummer des Sacks)
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Bitte geben Sie die Nummer ihres Körnersacks an.");
        double eingabeZahl = myScanner.nextDouble();

        System.out.println("Bitte schätzen Sie das Gewicht des Behälters in kg");
        String schaetz = myScanner.nextLine().replace(",",".");

        //Parsen
        double gewichtSchaetzung = Double.parseDouble(schaetz);

        //Berechnung der körner
        double gewichtKoerner = eingabeZahl*0.0005;

        if(gewichtSchaetzung>gewichtKoerner) {
            double differenzGewicht = gewichtSchaetzung - gewichtKoerner;

            System.out.println("zu viel: "+differenzGewicht);
        } else {
            if(gewichtSchaetzung<gewichtKoerner) {
                double differenzGewichte = gewichtKoerner-gewichtSchaetzung;

                System.out.println("Zu wenig: "+differenzGewichte);
            } else {
                System.out.println("genau richtig.");
            }
        }
        myScanner.close();

        System.out.println("Das wahre Gewicht beträgt: "+gewichtKoerner+ "kg.");
    }
}
