package atm;

import java.util.*;

public class ATM {
	
	private double balance = 100;
	
	public void checkBalance() {
		System.out.println("You have $" + balance + " in your account");
		System.out.println();
	}
	
	public void withdraw() {
		System.out.print("Enter the amount you want to withdraw: ");
		Scanner input1 = new Scanner(System.in);
		double amount = input1.nextDouble();
		if(balance > amount && amount > 0) {
			balance -= amount;
			System.out.println("$" + amount + " has been withdrawn from your account.");
			System.out.println();
		}
		else if(amount < 0) {
			System.out.println("Invalid Input");
			System.out.println();
		}
		else {
			System.out.println("You do not have enough balance. Transaction ignored");
			System.out.println();
		}
	}
	
	public void deposit() {
		System.out.print("Enter the amount you want to deposit: ");
		Scanner input1 = new Scanner(System.in);
		double amount = input1.nextDouble();
		
		if(amount > 0) {
			balance += amount;
			System.out.println("$" + amount + " has been deposited into your account.");
			System.out.println();
		}
		else {
			System.out.println("Invalid Input");
			System.out.println();
		}
			
	}
	
	public void menu() {
		boolean cont = true;
		while(cont) {
			System.out.println("Main menu: ");
			System.out.println("1 : check balance");
			System.out.println("2 : withdraw");
			System.out.println("3 : deposit");
			System.out.println("4 : exit");
			System.out.print("Enter choice: ");
			Scanner input1 = new Scanner(System.in);
			int choice = input1.nextInt();
			
			if(choice == 1) {
				checkBalance();
			}
			else if(choice == 2) {
				withdraw();
			}
			else if(choice == 3) {
				deposit();
			}
			else if(choice == 4) {
				cont = false;
				System.out.println("Have a nice day.");
			}
			else {
				System.out.println("Invalid input");
			}
		}
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ATM atm = new ATM();
		atm.menu();
	}

}
