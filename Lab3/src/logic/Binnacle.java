package logic;

import java.time.LocalDateTime; 
import java.util.ArrayList;     // Lista para guardar los registros
import java.util.Collections;   // Para devolver la lista sin que pueda modificarse desde afuera
import java.util.List;

public class Binnacle {
    
    // Contador para generar el número consecutivo de eventos
    private int idEvento = 0;

    // Lista donde se guardan las entradas de la bitácora
    // Cada entrada será un String con toda la información del movimiento
    private final List<String> transactions = new ArrayList<>();

    public void record(String event, String accountNumber, String clientId, double amount, double balanceAfter) {
        idEvento++; 

        String line = String.format(
                "Idevent=%d | Event=%s | Date=%s | NumberAccount=%s | IdClient=%s | Amount=%.2f | FinalBalance=%.2f",
                idEvento, event, LocalDateTime.now(), accountNumber, clientId, amount, balanceAfter);

        // Agrega la línea a la lista de entradas
        transactions.add(line);
    }

    public List<String> getEntries() {
        return Collections.unmodifiableList(transactions);
    }
    public void printAll() {
        for (String e : transactions) {
            System.out.println(e);
        }
    }
    
    
    
}
