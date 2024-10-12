package pe.edu.cibertec.app_hfc_facturacion.controller.remoteservice;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "app-hfc-proyectos")
public interface ProyectosService {

    @GetMapping("/factura")
    String verFactura();
}
