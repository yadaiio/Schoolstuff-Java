import java.util.Scanner;
public class Praemienberechnung {
    public static void main(String[] args) {
        int praemie = 0;

        //Firmenzugehörigkeit abfragen
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Bitte geben Sie in Jahren an wie lange Sie dem Unternehmen zugehörig sind:");
        String jahre = myScanner.nextLine();

        //Parsen in Integer
        int jahreszahl = Integer.parseInt(jahre);

        //Abfrage ob man 5 Jahre oder länger deer Firma zugehörig ist
        if(jahreszahl >= 5) {
            System.out.println("Haben Sie eine Körperbehinderung? (J/N)");
            String antwort = myScanner.nextLine();

            //Abfrage nach Art der Arbeit
            System.out.println("Bitte wählen Sie ihre Art der Tätigkeit: 1 für Führungskraft, 2 für Halbtagskraft oder 3 für normale Arbeitskraft");
            String auswahl = myScanner.nextLine();
                            
            //Parsen String in Integer
                            
            int zahl = Integer.parseInt(auswahl);
            
            if(antwort == "J") {
                if(zahl == 1) {
                    praemie = 125;
                } else if(zahl == 2) {
                    praemie = 150;
                } else {
                    praemie = 250;
                }
            } else {
                if(zahl == 1) {
                    praemie = 100;
                } else if(zahl == 2) {
                    praemie = 120;
                } else {
                    praemie = 200;
                }
            } 
        //Abfrage ob Mitarbeiter im Außendienst tätig war
        System.out.println("Waren Sie im Ausendienst tätig? (J/N)");
        String außen = myScanner.nextLine();

        if(außen == "J") {
            praemie = praemie+100;
        } else {
            System.out.println("Kein Außendienst");
        }

        //Abfrage ob Mitarbeiter im Ausland tätig war
        System.out.println("Waren Sie im Ausland tätig? (J/N)");
        String außland = myScanner.nextLine();

        if(außland == "J") {
            praemie = praemie+300;
        } else {
            System.out.println("Keine Auslandtätigkeit");
        }

        System.out.println("Sie erhalten nun eine Prämie von "+praemie+"€ von uns. Vielen Dank für Ihre Arbeit.");
        
    } else {
            System.out.println("Leider gibt es keine Prämie...");
        }
        myScanner.close();
    }
}
