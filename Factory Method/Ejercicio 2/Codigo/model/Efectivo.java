public class Efectivo extends MetodoPago{
    
    public Efectivo(String tipo, float costo){
        super(tipo, costo);
    }

    @Override
    public String realizarPago(float costo){
        return "Realizando pago de "+this.costo+" dolares con efectivo";
    }

    @Override
    public String consultarInfo(){
        return "Este metodo es efectivo....";
    }
}