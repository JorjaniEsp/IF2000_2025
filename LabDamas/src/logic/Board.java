package logic;

import domain.Piece; 

public class Board {

    private Piece[][] casillas;
    private static final int TAMANO = 8;

    public Board() {
        this.casillas = new Piece[TAMANO][TAMANO];

        for (int fila = 0; fila < TAMANO; fila++) {
            for (int columna = 0; columna < TAMANO; columna++) {
                

                if ((fila + columna) % 2 != 0) {
                    
                    if (fila < 3) { 
                        casillas[fila][columna] = new Piece("R");
                    } else if (fila > 4) { 
                        casillas[fila][columna] = new Piece("B");
                    }
                }
            }
        }
    }

    public void mostrarTablero() {
        System.out.println("  0 1 2 3 4 5 6 7");
        System.out.println(" -----------------");
        for (int fila = 0; fila < TAMANO; fila++) {
            System.out.print(fila + "|");
            for (int columna = 0; columna < TAMANO; columna++) {
                if (casillas[fila][columna] != null) {
                    System.out.print(casillas[fila][columna].getColor() + " ");
                } else {
                    System.out.print(". ");
                }
            }
            System.out.println("|");
        }
        System.out.println(" -----------------");
    }

    public boolean moverFicha(int filaOrigen, int colOrigen, int filaDestino, int colDestino, String turnoActual) {
        // 1. Validar que las coordenadas estén dentro del tablero
        if (filaOrigen < 0 || filaOrigen >= TAMANO || colOrigen < 0 || colOrigen >= TAMANO ||
            filaDestino < 0 || filaDestino >= TAMANO || colDestino < 0 || colDestino >= TAMANO) {
            System.out.println("Error: Las coordenadas están fuera del tablero.");
            return false;
        }

        Piece fichaAMover = casillas[filaOrigen][colOrigen];
        if (fichaAMover == null) {
            System.out.println("Error: No hay ninguna ficha en la casilla de origen.");
            return false;
        }

        if (!fichaAMover.getColor().equals(turnoActual)) {
            System.out.println("Error: No es tu turno para mover esa ficha.");
            return false;
        }

        if (casillas[filaDestino][colDestino] != null) {
            System.out.println("Error: La casilla de destino ya está ocupada.");
            return false;
        }

        int deltaFila = filaDestino - filaOrigen;
        int deltaCol = Math.abs(colDestino - colOrigen);

        if (deltaCol != 1) {
            System.out.println("Error: El movimiento debe ser diagonal de una casilla.");
            return false;
        }
        
        if (turnoActual.equals("R")) {
            if (deltaFila != 1) {
                System.out.println("Error: Las fichas rojas solo pueden moverse hacia abajo.");
                return false;
            }
        } else {
            if (deltaFila != -1) {
                System.out.println("Error: Las fichas negras solo pueden moverse hacia arriba.");
                return false;
            }
        }

        casillas[filaDestino][colDestino] = fichaAMover;
        casillas[filaOrigen][colOrigen] = null;
        return true;
    }
}
    

