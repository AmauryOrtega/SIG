package back;

import java.util.HashMap;
import java.util.Map;

public class ZanahoriaPasas extends Producto {

    private final String name = "Zanahoria con Pasas";
    private int cantidad;
    private final int precio = 3000;
    private final Map< String, Double> receta = new HashMap<>();

    public ZanahoriaPasas() {

        receta.put("Harina(g)", 20.833);
        receta.put("Azúcar(g)", 41.667);
        receta.put("Zanahoria Finamente Rallada(g)", 62.500);
        receta.put("Polvo para Hornear(mg)", 0.083);
        receta.put("Bicarbonato de Sodio(mg)", 0.083);
        receta.put("Canela en Polvo(mg)", 0.083);
        receta.put("Aceite Vegetal(dl)", 2.5);
        receta.put("Huevo(pieza)", 0.333);
    }

    @Override
    public int getPrecio() {
        return this.precio; //To change body of generated methods, choose Tools | Templates.
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
