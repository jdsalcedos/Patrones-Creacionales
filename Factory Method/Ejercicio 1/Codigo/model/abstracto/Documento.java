public abstract class Documento{

    protected String nombre;
    protected String tipo;
    protected float size;
    
    public Documento(String nombre, String tipo, float size){
        this.nombre = nombre;
        this.tipo = tipo;
        this.size = size;
    }

    public abstract String imprimir();
    public abstract String mostrarDatos();
    
}