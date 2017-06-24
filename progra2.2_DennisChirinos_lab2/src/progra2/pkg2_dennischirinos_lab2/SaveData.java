/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package progra2.pkg2_dennischirinos_lab2;

import java.io.*;
import java.util.ArrayList;

/**
 *
 * @author denni
 */
public class SaveData {

    //File Archivo = new File("./Data.txt");
    public void SaveRuso(ArrayList<Ruso> listP) {
        try {
            File Archivo = new File("./DataRusos");
            FileOutputStream fos = new FileOutputStream(Archivo);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(listP);
            oos.flush();
            oos.close();
        } catch (Exception e) {
        }
    }
    
    public void SaveAleman(ArrayList<Aleman> listP) {
        try {
            File Archivo = new File("./DataAleman");
            FileOutputStream fos = new FileOutputStream(Archivo);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(listP);
            oos.flush();
            oos.close();
        } catch (Exception e) {
        }
    }
    
    public void SaveAlumno(ArrayList<Alumno> listP) {
        try {
            File Archivo = new File("./DataAlumno");
            FileOutputStream fos = new FileOutputStream(Archivo);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(listP);
            oos.flush();
            oos.close();
        } catch (Exception e) {
        }
    }
    
    public ArrayList<Ruso> LoadRuso() {
        File Archivo = new File("./DataRusos");
        ArrayList<Ruso> list = new ArrayList();
        try {
            FileInputStream fis = new FileInputStream(Archivo);
            ObjectInputStream OIS = new ObjectInputStream(fis);
            list = (ArrayList<Ruso>) OIS.readObject();
            OIS.close();
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return list;
    }
    
    public ArrayList<Aleman> LoadAleman() {
        File Archivo = new File("./DataAleman");
        ArrayList<Aleman> list = new ArrayList();
        try {
            FileInputStream fis = new FileInputStream(Archivo);
            ObjectInputStream OIS = new ObjectInputStream(fis);
            list = (ArrayList<Aleman>) OIS.readObject();
            OIS.close();
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return list;
    }
    
    public ArrayList<Alumno> LoadAlumno() {
        File Archivo = new File("./DataAlumno");
        ArrayList<Alumno> list = new ArrayList();
        try {
            FileInputStream fis = new FileInputStream(Archivo);
            ObjectInputStream OIS = new ObjectInputStream(fis);
            list = (ArrayList<Alumno>) OIS.readObject();
            OIS.close();
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return list;
    }
    
    public void SaveAll(ArrayList<Ruso> listP, ArrayList<Aleman> listP1, ArrayList<Alumno> listP2) {
        this.SaveRuso(listP);
        this.SaveAleman(listP1);
        this.SaveAlumno(listP2);
    }
    
}
