package logic;

import java.util.Scanner;

public class Game {

    private Board tablero;
    private String turnoActual;
    private Scanner sc;

    /**
     * Constructor de la clase Juego.
     */
    public Game() {
        this.tablero = new Board(); 
        this.turnoActual = "R"; 
        this.sc = new Scanner(System.in);
    }
    
    public void iniciar() {
        while (true) {

            tablero.mostrarTablero();
            
            System.out.println("\nTurno de las fichas: " + turnoActual);
            
            System.out.print("Ingrese la Fila de Origen: ");
            int filaOrigen = sc.nextInt();
            System.out.print("Ingrese la Columna de Origen: ");
            int colOrigen = sc.nextInt();
            System.out.print("Ingrese la Fila de Destino: ");
            int filaDestino = sc.nextInt();
            System.out.print("Ingrese la Columna de Destino: ");
            int colDestino = sc.nextInt();
            
            boolean movimientoExitoso = tablero.moverFicha(filaOrigen, colOrigen, filaDestino, colDestino, turnoActual);
            
            if (movimientoExitoso) {
                cambiarTurno();
            } else {
                System.out.println("Movimiento invalido. Por favor, intente de nuevo.");
            }
        }
    }
    
    private void cambiarTurno() {
        if (turnoActual.equals("R")) {
            turnoActual = "B";
        } else {
            turnoActual = "R";
        }
    }
}
