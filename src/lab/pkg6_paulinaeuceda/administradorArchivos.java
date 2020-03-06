package lab.pkg6_paulinaeuceda;

import java.io.*;

public class administradorArchivos {

    private File archivo = null;
    
    public administradorArchivos() {
    }

    public administradorArchivos(String path) {
        archivo = new File(path);
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    @Override
    public String toString() {
        return "administradorArchivos{" + "archivo=" + archivo + '}';
    }
    
    
    public void escribirArchivo(String mensaje) throws IOException {
        FileWriter fw = null;
        BufferedWriter bw = null;
        try {
            fw = new FileWriter(archivo, true);
            bw = new BufferedWriter(fw);
            bw.write(mensaje+";");
            
            bw.flush();
        } catch (Exception ex) {
        }
        bw.close();
        fw.close();
    }

}
