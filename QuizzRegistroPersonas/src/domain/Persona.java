package domain;


public class Persona {
    
    private static String nombreCompleto;
    private String Cedula;
    private int edad;
    private String correoElectronico;
    private String telefono;

    public Persona() {
    }

    public Persona(String nombreCompleto, String Cedula, int edad, String correoElectronico, String telefono) {
        this.nombreCompleto = nombreCompleto;
        this.Cedula = Cedula;
        this.edad = edad;
        this.correoElectronico = correoElectronico;
        this.telefono = telefono;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public String getCedula() {
        return Cedula;
    }

    public void setCedula(String Cedula) {
        this.Cedula = Cedula;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "Persona:\n" +
           "  nombreCompleto='" + nombreCompleto + "'\n" +
           "  cedula='" + Cedula + "'\n" +
           "  edad=" + edad + "\n" +
           "  correoElectronico='" + correoElectronico + "'\n" +
           "  telefono='" + telefono + "'";
    }
  
}
