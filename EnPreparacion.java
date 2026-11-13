public class EnPreparacion implements EstadoOrden {
    @Override
    public EstadoOrden avanzar() {
        // Lógica para avanzar al siguiente state (ENTREGADO)
        return new Entregado();
    }

    @Override
    public EstadoOrden cancelar() {
        // Lógica para cancelar el pedido desde el state EN_PREPARACION
        return new Cancelado();
    }
    
}
