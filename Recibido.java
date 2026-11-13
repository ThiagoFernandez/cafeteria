public class Recibido implements EstadoOrden {
    @Override
    public EstadoOrden avanzar() {
        // Lógica para avanzar al siguiente state (EN_PREPARACION)
        return new EnPreparacion();
    }

    @Override
    public EstadoOrden cancelar() {
        // Lógica para cancelar el pedido desde el state RECIBIDO
        return new Cancelado();
    }
    
}
