package inventario;

import java.time.LocalDateTime;
import java.util.Date;

public class TrajeDeBano extends Producto implements Swimming{

    public TrajeDeBano(int codigo, String nombre, String descripcion, String talla, String marca, int stock, Double precio, enumCategoria categoria, String sexo, LocalDateTime fecha) {
        super(codigo, nombre, descripcion, talla, marca, stock, precio, categoria, sexo, fecha);
    }

    /*public TrajeDeBano(int codigo, String nombre, String descripcion, String talla, String marca, int stock, Double precio, String categoria, String sexo, Date fecha, String trajedebano) {
        super(codigo, nombre, descripcion, talla, marca, stock, precio, categoria, sexo, fecha, trajedebano);
    }*/
    
}
