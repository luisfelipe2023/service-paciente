package pe.edu.cibertec.service_paciente;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
public class ServicePacienteApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServicePacienteApplication.class, args);
	}

}
