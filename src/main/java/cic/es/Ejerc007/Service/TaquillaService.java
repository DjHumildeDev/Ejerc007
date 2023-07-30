package cic.es.Ejerc007.Service;

import java.util.HashMap;

import cic.es.Ejerc007.DTO.EntradaDTO;
import cic.es.Ejerc007.DTO.SesionDTO;

public interface TaquillaService {

    /**
     * Creamos el método vender que nos permite vender una entrada en función
     * de la cantidad de entradas deseadas y la sesion indicada
     * 
     * @param cantidad
     * @param sesion
     */
    boolean venderEntrada(int cantidad, SesionDTO sesion);

    /**
     * Método para aplicar el descuento en función de la cantidad de
     * las entradas
     * 
     * @param cantidad
     */
    double descuento(int cantidad);

    int entradasVendidas(SesionDTO sesion);

    int entradasDisponibles(SesionDTO sesion);

    boolean eliminar(int index);

    boolean editar(int index, EntradaDTO nueva);

    int entradasTotales();

    double ventasTotales();

    double ventasTotalesPorPelicula(String pelicula);

    HashMap<String, Double> ventasTotalesPeliculas();

}