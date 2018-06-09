package back;

import java.util.HashMap;
import java.util.Map;

public class Oreo extends Producto {

    private final String name = "Oreo";
    private int cantidad;
    private final int utilidad = 2450;
    private final Map< String, Double> receta = new HashMap<>();

    public Oreo() {

        receta.put("Galleta Oreo(pieza)", 1.4);
        receta.put("Queso Crema(g)", 30.0);
        receta.put("Azúcar(g)", 8.333);
        receta.put("Vainilla(mg)", 0.033);
        receta.put("Huevo(pieza)", 0.133);
        receta.put("Crema Ácida(dl)", 0.083);
        receta.put("Sal(pizca)", 0.033);

    }

    @Override
    public int getUtilidad() {
        return this.utilidad; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getCantidad() {
        return this.cantidad;
    }

    @Override
    public void setCantidad(int cantidad) {
        super.setCantidad(); //To change body of generated methods, choose Tools | Templates.
        this.cantidad = cantidad;
    }

}
