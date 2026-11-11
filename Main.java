public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");

        Producto producto1 = new Producto(1L, 10.0, "Producto 1");
        Producto producto2 = new Producto(2L, 20.0, "Producto 2");

        Item item1 = new Item("Nota 1", 2, producto1);
        Item item2 = new Item("Nota 2", 3, producto2);

        System.out.println("Subtotal Item 1: " + item1.calcularSubtotal());
        System.out.println("Subtotal Item 2: " + item2.calcularSubtotal());
    }   
}
