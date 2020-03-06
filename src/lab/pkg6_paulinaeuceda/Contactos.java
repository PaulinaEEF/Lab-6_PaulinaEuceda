
package lab.pkg6_paulinaeuceda;



public class Contactos {
    private String username, contrasena, display;
    private String fecha;

    public Contactos() {
    }

    public Contactos(String username, String contrasena, String display, String fecha) {
        this.username = username;
        this.contrasena = contrasena;
        this.display = display;
        this.fecha = fecha;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public String getDisplay() {
        return display;
    }

    public void setDisplay(String display) {
        this.display = display;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        return display;
    }
    
    
}
