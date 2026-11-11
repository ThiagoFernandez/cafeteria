import java.time.LocalTime;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.time.DayOfWeek;
public class Main {
    public static void main(String[] args) {
        List<Persona> listaPersonal = new ArrayList<Persona>();
        Empleado empleado1 = new Empleado(1L, "Juan", "1234", List.of(DayOfWeek.MONDAY, DayOfWeek.TUESDAY, DayOfWeek.WEDNESDAY), LocalTime.of(9, 0), LocalTime.of(17, 0));
        Empleado empleado2 = new Empleado(2L, "Maria", "5678", List.of(DayOfWeek.THURSDAY, DayOfWeek.FRIDAY), LocalTime.of(10, 0), LocalTime.of(18, 0));
        Gerente gerente1 = new Gerente(3L, "Carlos", "9012");
        listaPersonal.add(empleado1);
        listaPersonal.add(empleado2);
        listaPersonal.add(gerente1);


        for (Persona persona : listaPersonal) {
            System.out.println("Inicio sesion de "+persona.getNombre()+": "+persona.iniciarSesion(persona.getNombre(), persona.getPassword()));
        }


        Categoria categoria1 = new Categoria(1L, "Bebidas");
        Categoria categoria2 = new Categoria(2L, "Comidas");

        SubCategoria subCategoria1 = new SubCategoria(1L, "Cafes", categoria1);
        SubCategoria subCategoria2 = new SubCategoria(2L, "Jugos", categoria1);

        Producto producto1 = new Producto(1L, 2.5, "Café Americano");
        Producto producto2 = new Producto(2L, 3.0, "Café Latte");
        Producto producto3 = new Producto(3L, 4.0, "Jugo de Naranja");
        Producto producto4 = new Producto(4L, 3.5, "Jugo de Manzana");

        subCategoria1.agregarProducto(producto1);
        subCategoria1.agregarProducto(producto2);
        subCategoria1.agregarProducto(producto3);
        subCategoria2.agregarProducto(producto4);

        Item item1 = new Item("Para llevar", 2, producto1);
        Item item2 = new Item("Para llevar", 1, producto3);
        Item item3 = new Item("Para llevar", 3, producto4);

        MedioDePago medioDePago = new MedioDePago(TipoPago.EFECTIVO);

        Orden orden1 = new Orden(1L, LocalDate.now(), "Orden de prueba", EstadoPedido.RECIBIDO, empleado1);

        orden1.agregarItem(item1);
        orden1.agregarItem(item2);
        orden1.agregarItem(item3);

        orden1.setMedioDePago(medioDePago);

        System.out.println("Total de la orden: " + orden1.calcularTotal());
        System.out.println("Estado de la orden: " + orden1.getEstado());
        System.out.println("Empleado que atendió la orden: " + orden1.getEmpleado().getNombre());
        System.out.println("Medio de pago: " + orden1.getMedioDePago().getTipoPago());
    }
}
