public class Operario extends Empleado {

    Operario (String nombre){
        this.nombre = nombre;
    }
    @Override
    public String toString() {
        String cad;
        cad = "Operario " + nombre ;
        return cad;
    }
}
