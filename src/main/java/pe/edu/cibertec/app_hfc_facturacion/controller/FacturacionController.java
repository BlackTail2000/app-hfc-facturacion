package pe.edu.cibertec.app_hfc_facturacion.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pe.edu.cibertec.app_hfc_facturacion.controller.remoteservice.ProyectosService;

@RequiredArgsConstructor
@RestController
public class FacturacionController {
    private final ProyectosService proyectosService;
    @GetMapping("/generar")
    public String generarFactura() {
        int random = (int) (Math.random() * 100000) + 5000;
        return "S/. " + random;
    }

    @GetMapping("/proyecto/factura")
    public String berFacturaProyecto(){
        return proyectosService.verFactura();
    }
}
