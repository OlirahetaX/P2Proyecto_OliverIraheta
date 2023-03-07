package p2proyecto_oliveriraheta;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class AdmRegistro {

    private ArrayList<Registro> listaRegistros = new ArrayList();
    private File archivo = null;

    public AdmRegistro(String path) {
        this.archivo = new File(path);
    }

    public ArrayList<Registro> getListaRegistros() {
        return listaRegistros;
    }

    public void setListaRegistros(ArrayList<Registro> listaRegistros) {
        this.listaRegistros = listaRegistros;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }
    
    public void setRegistro(Registro r){
        this.listaRegistros.add(r);
    }
    
    public void cargarArchivo() {
        try {            
            listaRegistros = new ArrayList();
            Registro temp;
            if (archivo.exists()) {
                FileInputStream entrada
                    = new FileInputStream(archivo);
                ObjectInputStream objeto
                    = new ObjectInputStream(entrada);
                try {
                    while ((temp = (Registro) objeto.readObject()) != null) {
                        listaRegistros.add(temp);
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
            for (Registro t : listaRegistros) {
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
