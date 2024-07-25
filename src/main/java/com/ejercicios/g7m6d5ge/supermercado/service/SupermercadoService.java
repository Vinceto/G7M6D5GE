package com.ejercicios.g7m6d5ge.supermercado.service;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class SupermercadoService {
    private static final Logger logger = LoggerFactory.getLogger(SupermercadoService.class);

    public void iniciarSistema() {
        logger.info("Inicio Sistema");
    }

    public void cotizarProductos() {
        logger.info("Cotizar productos");
    }

    public void elegirProductos() {
        logger.info("Elegir productos");
    }

    public void elegirCantidadProductos() {
        logger.info("Elegir cantidad de productos");
    }

    public void comprarProductos(boolean exito) {
        if (exito) {
            logger.info("Comprar productos: exitoso");
        } else {
            logger.error("Comprar productos: error");
        }
    }

    public void finalizarSistema() {
        logger.info("Fin del sistema");
    }
}
