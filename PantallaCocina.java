public class PantallaCocina implements Pantalla {
    @Override
    public void escuchar(Orden orden) {
        System.out.println("Pantalla de Cocina: La orden con ID " + orden.getId() + " ha sido actualizada. Estado actual: " + orden.getEstadoString());
    }
    
}
