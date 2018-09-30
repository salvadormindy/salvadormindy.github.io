import java.util.Scanner;

	public class AccountTest {
		public static void main(String[] args) {
			Account account1 = new Account("Mindy Salvador", 50.00);
			Account account2 = new Account ("Jane Green", -7.53);

			
			System.out.printf("%s balance: $%.2f%n",
				account1.getName(), account1.getBalance());
			System.out.printf("%s balance: $%.2f%n%n",
				account2.getName(), account2.getBalance());
				
				
			Scanner input = new Scanner(System.in);
			
			System.out.print("Enter deposit amount for account1: ");
			double depositAmount = input.nextDouble();
			System.out.printf("%nadding %.2f to account1 balance%n%n",
				depositAmount);
			account1.deposit(depositAmount);

			System.out.print("Enter withdraw amount for account1: ");
			double withdrawalAmount = input.nextDouble();
			System.out.printf("\nsubtracting %.2f from accojaunt1 balance\n",
				withdrawalAmount);
			account1.Withdraw(withdrawalAmount);
			
			
			System.out.printf("%s balance: $%.2f%n",
				account1.getName(), account1.getBalance());
			System.out.printf("%s balance: $%.2f%n%n",
				account2.getName(), account2.getBalance());
				
			System.out.print("Enter deposit amount for account2: ");
			depositAmount = input.nextDouble();
			System.out.printf("%nadding %.2f to account2 balance%n%n",
				depositAmount);
			account2.deposit(depositAmount);
			

			System.out.print("Enter withdrawal amount for account2: ");
			withdrawalAmount = input.nextDouble();
			System.out.printf("\nsubtracting %.2f from account2 balance\n",
				withdrawalAmount);
			account2.Withdraw(withdrawalAmount);
			
			System.out.printf("%s balance: $%.2f%n",
				account1.getName(), account1.getBalance());
			System.out.printf("%s balance: $%.2f%n%n",
				account2.getName(), account2.getBalance());
		}
	}
