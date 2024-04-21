package alexander.EmpleadoAplication.Controller;
import alexander.EmpleadoAplication.Entidades.Prueba;
import alexander.EmpleadoAplication.Repo.PruebaRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PruebaController {

    @Autowired
    private PruebaRepo pruebaRepository;

    @PostMapping("/prueba")
    public Prueba createPrueba(@RequestBody Prueba prueba) {
        return pruebaRepository.save(prueba);
    }
}
