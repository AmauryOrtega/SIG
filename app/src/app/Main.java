package app;

import back.*;

public class Main {

    public static void main(String[] args) {

        Control simulacion = new Control();
        int diasSimulacion = 13;

        for (int dia = 1; dia <= diasSimulacion; dia++) {
            simulacion.ventaDia(dia);
            //Estado de las variables por iteracion(dia)
            MandarDatos.mandar(dia, simulacion.getListaProductos(), simulacion.getInventario());
        }

    }

}
