package alexander.EmpleadoAplication.Entidades;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity

public class Empleado {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int idempleado;
    String Nombre;
    String Depart;


    public Empleado(){}
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
