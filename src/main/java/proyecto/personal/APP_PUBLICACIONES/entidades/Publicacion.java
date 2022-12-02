package proyecto.personal.APP_PUBLICACIONES.entidades;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "publicaciones")
public class Publicacion {
        @Id
        @GeneratedValue(strategy = IDENTITY)
        private Integer id;
        
        @Column(name = "autor", nullable = false, length = 50)
        private String autor;
        
        @Column(name = "titulo", nullable = false, length = 255)
        private String titulo;
        
        @Column(name = "descripcion", nullable = false, length = 10000)
        private String descripcion;
        
        @Column(name =  "etiquetas", nullable = false, length = 255)
        private String etiquetas;

        public Integer getId() {
                return id;
        }

        public void setId(Integer id) {
                this.id = id;
        }

        public String getAutor() {
                return autor;
        }

        public void setAutor(String autor) {
                this.autor = autor;
        }

        public String getTitulo() {
                return titulo;
        }

        public void setTitulo(String titulo) {
                this.titulo = titulo;
        }

        public String getDescripcion() {
                return descripcion;
        }

        public void setDescripcion(String descripcion) {
                this.descripcion = descripcion;
        }

        public String getEtiquetas() {
                return etiquetas;
        }

        public void setEtiquetas(String etiquetas) {
                this.etiquetas = etiquetas;
        }

        public Publicacion(Integer id, String autor, String titulo, String descripcion, String etiquetas) {
                this.id = id;
                this.autor = autor;
                this.titulo = titulo;
                this.descripcion = descripcion;
                this.etiquetas = etiquetas;
        }

        public Publicacion() {
        }
        
}
