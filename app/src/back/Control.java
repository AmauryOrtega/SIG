package back;

import modelo.Producto;
import modelo.ChocolateCereza;
import modelo.ZanahoriaPasas;
import modelo.RedVelvet;
import modelo.Oreo;
import modelo.Napolitano;
import java.util.ArrayList;
import java.util.Random;

public class Control {

    private ArrayList<Producto> listaProductos;
    private Inventario inventario = new Inventario();

    public Control() {
        listaProductos = new ArrayList<>();
        this.listaProductos.add(new RedVelvet());
        this.listaProductos.add(new ZanahoriaPasas());
        this.listaProductos.add(new Oreo());
        this.listaProductos.add(new Napolitano());
        this.listaProductos.add(new ChocolateCereza());

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
            for (Producto producto : listaProductos) {
                Double cantidad_a_restar = (Double) producto.getReceta().getOrDefault(ingrediente, 0.0) * producto.getCantidad();
                if (cantidad_a_restar >= inventario.getListaInventario().get(ingrediente)) {
                    // Reabastecimiento
                    inventario.getListaInventario().put(ingrediente, inventario.getListaInventario().get(ingrediente) - cantidad_a_restar);
                    while (inventario.getListaInventario().get(ingrediente) <= 0) {
                        inventario.getListaInventario().put(
                                ingrediente,
                                inventario.getListaInventario().get(ingrediente) + inventario.getListaInventarioDefault().get(ingrediente)
                        );
                    }
                } else {
                    // Venta normal
                    inventario.getListaInventario().put(ingrediente, inventario.getListaInventario().get(ingrediente) - cantidad_a_restar);
                }
            }
        }
    }

    public void setCantidades(int a, int b, int c, int d, int e) {
        listaProductos.get(0).setCantidad(a);
        listaProductos.get(1).setCantidad(b);
        listaProductos.get(2).setCantidad(c);
        listaProductos.get(3).setCantidad(d);
        listaProductos.get(4).setCantidad(e);
    }

    public ArrayList<Producto> getListaProductos() {
        return listaProductos;
    }

    public void setListaProductos(ArrayList<Producto> listaProductos) {
        this.listaProductos = listaProductos;
    }

    public Inventario getInventario() {
        return inventario;
    }

    public void setInventario(Inventario inventario) {
        this.inventario = inventario;
    }

}
