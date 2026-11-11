public abstract class AgregadoDecorator  implements Producto{
    private Producto producto;
    
    public AgregadoDecorator(Producto producto) {
        this.producto = producto;
    }

    public Producto getProducto() {
        return producto;
    }
    
}
