
package logic;
import java.util.Iterator;
import java.util.Scanner;

public class Lab_2 {
    Scanner sc = new Scanner(System.in);
    
    public void ejercicio_13(){
        
        int num = 2;
        int suma = 0;
        
        while (num <= 1000){
        
        suma += num; // Acumula el valor actual
        num += 2;     // Avanza al siguiente número par

            
        }
        
         System.out.print("La suma de 2 en 2 hasta 1000 es : " + suma);
    
    }// end method
    
    public void ejercicio_14(){
        
        int gradosCelsius = 0;
        int gradosFaren = 0;
        
        System.out.println("Ingrese la temperatura en grados celsius: ");
        gradosCelsius = sc.nextInt();
        
        gradosFaren = 9 / 5 * (gradosCelsius + 32);
        
        System.out.println("La temperatura en grados Fahrenheit es de: " + gradosFaren); 
    
    }// end method
    
    public void ejercicio_15(int x, int y){
        int result = 1;
        if (y > 1) {
            
            for (int i = 0; i < y; i++) {
                
                result = result * x;
                
            }
            System.out.print("El numero x (" + x + ") elvado a n (" + y + ") da como resultado: " + result);
        } else if (y == 1) {
        System.out.print("El número x (" + x + ") elevado a n (" + y + ") es: " + x);
        } else if ( y == 0){
            x = 1;
            System.out.print("El numero x (" + x + ") elevado a n (" + y + ") da como resultado: " + x); 
        }
    }// end method
    
    public void ejercicio_16(){
        
        String[] meses = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", 
                  "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};
        
        System.out.println("Ingrese un numero del 0 al 11");
        int numero = sc.nextInt();
        
        if(numero >= 0 &&  numero < 12){
            System.out.println("El numero corresponde al mes: " + meses[numero]);
        } else {
            System.out.println("El numero esta fuera de rango");
        }
    }// end method
    
    public void ejercicio_17(){
       
        int num = 0;
        System.out.println("Ingre un numero: ");
        num = sc.nextInt();
        
        
        if (num > 0){
        num += 5;
        System.out.print("El resultado de la funcion es: " + num);
        } else if(num < 0){
            
                num *= num; 
                System.out.println("El resultado de la funcion es: " + num);
           
            } else {
                    System.out.print("El resultado de la funcion es: " + 1);
                    }
                
            }// end method
    public void ejercicio_18(){
    
        double ladoA = 0;
        double ladoB = 0;
        double baseC = 0;
        double perimetro = 0;
        double area = 0;
        
        System.out.println("Ingrese la medida del lado izquierdo: ");
        ladoA = sc.nextDouble();
        
        System.out.println("Ingrese la medida del lado derecho: ");
        ladoB = sc.nextDouble();
        
        System.out.println("Iingrese la medida de la base: ");
        baseC = sc.nextDouble();
        
        perimetro = (ladoA + ladoB + baseC) / 2;
        
        area = Math.sqrt(perimetro * ( perimetro - ladoA) * ( perimetro - ladoB) * ( perimetro - baseC));
        
        //System.out.println("El perimetro es de: " + perimetro);
        System.out.println("El area es de: " + area);
    
    }// end method
    
    public void ejercicio_19(){
        
        int variable1,variable2, tmp;
        
        System.out.println("Ingrese la variable 1:");
        variable1 = sc.nextInt();
        System.out.println("Ingrese la variable 2:");
        variable2 = sc.nextInt();
        
        System.out.println("La variable 1 es " + variable1 + " y la variable 2 es " + variable2);
        
        tmp = variable1;
        variable1 = variable2;
        variable2 = tmp;
                
        /*
        variable1 = variable1 + variable2;
        variable2 = variable1 - variable2; 
        variable1 = variable1 - variable2; 
        */
        
        System.out.println("Sus valores intercambiados son los siguientes: "
                + "\nLa variable 1 ahora es " + variable1 + "\ny la variable 2 ahora es " + variable2);

    }//end method 
    
