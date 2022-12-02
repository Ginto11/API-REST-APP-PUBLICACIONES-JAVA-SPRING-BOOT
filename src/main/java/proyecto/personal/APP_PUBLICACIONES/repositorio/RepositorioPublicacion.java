package proyecto.personal.APP_PUBLICACIONES.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import proyecto.personal.APP_PUBLICACIONES.entidades.Publicacion;

public interface RepositorioPublicacion extends JpaRepository<Publicacion, Integer>{
        
}
