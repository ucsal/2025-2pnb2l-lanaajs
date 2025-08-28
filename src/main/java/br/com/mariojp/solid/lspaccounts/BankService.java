package br.com.mariojp.solid.lspaccounts;

public class BankService {

    public void processWithdrawal(Withdrawable wit, double amount){
        wit.withdrawable(amount);
    }
}