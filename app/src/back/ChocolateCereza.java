package back;

import java.util.HashMap;
import java.util.Map;

public class ChocolateCereza extends Producto {

    private final String name = "Chocolate y Cereza";
    private int cantidad;
    private final int precio = 4000;
    private final Map< String, Double> receta = new HashMap<>();

    public ChocolateCereza() {

        receta.put("Harina(g)", 41.63);
        receta.put("Polvo para Hornear(mg)", 0.083);
        receta.put("Bicarbonato de Sodio(mg)", 0.083);
        receta.put("Azúcar(g)", 41.667);
        receta.put("Azúcar(g)", 41.667);
        receta.put("Azúcar(g)", 41.667);      
        receta.put("Azúcar(g)", 41.667);
        
        
        receta.put("Huevo(piezas)", 0.333);
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
