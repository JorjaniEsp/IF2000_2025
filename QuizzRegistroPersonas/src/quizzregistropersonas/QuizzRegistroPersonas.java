package quizzregistropersonas;
import logic.*;
import domain.*;

public class QuizzRegistroPersonas {

    public static void main(String[] args) {
        
        String nombre = ValidacionDeDatos.leerNoVacio();
        String cedula = ValidacionDeDatos.leerCedulaPositivo();
        int edad = ValidacionDeDatos.leerEdadPositiva();
        String correo = ValidacionDeDatos.leerCorreoValido();
        String telefono = ValidacionDeDatos.leerTelefonoValido();
    
        Persona pr1 = new Persona(nombre,cedula,edad,correo, telefono);
        
        ManejoDeArchivos.guardarRegistro(pr1);
        ManejoDeArchivos.mostrarDatosGuardados();
    }
    
}
