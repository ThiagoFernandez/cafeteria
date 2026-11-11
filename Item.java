public class Item {
    private String nota;
    private int cantidad;
    private Producto producto;

    public Item(String nota, int cantidad, Producto producto) {
        this.nota = nota;
        this.cantidad = cantidad;
        this.producto = producto;
    }



    public double calcularSubtotal() {
        return cantidad * producto.getPrecio();
    }


    public String getNota() {
        return nota;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public void setNota(String nota) {
        this.nota = nota;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
}
