public class DescuentoPorcentaje implements PoliticaDescuento{
    private double porcentaje;

    public DescuentoPorcentaje(double porcentaje) {
        this.porcentaje = porcentaje;
    }

    @Override
    public double aplicado(double subtotal) {
        return subtotal - (subtotal * porcentaje / 100);
    }
    
}
