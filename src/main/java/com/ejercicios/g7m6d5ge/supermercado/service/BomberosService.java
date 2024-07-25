package com.ejercicios.g7m6d5ge.supermercado.service;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class BomberosService {
    private static final Logger logger = LoggerFactory.getLogger(BomberosService.class);

    public void iniciarSistema() {
        logger.info("Inicio Sistema");
    }

    public void mensajeAlarmaIncendio() {
        logger.info("Mensaje Alarma incendio");
    }

    public void horaIncendio() {
        logger.info("Hora del incendio");
    }

    public void lugarUbicacionEmergencia() {
        logger.info("Lugar de ubicación de la emergencia");
    }

    public void llegadaLugar() {
        logger.info("Llegada al lugar");
    }

    public void realizarManiobras(boolean hayPersonas) {
        if (hayPersonas) {
            logger.info("Se rescata personal y se aplica primeros auxilios");
        } else {
            logger.info("No hay heridos");
        }
    }

    public void apagarIncendio() {
        logger.info("Apagar el incendio");
    }

    public void realizarInformes() {
        logger.info("Realizar informes");
    }

    public void finalizarSistema() {
        logger.info("Fin del Sistema");
    }
}
