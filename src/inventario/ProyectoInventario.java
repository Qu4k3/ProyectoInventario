
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
        
        HashMap<String, String> producto = new HashMap<String, String>();
        //Crean un objeto tipo Balon
        String[] datosView = {"001", "Balon Caro", "Un balon es un solo un balon", "9", "Spalding", "50", "35.95", "BASKET", "BALON", "", "07/11/2015"};
                            //textCodigo, textNombre, "textDescripcion", "textTalla", "textMarca", "textStock", "textPrecio", "textCategoria", "textTipo", "textSexo", "textFecha"
        producto = parsearProducto(datosView);
        crearProducto(producto);
        
        //Crea un objeto tipo Camiseta
        datosView[0]="002";
        datosView[1]="Camiseta Hawaiana";
        datosView[2]="Las camisetas con estampados rollo hamaicano, dicese de estas que, molan demasiao, perfectas para hacer Running";
        datosView[3]="M";
        datosView[4]="Hawaii-shirt";
        datosView[5]="500";
        datosView[6]="5.0";
        datosView[7]="RUNNING";
        datosView[8]="CAMISETA";
        datosView[9]="H";
        datosView[10]="05/10/2015";
        producto = parsearProducto(datosView);
        anadirProducto(producto);
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
    public static HashMap<String, String> parsearProducto(String[] datosView){
        String[] key = {"Codigo", "Nombre", "Descripcion", "Talla", "Marca", "Stock", "Precio", "Categoria", "Tipo", "Sexo", "Fecha"};
               
        HashMap<String, String> inventario = new HashMap<String, String>();
        inventario.put(key[0], datosView[0]);
        inventario.put(key[1], datosView[1]);
        inventario.put(key[2], datosView[2]);
        inventario.put(key[3], datosView[3]);
        inventario.put(key[4], datosView[4]);
        inventario.put(key[5], datosView[5]);
        inventario.put(key[6], datosView[6]);
        inventario.put(key[7], datosView[7]);
        inventario.put(key[8], datosView[8]);
        inventario.put(key[9], datosView[9]);
        inventario.put(key[10], datosView[10]);
        
        return inventario;
    }
    public static void anadirProducto(HashMap<String, String> producto){
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
                enumTipo.BALON, categoria,producto.get("Sexo"), LocalDate.of(fecha[2], fecha[1], fecha[0]));
                System.out.println("Producto balon añadido...");
                break;
            case "CAMISETA":
                Camiseta camiseta = new Camiseta(Integer.parseInt(producto.get("Codigo")), producto.get("Nombre"), 
                producto.get("Descripcion"), producto.get("Talla"), producto.get("Marca"), 
                Integer.parseInt(producto.get("Stock")), Double.parseDouble(producto.get("Precio")), 
                enumTipo.CAMISETA, categoria,producto.get("Sexo"), LocalDate.of(fecha[2], fecha[1], fecha[0]));
                System.out.println("Producto camiseta añadida...");
                break;
            case "PANTALON":
                Pantalon pantalon = new Pantalon(Integer.parseInt(producto.get("Codigo")), producto.get("Nombre"), 
                producto.get("Descripcion"), producto.get("Talla"), producto.get("Marca"), 
                Integer.parseInt(producto.get("Stock")), Double.parseDouble(producto.get("Precio")), 
                enumTipo.PANTALON, categoria,producto.get("Sexo"), LocalDate.of(fecha[2], fecha[1], fecha[0]));
                System.out.println("Producto camiseta añadida...");
                break;
            case "CALZADO":
                Calzado calzado = new Calzado(Integer.parseInt(producto.get("Codigo")), producto.get("Nombre"), 
                producto.get("Descripcion"), producto.get("Talla"), producto.get("Marca"), 
                Integer.parseInt(producto.get("Stock")), Double.parseDouble(producto.get("Precio")), 
                enumTipo.CALZADO, categoria,producto.get("Sexo"), LocalDate.of(fecha[2], fecha[1], fecha[0]));
                System.out.println("Producto camiseta añadida...");
                break;
            case "CALCETIN":
                Calcetin calcetin = new Calcetin(Integer.parseInt(producto.get("Codigo")), producto.get("Nombre"), 
                producto.get("Descripcion"), producto.get("Talla"), producto.get("Marca"), 
                Integer.parseInt(producto.get("Stock")), Double.parseDouble(producto.get("Precio")), 
                enumTipo.CALCETIN, categoria,producto.get("Sexo"), LocalDate.of(fecha[2], fecha[1], fecha[0]));
                System.out.println("Producto camiseta añadida...");
                break;
            case "GUANTE":
                Guante guante = new Guante(Integer.parseInt(producto.get("Codigo")), producto.get("Nombre"), 
                producto.get("Descripcion"), producto.get("Talla"), producto.get("Marca"), 
                Integer.parseInt(producto.get("Stock")), Double.parseDouble(producto.get("Precio")), 
                enumTipo.GUANTE, categoria,producto.get("Sexo"), LocalDate.of(fecha[2], fecha[1], fecha[0]));
                System.out.println("Producto camiseta añadida...");
                break;
            case "TRAJEDEBANO":
                TrajeDeBano trajeDeBano = new TrajeDeBano(Integer.parseInt(producto.get("Codigo")), producto.get("Nombre"), 
                producto.get("Descripcion"), producto.get("Talla"), producto.get("Marca"), 
                Integer.parseInt(producto.get("Stock")), Double.parseDouble(producto.get("Precio")), 
                enumTipo.TRAJEDEBANO, categoria,producto.get("Sexo"), LocalDate.of(fecha[2], fecha[1], fecha[0]));
                System.out.println("Producto camiseta añadida...");
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
