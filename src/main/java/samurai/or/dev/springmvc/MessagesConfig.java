package samurai.or.dev.springmvc;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
// La anotación @Configuration se utiliza para indicar que la clase puede
// contener métodos @Bean.
// Cuando se utiliza con @ComponentScan, Spring buscará otras configuraciones y
// beans en el paquete de la clase anotada.
@PropertySource({ "classpath:messages.properties" })
// La anotación @PropertySource se utiliza para definir la ubicación de los
// archivos de propiedades
// que Spring debería cargar en su contexto de aplicación.

public class MessagesConfig {
}
