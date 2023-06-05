public class Tecnico {

    Tecnico (String nombre){
        this.nombre = nombre;
    }
    @Override
    public String toString() {
        String cad;
        cad = "Tecnico " + nombre ;
        return cad;
    }
}
