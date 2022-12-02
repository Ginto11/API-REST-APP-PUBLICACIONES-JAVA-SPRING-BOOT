package proyecto.personal.APP_PUBLICACIONES.servicios;

import java.util.List;
import proyecto.personal.APP_PUBLICACIONES.entidades.Publicacion;

public interface IPublicacionServicio {
        
        public Publicacion guardarPublicacion(Publicacion publicacion);
        public Publicacion actualizarPublicacion(Publicacion  publicacion);
        public void eliminarPublicacion(Integer id);
        public List<Publicacion> listaPublicaciones();
        public Publicacion buscarPublicacionPorId(Integer id);
}
