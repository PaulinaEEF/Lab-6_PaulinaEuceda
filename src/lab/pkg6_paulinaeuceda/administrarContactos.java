package lab.pkg6_paulinaeuceda;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class administrarContactos {

    private ArrayList<Contactos> listaContactos = new ArrayList();
    private File archivo = null;

    public administrarContactos() {
    }

    public administrarContactos(String path) {
        archivo = new File(path);
    }

    public ArrayList<Contactos> getListaContactos() {
        return listaContactos;
    }

    public void setListaContactos(ArrayList<Contactos> listaContactos) {
        this.listaContactos = listaContactos;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    @Override
    public String toString() {
        return "administrarContactos{" + "listaContactos=" + listaContactos + '}';
    }

    public void setContacto(Contactos p) {
        this.listaContactos.add(p);
    }

    public void escribirArchivo() throws IOException {
        FileWriter fw = null;
        BufferedWriter bw = null;
        try {
            fw = new FileWriter(archivo, true);
            bw = new BufferedWriter(fw);
            for (Contactos t : listaContactos) {
                bw.write(t.getUsername() + ",");
                bw.write(t.getContrasena() + ",");
                bw.write(t.getDisplay() + ",");
                bw.write(t.getFecha() + ";\n");
            }
            bw.flush();
        } catch (Exception ex) {
        }
        bw.close();
        fw.close();
    }

    public void cargarArchivo() {
        Scanner sc = null;
        listaContactos = new ArrayList();
        if (archivo.exists()) {
            try {
                sc = new Scanner(archivo);
                sc.useDelimiter(";");

                while (sc.hasNext()) {
                    String m = sc.next();
                    String[] tokens = m.split(",");
                    if (tokens.length == 4) {
                        Contactos u = new Contactos(tokens[0], tokens[1], tokens[2], tokens[3]);
                        listaContactos.add(u);

                    }

                }
            } catch (Exception ex) {
            }
            sc.close();
        }//FIN IF
    }

}
