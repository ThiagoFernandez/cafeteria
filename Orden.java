import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Orden {
    private Long id;
    private LocalDate fecha;
    private String nota;
    private EstadoPedido estado;
    private List<Item> items;

    public Orden(Long id, LocalDate fecha, String nota, EstadoPedido estado) {
        this.id = id;
        this.fecha = fecha;
        this.nota = nota;
        this.estado = estado;
        this.items = new ArrayList<>();
    }
    public double calcularTotal() {
        double total = 0.0;
        for (Item item : items) {
            total += item.calcularSubtotal();
        }
        return total;
    }

    public void agregarItem(Item item) {
        items.add(item);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public String getNota() {
        return nota;
    }

    public void setNota(String nota) {
        this.nota = nota;
    }

    public EstadoPedido getEstado() {
        return estado;
    }

    public void setEstado(EstadoPedido estado) {
        this.estado = estado;
    }

    
}
