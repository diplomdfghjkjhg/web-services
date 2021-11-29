package kz.paket.studu.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@ComponentScan("kz.paket.studu")
@EnableWebMvc
public class SpringConfig {

}
