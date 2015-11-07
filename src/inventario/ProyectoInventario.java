
package inventario;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.HashMap;



public class ProyectoInventario {

    
    public static void main(String[] args) {
        /* Recibir de los campos view/crearProducto
            JTextField    textCodigo;
            JTextField    textNombre;
            JTextField    textDescripcion;
            JTextField    textTalla;
            JTextField    textMarca;
            JTextField    textStock;
            JTextField    textPrecio;
            JTextField    textCategoria;
            JTextField    textTipo;
            JTextField    textSexo;
            JTextField    textFecha;
        */
        
        HashMap<String, String> inventario = new HashMap<String, String>();
        //Variables que recogeria los datos de los campos de view
        inventario.put("Codigo", "001");
        inventario.put("Nombre", "Balon Caro");
        inventario.put("Descripcion", "Un balon es un solo un balon");
        inventario.put("Talla", "9");
        inventario.put("Marca", "Spalding");
        inventario.put("Stock", "50");
        inventario.put("Precio", "35.95");
        inventario.put("Categoria", "BASKET");
        inventario.put("Tipo", "BALON");
        inventario.put("Sexo", "");
        inventario.put("Fecha", "07/11/2015");
        /*String[] datosRecogidos = new String[11];
        datosRecogidos[0]="codigo";
        datosRecogidos[1]="nombre";
        datosRecogidos[2]="Descripcion";
        datosRecogidos[3]="Talla";
        datosRecogidos[4]="Marca";
        datosRecogidos[5]="Stock";
        datosRecogidos[6]="Precio";
        datosRecogidos[7]="Categoria";
        datosRecogidos[8]="Tipo";
        datosRecogidos[9]="Sexo";
        datosRecogidos[10]="fecha";*/
        crearProducto(inventario);
        //Producto nuevoProducto = new Producto(9, "1", "2", "3", "4", 9, 3.3, "Tipo", "Cat", "6", LocalDateTime.now());
        /*enumCategoria cat = enumCategoria.FOOTBALL;
        enumTipo tipo = enumTipo.BALON;
        DateFormat format = new SimpleDateFormat("d/MM/Y");
        Balon balon = new Balon(9, "1", "2", "3", "4", 9, 3.3, tipo, cat, "6", LocalDateTime.now());
        System.out.println(balon.getPrecio());*/
        /*if(balon instanceof Football)
            System.out.println("football");
        if(balon instanceof Basket)
            System.out.println("basket");*/
        //Comparar enums con string --Funciona
        /*if(balon.getCategoria().name().equals("FOOTBALL"))
            System.out.println(balon.getCategoria().name());*/
        //anadirProducto();
    }
                        //anadirProducto
    public static void crearProducto(HashMap<String, String> producto){
        enumCategoria categoria = enumCategoria.DEFAULT;
        int[] fecha = new int[3];
        String[] fechaStr = new String[3];
        fechaStr = producto.get("Fecha").split("/");
        fecha[0] = Integer.parseInt(fechaStr[0]);
        fecha[1] = Integer.parseInt(fechaStr[1]);
        fecha[2] = Integer.parseInt(fechaStr[2]);
        switch(producto.get("Categoria")){
            case "BASKET":
                categoria = enumCategoria.BASKET;
                break;
            case "FOOTBALL":
                categoria = enumCategoria.FOOTBALL;
                break;
            case "RUNNING":
                categoria = enumCategoria.RUNNING;
                break;
            case "SWIMMING":
                categoria = enumCategoria.SWIMMING;
                break;
        }
        
        switch(producto.get("Tipo")){
            case "BALON":
                        
                Balon balon = new Balon(Integer.parseInt(producto.get("Codigo")), producto.get("Nombre"), 
                producto.get("Descripcion"), producto.get("Talla"), producto.get("Marca"), 
                Integer.parseInt(producto.get("Stock")), Double.parseDouble(producto.get("Precio")), 
                enumTipo.BALON, categoria,producto.get("Sexo"), LocalDate.of(fecha[0], fecha[1], fecha[2]));
                System.out.println("Producto balon añadido...");
                break;
                
            default: System.out.println("Tipo Incorrecto!");
        }
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
