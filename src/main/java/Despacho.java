import java.util.List;

public class Despacho {
    private String codigo;
    private Mensajero mensajero;

    public Despacho(String codigo, Mensajero mensajero) {
        this.codigo = "D-"+codigo;
        this.mensajero = mensajero;
    }


}
