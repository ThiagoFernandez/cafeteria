import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

public class Empleado extends Persona{
    private List<DayOfWeek> diaSemana;
    private LocalTime horaEntrada;
    private LocalTime horaSalida;

    public Empleado(Long id, String nombre, String password, List<DayOfWeek> diaSemana, LocalTime horaEntrada, LocalTime horaSalida) {
        super(id, nombre, password);
        this.diaSemana = diaSemana;
        this.horaEntrada = horaEntrada;
        this.horaSalida = horaSalida;
    }


    @Override
    public boolean iniciarSesion(String nombre, String password) {
        LocalTime horaActual = LocalTime.now();
        DayOfWeek diaActual = LocalDate.now().getDayOfWeek();
        return super.iniciarSesion(nombre, password) && diaSemana.contains(diaActual) && horaActual.isAfter(horaEntrada) && horaActual.isBefore(horaSalida);
    }

    public List<DayOfWeek> getDiaSemana() {
        return diaSemana;
    }

    public void setDiaSemana(List<DayOfWeek> diaSemana) {
        this.diaSemana = diaSemana;
    }

    public LocalTime getHoraEntrada() {
        return horaEntrada;
    }

    public void setHoraEntrada(LocalTime horaEntrada) {
        this.horaEntrada = horaEntrada;
    }

    public LocalTime getHoraSalida() {
        return horaSalida;
    }

    public void setHoraSalida(LocalTime horaSalida) {
        this.horaSalida = horaSalida;
    }

    
}
