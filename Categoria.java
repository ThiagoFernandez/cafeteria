import java.util.ArrayList;
import java.util.List;

public class Categoria {
    private Long id;
    private String nombre;
    private List<SubCategoria> subCategorias;

    public Categoria(Long id, String nombre) {
        this.id = id;
        this.nombre = nombre;
        this.subCategorias = new ArrayList<>();
    }


    public void crearSubCategoria(String nombre){
        SubCategoria subCategoria = new SubCategoria((long) (subCategorias.size() + 1), nombre, this);
        agregarSubCategoria(subCategoria);
    }

    private void agregarSubCategoria(SubCategoria subCategoria) {
        subCategorias.add(subCategoria);
    }


    public Long getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<SubCategoria> getSubCategorias() {
        return subCategorias;
    }

    public void setSubCategorias(List<SubCategoria> subCategorias) {
        this.subCategorias = subCategorias;
    }
}
