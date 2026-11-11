import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Orden {
    private Long id;
    private LocalDate fecha;
    private String nota;
    private EstadoPedido estado;
    private List<Item> items;
    private Empleado empleado;
    private MedioDePago medioDePago;
    private PoliticaDescuento descuento;

    public Orden(Long id, LocalDate fecha, String nota, EstadoPedido estado, Empleado empleado) {
        this.id = id;
        this.fecha = fecha;
        this.nota = nota;
        this.estado = estado;
        this.items = new ArrayList<>();
        this.empleado = empleado;
        this.medioDePago = null;
        this.descuento = new SinDescuento();
    }

    public List<Item> getItems() {
        return items;
    }
    public void setItems(List<Item> items) {
        this.items = items;
    }
    public Empleado getEmpleado() {
        return empleado;
    }
    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }
    public MedioDePago getMedioDePago() {
        return medioDePago;
    }
    public void setMedioDePago(MedioDePago medioDePago) {
        this.medioDePago = medioDePago;
    }
    public double calcularTotal() {
        double total = 0.0;
        for (Item item : items) {
            total += item.calcularSubtotal();
        }
        return descuento.aplicado(total);
    }

    public void agregarItem(Item item) {
        items.add(item);
    }

    public Long getId() {
        return id;
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

    public void setDescuento(PoliticaDescuento des){
        this.descuento = des;
    }
    
}
