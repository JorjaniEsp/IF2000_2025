package lab3;

import logic.*;

import java.util.ArrayList;
import java.util.List;

public class Lab3 {

    public static void main(String[] args) {
        

        Client cliente1 = new Client("Jaun", "Lopez", "123", "8888-8888", 21, "BancoNacional");
        Client cliente2 = new Client("Maria", "Dolores", "456", "7777-7777", 22, "BancoNacional");

        SavingsAccount account1 = new SavingsAccount(
                "2025-01-01", 6, 0.05f,
                "ACC-SAV-001", 50000, cliente1, "BancoNacional");

        CurrentAccount account2 = new CurrentAccount(
                0.03f, "ACC-CUR-001", 30000, cliente2, "BancoNacional");

       List<Account> accounts = new ArrayList<>();
        accounts.add(account1);
        accounts.add(account2);

        account1.deposit(5000);   
        account1.withdraw(2000);  

        account2.deposit(3000);  
        account2.withdraw(1000);  
        
        System.out.println("\n---- transfers ----");
        SimpeMobile.transfer(account1, "7777-7777", "BancoNacional", 1000, "Pago a Maria", accounts);
        SimpeMobile.transfer(account2, "8888-8888", "BancoNacional", 1000, "Pago a Jaun", accounts);

        System.out.println(account1);
        System.out.println(account2);

   
        System.out.println("\n---- Binnacle ----");
        SimpeMobile.log.printAll();
        SavingsAccount.log.printAll();
        CurrentAccount.log.printAll();
        
    }
    
}
