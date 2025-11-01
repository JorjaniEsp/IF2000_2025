package logic;
import javax.swing.JOptionPane;

public class ValidacionDeDatos {
    
    public static String leerNoVacio() {
        String nombre;
        while (true) {
           nombre = JOptionPane.showInputDialog(null, "Ingrese el nombre completo: ").trim(); 
            if (!nombre.isEmpty()) {
                return nombre; 
            } else {
                JOptionPane.showMessageDialog(null, "ERROR: El nombre no puede estar vacio. \n Intentalo de nuevo. ");
            }
        }
    }

    public static String leerCedulaPositivo() {
        String cedula;
        while (true) {
            try {
                cedula = JOptionPane.showInputDialog(null, "Ingrese su numero de cedula: "); 
                if ( cedula.length()> 0 ) {
                    return cedula; 
                } else {
                    JOptionPane.showMessageDialog(null, "ERROR: La cedula debe contener un numero entero positivo. \n Intentalo de nuevo. ");
                }
            } catch (NumberFormatException e) {
                System.out.println("Error: Debe ingresar un número válido. \n Inténtelo de nuevo.");
            }
        }
    }
    
    public static int leerEdadPositiva() {
        int edad;
        while (true) {
            try {
                edad = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la edad: ")); 
                if ( edad > 0 ) {
                    return edad; 
                } else {
                    JOptionPane.showMessageDialog(null, "ERROR: La edad debe ser un entero positivo. \n Intentalo de nuevo. ");
                }
            } catch (NumberFormatException e) {
                System.out.println("Error: Debe ingresar un número válido. \n Inténtelo de nuevo.");
            }
        }
    }

    public static String leerCorreoValido() {
        String correo;
        while (true) {
            correo = JOptionPane.showInputDialog(null, "Ingrese el correo electronico: ").trim();
            if (correo.contains("@")) {
                return correo; 
            } else {
                JOptionPane.showMessageDialog(null, "ERROR: El correo debe contener @. \n Intentalo de nuevo. ");
            }
        }
    }

    public static String leerTelefonoValido() {
        while (true) {
            String telefono = JOptionPane.showInputDialog(null, "Ingrese el teléfono (mínimo 8 dígitos):");

            if (telefono.length() >= 8) {
                return telefono; 
            } else{
            JOptionPane.showMessageDialog(null, "Error: Ingrese un número válido de al menos 8 dígitos.");
            }
        }
    }
}
