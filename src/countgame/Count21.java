package countgame;

import java.util.Scanner;

public class Count21 {

	public static int computerChoice;
	public static int userChoice;
	public static final int TOTAL_OF_21 = 21;
	public static int runningValue = 0;
	public static int total;
	
	static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		count21();
		
	}

	public static void count21() {
	
		
		while(runningValue < TOTAL_OF_21) {
			
			for(int i = 1; i < TOTAL_OF_21; i = runningValue) {
				
				computerChoice = computerChoice();
				
				userChoices();
			
				total = computerChoice + userChoice;
				runningValue += total;
				
				displayChoices();
				
			}
			
		} //First While Loop Ending		
		
		if(runningValue >= 21) {
			
			System.out.println("You lose!");
		}
		
	}
	
	public static int computerChoice() {
			
			if(runningValue == 0) {
				
				computerChoice = 1;
			}
			
			else {
				
				for(int i = 1; 4*i <= 20; i++) {
					if(runningValue < 4*i) {
					computerChoice = 4*i - runningValue;
					break;
					}
				}
			}
			return computerChoice;
		}
	
	public static void userChoices() {
		
		System.out.println("Please choose a number: 1, 2, or 3: ");
		userChoice = input.nextInt();
		
		while(userChoice < 1 || userChoice > 3) {
			
			System.out.println("Not a valid choice.\nPlease re-enter value: ");
			userChoice = input.nextInt();
			
		}
	}
	
	public static void displayChoices() {
		
		System.out.println("The computer chose: " + computerChoice + "\nYou chose: " + userChoice );
		System.out.println("The running total is: " + runningValue);
	}
	
} //Class Ending