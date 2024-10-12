package pe.edu.cibertec.app_hfc_facturacion.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FacturacionController {

    @GetMapping("/generar")
    public String generarFactura() {
        int random = (int) (Math.random() * 100000) + 5000;
        return "S/. " + random;
    }
}
