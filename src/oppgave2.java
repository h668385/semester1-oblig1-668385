import java.util.Scanner;

public class oppgave2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
	
		for(int i = 1; i <= 10; i++) {
			String karakter = "";
			
			boolean gyldig = false;
			while(!gyldig) {
				System.out.print("Skriv inn dine poeng for student" + i + ": ");
				int poeng = Integer.parseInt(input.nextLine());
				
				if (poeng >= 0 && poeng <=39) {
					karakter = "F";
					gyldig = true;
				}else if(poeng >= 40 && poeng <=49) {
					karakter = "E";
					gyldig = true;
				}else if (poeng >= 50 && poeng <=59) {
					karakter = "D";
					gyldig = true;
				}else if (poeng >=60 && poeng <=79) {
					karakter = "C";
					gyldig = true;
				}else if (poeng >=80 && poeng <=89) {
					karakter = "B";
					gyldig = true;
				}else if (poeng>=90 && poeng <=100) {
					karakter = "A";
					gyldig = true;
				}else {
					System.out.println("Ikke gyldig poengsum");
					karakter= "Ikke gyldig poengsum";
					gyldig = false;
				}
			}
			
			System.out.println(karakter);
		}
	}
	
		
		
		
		
}
