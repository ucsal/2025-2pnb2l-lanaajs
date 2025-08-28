package br.com.mariojp.solid.lspaccounts;

public class CheckingAccount extends Account implements Withdrawable{

    @Override
    public void withdrawable(double amount) {
        if(balance < amount){
            throw new IllegalArgumentException("Saldo insuficiente");
        }

        super.withdraw(amount);
    }
}