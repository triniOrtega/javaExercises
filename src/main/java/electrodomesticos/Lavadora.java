package electrodomesticos;

public class Lavadora extends Electrodomestico {

    private double precio;

    private boolean aguaCaliente;

    Lavadora (String marca, double potencia) {
        super("Lavadora", marca, potencia);
        aguaCaliente = false;
    }

    Lavadora (String marca, double precio, double potencia, boolean aguaCaliente) {
        super("Lavadora", marca, potencia);
        this.precio = precio;
        this.aguaCaliente = aguaCaliente;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public boolean getAguaCaliente() {
        return aguaCaliente;
    }

    public void setAguaCaliente(boolean aguaCaliente) {
        this.aguaCaliente = aguaCaliente;
    }

    @Override
    public String toString() {
        return super.toString()+"; precio: "+precio+" tiene agua caliente: "+aguaCaliente;
    }

    @Override
    public double getConsumo(int horas) {
        if(aguaCaliente) {
            return super.getConsumo(horas)*0.2;
        } else {
            return super.getConsumo(horas);
        }
    }

}
