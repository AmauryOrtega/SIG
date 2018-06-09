package modelo;

import java.util.HashMap;
import java.util.Map;

public class Producto {

    private String Nombre;

    private int cantidad;
    private int utilidad;
    private Map< String, Double> receta;

    public Producto(String nombre, int cantidad, int utilidad) {
        this.Nombre = nombre;
        this.cantidad = cantidad;
        this.utilidad = utilidad;
        this.receta = new HashMap<>();
    }

    public String getName() {
        return Nombre;
    }

    public void setName(String Nombre) {
        this.Nombre = Nombre;
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

    @Override
    public String toString() {
        return "Producto{" + "Nombre=" + Nombre + ", cantidad=" + cantidad + ", utilidad=" + utilidad + ", receta=" + receta + '}';
    }

}
