package proyecto.personal.APP_PUBLICACIONES.controladores;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import proyecto.personal.APP_PUBLICACIONES.entidades.Publicacion;


@Controller
@RequestMapping("/")
public class ControladorFrontend {
        
        @Autowired
        private API_REST api;
        
        @GetMapping("/index")
        public String getHome(Model model){
                
                model.addAttribute("publicaciones", api.mostrarPublicaciones());
                
                return "home";
        }
        
        @GetMapping("/acerca-de")
        public String getAcerca(Model model){
                model.addAttribute("dependencias", List.of("Thymeleaf", "Spring Boot DevTools", "Spring Web", "Spring Data JPA", "Validation", "MySQL Driver"));
                return "acerca";
        }
        
        @GetMapping("/form")
        public String getForm(){
                return "form";
        }
        
        @PostMapping("/nueva")
        public String getIndex(@ModelAttribute("publicacion") Publicacion publicacion, Model model){
                
                api.guardarPublicacion(publicacion);
                
                List<Publicacion> publicaciones = api.mostrarPublicaciones();
                
                model.addAttribute("publicaciones", publicaciones);
                
                return "home";
        }
        
        
        @GetMapping("/delete")
        public String eliminarPublicacion(@RequestParam("id") Integer id, Model model){
                api.eliminarPublicacion(id);
                model.addAttribute("publicaciones", api.mostrarPublicaciones());
                
                return "home";
        }
        
        @GetMapping("/editar")
        public String editarPublicacion(@RequestParam("id") Integer id, Model model){
                
                model.addAttribute("publicacion", api.buscarPublicacion(id));
                
                return "editar";
        }
        
        @PostMapping("/index")
        public String actualizarPublicacion(@ModelAttribute("publicacion") Publicacion publicacion, Model model){
                
                api.actualizarPublicacion(publicacion);
                
                model.addAttribute("publicaciones", api.mostrarPublicaciones());
                
                return "home";
        }
        
        @GetMapping("/publicacion/{idPublicacion}")
        public String buscarPublicacacionPorId(@PathVariable("idPublicacion") Integer idPublicacion, Model model){
                model.addAttribute("publicacion", api.buscarPublicacion(idPublicacion));
                return "ver";
        }
}
