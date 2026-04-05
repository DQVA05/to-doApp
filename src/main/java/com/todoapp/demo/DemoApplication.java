package com.todoapp.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
/*


necesito crear un proyecto de spring boot con el nombre de todoapp, con las siguientes dependencias:
- Spring Web
- Spring Data JPA
- H2 Database
- Spring Boot DevTools
El proyecto debe tener una estructura de paquetes organizada, con los siguientes paquetes:
- com.todoapp.demo.controller: para las clases controladoras
- com.todoapp.demo.model: para las clases de modelo
- com.todoapp.demo.repository: para las interfaces de repositorio
- com.todoapp.demo.service: para las clases de servicio
- com.todoapp.demo.dto: para las clases de transferencia de datos (DTO)
- com.todoapp.demo.exception: para las clases de manejo de excepciones
- com.todoapp.demo.config: para las clases de configuración




*/







@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

}
