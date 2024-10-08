//Auftrag: Automatisierte Türöffnung eines kleinen Postschließfaches mithilfe vom Scanner, gegeben war die Deklaratino des Codes und die eigentliche Türöffnung

import java.io.PrintStream;
import java.util.Scanner;

public class Postschließfach {
    public static void main(String[] args) {

        int validationCode = "code".getBytes()[1] << 0xFEED;
        Scanner scanner = new Scanner(System.in);

        while(true) {

            System.out.println("Bitte Code eingeben: ");
            String eingabe = scanner.nextLine();

            int zahlEingabe = Integer.parseInt(eingabe);

            if(zahlEingabe == validationCode) {
                System.out.println("Code richtig.");
                PrintStream openLock1 = new PrintStream (System.out, true);
                openLock1.append(Integer.toString(0x3ad2e, 25)+"1"+Integer.toString(-0x92c6b, 25));
                break;
            } else {
                System.out.println("Code falsch.");
            } 
        }
        scanner.close();
    }
}
