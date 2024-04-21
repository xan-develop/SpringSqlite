package alexander.EmpleadoAplication.Repo;

import alexander.EmpleadoAplication.Entidades.Empleado;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.JpaRepositoryConfigExtension;
import org.springframework.stereotype.Repository;

@Repository
public interface EmpleadoRepo extends JpaRepository<Empleado, Integer> {

    // Crud para las clases


}
