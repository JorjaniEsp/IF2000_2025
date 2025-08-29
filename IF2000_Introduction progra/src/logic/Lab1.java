/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logic;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Lab1 {
    
    Scanner sc = new Scanner(System.in);
    
    public void ejercicio_1(){
        
        int numero = 0;
    
    System.out.println("Ingrese un numero");
    numero = sc.nextInt();
    
    if (numero % 2 ==0){
    
    System.out.print("Es un numero par");
    }
    
    else{
        System.out.print("Es un numero impar");
            
            }
    }//end method
    
    public void ejercicio_2(){
        
        int numero = 0;
        
        System.out.println("Ingrese un numero: ");
        numero = sc.nextInt();
        
        if(numero > 0){
        System.out.print("El valor absoluto es: " + numero);
        } if (numero < 0){
        numero = numero - (numero*2);
        System.out.print("El valor absoluto es: " + numero);
        }
    
    }//end method
    
    public void ejercicio_3(){
        
        int  suma=0;
         int num=3;
         
         while (num<=99){
             System.out.println(" " + num);
             suma = suma+num;
             num=num +3;
           
         }
      System.out.println("La suma del numero es:"+suma);
    }// end method
    
    public void ejercicio_4(){
        
        int num1, num2, num3, aux;

        // Leer los 3 números
        System.out.print("Ingrese el primer número: ");
        num1 = sc.nextInt();
        System.out.print("Ingrese el segundo número: ");
        num2 = sc.nextInt();
        System.out.print("Ingrese el tercer número: ");
        num3 = sc.nextInt();

        // Ordenar con intercambios (método simple)
        if (num1 > num2) {
            aux = num1;
            num1 = num2;
            num2 = aux;
        }

        if (num1 > num3) {
            aux = num1;
            num1 = num3;
            num3 = aux;
        }

        if (num2 > num3) {
            aux = num2;
            num2 = num3;
            num3 = aux;
        }
        
        System.out.println("Numeros en orden ascendente: " + num1 + ", " + num2 + ", " + num3);

        sc.close();
    
    }// end method
    
    public void ejercicio_5(){
        
    int num1 = 0;
      int num2 = 0;
      int result = 0;
      
      System.out.println("Digite el primer numero: ");
      num1=sc.nextInt();
      
      System.out.println("Digite el segundo numero: ");
      num2=sc.nextInt();
      
      if (num1 == num2){
      
      result = num1*num2;
      
      System.out.println("El resultado de la multiplicacion es: " + result);
      }
      else if (num1 > num2){
              
      result = num1 - num2;
      
      System.out.println("El resultado de la resta es: " + result);
        }
      else{
      
      result = num2 + num1;
              
       System.out.println("El resultado de la suma es: " + result);
      }
    }// end method
    
    public void ejercicio_6(){
        
         boolean nOtaDiez = false;
    int nota;

    do {
        System.out.print("Ingrese una nota (0 a 10) o -1 para terminar: ");
        nota = sc.nextInt();

        if (nota == 10) {
            nOtaDiez = true;
        }

    } while (nota != -1);

    if (nOtaDiez) {
        System.out.println("Sí hubo una nota con valor 10.");
    } else {
        System.out.println("No hubo ninguna nota con valor 10.");
    }

    sc.close();
    
    }// end method
    
    public void ejercicio_7(){
        
        System.out.println("Ingrese su sexo (F/M)");
        String sexo = sc.next(); 
        
        System.out.println("Ingrese su edad (años)");
        double edad = sc.nextInt();
        
        double pulsaciones; 
        
        if (sexo.equalsIgnoreCase("F")) {/*equalsIgnoreCase, es para que cuando el usuario ingrese F/M no 
                                           sea exigidamente en mayuscula, ya que si lo 
                                           ingresa en minuscula, asumira que es masculino.*/
            
            pulsaciones = (220 - edad)/10;
        } else {
            pulsaciones = (210 - edad)/10;
        }
        
        System.out.println("El numero de pulsaciones es de: " + pulsaciones);
        sc.close();

    
    }// en method
    
    public void ejercicio_8(){
        
         System.out.print("Ingrese el salario mensual: ");
    double salario = sc.nextDouble();

    System.out.print("Ingrese los años de antigüedad: ");
    int antiguedad = sc.nextInt();

    double utilidad;

    if (antiguedad < 1) {
        utilidad = salario * 0.05;
    } else if (antiguedad >= 1 && antiguedad < 2) {
        utilidad = salario * 0.07;
    } else if (antiguedad >= 2 && antiguedad < 5) {
        utilidad = salario * 0.10;
    } else if (antiguedad >= 5 && antiguedad < 10) {
        utilidad = salario * 0.15;
    } else {
        utilidad = salario * 0.20;
    }

    System.out.println("La utilidad a recibir es: " + utilidad);
    sc.close();

        
    }// end method
    
    public void ejercicio_9(){
     
        int num = 0;
        System.out.print("Digite un numero: ");
        num = sc.nextInt();
        
        if (num % 2 == 1){
        System.out.println("El numero " + num + "es un numero primo");
        } else {
        System.out.println("El numero " + num + "no es un numero primo");
        }  
    }// end method
    
    public void ejercicio_10(){
        
        final double precioUnitario = 11000;
    System.out.print("Ingrese la cantidad de computadoras a comprar: ");
    int cantidad = sc.nextInt();

    double precioTotal = cantidad * precioUnitario;
    double descuento;

    if (cantidad < 5) {
        descuento = precioTotal * 0.10;
    } else if (cantidad >= 5 && cantidad < 10) {
        descuento = precioTotal * 0.20;
    } else {
        descuento = precioTotal * 0.40;
    }

    double totalPagar = precioTotal - descuento;

    System.out.println("Cantidad de computadoras: " + cantidad);
    System.out.println("Precio total sin descuento: $" + precioTotal);
    System.out.println("Monto descontado: $" + descuento);
    System.out.println("Monto total a pagar: $" + totalPagar);
    
    }// end method
    
    public void ejercicio_11(){
        
        System.out.println("Ingrese un número (>= 2)");
        int n = sc.nextInt();
        
        if (n < 2) {
            System.out.println("No hay numeros primos que sean menores que 2");
        }
        
        //generar un lista con List
        List<Integer> primos = new ArrayList<>();
        for (int i = 2; i <= n; i++) {
            boolean esPrimo = true;
            for (int j = 2; j * j <= i ; j++) {
                if (i % j == 0) {
                    esPrimo = false;
                    break;
                }
                
            }
            if (esPrimo) primos.add(i); //El método add(valor) de una lista sirve para agregar un elemento al final de la lista.
            System.out.println("Numeros primos entre 2 y " + n + ", son: " + primos);
        sc.close();
        
        } 
    }// end method
        public void ejercicio_12(){
            
            int base,altura,area;
       
       System.out.println("ingrese la base guapo");
       base = sc.nextInt();
       
       System.out.println("ingrese la altura princesa xd");
       altura = sc.nextInt();
       
       area= (base*altura)/2;
       
       System.out.println("El valor del area es: " + area);
             
        }// end method
    
}
