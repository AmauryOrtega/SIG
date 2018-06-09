/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package back;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Gray
 */
public class Oreo extends Producto {

    private static final String name = "Zanahoria con Pasas";
    private int cantidad;
    private static final int precio = 3000;
    private final Map< String, Double> receta = new HashMap<>();

    public Oreo() {
           
        receta.put("Harina(g)", 20.833);
        receta.put("Azúcar(g)", 41.667);
        receta.put("Zanahoria Finamente Rallada(g)", 62.500);
        receta.put("Polvo para Hornear(mg)", 0.083);
        receta.put("Bicarbonato de Sodio(mg)", 0.083);
        receta.put("Canela en Polvo(mg)", 0.083);
        receta.put("Aceite Vegetal(dl)", 2.500);
        receta.put("Huevo(piezas)", 0.333);
    }

    public static String getName() {
        return name;
    }

    public int getCantidad() {
        return cantidad;
    }

    public static int getPrecio() {
        return precio;
    }

    public Map<String, Double> getReceta() {
        return receta;
    }
    
    
    @Override
    public void setCantidad(int cantidad) {
        super.setCantidad(); //To change body of generated methods, choose Tools | Templates.
        this.cantidad = cantidad;
    }

}
