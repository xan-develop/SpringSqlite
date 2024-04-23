package alexander.EmpleadoAplication.Controller;

import alexander.EmpleadoAplication.Entidades.Empleado;
import alexander.EmpleadoAplication.Service.ServicioEmpleado;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
@ResponseBody
    public class EmpleadoControl {

        @Autowired
        ServicioEmpleado ser;

    @RequestMapping("/empleados")
        public List<Empleado> listarEmpleados(){


            return ser.getAllEmpleados();
        }
        @RequestMapping("/empleados/{id}")
            public Optional<Empleado> findAnEmpleado(@PathVariable int id){
            return ser.getAnEmpleado(id);
            }

        @RequestMapping(value = "/empleados" , method = RequestMethod.POST)
            public void createEmpleado(@RequestBody Empleado emp){
            ser.createEmpleado(emp);
            }

        // ACTUALIZA EL EMPLEADO

        @RequestMapping(value = "/empleados/{id}", method = RequestMethod.PUT)
            public void updateEmpleado(@PathVariable int id,@RequestBody Empleado emp){
                emp.setIdempleado(id);
                ser.updateEmpleados(emp);
            }

        @RequestMapping(value = "/empleados/{id}", method = RequestMethod.DELETE)
            public List<Empleado> deleteEmpleado(@PathVariable int id){
                ser.deleteEmpleado(id);
                return ser.getAllEmpleados();
            }
    }
