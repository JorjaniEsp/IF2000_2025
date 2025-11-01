package logic;
import java.io.*;
import javax.swing.JOptionPane;
import domain.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;



public class ManejoDeArchivos {
    
    private static final String NOMBRE_ARCHIVO = "personas.txt";

    public static void guardarRegistro(Persona persona) {

        DateTimeFormatter formato = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
        String fechaFormateada = LocalDateTime.now().format(formato);
        
        String lineaParaGuardar = persona.getNombreCompleto() + "|"
                                + persona.getCedula() + "|"
                                + persona.getEdad() + "|"
                                + persona.getCorreoElectronico() + "|"
                                + persona.getTelefono() + "|"
                                + fechaFormateada;
        try (FileWriter fileWriter = new FileWriter(NOMBRE_ARCHIVO, true); 
             BufferedWriter bufferedWriter = new BufferedWriter(fileWriter)) {
            
            bufferedWriter.write(lineaParaGuardar);
            bufferedWriter.newLine(); 
            
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Error al escribir en el archivo: " + e.getMessage(), "Error de Archivo", JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
        }
    }

    public static void mostrarDatosGuardados() {
        File archivo = new File(NOMBRE_ARCHIVO);

        if (!archivo.exists() || archivo.length() == 0) {
            System.out.println("No hay registros que mostrar");
            return;
        }

        System.out.println("\n--- Registros Guardados en " + NOMBRE_ARCHIVO + " ---");
        
        try (BufferedReader reader = new BufferedReader(new FileReader(archivo))) {
            String linea;
            while ((linea = reader.readLine()) != null) {
                System.out.println(linea);
            }
        } catch (IOException e) {
            System.out.println(" Error al leer el archivo: " + e.getMessage());
        }
        System.out.println("------------------------------------");
    }
 
}
