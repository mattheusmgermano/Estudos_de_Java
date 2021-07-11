package application;

import java.util.Scanner;

import entities.BankAccount;

public class Program {

	public static void main(String[] args) {
		var sc = new Scanner(System.in);
		
		var conta = new BankAccount(sc.nextLine(), sc.nextInt(), sc.nextDouble());
		conta.Deposit(sc.nextDouble());
		conta.Withdraw(sc.nextDouble());
		
		sc.close();

	}

}