    public void ejercicio_20(){
        
        double x1 = 0, y1 = 0, x2 = 0, y2 = 0;
        double m = 0;
        double b = 0;
        double y = 0;
        
         System.out.println("Ingrese x1: ");
         x1 = sc.nextDouble();
         System.out.println("Ingrese y1: ");
         y1 = sc.nextDouble();
         
         System.out.println("Ingrese x2: ");
         x2 = sc.nextDouble();
         System.out.println("Ingrese y2: ");
         y2 = sc.nextDouble();
        
        m = (y1 - y2) / (x1 - x2);
        b = y1 - ((x1)* (m));
        
        System.out.println("La ecuacion de la recta es: y = " + m + "x + " + b);
        
    }// end method
    
    public void ejercicio_21(){
        
        int num = 0;
        int suma = 0;
        System.out.println("Ingre un numero: ");
        num = sc.nextInt();
        
        for (int i = 1; i < num; i++) {
            suma += i;
        }
        
        System.out.println("La suma de todos los numeros menores a " + num + " es de: " + suma);
       
    
    }// end method
    
    public void ejercicio_22(){
    int num = 1;
    int suma = 0;
    double promedio = 0;
    int contador = 0;
    
    
        while(num > 10){
            System.out.println("Ingrese un numero positivo o ingrese 0 para detener el ciclo" );
            num = sc.nextInt();
            if(num > 0){
            suma+= num;
            contador += 1;
            }
        }
    
        promedio = suma / contador;
        System.out.print("El promedio de todos los numeros es de: " + promedio);
        
    }// end method
    
    public void ejercicio_23(){
        
        int numeros = 0;
        int sumaPares = 0;
        int sumaImpares = 0;
        int contadorPares = 0;
        int contadorImpares = 0;
        int contNumeros = 0;
        int sumaTotal = 0;
        
        while (contNumeros < 10){
        System.out.print("Ingrese un numero: " );
        numeros = sc.nextInt();
        contNumeros += 1;
        
        if(numeros % 2 == 0){
        sumaPares += numeros;
        contadorPares += 1;
        } else{
        sumaImpares += numeros;
        contadorImpares += 1;
        }
        
        }
        sumaTotal = sumaPares + sumaImpares ;
        System.out.println("De los 10 numeros " + contadorPares + " son pares.");
        System.out.println("La suma de estos es de: " +sumaPares);
        
        System.out.println("De los 10 numeros " + contadorImpares + " son impares");
        System.out.println("La suma de los numeros impares es de: " +sumaImpares);
        System.out.println("La suma total es de: " + sumaTotal);
    
    }// end method
    
    public void ejercicio_24(){
        
        int num = 1;
        int sumaPares = 0;
        int sumaImpares = 0;
     
        for ( num = 1; num <= 200; num++) {
            if(num % 2 == 0){
            sumaPares += num;
            } else {
            sumaImpares += num;
            }
        }
        
        System.out.println("La suma de los numeros pares hasta el 200 es de " + sumaPares);
        System.out.println("La suma de los numeros impares hasta el 200 es de " + sumaImpares);
    
    }// end method
    
    public void ejercicio_25(){
    int num = 0;
    int valorCuadrado = 0;
    int sumaCuadrados = 0;
    
        for (num = 1; num <= 100; num++) {
            valorCuadrado = num * num;
            sumaCuadrados += valorCuadrado;
        }
        
        System.out.println("La suma de los cuadrados de los numeros naturales hasta el 100 es de: " + sumaCuadrados);
    
    }// end method
    
    public void ejercicio_26(){
        
        int num = 0;
        int resultFact = 1;
                
        System.out.print("Ingrese el numero a factorizar: ");
        num = sc.nextInt();
        
        for (int i = 1; i <= num; i++) {
            resultFact *= i;
        }
        
        System.out.println("El resultado es" + resultFact);
    }// end method
    
    public void ejercicio_27(){
        
        int []num = new int[10];
        
        
        for (int i = 0; i < 10; i++) {
            System.out.print("Ingrese un numero: ");
            num[i] = sc.nextInt(); 
                
            }
        int valorMaximo = num[0];
        
        for (int i = 1; i < num.length; i++) {
            if(num[i] > valorMaximo){
            valorMaximo = num[i];
            }
        }
            System.out.println("El mayor valor de la serie es " + valorMaximo);
            }
        
            
            
        }
        
 
