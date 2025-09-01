
package logic;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class Ejercicios_Semana2_PracticaEnClase {

    public Ejercicios_Semana2_PracticaEnClase() {
    }
    
    Scanner sc = new Scanner(System.in);
    
     public void quiz2_A_numPrimos(){
         
         System.out.println("Ingrese el numero: ");
         int num = sc.nextInt();
         
         if (num % 2 == 1) {
             
             System.out.println("El numero si es primo");
             
         } else{
             System.out.println("El numero no es primo");
         
         }
     
     }
    
    public void quiz2_B_piramide(int n){
        for (int i = 1; i<= n ; i++){
            //controla los espacios vacios 
            
            for (int j = 1; j <=(n-i); j++) {
             System.out.print(" ");   
            }//endForInterno A}
            //Controla los *S de la piramide
            
            for (int k = 1; k <=(2*i-1); k++) {
                System.out.print("*");
            }//endForInterno B
            System.out.println("");
        }//endExterno
    }//endMetodo
    
    public void ejercicio_A(int n){
        System.out.println("*  *  *  *  *");
        // controla las filas
        //for (int i = 1; i <=n-2; i++) {
            // controla los *S
            for (int j = 1; j <=n-2 ; j++) {
                System.out.println("*           *");
            }//EnForInterno
                
           // System.out.println("");
       // }//endForExterno
       System.out.println("*  *  *  *  *");
    
    }
    public void ejercicio_B(int n){
        
        
        for (int i = n; i >= 1; i--) {
            
            for(int k = 1; k <= i; k++){
            System.out.print("*");
            }
            
            System.out.println();
            
        }//end for
    
    
    }// end method
    
    public void ejercicio_C(int n){
        
         for (int i = n; i >= 1; i--) {   //Los niveles/Filas 
         for (int j = 1; j <=n-i; j++) System.out.print(" "); //Los espacios
         for (int k = 1; k <= i; k++) System.out.print("*"); //Los *
         System.out.println();
}
        }
        
        public void ejercicio_D(){
            
            int[] numeros = new int[10];
            int tmp = 0;
            
            for (int i = 0; i < 10; i++) {
                
                System.out.println("Ingrese un numero");
                numeros[i] = sc.nextInt();
                
            }
            for (int i=0; i < numeros.length-1; i++)
                for (int j=i+1; j < numeros.length; j++)

                    if (numeros[i] > numeros[j]) {
                        tmp = numeros[i];
                        numeros[i] = numeros[j];
                        numeros[j] = tmp;
                    }
            System.out.println(Arrays.toString(numeros));
        }
            public void ejercicio_E(){
                 Integer[] numeros = new Integer[100]; // Usamos Integer para poder ordenar con Comparator
        Random rand = new Random();

        // Generar 100 números aleatorios entre 0 y 999
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = rand.nextInt(200); 
        }

        // Ordenar en forma descendente
        Arrays.sort(numeros, Collections.reverseOrder());

        // Imprimir el arreglo ordenado
        System.out.println("Arreglo ordenado descendentemente:");
        System.out.println(Arrays.toString(numeros));
            }
            
           public void ejercicio_F(){
           
               String[][] tablero = new String[8][8];

        // Inicializar el tablero con espacios vacíos
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                tablero[i][j] = " ";
            }
        }

        // Colocar fichas negras en filas A, B, C
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 8; j++) {
                if ((i + j) % 2 == 0) {
                    tablero[i][j] = "N";
                }
            }
        }

        // Colocar fichas rojas en filas F, G, H
        for (int i = 5; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if ((i + j) % 2 == 0) {
                    tablero[i][j] = "R";
                }
            }
        }

        // Imprimir encabezado de columnas
        System.out.print("   ");
        for (int col = 1; col <= 8; col++) {
            System.out.print(col + "  ");
        }
        System.out.println();

        // Imprimir filas con etiquetas A–H
        for (int i = 0; i < 8; i++) {
            char fila = (char) ('A' + i);
            System.out.print(fila + "  ");
            for (int j = 0; j < 8; j++) {
                System.out.print(tablero[i][j] + "  ");
            }
            System.out.println();

           
           }
           }
    
    


}
