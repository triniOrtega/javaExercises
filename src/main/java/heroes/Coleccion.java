package heroes;

import java.util.ArrayList;
import java.util.Objects;

public class Coleccion {

    private String nombreColeccion;

    private ArrayList<Figura> listaFiguras;

    Coleccion (String nombreColeccion) {
        this.listaFiguras = null;
    }

    public String getNombreColeccion() {
        return nombreColeccion;
    }

    public void setNombreColeccion(String nombreColeccion) {
        this.nombreColeccion = nombreColeccion;
    }

    public void addFigura(Figura fig) {
        this.listaFiguras.add(fig);
    }

    public void subirPrecio(double cantidad, String id) {
        for (int i = 0; i < listaFiguras.size(); i++) {
            if(listaFiguras.get(i).getCodigo().equals(id)) {
                subirPrecio(cantidad, id);
            }
        }
    }
    public String toString() {
        String listaFigurasString = "";
        for (int i = 0; i < listaFiguras.size(); i++) {
            listaFigurasString += listaFiguras.get(i).toString();
        }
        return "Figuras: "+listaFigurasString;
    }

    public ArrayList<Figura> conCapa() {
        ArrayList<Figura> figurasConCapa = new ArrayList<>();
        for (int i = 0; i < listaFiguras.size(); i++) {
            if (listaFiguras.get(i).getSuperheroe().getCapa().equals(true)) {

                figurasConCapa.add(listaFiguras.get(i));
            }
        }
        return figurasConCapa;
    }

    public Figura masValioso () {
        double mayorValor = 0;
        Figura figuraMasValiosa = null;
        for (int i = 0; i < listaFiguras.size(); i++) {

            if(listaFiguras.get(i).getPrecio() > mayorValor) {
                mayorValor = listaFiguras.get(i).getPrecio();
                figuraMasValiosa = listaFiguras.get(i);
            }
        }
        return figuraMasValiosa;
    }

    public double getValorColeccion() {
        double precioTotal = 0;

        for (int i = 0; i < listaFiguras.size(); i++) {
            precioTotal += listaFiguras.get(i).getPrecio();
        }
        return precioTotal;
    }

    public double getVolumenColeccion() {
        double sumatoriaVolumenes = 0;

        for (int i = 0; i < listaFiguras.size(); i++) {
            sumatoriaVolumenes += listaFiguras.get(i).getDimensiones().getVolumen();
        }

        return sumatoriaVolumenes+200;
    }

}
