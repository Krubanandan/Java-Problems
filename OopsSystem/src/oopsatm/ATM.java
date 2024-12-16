package oopsatm;

public class ATM {
    private int cashAvailable;

    public ATM(int cashAvailable){
        this.cashAvailable=cashAvailable;

    }

    public boolean withdrawCash(int cashWithdraw){
        if(cashAvailable>=cashWithdraw){
            cashAvailable-=cashWithdraw;
            return true;

        }else{
            return false;
        }

    }

    public void depositATM(int cashDeposit){
        cashAvailable+=cashDeposit;
    }

    public boolean authenticateAccount(Account account, int pin ){
        return account.authenATM(pin);
    }

}
