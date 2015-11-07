package inventario;

import java.util.Date;

public class DeporteBasico /*extends Producto*/ {

    private String camiseta;
    private String pantalon;
    private String calzado;
    private String calcetin;

    public DeporteBasico(int codigo, String nombre, String descripcion, String talla, String marca, int stock, Double precio, String categoria, String sexo, Date fecha, String camiseta, String pantalon, String calzado, String calcetin) {
        //super(codigo, nombre, descripcion, talla, marca, stock, precio, categoria, sexo, fecha);
        this.camiseta = camiseta;
        this.pantalon = pantalon;
        this.calzado = calzado;
        this.calcetin = calcetin;
    }

}
