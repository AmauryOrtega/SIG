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
public class ZanhoriaPasas extends Producto{
  private final String name = "ZanahoriaPasas";
  private int cantidad;
  private final int precio = 5000;
  private final Map< String,Integer> receta= new HashMap<>();

    public ZanhoriaPasas(int cantidad){
        this.cantidad = cantidad;
        receta();
    }

    @Override
    public void setCantidad(int cantidad) {
        super.setCantidad(); //To change body of generated methods, choose Tools | Templates.
        this.cantidad = cantidad;
    }

    public void receta(){
        receta.put(null, null);
    }
  
}
