package logic;
import java.util.Scanner;

public class Ejercios28_41 {
    
    Scanner sc = new Scanner(System.in);
    
    // int dia = Integer.parseInt(); convierto valores en string en int
    // String diaStr = fecha.substring(); extraigo caracteres del un string
    
    public void ejercicio_28(){
        
        int dia = 0, mes = 0, año = 0;
        String fecha, diaSt, numMesSt, anoSt;
        String nomMes;
        String meses[] = {"enero", "febrero", "marzo","abril", "mayo","junio","julio","agosto","septiembre","octubre","noviembre","diciembre"};
        
        System.out.print("Ingrese la fecha en formato dd/mm/yyyy:");
        fecha = sc.nextLine();
        
        diaSt = fecha.substring(0,2);
        numMesSt = fecha.substring(3,5);
        anoSt = fecha.substring(6,10);
        
        mes = Integer.parseInt(numMesSt);
        dia = Integer.parseInt(diaSt);
        año = Integer.parseInt(anoSt);

        
        if (mes >= 1 && mes <= 12) {
            nomMes = meses[mes - 1];
        } else {
            nomMes = "Mes inválido";
        }

        System.out.println("Día: " + dia + ", Mes: " + nomMes + ", Año: " + año);
    
 
    }//end method
    
    public void ejercicio_29(){
        
        int num1 = 0, num2 = 0, producto = 0;
        System.out.println("Ingrese num1:");
        num1 = sc.nextInt();
        System.out.println("Ingrese num:");
        num2 = sc.nextInt();
        
        for (int i = 0; i < num2; i++) {
            producto += num1;
        }
        
        System.out.print("El producto es: " + producto);
    
    }//end method
    
    public void ejercicio_30(){
        
        int num = 1;
        int result = 0;
        
        for (int i = 1; i <= 12; i++) {
            
            num = i;
            System.out.println("La tabla del "+ num);
            
            for (int j = 1; j <= 12; j++) {
                
                result = num * j;
                
                System.out.println( num + " * "+ j  +" = " + result);
                
            }// end for interno
        }//end for externo
    
    }//end method
    
    public void ejercicio_31(){
        
        int num1 = 0, num2= 0, contCociente = 0, residuo = 0;
        
        System.out.println("Ingrese un numero entero positivo: ");
        num1 = sc.nextInt();
        
        System.out.println("Ingrese un segundo numero entero positivo: ");
        num2 = sc.nextInt();
        
        if (num2 == 0) {
            System.out.println("Error: la división entre 0 no está definida.");
        
        } else {
        
        residuo = num1;
        
        while(residuo >= num2){
            
            residuo -= num2; 
            contCociente++;
        }// end while
        
        System.out.println("El cociente es:" + contCociente);
        System.out.println("El residuo es:" + residuo);
        
        }
    
    }//end method
    
    public void ejercicio_32(){
    //  Se tienen las calificaciones de los alumnos del curso IF – 1300. Diseñar un DF que calcule la
    // examen = 50%, proyecto = 30%, tareas = 20%.
    
    double notaExa = 0, notaPro = 0, notaTa = 0, notaFinal = 0;
    int cantEst = 0;
    
    System.out.println("Digite la cantidad de estudiantes: ");
    cantEst = sc.nextInt();
    
        for (int i = 0; i < cantEst; i++) {
    
    System.out.println("Agruege la obtenida en el examen dentro de una escala del (1-100)");
    notaExa = sc.nextInt();
    
    System.out.println("Agruege la obtenida en el proyecto dentro de una escala del (1-100)");
    notaPro = sc.nextInt();
    
    System.out.println("Agruege la obtenida en el tarea dentro de una escala del (1-100)");
    notaTa = sc.nextInt();
    
    notaFinal = (notaExa * 0.5) + (notaPro * 0.3) + (notaTa * 0.2);
    
    System.out.println("La nota final es de: " + notaFinal);
        }
    }//end method
    
    public void ejercicio_33(){
    // Calcular la media de un conjunto de notas de alumnos. Pondremos un valor centinela de -99 
    // que detecta el fin de los estudiantes. 
    double nota = 0, promedio = 0, totalSuma = 0;
    int cont = 0;
    
    while(nota != -99){
    System.out.println("Ingrese una nota o -99 para terminar:");
    nota = sc.nextInt();
    if(nota != -99){cont++;
    totalSuma += nota;
    }
    
    }
    promedio = totalSuma / cont;
    System.out.println("El promedio es de las notas es: " + promedio );
    
    }//end method
    
    public void ejercicio_34(){
    int cantidad = 0, num2 = 0, resultSum = 0;
    
    System.out.println("Ingrese la cantida de numeros que desea sumar: ");
    cantidad = sc.nextInt();
    
        for (int i = 0; i < cantidad; i++) {
            System.out.print("Ingrese el numero: ");
            num2 = sc.nextInt();
            
            resultSum += num2;
            
        }
        
        System.out.println("La suma total es: " + resultSum);
        
    
    }//end method
    
    public void ejercicio_35(){
        
        int num1 = 0, num2 = 0, num3 =0;
        
        System.out.println("Ingrese num1:" );
        num1 = sc.nextInt();
        System.out.println("Ingrese num2:" );
        num2 = sc.nextInt();
        System.out.println("Ingrese num3:" );
        num3 = sc.nextInt();
        
        
        if ((num1 > num2 && num1 < num3) || (num1 < num2 && num1 > num3)) {
            System.out.println("El numero central es: " + num1);
        } else if ((num2 > num1 && num2 < num3) || (num2 < num1 && num2 > num3)) {
            System.out.println("El numero central es: " + num2);
        } else {
            System.out.println("El numero central es: " + num3);
        }
    }//end method
    
