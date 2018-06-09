package modelo;

public class Oreo extends Producto {

    public Oreo() {

        super("Oreo", 0, 2450);
        this.getReceta().put("Galleta Oreo(pieza)", 1.4);
        this.getReceta().put("Queso Crema(g)", 30.0);
        this.getReceta().put("Azucar(g)", 8.333);
        this.getReceta().put("Vainilla(mg)", 0.033);
        this.getReceta().put("Huevo(pieza)", 0.133);
        this.getReceta().put("Crema Acida(dl)", 0.083);
        this.getReceta().put("Sal(pizca)", 0.033);
    }

}
