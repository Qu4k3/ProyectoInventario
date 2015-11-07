
package inventario;

import java.time.LocalDateTime;

public class Producto {
    private int codigo;
    private String nombre;
    private String descripcion;
    private String talla;
    private String marca;
    private int stock;
    private Double precio;
    private enumCategoria categoria;
    private enumTipo tipo;
    private String sexo;
    private LocalDateTime fecha;

    public Producto(int codigo, String nombre, String descripcion, String talla, String marca, int stock, Double precio, enumTipo tipo, enumCategoria categoria, String sexo, LocalDateTime fecha) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.talla = talla;
        this.marca = marca;
        this.stock = stock;
        this.precio = precio;
        this.categoria = categoria;
        this.sexo = sexo;
        this.fecha = fecha;
    }

    public Double getPrecio() {
        return precio;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public int getStock() {
        return stock;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }
    
    public void setStock(int stock) {
        this.stock = stock;
    }

    public enumCategoria getCategoria() {
        return categoria;
    }
    
}
