
import java.util.Scanner;

public class Innlevering1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Skriv inn din inntekt: ");
		double salary = Double.parseDouble(input.nextLine());
		double reminding = salary;
		double tax = 0;
		boolean solved = false;
		double trinn1 = ((230951-164101)* 0.0093);
		double trinn2 = ((580651-230951)* 0.0241);
		double trinn3 = ((934051-580651)* (0.1152));
		

		if (salary >= 934051) {
			tax = -((salary-934051) * 0.1452) + trinn3 + trinn2 +trinn1;
			
    } else if (reminding >= 580651) {
		tax = ((salary-580651)* (0.1152)) + trinn2 + trinn1  ;

		
    } else if (reminding >= 230951) {
		tax = ((salary-230951)* 0.0241) + trinn1  ; 

    } else if (reminding >= 164101) {
		tax = ((salary-164101)* 0.0093) ;
 
    }  else {
    	tax = 0;
    }

System.out.println("Skatt: " +tax );
System.out.println("lønning ut: " + (salary - tax));

	}
	}
		

	
