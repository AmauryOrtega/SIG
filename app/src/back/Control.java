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
    private Inventario inventario = new Inventario();

    public Control() {

        this.ventaDia = new HashMap<>();
        this.lista.add(new RedVelvet());
        this.lista.add(new ZanahoriaPasas());
        this.lista.add(new Oreo());
        this.lista.add(new Napolitano());
        this.lista.add(new ChocolateCereza());

    }

    public void ventaDia(int dia) {
        Random rn = new Random();
        int a = rn.nextInt(50) + 1;
        int b = rn.nextInt(50) + 1;
        int c = rn.nextInt(50) + 1;
        int d = rn.nextInt(50) + 1;
        int e = rn.nextInt(50) + 1;
        setCantidades(a, b, c, d, e);

        for (String ingrediente : inventario.getListaInventario().keySet()) {
            for (Producto producto : lista) {
                Double cantidad_actual = inventario.getListaInventario().get(ingrediente);
                Double cantidad_a_restar = (Double) producto.getReceta().getOrDefault(ingrediente, 0.0);
                inventario.getListaInventario().put(ingrediente, cantidad_actual - cantidad_a_restar);
            }
        }
       
        int utilidad = ventaDelDia();
        //Este es el map que se va.
        ventaDia.put("Dia", dia);
        ventaDia.put("utilidad", utilidad);
    }

    public int ventaDelDia() {
        int utilidad = 0;
        for (Producto producto : lista) {
            utilidad += (producto.getCantidad() * producto.getUtilidad());
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
            ventaDia(i);
        }
    }

    public void informe() {

    }

}
