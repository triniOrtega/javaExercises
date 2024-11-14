package supermercado;

public class Detergente implements EsLiquido, ConDescuento {

    private String marca;

    private double precio;

    private double volume;

    private String envase;

    private double descuento;

    Detergente (String marca, double precio) {
        this.marca = marca;
        this.precio = precio;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getMarca() {
        return marca;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public double getPrecio() {
        return precio;
    }


    @Override
    public void setVolume(double v) {
        this.volume = v;
    }

    @Override
    public double getVolume() {
        return 0;
    }

    @Override
    public void setTipoEnvase(String env) {
        this.envase = env;
    }

    @Override
    public String getTipoEnvase() {
        return null;
    }

    @Override
    public String toString() {
        return "Detergente{" +
                "marca='" + marca + '\'' +
                ", precio=" + precio +
                ", descuento="+descuento+
                ", volumen=" + volume +
                ", envase='" + envase + '\'' +
                '}';
    }

    @Override
    public void setDescuento(double des) {
        this.descuento = des;

    }

    @Override
    public double getDescuento() {
        return 0;
    }

    @Override
    public double getPrecioDescuento() {
        return 0;
    }
}
