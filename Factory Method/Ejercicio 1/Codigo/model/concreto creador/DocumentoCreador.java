import model.abstracto.DocumentoFactory;
import model.abstracto.Documento;
import model.*;

public class DocumentoCreador implements DocumentoFactory{

    @Override
    public Documento crearDocumento(String nombre, String tipo, float size){
        if(tipo.equals("Word")){
            return new docWord(nombre, tipo, size);
        } else if(tipo.equals("PDF")){
            return new docPDF(nombre, tipo, size);
        } else if(tipo.equals("Excel")){
            return new docExcel(nombre, tipo, size);
        }
    }
}
