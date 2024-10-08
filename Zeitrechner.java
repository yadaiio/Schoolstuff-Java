import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;


public class Zeitrechner {
    public static void main(String[] args) {

        //Scanner setzen
        Scanner scanner = new Scanner(System.in);

        //Zeitform festlegen (HH:mm)
        DateTimeFormatter Zeit = DateTimeFormatter.ofPattern("HH:mm");

        while (true) {
            
            //Eingabe Startzeit
            System.out.println("Beginn deiner Arbeitszeit: ");
            String eingabe = scanner.nextLine();

            //Eingabe der genauen Pausenzeit
            System.out.println("Länge der Pause in Minuten: ");
            String eingabePause = scanner.nextLine();

            try {
                LocalTime echteZeit = LocalTime.parse(eingabe, Zeit);
                int echteZeitPause = Integer.parseInt(eingabePause);

                //Unter 30 Minuten wird trotzdem 30 Minuten abgerechnet, wenn die Pause 30 Minuten überschreitet, dann werden die genauen Minuten verrechnet.
                if (echteZeitPause >= 30) {
                    echteZeitPause = 30;
                }
                //Berechnung der Zeit und Ausgabe
                LocalTime endZeit = echteZeit.plusMinutes(8*60+echteZeitPause);
                System.out.println("Feierabend ist um: " + endZeit);
                break;

            //Errors catchen    
            } catch (Exception e) {
                System.out.println("Eingabe Inkorrekt! " + e.getMessage());
            }    
        }
        scanner.close(); 
    }
    
}
