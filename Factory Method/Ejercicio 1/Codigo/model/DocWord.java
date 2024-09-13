import model.abstracto.Documento;

public class DocWord extends Documento{
    
    public DocWord(String nombre, String tipo, float size){
        super(nombre, tipo, size);
    }

    @Override
    public String imprimir(){
        return "imprimiendo documento de Word...";
    }

    @Override
    public String mostrarDatos(){
        String res = "El nombre del documento es "+nombre+" y tiene un tamaño de "+size+" MB";
        return res;
    }
}