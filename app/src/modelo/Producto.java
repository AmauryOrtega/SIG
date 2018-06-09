package modelo;

import java.util.HashMap;
import java.util.Map;

public class Producto {

    private String name;

    private int cantidad;
    private int utilidad;
    private Map< String, Double> receta;

    public Producto(String name, int cantidad, int utilidad) {
        this.name = name;
        this.cantidad = cantidad;
        this.utilidad = utilidad;
        this.receta = new HashMap<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getUtilidad() {
        return utilidad;
    }

    public void setUtilidad(int utilidad) {
        this.utilidad = utilidad;
    }

    public Map<String, Double> getReceta() {
        return receta;
    }

    public void setReceta(Map<String, Double> receta) {
        this.receta = receta;
    }

}
