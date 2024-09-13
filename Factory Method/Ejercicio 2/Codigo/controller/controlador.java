import Codigo.model.abstracto.*;
import model.concretoCreador.*;
import view.VistaConsola;

public class Controlador{
    private VistaConsola vista;
    
    public Controlador(){
        vista = new VistaConsola(); 
    }

    public void run(){

        String tipo = "";
        float costo = 0;

        vista.mostrarInfo("Digite los datos del metodo de pago");

        tipo = vista.leerDatoStr("\t" + "Digite el tipo de metodo de pago");
        costo = vista.leerDatoFloat("\t" + "Digite el costo total de lo que va a comprar");

        MetodoPagoFactory fabrica = new MetodoPagoCreador();
        MetodoPago mtp = fabrica.crearMetodoPago(tipo, costo);

        vista.mostrarInfo("Pago: " + mtp.realizarPago(costo));
        vista.mostrarInfo("Datos del metodo de pago: " + mtp.mostrarInfo());
    }
}