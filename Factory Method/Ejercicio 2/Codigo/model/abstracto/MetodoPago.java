public abstract class MetodoPago{

    protected String tipo;
    protected float costo;
    
    public MetodoPago(String tipo, float costo){
        this.tipo = tipo;
        this.costo = costo;
    }

    public abstract String realizarPago(float costo);
    public abstract String consultarInfo();

}