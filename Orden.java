import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Orden {
    private Long id;
    private LocalDate fecha;
    private String nota;
    private EstadoOrden estado;
    private List<Item> items;
    private Empleado empleado;
    private MedioDePago medioDePago;
    private PoliticaDescuento descuento;

    public Orden(Long id, LocalDate fecha, String nota, EstadoOrden estado, Empleado empleado) {
        this.id = id;
        this.fecha = fecha;
        this.nota = nota;
        this.estado = estado;
        this.items = new ArrayList<>();
        this.empleado = empleado;
        this.medioDePago = new MedioDePago(TipoPago.EFECTIVO);
        this.descuento = new SinDescuento();
    }

    public void avanzar(){
        try {
            EstadoOrden nuevoEstado = estado.avanzar();
            this.estado = nuevoEstado;
        } catch (IllegalStateException e) {
            System.out.println("No se puede avanzar la orden en el estado actual: " + e.getMessage());
        }
        
    }

    public void cancelar(){
        try {
            EstadoOrden nuevoEstado = estado.cancelar();
            this.estado = nuevoEstado;
        } catch (IllegalStateException e) {
            System.out.println("No se puede cancelar la orden en el estado actual: " + e.getMessage());
        }
    }

    public TipoPago getTipoPago() {
        return this.medioDePago.getTipoPago();
    }

    public void setTipoPago(TipoPago tipoPago) {
        this.medioDePago.setTipoPago(tipoPago);
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

    public EstadoOrden getEstado() {
        return estado;
    }

    public String getEstadoString() {
        return estado.getClass().getSimpleName();
    }


    public void setDescuento(PoliticaDescuento des){
        this.descuento = des;
    }
    
}
