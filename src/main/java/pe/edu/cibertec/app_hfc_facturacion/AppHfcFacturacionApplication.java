package pe.edu.cibertec.app_hfc_facturacion;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class AppHfcFacturacionApplication {

	public static void main(String[] args) {
		SpringApplication.run(AppHfcFacturacionApplication.class, args);
	}

}
