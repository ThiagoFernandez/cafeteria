public class ConLeche extends AgregadoDecorator {
    private double precioLeche = 0.5;
    private String descripcionLeche = " con leche";
    public ConLeche(Producto producto) {
        super(producto);
    }

    @Override
    public double getPrecio() {
        return super.getProducto().getPrecio() + precioLeche; // Agrega un costo adicional por la leche
    }

    @Override
    public String getDescripcion() {
        return super.getProducto().getDescripcion() + descripcionLeche;
    }
    
}