    public void ejercicio_36(){
        
        String palabra = "";
        String priVocal = "";
        
        System.out.println("Ingrese una palabra: ");
        palabra = sc.nextLine();
        
        for (int i = 0; i < palabra.length(); i++) {
            String letra = palabra.substring(i, i + 1);
        if ("aeiouAEIOU".contains(letra)) {
            priVocal = letra;
            break;
        }
    } 
        System.out.println("La primera vocal es: "+ priVocal);
        
        /* 
    String palabra = "";
    String priVocal = "";

    System.out.println("Ingrese una palabra: ");
    palabra = sc.nextLine();

    for (int i = 0; i < palabra.length(); i++) {
        char letra = palabra.charAt(i);  // obtenemos el caracter en la posición i

        // Pasamos a minúscula para no preocuparnos por mayúsculas
        letra = Character.toLowerCase(letra);

        if ("aeiou".contains(String.valueOf(letra))) {
            priVocal = String.valueOf(letra);
            break; // cortamos al encontrar la primera vocal
        }
    }

    if (priVocal.equals("")) {
        System.out.println("La palabra no tiene vocales.");
    } else {
        System.out.println("La primera vocal es: " + priVocal);
    }
*/
    }//end method
    
    public void ejercicio_37(){
        
        String palabra = "";
        String letras = "";
        int contCon = 0;
        
        System.out.println("Ingrese una palabra: ");
        palabra = sc.nextLine();
        
        for (int i = 0; i < palabra.length(); i++) {
            letras = palabra.substring(i, i + 1);
        if ("aeiouAEIOU".contains(letras)) {
        } else{
        contCon++;
        }      
        }
        
        System.out.println("La cantidad de consantes es de: " + contCon);
        
        /*
        String palabra = "";
    int contCon = 0;

    System.out.println("Ingrese una palabra: ");
    palabra = sc.nextLine();

    for (int i = 0; i < palabra.length(); i++) {
        char letra = palabra.charAt(i);

        // Verificar que sea una letra (a-z o A-Z)
        if (Character.isLetter(letra)) {
            // Convertir a minúscula para simplificar
            letra = Character.toLowerCase(letra);

            // Si no es vocal, entonces es consonante
            if (!"aeiou".contains(String.valueOf(letra))) {
                contCon++;
            }
        }
    }

    System.out.println("La cantidad de consonantes es: " + contCon);
}
        */
    
    
    }//end method
    
    public void ejercicio_38(){
        
        int numerador = 0, denominador = 0;

    System.out.println("Ingrese el numerador: ");
    numerador = sc.nextInt();

    System.out.println("Ingrese el denominador: ");
    denominador = sc.nextInt();
    
    if (denominador == 0) {
        System.out.println("Error: el denominador no puede ser 0.");
    }

    int a = numerador;
    int b = denominador;
    while (b != 0) {
        int temp = b;
        b = a % b;
        a = temp;
    }
    int mcd = a;

    int numSimplificado = numerador / mcd;
    int denSimplificado = denominador / mcd;

    System.out.println("La fracción simplificada es: " + numSimplificado + "/" + denSimplificado);
    
    }//end method
    
    public void ejercicio_39(){
        
        int año = 0;
        
        System.out.println("Ingrese el año");
        año = sc.nextInt();
        
        if (año % 400 == 0) {
            System.out.println("El año es bisiesto");
        } else if (año % 100 == 0) {
            System.out.println("El año no es bisiesto");
        } else if (año % 4 == 0) {
            System.out.println("El año es bisiesto");
        } else {
            System.out.println("El año no es bisiesto");
        }
    }//end method
    
    public void ejercicio_40(){
        
        int gradosMax, gradosMin;
    int mayor = -999;   
    int menor = 999;  
    int totalDias = 0;
    int diasConError = 0;
    int errores = 0;

    while (true) {
        System.out.println("Ingrese la temperatura máxima del día o -100 para terminar:");
        gradosMax = sc.nextInt();

        System.out.println("Ingrese la temperatura mínima del día o -100 para terminar:");
        gradosMin = sc.nextInt();


        if (gradosMax == -100 && gradosMin == -100) {
            break;
        }

        totalDias++;

        if (gradosMax == 9 || gradosMin == 9 || gradosMin > gradosMax) {
            errores++;
            diasConError++;
        } else {
            if (gradosMax > mayor) {
                mayor = gradosMax;
            }
            if (gradosMin < menor) {
                menor = gradosMin;
            }
        }
    }

    double porcentajeErrores = 0;
    if (totalDias > 0) {
        porcentajeErrores = (diasConError * 100.0) / totalDias;
    }

    System.out.println("Se ingresaron datos de " + totalDias + " días");
    System.out.println("Temperatura máxima registrada: " + mayor);
    System.out.println("Temperatura mínima registrada: " + menor);
    System.out.println("Cantidad de errores: " + errores);
    System.out.println("Porcentaje de días con errores: " + porcentajeErrores + "%");
    }//end method
    
    public void ejercicio_41(){
        
        int num = 0;
        
        System.out.println("Ingrese num1: ");
        num = sc.nextInt();
        
        System.out.println("Los divisores de " + num + " son:");
        
        for (int i = 1; i <= num; i++) {
            
            if (num % i == 0){
                System.out.println(i);
        }
        }
    
    
    }//end method
}
