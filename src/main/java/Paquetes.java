import java.util.Objects;

public class Paquetes {
    private String guia;
    private double peso;
    private ;
    private TipoEnvio tipoEnvio;

    public Paquetes(String guia, double peso, zonas zonadestino, TipoEnvio tipoEnvio) {
        MensajeriaUtils.validarPeso(peso,guia);
        this.guia = guia;
        this.peso = peso;
        this.tipoEnvio = tipoEnvio;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Paquetes paquetes = (Paquetes) o;
        return Objects.equals(guia, paquetes.guia);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(guia);
    }

    public String getGuia() {
        return guia;
    }

    public double getPeso() {
        return peso;
    }

    public zonas getZonadestino() {
        return zonadestino;
    }
}

