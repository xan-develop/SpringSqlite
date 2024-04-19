package alexander.EmpleadoAplication.Entidades;

public class Empleado {
    int idempleado;
    String Nombre;
    String Depart;

    public Empleado(int idempleado, String nombre, String depart) {
        this.idempleado = idempleado;
        Nombre = nombre;
        Depart = depart;
    }

    public int getIdempleado() {
        return idempleado;
    }

    public void setIdempleado(int idempleado) {
        this.idempleado = idempleado;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getDepart() {
        return Depart;
    }

    public void setDepart(String depart) {
        Depart = depart;
    }
}
