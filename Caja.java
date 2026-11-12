public class Caja {
    // juega de facade por su estructura y de controller por su comportamiento

    public Caja(){}

    public void cobrar(Order orden){
        double total = orden.calcularTotal();

        orden.setEstado(EstadoPedido.EN_PREPARACION);
        imprimirComprobante(orden, total);
    }

    private void imprimirComprobante(Order orden, double total){
        for (Item item : orden.getItems()) {
            System.out.println("- "+item.getProducto().getPrecio()+" "+item.getProducto().getDescripcion()+" x "+item.getCantidad());
        }
        System.out.println("Total: "+total);
        System.out.println("Medio de pago: "+orden.getTipoPago());
    }
}
