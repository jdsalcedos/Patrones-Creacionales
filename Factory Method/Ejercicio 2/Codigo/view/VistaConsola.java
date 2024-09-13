import java.util.Scanner;

public class VistaConsola{

    private Scanner sc;

    public VistaConsola(){
        sc = new Scanner(System.in);
    }

    public void mostrarInfo(String msj){
        System.out.println(msj);
    }

    public String leerDatoStr(String msj){
        String dato = "";
        System.out.println(msj);
        dato = sc.nextLine();
        return dato;
    }

    public float leerDatoFloat(String msj){
        float dato = 0;
        System.out.println(msj);
        dato = sc.nextFloat();
        return dato;
    }
}
