import br.com.mariojp.solid.lspaccounts.BankService;
import br.com.mariojp.solid.lspaccounts.CheckingAccount;
import br.com.mariojp.solid.lspaccounts.SavingsAccount;

public class Main {
    public static void main(String[] args) {

        // Conta corrente pode sacar
        CheckingAccount cc = new CheckingAccount();

        cc.deposit(500);
        new BankService().processWithdrawal(cc, 100);
        System.out.println(cc.getBalance()); // 400.0

        // Conta poupança - não compila se tentar passar para processWithdrawal
        SavingsAccount poupanca = new SavingsAccount();
        
        poupanca.deposit(500);

        // new BankService().processWithdrawal(poupanca, 100); ❌ ERRO DE COMPILAÇÃO
        System.out.println(poupanca.getBalance()); // 500.0
    }
}
