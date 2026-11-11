import java.time.LocalDate;

public class Orden {
    private Long id;
    private LocalDate fecha;
    private String nota;
    private EstadoPedido estado;

    public Orden(Long id, LocalDate fecha, String nota, EstadoPedido estado) {
        this.id = id;
        this.fecha = fecha;
        this.nota = nota;
        this.estado = estado;
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
