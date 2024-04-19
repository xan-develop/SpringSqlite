package alexander.EmpleadoAplication.Controller;

import alexander.EmpleadoAplication.Entidades.Empleado;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Controller
@ResponseBody
public class EmpleadoControl {

@RequestMapping("/empleados")
    public List<Empleado> listarEmpleados(){
        List<Empleado> listaEmpleados = new ArrayList<>();

        // Creamos 5 objetos Empleado y los agregamos a la lista
        listaEmpleados.add(new Empleado(1, "Martin Gonzalez", "Ventas"));
        listaEmpleados.add(new Empleado(2, "Ana Lopez", "Marketing"));
        listaEmpleados.add(new Empleado(3, "Juan Ramirez", "Recursos Humanos"));
        listaEmpleados.add(new Empleado(4, "Maria Sanchez", "Contabilidad"));
        listaEmpleados.add(new Empleado(5, "Carlos Martinez", "Tecnología"));
        return listaEmpleados;
    }
}
