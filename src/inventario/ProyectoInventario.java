
package inventario;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;



public class ProyectoInventario {

    
    public static void main(String[] args) {
        enumCategoria cat = enumCategoria.FOOTBALL;
        DateFormat format = new SimpleDateFormat("d/MM/Y");
        Balon balon = new Balon(9, "1", "2", "3", "4", 9, 3.3, cat, "6", LocalDateTime.now());
        System.out.println(balon.getPrecio());
        /*if(balon instanceof Football)
            System.out.println("football");
        if(balon instanceof Basket)
            System.out.println("basket");*/
        //Comparar enums con string --Funciona
        if(balon.getCategoria().name().equals("FOOTBALL"))
            System.out.println(balon.getCategoria().name());
        
    }
    
    public static void anadirProducto(){
        
    }        
    public void editarProducto(){
    
    }
    public void eliminarProducto(){
        
    }
    public void buscarProducto(){
        
    }
    public void ordenarBasico(){
        
    }
}
