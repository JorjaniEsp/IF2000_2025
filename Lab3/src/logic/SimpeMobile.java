
package logic;

import java.util.List;

public class SimpeMobile {
    
    private SimpeMobile() {} // evitar instancias
    
    public static Binnacle log = new Binnacle();

    public static void transfer(Account from, String phoneTo, String bankTo,
                                double amount, String desc, List<Account> accounts) {

        // Validar monto positivo
        if (amount <= 0) {
            throw new IllegalArgumentException("The amount must be positive.");
        }

        // Validar fondos
        if (from.getBalance() < amount) {
            throw new IllegalStateException("Insufficient funds in the source account.");
        }

        // Buscar cuenta destino por teléfono y banco
        Account to = null;
        for (Account acc : accounts) {
            if (acc.getClient() != null
                    && phoneTo.equals(acc.getClient().getPhone())
                    && bankTo.equalsIgnoreCase(acc.getBank())) {
                to = acc;
                break; 
            }
        }

        if (to == null) {
            throw new IllegalStateException("There is no account in that bank associated with that phone number.");
        }

        // Ejecutar transferencia
        from.withdraw(amount);   
        to.deposit(amount);     

        log.record("SINPE_OUT (" + desc + ")", from.getAccountNumber(),
                from.getClient().getId(), amount * -1, from.getBalance());
        log.record("SINPE_IN (" + desc + ")", to.getAccountNumber(),
                to.getClient().getId(), amount, to.getBalance());

        System.out.println("Simpe transfer completed: " +
                amount + " de " + from.getClient().getPhone() + " → " + phoneTo +
                " (" + desc + ")");
    }
    
    
    
}
