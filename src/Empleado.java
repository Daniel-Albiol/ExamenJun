public class Empleado {

    private String nombre;

    Empleado(){}

    Empleado(String nombre){
        this.nombre = nombre;
    }

    public void setNombre (String nombre){
        this.nombre = nombre;
    }

    public String getNombre() {

        return nombre;
    }

    public String toString () {
        String cad;
        cad = "Empleado " + nombre ;
        return cad;

    }
}
