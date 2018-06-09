package app;

import back.*;

public class Main {

    public static void main(String[] args) {

        Control simulacion = new Control();
        int diasSimulacion = 13;
  
        for (int i = 1; i <= diasSimulacion; i++) {
            simulacion.ventaDia(i);
            // la variable dia es i
            
            //Estado de las variables por iteracion(dia)
            
            simulacion.getListaProductos();
            simulacion.getInventario();
            
        }

        

    }

}
