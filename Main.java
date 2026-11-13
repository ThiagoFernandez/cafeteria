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

        ProductoSimple producto1 = new ProductoSimple(1L, 2.5, "Café Americano");
        ProductoSimple producto2 = new ProductoSimple(2L, 3.0, "Café Latte");
        ProductoSimple producto3 = new ProductoSimple(3L, 4.0, "Jugo de Naranja");
        ProductoSimple producto4 = new ProductoSimple(4L, 3.5, "Jugo de Manzana");

        subCategoria1.agregarProducto(producto1);
        subCategoria1.agregarProducto(producto2);
        subCategoria1.agregarProducto(producto3);
        subCategoria2.agregarProducto(producto4);

        Item item1 = new Item("Para llevar", 2, new ConCaramelo(new ConLeche(producto1))); // decorator
        Item item2 = new Item("Para llevar", 1, producto3);
        Item item3 = new Item("Para llevar", 3, producto4);

        Orden orden1 = new Orden(1L, LocalDate.now(), "Orden de prueba", new Recibido(), empleado1);

        orden1.agregarItem(item1);
        orden1.agregarItem(item2);
        orden1.agregarItem(item3);

        orden1.setDescuento(new DescuentoPorcentaje(10.0)); // strategy

        Caja caja = new Caja();

        System.out.println("Estado inicial de la orden: "+orden1.getEstadoString()); // state

        caja.cobrar(orden1); // facade y controller

        System.out.println("Estado de la orden después de cobrar: "+orden1.getEstadoString()); // state
        orden1.avanzar(); // Avanza al siguiente estado (ENTREGADO)
        System.out.println("Estado de la orden después de entregar: "+orden1.getEstadoString()); // state

        // vemos el fallo de cancelar una orden que ya fue entregada
        System.out.println("Intentando cancelar la orden después de entregarla:");
        orden1.cancelar(); // Intenta cancelar la orden (no debería permitirlo)
    }
}
