package proyecto.personal.APP_PUBLICACIONES.servicios;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import proyecto.personal.APP_PUBLICACIONES.entidades.Publicacion;
import proyecto.personal.APP_PUBLICACIONES.repositorio.RepositorioPublicacion;

@Service
public class PublicacionServicioImple implements IPublicacionServicio{
        
        @Autowired
        private RepositorioPublicacion repositorio;

        @Override
        public Publicacion guardarPublicacion(Publicacion publicacion) {
               Publicacion nuevaPublicacion= repositorio.save(publicacion);
               return nuevaPublicacion;
        }

        @Override
        public Publicacion actualizarPublicacion(Publicacion publicacion) {
               return repositorio.save(publicacion);
        }

        @Override
        public void eliminarPublicacion(Integer id) {
                repositorio.deleteById(id);
        }

        @Override
        public List<Publicacion> listaPublicaciones() {
                List<Publicacion> lista = repositorio.findAll();
                return lista;
        }

        @Override
        public Publicacion buscarPublicacionPorId(Integer id) {
                Publicacion publicacion = repositorio.findById(id).orElseThrow(null);
                return publicacion;
        }
        
}
