package inventario;

public enum enumCategoria {
    FOOTBALL(1), BASKET(2), RUNNING(3), SWIMMING(4);
    
    private int numCategoria;
    
    private enumCategoria(int numCategoria){
        this.numCategoria = numCategoria;
    }

    @Override
    public String toString() {
        return this.name();
    }
    
}
