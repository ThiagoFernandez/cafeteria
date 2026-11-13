public class Cancelado implements EstadoOrden {
    @Override
    public EstadoOrden avanzar() {
        // Lógica para avanzar al siguiente state (no hay siguiente state desde CANCELADO)
        throw new IllegalStateException("No se puede avanzar un pedido ya cancelado.");
    }

    @Override
    public EstadoOrden cancelar() {
        // Lógica para cancelar el pedido desde el state CANCELADO (ya está cancelado)
        throw new IllegalStateException("El pedido ya está cancelado.");
    }
    
}
