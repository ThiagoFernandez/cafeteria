public class ConCaramelo extends AgregadoDecorator {
    private double precioCaramelo = 0.5;
    private String descripcionCaramelo = " con caramelo";

    public ConCaramelo(Producto producto) {
        super(producto);
    }

    @Override
    public double getPrecio() {
        return super.getProducto().getPrecio() + precioCaramelo;
    }

    @Override
    public String getDescripcion() {
        return super.getProducto().getDescripcion() + descripcionCaramelo;
    }
    
}
