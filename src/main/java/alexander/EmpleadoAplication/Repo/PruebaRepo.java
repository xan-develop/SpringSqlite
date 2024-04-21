package alexander.EmpleadoAplication.Repo;
import alexander.EmpleadoAplication.Entidades.Prueba;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PruebaRepo extends JpaRepository<Prueba, Long> {
}
