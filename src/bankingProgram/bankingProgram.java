package bankingProgram;

import java.util.Scanner;

public class bankingProgram {
	
	public static String programName = "Banking program";

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		double balance = 0;
		String programName = "Banking Program";
		String optionSelected;
		boolean infiniteTortureLoop = true;
		
	while(infiniteTortureLoop)	{
	System.out.println("Hello and welcome to my banking program");
	asterickThingy();
	System.out.println();
	System.out.println(programName);
	asterickThingy();
	System.out.println();
	System.out.println("Option 1 > Check balance");
	System.out.println("Option 2 > Withdraw");
	System.out.println("Option 3 > Deposit");
	System.out.println("Option 4 > Exit program");
	System.out.println("Please select an option 1-4");
	optionSelected = scanner.next();
	scanner.nextLine();//we needed this to catch the "/n"
	
	switch(optionSelected){
	case "1" -> System.out.println(balance);
	case "2" -> {
		balance = withdraw(balance, scanner);
		System.out.println(balance); //when calling a method you don't need to define the method when calling it. You only need to do that when writing the method. just pass the method instead.
	}
	case "3" -> {
		balance = deposit(balance, scanner);
		System.out.println(balance);
	}
	case "4" -> {
		System.out.println("Goodbye");
		infiniteTortureLoop = false;
	}
	}
	}
	
	
		
		scanner.close();
}
	

	
	static double deposit(double balance, Scanner scanner) {//trying to implement proper variables muhaha
//		Scanner scanner = new Scanner(System.in); we shouldnt create a new scanner in each method
		System.out.println("Please select an amount to deposit");
		double depositedAmount = scanner.nextDouble();
		balance += depositedAmount;
		return balance;
	}
	
	static double withdraw(double a, Scanner scanner) {
//		Scanner scanner = new Scanner(System.in); THIS IS WRONG
		System.out.println("Please select an amount to withdraw");
		double withdrawnAmount = scanner.nextDouble();
		a -= withdrawnAmount;//becareful when putting the - after the = because otherwise it reads as "-withdrawnAmount"
		return a;
	}
	
	static void asterickThingy() {
		for(int i =0; i < programName.length()+1; i++) {
			System.out.print("*");
		}
	}

}
//we had two major errors we didnt detect, first with putting a new scanner in every method.
// second was not updating the variable balance and just returning a number and replacing balance.