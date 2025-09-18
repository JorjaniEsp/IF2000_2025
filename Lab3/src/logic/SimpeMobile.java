
package logic;

import java.util.List;

public class SimpeMobile {
    
    private SimpeMobile() {} // evitar instancias
    
    public static Binnacle log = new Binnacle();

    public static void transfer(Account from, String phoneTo, String bankTo,
                                double amount, String desc, List<Account> accounts) {

        // Validar monto positivo
        if (amount <= 0) {
            throw new IllegalArgumentException("El monto debe ser positivo.");
        }

        // Validar fondos
        if (from.getBalance() < amount) {
            throw new IllegalStateException("Fondos insuficientes en la cuenta origen.");
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
            throw new IllegalStateException("No existe una cuenta en ese banco con ese numero de telefono.");
        }

        // Ejecutar transferencia
        from.withdraw(amount);   
        to.deposit(amount);     

        log.record("SINPE_OUT (" + desc + ")", from.getAccountNumber(),
                from.getClient().getId(), amount * -1, from.getBalance());
        log.record("SINPE_IN (" + desc + ")", to.getAccountNumber(),
                to.getClient().getId(), amount, to.getBalance());

        System.out.println("Transferencia SINPE completada: " +
                amount + " de " + from.getClient().getPhone() + " → " + phoneTo +
                " (" + desc + ")");
    }
    
    
    
}
