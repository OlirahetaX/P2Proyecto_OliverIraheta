
package p2proyecto_oliveriraheta;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;


public class AdmMaestro {
    private ArrayList<Maestro> listaMaestros = new ArrayList();
    private File archivo = null;
    
    public AdmMaestro(String path) {
        this.archivo = new File(path);
    }

    public ArrayList<Maestro> getListaMaestros() {
        return listaMaestros;
    }

    public void setListaMaestros(ArrayList<Maestro> listaMaestros) {
        this.listaMaestros = listaMaestros;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }
    //extra mutador
    public void setAlumno(Maestro a) {
        this.listaMaestros.add(a);
    }
    public void cargarArchivo() {
        try {            
            listaMaestros = new ArrayList();
            Maestro temp;
            if (archivo.exists()) {
                FileInputStream entrada
                    = new FileInputStream(archivo);
                ObjectInputStream objeto
                    = new ObjectInputStream(entrada);
                try {
                    while ((temp = (Maestro) objeto.readObject()) != null) {
                        listaMaestros.add(temp);
                    }
                } catch (EOFException e) {
                    //encontro el final del archivo
                }
                objeto.close();
                entrada.close();
            }            
        } catch (IOException | ClassNotFoundException ex) {
            ex.printStackTrace();
        }
    }

    public void escribirArchivo() {
        FileOutputStream fw = null;
        ObjectOutputStream bw = null;
        try {
            fw = new FileOutputStream(archivo);
            bw = new ObjectOutputStream(fw);
            for (Maestro t : listaMaestros) {
                bw.writeObject(t);
            }
            bw.flush();
        } catch (IOException ex) {
        } finally {
            try {
                bw.close();
                fw.close();
            } catch (IOException ex) {
            }
        }
    }
}
