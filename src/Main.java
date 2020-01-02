import java.util.Scanner;

public class Main {
	public static Scanner sc = new Scanner(System.in);
	//test user info
	public static int accountNum1=9876543;
	public static int accountNum2=8989898;
	public static int pin1=9876;
	public static int pin2=1890;
	public static int usr1=0;
	public static int usr2=0;
	public static int usrChoice=0;
	public static int usrChecking=0;
	public static int usrSavings=0;
	public static int usrWithdraw;
	public static int usrDeposit;

	public static void main(String[] args) {
		//log in 
		logIn();

		//is it user 1
		if(usr1==accountNum1 && usr2==pin1) {
			//test validation
			//System.out.println("test successful");

			while(usrChoice!=3) {
				System.out.println("Which account would you like to use");
				System.out.println("Enter 1: Checking");
				System.out.println("Enter 2: Savings:");
				System.out.println("Enter 3: Exit");
				usrChoice=sc.nextInt();

				if(usrChoice==1) {
					checking();
				}

				else if(usrChoice==2) {
					savings();
				}

				else if(usrChoice==3){
					break;
				}

				else {
					System.out.println("enter a valid number");

				}
			}
		}

		//is it user 2
		else if(usr1==accountNum2 && usr2==pin2) {

			while(usrChoice!=3) {
				System.out.println("Which account would you like to use");
				System.out.println("Enter 1: Checking");
				System.out.println("Enter 2: Savings:");
				System.out.println("Enter 3: Exit");
				usrChoice=sc.nextInt();

				if(usrChoice==1) {
					checking();
				}

				else if(usrChoice==2) {
					savings();	
				}

				else if(usrChoice==3) {
					break;
				}
				//error message
				else {
					System.out.println("enter a valid number");

				}
			}
		}

		else {
			System.out.println("Please enter valid credentials");
		}

	}

	//log in method
	public static void logIn() {
		while(usr1!=accountNum1 && usr2!=pin1) {
			System.out.println("Welcome to the ATM project");
			System.out.println("Enter your account number");
			usr1=sc.nextInt();
			System.out.println("Enter your pin number");
			usr2=sc.nextInt();
		}
	}

	//checking account method
	public static void checking() {
		while(usrChoice!=4) {
			System.out.println("Checking Account:");
			System.out.println("Enter 1: Check Balance");
			System.out.println("Enter 2: Deposit");
			System.out.println("Enter 3: Withdraw");
			System.out.println("Enter 4: Exit");
			usrChoice=sc.nextInt();

			//check account balance							
			if(usrChoice==1) {
				System.out.println("Your Checking Balance is $"+usrChecking);
			}

			//deposit money
			else if(usrChoice==2) {
				System.out.println("Your Checking Balance is $"+usrChecking);
				System.out.println("How much would you like to deposit");
				usrDeposit=sc.nextInt();
				usrChecking=usrDeposit+usrChecking;
				System.out.println("Your New Checking Balance is $"+usrChecking);
			}

			//withdraw money
			else if(usrChoice==3) {
				System.out.println("Your Checking Balance is $"+usrChecking);
				System.out.println("How much would you like to withdraw");
				usrWithdraw=sc.nextInt();
				usrChecking = usrChecking-usrWithdraw;
				System.out.println("Your New Checking Balance is $"+usrChecking);
			}

			//end program
			else if(usrChoice==4) {
				break;
			}

			//error catch
			else {
				System.out.println("please enter a valid number");

			}
		}
	}

	//savings account method
	public static void savings() {
		while(usrChoice!=4) {
			System.out.println("Savings Account:");
			System.out.println("Enter 1: Check Balance");
			System.out.println("Enter 2: Deposit");
			System.out.println("Enter 3: Withdraw");
			System.out.println("Enter 4: Exit");
			usrChoice=sc.nextInt();

			//check account balance
			if(usrChoice==1) {
				System.out.println("Your Savings Balance is $"+usrSavings);
			}

			//deposit money
			else if(usrChoice==2) {
				System.out.println("Your Savings Balance is $"+usrSavings);
				System.out.println("How much would you like to deposit");
				usrDeposit=sc.nextInt();
				usrSavings=usrDeposit+usrSavings;
				System.out.println("Your New Savings Balance is $"+usrSavings);
			}

			//withdraw money
			else if(usrChoice==3) {
				System.out.println("Your Savings Balance is $"+usrSavings);
				System.out.println("How much would you like to withdraw");
				usrWithdraw=sc.nextInt();
				usrSavings = usrSavings-usrWithdraw;
				System.out.println("Your New Savings Balance is $"+usrSavings);
			}

			//end program
			else if(usrChoice==4) {
				break;
			}


			else {
				System.out.println("please enter a valid number");
			}	
		}
	}
}










