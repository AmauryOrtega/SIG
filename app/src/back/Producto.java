package back;

import java.util.HashMap;
import java.util.Map;

public abstract class Producto {

    public void setCantidad(int cantidad) {
    }

    public int getCantidad() {
        return 0;
    }

    public int getUtilidad() {
        return 0;
    }
    
    public Map getReceta() {
        return new HashMap<>();
    }

    void setCantidad() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
