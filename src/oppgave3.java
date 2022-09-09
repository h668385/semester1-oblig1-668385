import java.util.Scanner;

public class oppgave3 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
        System.out.print("Fakultet verdi: ");
        int n = Integer.parseInt(input.nextLine());

        int sum = 1;

        for (int i = n; i > 0; i--) {
            sum = sum * i;
        }

        System.out.println(sum);

        input.close();
	}

}
