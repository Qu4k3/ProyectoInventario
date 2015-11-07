package inventario;

import java.time.LocalDateTime;
import java.util.Date;

public class Camiseta extends Producto implements Running, Football, Basket{

    public Camiseta(int codigo, String nombre, String descripcion, String talla, String marca, int stock, Double precio, enumCategoria categoria, String sexo, LocalDateTime fecha) {
        super(codigo, nombre, descripcion, talla, marca, stock, precio, categoria, sexo, fecha);
    }
    
}
