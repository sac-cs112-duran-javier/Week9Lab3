import java.util.Scanner;

public class GuessANumber {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		RandomNumber myRandomNumber = new RandomNumber();
		int userMax;
		int userMin;
		int userNum;
		
		System.out.print("Enter a maximum number: ");
		userMax = input.nextInt();
		
		System.out.print("Enter a minimum number: ");
		userMin = input.nextInt();
		
		int computerNum = myRandomNumber.GetANumber(userMin, userMax);
		
		System.out.print("Enter a number: ");
		userNum = input.nextInt();
		
		if (userNum > computerNum)
			System.out.print("Your number is too big");
		
		if (userNum < computerNum)
			System.out.print("Your number is too small");
			
		if (userNum == computerNum)
			System.out.print("Your number is correct");

		System.out.print("\n\nThe correct number is ");
		System.out.print(computerNum);
	}

}