package Innlevering1;
import java.util.Scanner;

public class Oppgave2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	String message ="";
	String karakter ="";
	int poeng = 0;
	final int AntallElever = 10;
	Scanner input = new Scanner(System.in);
	boolean yes = true;
	boolean no = false;
	for (int i= 1; i <= AntallElever && yes; i++) {
		message = "Hvor mange poeng fikk elev " + i + "? ";
		System.out.print(message);
		poeng = Integer.parseInt(input.nextLine());
		if (poeng < 0 || poeng > 100) {
			yes = false;
			no = true;
			for (int j = 2; j >= 1 && no; j--) { 
				message = "Dette er ikke en gyldig poengsum. Start på nytt.";
				System.out.print(message);
				poeng = Integer.parseInt(input.nextLine());
				if (poeng >= 0 && poeng < 100) {
					yes = true;
					no = false;
				}}} 
		if  (poeng >= 90 && poeng <= 100) {
			karakter = "A - Fremragende";
	    } else if (poeng >= 80 && poeng <= 89) {
	    	karakter = "B - Meget god";
	    } else if (poeng >= 60 && poeng <= 79) {
	    	karakter = "C - God";
	    } else if (poeng >= 50 && poeng <= 59) {
	    	karakter = "D - Nokså god";
		} else if (poeng >= 40 && poeng <= 49) {
			karakter = "E - Tilstrekkelig";
		} else if (poeng >= 0 && poeng <= 39)  {
			karakter = "F - Ikke bestått";
		}
		if (no) message = "Avsluttet fordi ugyldig poengsum ble skrevet,";
		else message = "Elev #" + i + " fikk " + poeng + " poeng og får karakteren " + karakter + ".";
		System.out.println(message);
		
	}
	input.close();}
				
						
			}
					
		
	
	
		
		
		
		
		
				
		

	
		


