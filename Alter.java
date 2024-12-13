import java.util.Scanner;

public class Alter {
    public static void main(String[] args) {

        // User abfragen
        Scanner scanner = new Scanner(System.in);
        System.out.println("Gib uns dein Alter bitte an.");       

        // Mehrere if-else-Anwendungen zur Überprüfung des Alters
        while (true) {
            String input = scanner.nextLine();
            int alter = Integer.parseInt(input);
            
            if (alter < 13) {
                System.out.println("Status: Kind");
                break;
            } else if (alter >= 13 && alter <= 17) {
                System.out.println("Status: Jugendlich");
                break;
            } else if (alter >= 18 && alter <= 64) {
                System.out.println("Status: Erwachsen");
                break;
            } else if (alter >= 65 && alter <= 121) {
                System.out.println("Status: Senior");
                break;
            } else {
                System.out.println("Status: falsch,bitte");
            }
        }

        scanner.close();
    }
}
