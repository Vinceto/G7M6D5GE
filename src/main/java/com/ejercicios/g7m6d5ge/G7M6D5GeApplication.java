package com.ejercicios.g7m6d5ge;

import com.ejercicios.g7m6d5ge.supermercado.service.SupermercadoService;
import com.ejercicios.g7m6d5ge.supermercado.service.BomberosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SpringBootApplication
public class G7M6D5GeApplication implements CommandLineRunner {

    private static final Logger logger = LoggerFactory.getLogger(G7M6D5GeApplication.class);

    @Autowired
    private SupermercadoService supermercadoService;

    @Autowired
    private BomberosService bomberosService;

    public static void main(String[] args) {
        SpringApplication.run(G7M6D5GeApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        // 1)
        logger.info("Inicio del sistema");
        logger.debug("Depuración del sistema");
        logger.error("Error en el sistema");
        logger.warn("Advertencia del sistema");

        // 2)
        supermercadoService.iniciarSistema();
        supermercadoService.cotizarProductos();
        supermercadoService.elegirProductos();
        supermercadoService.elegirCantidadProductos();
        supermercadoService.comprarProductos(true);
        supermercadoService.finalizarSistema();

        // 3)
        bomberosService.iniciarSistema();
        bomberosService.mensajeAlarmaIncendio();
        bomberosService.horaIncendio();
        bomberosService.lugarUbicacionEmergencia();
        bomberosService.llegadaLugar();
        bomberosService.realizarManiobras(true);
        bomberosService.apagarIncendio();
        bomberosService.realizarInformes();
        bomberosService.finalizarSistema();
    }
}