package inventario;

public enum enumTipo {
    CAMISETA(1), PANTALON(2), CALZADO(3), CALCETIN(4), BALON(5), GUANTE(6);
    
    private int numTipo;
    
    private enumTipo(int numTipo){
        this.numTipo = numTipo;
    }
}
