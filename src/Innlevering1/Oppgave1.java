package Innlevering1;
import java.util.Scanner;

public class Oppgave1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				

		String message ="";
		String skattetrekk = "";
		Scanner input = new Scanner(System.in);
		int inntekt = 0; 
		message = "Hva er din inntekt? ";
		System.out.print(message);
		inntekt = Integer.parseInt(input.nextLine());
		
		if  (inntekt <= 190349) {
			skattetrekk = "ingen trinnskatt";
	    } else if (inntekt <= 267899) {
	    	skattetrekk = "1,7% trinnskatt på inntekt over 190 350 kroner";
	    } else if (inntekt <= 643799) {
	    	skattetrekk = "4,0%  trinnskatt på inntekt over 267 900 kroner";
	    } else if (inntekt <= 969199) {
	    	skattetrekk = "13,4% trinnskatt på inntekt over 643 800 kroner";
		} else if (inntekt <= 1999999) {
			skattetrekk = "16,4% trinnskatt på inntekt over 969 200 kroner";
		} else if (inntekt >= 2000000)  {
			skattetrekk = "17,4%  trinnskatt på inntekt over 2 000 000 kroner";
		}	
		
			message = "Din inntekt er " + inntekt + " og du betaler " + skattetrekk;
			System.out.println(message);
			
			input.close();}
			
			
		

		
		
		
		}
		
	
		


	
