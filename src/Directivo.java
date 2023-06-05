public class Directivo extends Empleado {

    Directivo (String nombre){
        this.nombre = nombre;
    }
    @Override
    public String toString() {
        String cad;
        cad = "Directivo " + nombre ;
        return cad;
    }
}
