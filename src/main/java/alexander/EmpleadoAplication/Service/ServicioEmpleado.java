package alexander.EmpleadoAplication.Service;

import alexander.EmpleadoAplication.Entidades.Empleado;
import alexander.EmpleadoAplication.Repo.EmpleadoRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class ServicioEmpleado {


    @Autowired
    EmpleadoRepo repemp;

public List<Empleado> getAllEmpleados(){
            return repemp.findAll();
    }

    public Optional<Empleado> getAnEmpleado(int id){
    return Optional.ofNullable(repemp.findById(id).orElseThrow(() -> new RuntimeException("No se ha encontrado el usuario")));

    }
    public void createEmpleado(Empleado emp){


        repemp.save(emp);
    }

    public void deleteEmpleado(int id){

        repemp.delete(repemp.getReferenceById(id));
        }



    public void updateEmpleados(Empleado empleado){

    repemp.save(empleado);
}

}
