
package logic;


public class Quiz_3 {
    
    public void parte_3(int n){
            if (n <= 0) return; //si n es 0 o negativo, no hay nada que dibujar; salimos del método de inmediato.

    int centro = (n + 1) / 2; // fila/columna central (si n es par, queda el centro "superior-izq")

    for (int fila = 1; fila <= n; fila++) {              // n filas
        for (int colum = 1; colum <= n; colum++) {       // n columnas por fila
            boolean borde = (fila == 1 || fila == n       // arriba o abajo
                           || colum == 1 || colum == n);  // izquierda o derecha
            //Marca el punto central dentro del cuadrado (la “estrellita” del centro).
            boolean puntoInterior = (fila == centro && colum == centro);
            
            System.out.print( (borde || puntoInterior) ? "* " : "  " ); // usa "* " y "  " para que se vea proporcionado
        }
        System.out.println(); // salto de línea al terminar la fila
    }
}
    
}
