package alexander.EmpleadoAplication.Service;

import alexander.EmpleadoAplication.Entidades.Empleado;
import alexander.EmpleadoAplication.Repo.EmpleadoRepo;
import org.springframework.beans.factory.annotation.Autowired;
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
    @Autowired
    EmpleadoRepo repemp;

public List<Empleado> getAllEmpleados(){
            return listaEmpleados;
    }

    public Empleado getAnEmpleado(int id){
    return listaEmpleados.stream().filter(e ->(
            e.getIdempleado() == id)).findFirst().get();

    }
    public void createEmpleado(Empleado emp){


        repemp.save(emp);
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
    repemp.save(empleado);
}

}
