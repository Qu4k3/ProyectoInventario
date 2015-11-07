
package inventario;

import java.util.Date;

public class DeporteBalon extends DeporteBasico{
    
    private String balon;

    public DeporteBalon(int codigo, String nombre, String descripcion, String talla, String marca, int stock, Double precio, String categoria, String sexo, Date fecha, String camiseta, String pantalon, String calzado, String calcetin, String balon) {
        super(codigo, nombre, descripcion, talla, marca, stock, precio, categoria, sexo, fecha, camiseta, pantalon, calzado, calcetin);
  this.balon=balon;
    }

   

    
}
