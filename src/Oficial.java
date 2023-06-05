public class Oficial extends Operario {

    Oficial (String nombre){
        this.nombre = nombre;
    }
    @Override
    public String toString() {
        String cad;
        cad = "Oficial " + nombre ;
        return cad;
    }
}
