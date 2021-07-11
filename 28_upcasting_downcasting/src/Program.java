import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class Program {

	public static void main(String[] args) {
		
//	Upcasting
//		Casting da subclasse para superclasse
//		Uso comum: polimorfismo
//		
//	Downcasting
//		Casting da superclasse para subclasse
//		Palavra instanceOf
//		Uso comum: métodos que recebem parâmetros genéricos (ex: Equals);
		
		var account = new Account(1001, "Micaela", 0.0);
		
		var businessAccount = new BusinessAccount(1002, "Regina", 0.0, 500.00);
		
		// Upcasting
		
		Account account1 = businessAccount;
		
		Account account2 = new BusinessAccount(1003, "Mike Wazowsky", 500.0, 3000.0);
		
		Account account3 = new SavingsAccount(1004, "Jake Sullivan", 3000.0, 4.0);
		
		//Downcasting
		
		BusinessAccount account4 = (BusinessAccount)account2;
		
		account4.loan(100.0);
		
		// BusinessAccount account5 = (BusinessAccount)account3;
		// Como evitar esse tipo de erro?
		if(account3 instanceof BusinessAccount){
			BusinessAccount account5 = (BusinessAccount)account3;
			account5.loan(200.0);
			System.out.println("Loan!");
		} else if(account3 instanceof SavingsAccount){
			SavingsAccount account5 = (SavingsAccount) account3;
			account5.updateBalance();
			System.out.println("Update!");
		}
		
		

	}

}
