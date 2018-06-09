package back;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Control {

    private static final int diasSimulacion = 13;
    private Map< String, Integer> ventaDia;
    private ArrayList<Producto> lista;

    public Control(ArrayList<Producto> lista) {
        this.ventaDia = new HashMap<>();
        this.lista = lista;
    }

    public void ventadia(int dia) {
        Random rn = new Random();
        int a = rn.nextInt(30) + 1;
        int b = rn.nextInt(30) + 1;
        int c = rn.nextInt(30) + 1;
        int d = rn.nextInt(30) + 1;
        int e = rn.nextInt(30) + 1;
        setCantidades(a, b, c, d, e);

        int utilidad = ventaDelDia();
        ventaDia.put("Dia", dia);
        ventaDia.put("utilidad", utilidad);
    }

    public int ventaDelDia() {
        int utilidad = 0;
        for (Producto producto : lista) {
            utilidad += (producto.getCantidad() * producto.getPrecio());
        }
        return utilidad;
    }

    public void setCantidades(int a, int b, int c, int d, int e) {
        lista.get(0).setCantidad(a);
        lista.get(1).setCantidad(b);
        lista.get(2).setCantidad(c);
        lista.get(3).setCantidad(d);
        lista.get(4).setCantidad(e);
    }

    public void ventas() {
        for (int i = 0; i < diasSimulacion; i++) {
            ventadia(i);
        }
    }

}
