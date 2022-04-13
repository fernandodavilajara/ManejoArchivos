package manejoarchivos;

import java.io.*;


public class ManejoArchivos {

    public static void crearArchivo(String nombreArchivo) {
        File archivo = new File(nombreArchivo);
        try {
            PrintWriter salida = new PrintWriter(archivo);
            salida.close();
            System.out.println("Se ha creado el archivo");
        } catch (FileNotFoundException ex) {
            ex.printStackTrace(System.out);
        }

    }

    public static void escribirArchivo(String nombreArchivo, String contenido) {
        File archivo = new File(nombreArchivo);
        try {
            PrintWriter salida = new PrintWriter(archivo);
            salida.println(contenido);
            salida.close();
            System.out.println("Se ha escrito el archivo");
        } catch (FileNotFoundException ex) {
            ex.printStackTrace(System.out);
        }

    }
    
    public static void anexarInfo(String nombreArchivo, String contenido){
        File archivo = new File(nombreArchivo);
        try {
            PrintWriter salida = new PrintWriter(new FileWriter (archivo,true));//FileWriter permite hacer un append en el archivo existente
            salida.println(contenido); //el metodo oppend que aparece como opcion a println permite agregar info al objeto, no al archivo
            salida.close();
            System.out.println("se ha anexado info al archivo");
        } catch (IOException ex) {
            ex.printStackTrace(System.out);
        }
        

    }
    
    public static void leerArchivo(String nombreArchivo){
        File archivo = new File(nombreArchivo);
        try {
            BufferedReader entrada = new BufferedReader (new FileReader(archivo));
            var lectura = entrada.readLine();
            while (lectura !=null ) {
                System.out.println("lectura = " + lectura);
                lectura = entrada.readLine();
            }
            entrada.close();
            
        } catch (FileNotFoundException ex) {
            //Logger.getLogger(ManejoArchivos.class.getName()).log(Level.SEVERE, null, ex);
            ex.printStackTrace(System.out);
        } catch (IOException ex) {
            //Logger.getLogger(ManejoArchivos.class.getName()).log(Level.SEVERE, null, ex);
            ex.printStackTrace();
        }
        
    }

}
