public class SinDescuento implements PoliticaDescuento {
    @Override
    public double aplicado(double subtotal) {
        return subtotal;
    }
    
}
