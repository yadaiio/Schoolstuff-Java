import java.util.Scanner;

public class uebungen {
    public static void main(String[] args) {

        //Begrüßungstext
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hallo zusammen. Bitte gebt mir drei Zahlen mit Komma-Trennung.");
        String eingabe = scanner.nextLine();
        
        //Splitten des Strings
        String[] teile = eingabe.split(",");

        //Erstelle int-Array
        int[] eingabeClient = new int[teile.length];

            for (int i=0; i<teile.length; i++) {
                eingabeClient[i] = Integer.parseInt(teile[i].trim()); //Leerzeichen entfernen
            }

            if(eingabeClient[0]>eingabeClient[1]) {
                int groß = eingabeClient[0];

                if(groß>eingabeClient[2]) {
                    System.out.println("Die größte Zahl ist " + eingabeClient[0] + ".");
                } else {
                    System.out.println("Die größte Zahl ist " + eingabeClient[2] + ".");
                }
            } else {
                int klein = eingabeClient[1];
                    if(klein>eingabeClient[2]) {
                        System.out.println("Die größte Zahl ist " + eingabeClient[1] + ".");
                    } else {
                        System.out.println("Die größte Zahl ist " + eingabeClient[2] + ".");
                    }
            }
            scanner.close();
    }
}
