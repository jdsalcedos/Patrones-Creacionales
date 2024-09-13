public class Paypal extends MetodoPago{
    
    public Paypal(String tipo, float costo){
        super(tipo, costo);
    }

    @Override
    public String realizarPago(float costo){
        return "Realizando pago de "+this.costo+" dolares con Paypal";
    }

    @Override
    public String consultarInfo(){
        return "Este metodo es Paypal....";
    }
}
