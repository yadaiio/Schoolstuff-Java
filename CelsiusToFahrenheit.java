import java.util.Scanner;

public class CelsiusToFahrenheit {
    public static void main(String[] args) {

        //Begrüßungstext
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Bitte geben Sie die heutige Temperatur in Celsius ein.");
        String eingabe = myScanner.nextLine().replace(",",".");

        //String in double parsen
        double celsius = Double.parseDouble(eingabe);

        // Frage ob in Fahrenheit oder Kelvin berechnet werden sollte
        System.out.println("Wenn Sie mit F antworten wird ihre Temperatur in Fahrenheit umgerechnet, antworten Sie mit K wird in Kelvin umgerechnet");
        String abfrage = myScanner.nextLine();

        if(abfrage.equals("F")) {
            //Umrechnung in Fahrenheit wenn F eingegeben wurde
            double fahrenheit = (celsius * 9/5) + 32;

            System.out.println("Die Temperatur beträgt "+ fahrenheit + " Fahrenheit.");

        } else {
            //Umrechnung in Kelvin wenn K eingegeben wurde
            double kelvin = celsius + 273.15;

            System.out.println("Die Temperatur beträgt "+ kelvin + " Kelvin.");
        }

        myScanner.close();
    }
}
