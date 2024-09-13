import Codigo.model.abstracto.MetodoPago;

public class TarjetaDebito extends MetodoPago{
    
    public TarjetaDebito(String tipo, float costo){
        super(tipo, costo);
    }

    @Override
    public String realizarPago(float costo){
        return "Realizando pago de "+this.costo+" dolares con tarjeta debito";
    }

    @Override
    public String consultarInfo(){
        return "Este metodo es tarjeta debito....";
    }
}
