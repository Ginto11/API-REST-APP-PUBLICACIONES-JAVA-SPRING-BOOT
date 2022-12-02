package proyecto.personal.APP_PUBLICACIONES.controladores;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import proyecto.personal.APP_PUBLICACIONES.entidades.Publicacion;
import proyecto.personal.APP_PUBLICACIONES.servicios.PublicacionServicioImple;


@RestController
@RequestMapping("/publicaciones")
public class API_REST {
        
        @Autowired
        private PublicacionServicioImple servicio;
        
        @PostMapping
        public Publicacion guardarPublicacion(@RequestBody Publicacion publicacion){
                return servicio.guardarPublicacion(publicacion);
        }
        
        @GetMapping
        public List<Publicacion> mostrarPublicaciones(){
                return servicio.listaPublicaciones();
        }
        
        @DeleteMapping("/{id}")
        public void eliminarPublicacion(@PathVariable("id") Integer id){
                servicio.eliminarPublicacion(id);
        }
        
        @GetMapping("/{id}")
        public Publicacion buscarPublicacion(@PathVariable("id") Integer id){
                Publicacion publicacion = servicio.buscarPublicacionPorId(id);
                return publicacion;
        }
        
        @PutMapping
        public Publicacion actualizarPublicacion(@RequestBody Publicacion publicacion){
                return servicio.actualizarPublicacion(publicacion);
        }
}
