package supermercado;

import java.time.LocalDate;

public class Cereales implements EsAlimento{

    private String marca;

    private double precio;

    private String tipoCereal;

    private LocalDate fechaCaducidad;

    private int calorias;

    Cereales (String marca, double precio, String tipoCereal) {
        this.marca = marca;
        this.precio = precio;
        this.tipoCereal = tipoCereal;
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

    public void setTipoCereal(String tipoCereal) {
        this.tipoCereal = tipoCereal;
    }

    public String getTipoCereal() {
        return tipoCereal;
    }
    @Override
    public void setCaducidad(LocalDate fc) {
        this.fechaCaducidad = fc;
    }

    @Override
    public int getCalorias() {
        if (tipoCereal.equals("espelta")) {
            calorias = 5;
        } else if (tipoCereal.equals("maiz")) {
            calorias = 8;
        } else if (tipoCereal.equals("trigo")) {
            calorias = 12;
        } else {
            calorias = 15;
        }
        return calorias;
    }

    @Override
    public String toString() {
        return "Cereales{" +
                "marca='" + marca + '\'' +
                ", precio=" + precio +
                ", tipoCereal='" + tipoCereal + '\'' +
                ", fechaCaducidad=" + fechaCaducidad +
                ", calorias=" + calorias +
                '}';
    }
}
