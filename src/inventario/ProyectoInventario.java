
package inventario;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;



public class ProyectoInventario {

    
    public static void main(String[] args) {
        /* Recibo de view
            
        */
        
        
        enumCategoria cat = enumCategoria.FOOTBALL;
        enumTipo tipo = enumTipo.BALON;
        DateFormat format = new SimpleDateFormat("d/MM/Y");
        Balon balon = new Balon(9, "1", "2", "3", "4", 9, 3.3, tipo, cat, "6", LocalDateTime.now());
        System.out.println(balon.getPrecio());
        /*if(balon instanceof Football)
            System.out.println("football");
        if(balon instanceof Basket)
            System.out.println("basket");*/
        //Comparar enums con string --Funciona
        if(balon.getCategoria().name().equals("FOOTBALL"))
            System.out.println(balon.getCategoria().name());
        //anadirProducto();
    }
                        //anadirProducto
    public static void crearProducto(){
        
    }        
    public static void editarProducto(){
    
    }
    public static void eliminarProducto(){
        
    }
    public static void buscarProducto(){
        
    }
    public void ordenarBasico(){
        
    }
}
