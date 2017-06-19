import java.util.Scanner;

public class ChangeMaker {

	public static void main(String[] args) {
		
		int quarterCount = 0;
		int dimeCount = 0;
		int nickelCount = 0;
		int pennyCount = 0;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("How many cents do you need? ");
		int changeAmt = sc.nextInt();
		
		while ((changeAmt > 99) || (changeAmt < 1)) {
			System.out.println("Amount must be between 1 and 99, inclusively.");
			System.out.println("How many cents do you need? ");
			changeAmt = sc.nextInt();
		}
		
		while (changeAmt > 0) {
			if (changeAmt >= 25) {
				quarterCount++;
				changeAmt = changeAmt - 25;
			}
			if ((changeAmt < 25) && (changeAmt >=10)) {
				dimeCount++;
				changeAmt = changeAmt - 10;
			}
			if ((changeAmt < 10) && (changeAmt >=5)) {
				nickelCount++;
				changeAmt = changeAmt - 5;		
			}
			else {
				pennyCount++;
				changeAmt = changeAmt - 1;
			}
		}
		
		System.out.println("You need " + quarterCount + " quarters, " + dimeCount + " dimes, " + nickelCount + " nickels, and " + pennyCount + " pennies.");
		
		sc.close();
	}


}
