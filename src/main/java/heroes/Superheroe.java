package heroes;

public class Superheroe {

    private String nombre;
    private String descripcion = "";
    private boolean capa = false;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescrpcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Boolean getCapa() {
        return capa;
    }

    public void setCapa(boolean capa) {
        this.capa = capa;
    }

    @Override
    public String toString() {
        return "Nombre: "+nombre+"; descripcion: "+descripcion+"; capa: "+capa;
    }
}

