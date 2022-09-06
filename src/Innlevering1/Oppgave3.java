package Innlevering1;
import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;

public class Oppgave3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = parseInt(showInputDialog("Skriv inn et tall"));
		int fakultet = 1;
		while (n > 1) {
			fakultet *= n;
			n--;
		}

		System.out.println("Svaret er " + fakultet);

	}
}
