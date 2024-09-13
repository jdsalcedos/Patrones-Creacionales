public class MetodoPagoCreador implements MetodoPagoFactory{
    
    @Override
    MetodoPago crearMetodoPago(String tipo, float costo){
        if(tipo.equals("paypal")){
            return new Paypal(tipo, costo);
        } else if(tipo.equals("tarjeta de debito")){
            return new TarjetaDebito(tipo, costo);
        } else if(tipo.equals("efectivo")){
            return new Efectivo(tipo, costo);
        }
    }
}
