package oopsatm;

public class Account {
    private int accNum;
    private int balance;
    private int PIN;

    public Account(int accNum,int balance, int PIN){
        this.accNum=accNum;
        this.balance=balance;
        this.PIN=PIN;
    }

    public void depoCash(int amount){
        balance+=amount;
        
    }

    public boolean withDraw(int amount){
        if(balance>=amount){
            balance-=amount;
            System.out.println("Amount: "+amount+" Withdrawn");
            return true;
        }else{
            return false;
        }
    }

    public boolean authenATM(int enterPin){
        if(enterPin==PIN){
            return  true;
        }else{
            return false;
        }

    }

    public int getBalance(){
        return balance;
    }

    
}
