public class MensajeriaUtils {
    private MensajeriaUtils() {
    }
    public static void validarPeso(double peso, String guia) throws PesoExcedidoPaqueteExepcion{
        if(peso < 0 || peso > 20.0) throw new PesoExcedidoPaqueteExepcion("El paquete " + guia + "debe pesar menos de 20kg");
    }

    public static void validarTexto(String valor, String nombreCampo){
        if(valor == null || valor.isBlank() ) {
            throw new IllegalArgumentException("El campo" + nombreCampo + " tiene que tener un nombre no puede estar vacio");
        }
    }

    public static void validarTipoEnvio(TipoEnvio, double tarifabase){
        if(TipoEnvio.EXPRESS ){

    }


}
}