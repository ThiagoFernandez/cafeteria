import java.util.ArrayList;
import java.util.List;

public class SubCategoria {
    private Long id;
    private String nombre;
    private Categoria categoria;
    private List<ProductoSimple> productos;

    public SubCategoria(Long id, String nombre, Categoria categoria) {
        this.id = id;
        this.nombre = nombre;
        this.categoria = categoria;
        this.productos = new ArrayList<>();
    }

    public void agregarProducto(ProductoSimple producto) {
        productos.add(producto);
    }

    public Long getId() {
        return id;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public List<ProductoSimple> getProductos() {
        return productos;
    }

    public void setProductos(List<ProductoSimple> productos) {
        this.productos = productos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
