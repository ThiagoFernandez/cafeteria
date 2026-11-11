public class ProductoSimple implements Producto {
    private Long id;
    private double precio;
    private String nombre;

    public ProductoSimple(Long id, double precio, String nombre) {
        this.id = id;
        this.precio = precio;
        this.nombre = nombre;
    }



    @Override 
    public double getPrecio() {
        return precio;
    }

    @Override
    public String getDescripcion() {
        return nombre;
    }

    public Long getId() {
        return id;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
