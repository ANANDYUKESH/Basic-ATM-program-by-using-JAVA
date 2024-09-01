import java.util.*;

public class Atm {
    public static void main(String[] args) {
        int pin = 2003;
        int balance = 100000;
        int Takeamount = 0;
        int Addamount = 0;
        String name;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your pin number:");
        int password = sc.nextInt();
        if (password == pin) {
            System.out.println("Enter your name:");
            name = sc.next();
            System.out.println("Welcome " + name);
            while (true) {
                System.out.println("press 1 to check your balance");
                System.out.println("press 2 to add amount");
                System.out.println("press 3 to take amount");
                System.out.println("press 4 to print resipt");
                System.out.println("press 5 to Exit");
                int options = sc.nextInt();
                switch (options) {
                    case 1:
                        System.out.println("your current balance is " + balance);
                        break;
                    case 2:
                        System.out.println("Enter Amount you want to add");
                        Addamount = sc.nextInt();
                        System.out.println("Sucessfully Credited");
                        balance += Addamount;
                        break;
                    case 3:
                        System.out.println("How much amount you want to take ");
                        Takeamount = sc.nextInt();
                        if (Takeamount > balance) {
                            System.out.println("Insufficient Balance");
                            System.out.println("want to check balance?yes or no");
                            String Yes = sc.next();
                            if (Yes == "yes") {
                                System.out.println("Your balance is" + balance);
                            }
                        } else {
                            System.out.println("successful taken");
                            balance -=Takeamount;
                        }
                        break;
                    case 4:
                        System.out.println("Welcome to the one and only ATm");
                        System.out.println("Available balance is " + balance);
                        System.out.println("Amount deposit" + Addamount);
                        System.out.println("Amount taken" + Takeamount);
                        System.out.println("Thank you");
                        break;
                    case 5:
                        System.out.println("Thank for using");
                        break;
                    default:
                        System.out.println("Please enter correct number");
                        break;
                }
            }
        }
        else{
            System.out.println("Wrong pin number");
            System.out.println("Enter the correct pin number");
        }
    }
}