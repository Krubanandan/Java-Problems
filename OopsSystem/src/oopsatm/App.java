package oopsatm;


import java.util.Scanner;

public class App {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        ATM atm1=new ATM(50000);
        Account person1=new Account(523,10000, 123);

        

        System.out.println("Enter ATM Pin");
        int atmPIN=scan.nextInt();
        if(atm1.authenticateAccount(person1, atmPIN)){
            System.out.println("Authentication Succesful");
            boolean choiceATM=true;
            while(choiceATM){
                System.out.println("1.Deposit");
                System.out.println("2.Withdraw");
                System.out.println("3.Get Balance");
                System.out.println("4.Exit");
                System.out.println("Enter Choice");
                int choice=scan.nextInt();
    
                switch (choice) {
                    case 1:
                    System.out.println("Enter amount to be deposited");
                    int cash=scan.nextInt();
                    atm1.depositATM(cash);
                    person1.depoCash(cash);
                    break;
                    case 2:
                    System.out.println("Enter amount to withdraw");
                    int cashWith=scan.nextInt();
                    if(atm1.withdrawCash(cashWith)){
                        if(person1.withDraw(cashWith)){
                            System.out.println(cashWith+" withdrawn");


                        }else{
                            System.out.println("Insufficient Account Balance");
                            atm1.depositATM(cashWith);
                        }

                    }else{
                        System.out.println("Insufficient ATM Balance");
                    }
                    break;

                    case 3:
                        System.out.println(person1.getBalance());
                        break;
                        

                    case 4:
                    System.out.println("Thank you");
                    choiceATM=false;
                    break;
                    default:
                        System.out.println("Invalid Choice");;
                }
                
            }

        }else{
            System.out.println("Incorrect ATM Pin");
        }

        

    }
}
