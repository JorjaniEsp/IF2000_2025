
package logic;

import java.util.Scanner;

public class PracticaExa {
    
    Scanner sc = new Scanner(System.in);
    
    public void ejercicio_42(){
        int num = 0;
        int residuo = 0;
        int sumador = 0;
        
        while(num < 1000){
            num += 1;
            sumador = 0;
        for(int i = 1; i < num; i++){
            residuo = num % i;
            if(residuo == 0){
            sumador += i;
            }
        }//end for
        
        if(sumador == num){
            System.out.println(num + " es un numero perfecto");
        }
        }
    }// end method
    
    public void ejercicio_43(){
        int num = 0, cantDigitos = 0;
        System.out.println("Ingrese un numero: ");
        num = sc.nextInt();     
      
        int numAbs = Math.abs(num);
        
        String strNum = Integer.toString(numAbs);   //Integer.parseInt()
        cantDigitos = strNum.length();
        
        System.out.println("El número tiene " + cantDigitos + " dígitos");
        
    }// end method
    
    public void ejercicio_48(){
        
        String fecha = "";
        
        System.out.println("Ingrese la fecha");
        fecha = sc.nextLine();
        
        String dia = fecha.substring(0,2);
        String mes = fecha.substring(3,5);
        String año = fecha.substring(6,10);
        
        int numdia = Integer.parseInt(dia);
        
        if(numdia == 31){
            
            numdia = 1;
        
        } else{
        
        numdia++;
        }
        
        System.out.println("El dia de mañana es: " + numdia);
    
    
    }//end method
    
    public void ejercicio_49(){
        
    }// end method
    
    public void ejercicio_ramdom(){
    
    int num = 0, cont = 0, contPos = 0, contNe = 0;
    
    while(true){
    System.out.println("Ingrese un num o 0 para terminar: ");
    num = sc.nextInt();
    cont++;
    
    if(num>0){
    
    contPos++;
    } else if (num<0){
    contNe++;
    }
   
    }
    
    
    }//end method
    
    public void ejercicio_ramdom2(){
    
    double num1 = 0, num2 = 0;
    double potencia = 0, max = 0, min = 0;
    
    System.out.println("Ingrese el num1: ");
    num1 = sc.nextInt();
    
    System.out.print("Ingrese el num2: ");
    num2 = sc.nextInt();
    
    max = Math.max(num1,num2);
    min = Math.min(num1, num2);
    potencia = Math.pow(num1, num2);
    
    System.out.print("La potencia: " + potencia);
    System.out.print("El numero mayor: " + max);
    System.out.print("El numero meno: " + min);
            
    
    }
    
    public void ejercicio_ramdom3(){
        
    }
    
}
