package heroes;

public class Dimension {

    private double alto;
    private double ancho;
    private double profundidad;

    Dimension() {
        this.alto = 0;
        this.ancho = 0;
        this.profundidad = 0;
    }

    Dimension(double alto,
              double ancho,
              double profundidad) {

        this.alto = alto;
        this.ancho = ancho;
        this.profundidad = profundidad;

    }

    public double getAlto() {
        return alto;
    }

    public void setAlto(double alto) {
        this.alto = alto;
    }

    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public double getProfundidad() {
        return profundidad;
    }

    public void setProfundidad(double profundidad) {
        this.profundidad = profundidad;
    }

    public double getVolumen() {

        return alto*ancho*profundidad;
    }
    public double getVolumen(double alto, double ancho, double profundidad) {
        this.alto = alto;
        this.ancho = ancho;
        this.profundidad = profundidad;
        return alto*ancho*profundidad;
    }

    public String toString() {
        return "Alto: "+alto+"; ancho: "+ancho+"; profundidad: "+profundidad+"; volumen maximo:"+getVolumen(alto, ancho,profundidad);
    }
}
