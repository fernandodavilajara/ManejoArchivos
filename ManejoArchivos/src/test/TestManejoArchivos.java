package test;

import static manejoarchivos.ManejoArchivos.*;

public class TestManejoArchivos {

    public static void main(String[] args) {
        var nombreArchivo = "prueba.txt";
        //crearArchivo(nombreArchivo);
        anexarInfo(nombreArchivo, "Información anexada");
        leerArchivo(nombreArchivo);

    }

}
