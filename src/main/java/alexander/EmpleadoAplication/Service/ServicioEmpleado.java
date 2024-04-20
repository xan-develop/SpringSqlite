package alexander.EmpleadoAplication.Service;

import alexander.EmpleadoAplication.Entidades.Empleado;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

@Service
public class ServicioEmpleado {

    List<Empleado> listaEmpleados = new ArrayList<>(Arrays.asList(
            new Empleado(1, "Martin Gonzalez", "Ventas"),
            new Empleado(2, "Ana Lopez", "Marketing"),
            new Empleado(3, "Juan Ramirez", "Recursos Humanos"),
            new Empleado(4, "Maria Sanchez", "Contabilidad"),
            new Empleado(5, "Carlos Martinez", "Tecnología")

    ));

public List<Empleado> getAllEmpleados(){
            return listaEmpleados;
    }

    public Empleado getAnEmpleado(int id){
    return listaEmpleados.stream().filter(e ->(
            e.getIdempleado() == id)).findFirst().get();

    }
    public void createEmpleado(Empleado emp){

    listaEmpleados.add(emp);

    }

    public void deleteEmpleado(int id){

        ArrayList<Empleado> copia = new ArrayList<>();

        for (Empleado emp : listaEmpleados){

            if (emp.getIdempleado() == id)
                continue;
               copia.add(emp);
            }
            listaEmpleados = copia;
        }



    public void updateEmpleados(Empleado empleado){
    ArrayList<Empleado> copia = new ArrayList<>();
    for (Empleado emp : listaEmpleados){

        if (emp.getIdempleado() == empleado.getIdempleado()){
            emp.setNombre(empleado.getNombre());
            emp.setDepart(empleado.getDepart());
        }
        copia.add(emp);
    }
    listaEmpleados = copia;
}

}
