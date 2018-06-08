/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package back;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Gray
 */
public class Control {
    private final int diasSimulacion = 13;
    private Map< Integer,ArrayList> ventaDia;
    private ArrayList<Producto> lista ;

    public Control(ArrayList<Producto> lista) {
        this.ventaDia = new HashMap<>();
        this.lista = lista;
    }
    
    public void ventadia (int a, int b, int c, int d, int e,int dia){
        setCantidades(a, b, c, d, e);
        ventaDia.put(dia, lista);
    }
    
    public void setCantidades(int a, int b, int c, int d, int e){
        lista.get(0).setCantidad(a);
        lista.get(1).setCantidad(b);
        lista.get(2).setCantidad(c);
        lista.get(3).setCantidad(d);
        lista.get(4).setCantidad(e);
    }
    
}
