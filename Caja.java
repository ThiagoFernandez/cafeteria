public class Caja {
    // juega de facade por su estructura y de controller por su comportamiento
    private double total;
    
    public Caja(Orden orden) {
        this.total = orden.calcularTotal();
    }

    public registrarCobro(MedioDePago medioDePago) {
        // Lógica para registrar el cobro utilizando el medio de pago proporcionado
        // Por ejemplo, podrías llamar a un método en el objeto MedioDePago para procesar el pago
        medioDePago.procesarPago(total);
    }
}
