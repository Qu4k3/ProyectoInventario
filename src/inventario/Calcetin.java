package inventario;

import java.time.LocalDate;

public class Calcetin extends Producto{

    public Calcetin(int codigo, String nombre, String descripcion, String talla, String marca, int stock, Double precio, enumTipo tipo, enumCategoria categoria, String sexo, LocalDate fecha) {
        super(codigo, nombre, descripcion, talla, marca, stock, precio, tipo, categoria, sexo, fecha);
    }
    
}
