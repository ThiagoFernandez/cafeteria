public class Entregado implements EstadoOrden {
    @Override
    public EstadoOrden avanzar() {
        throw new IllegalStateException("El pedido ya esta entregado.");         
    }

    @Override
    public EstadoOrden cancelar() {
        // Lógica para cancelar el pedido desde el state ENTREGADO
        throw new IllegalStateException("No se puede cancelar un pedido ya entregado.");
    }
    
}
