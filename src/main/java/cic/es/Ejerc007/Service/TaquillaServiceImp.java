package cic.es.Ejerc007.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;


import cic.es.Ejerc007.DTO.EntradaDTO;
import cic.es.Ejerc007.DTO.SalaDTO;
import cic.es.Ejerc007.DTO.SesionDTO;
import cic.es.Ejerc007.Repository.TaquillaRepository;

@Service("TaquillaService")
@Lazy
public class TaquillaServiceImp implements TaquillaService {

    // ----------------------------------------------- Atributos
    
    private List<EntradaDTO> entradas;

    private List<SalaDTO> salas;

    // -----------------------------------------------Constructores
    public TaquillaServiceImp(){
        salas = TaquillaRepository.getSalas();
    }

    // --------------------------------------------------Métodos

    /**
     * Creamos el método vender que nos permite vender una entrada en función
     * de la cantidad de entradas deseadas y la sesion indicada
     * 
     * @param cantidad
     * @param sesion
     */
    @Override
    public boolean venderEntrada(int cantidad, SesionDTO sesion) {

        if (entradasDisponibles(sesion) >= cantidad) {

            double precioTotal = descuento(cantidad);
            for (int i = 0; i < cantidad; i++) {

                EntradaDTO entrada = new EntradaDTO(sesion);
                entradas.add(entrada);
            }
            SalaDTO sala = sesion.getSala();
            sala.setAsientos(sala.getAsientos() - cantidad);
            return true;
        }
        return false;

    }
    @Override
    public String mostrarSalas(){
        String cadenaSalas = "";
        for(SalaDTO sala:salas){
            cadenaSalas += sala.toString() + ",";
        }
        return cadenaSalas;
    }

    /**
     * Método para aplicar el descuento en función de la cantidad de
     * las entradas
     * 
     * @param cantidad
     */
    @Override
    public double descuento(int cantidad) {

        double total = cantidad * 5;

        if (cantidad >= 5) {

            double descuento = total * 0.10;
            total -= descuento;
        }

        return total;
    }

    @Override
    public int entradasVendidas(SesionDTO sesion) {

        int contador = 0;
        for (EntradaDTO entrada : entradas) {

            if (entrada.getSesion() == sesion) {
                contador++;
            }
        }

        return contador;
    }

    @Override
    public int entradasDisponibles(SesionDTO sesion) {

        return sesion.getSala().getAsientos() - entradasVendidas(sesion);

    }

    @Override
    public boolean eliminar(int index) {

        if (entradas.remove(index) != null) {

            return true;

        }

        return false;
    }

    @Override
    public boolean editar(int index, EntradaDTO nueva) {

        if (entradas.set(index, nueva) != null) {

            return true;

        }

        return false;
    }

    @Override
    public int entradasTotales() {

        return entradas.size();
    }

    @Override
    public double ventasTotales() {

        double total = 0;

        for (EntradaDTO entrada : entradas) {

            total += EntradaDTO.getPrecio();
        }

        return total;
    }

    @Override
    public double ventasTotalesPorPelicula(String pelicula) {

        double total = 0;

        for (EntradaDTO entrada : entradas) {

            if (entrada.getSesion().getPelicula().equalsIgnoreCase(pelicula)) {
                total += EntradaDTO.getPrecio();
            }
        }

        return total;
    }

    @Override
    public HashMap<String, Double> ventasTotalesPeliculas() {

        HashMap<String, Double> estadistica = new HashMap<>();
        for (EntradaDTO entrada : entradas) {

            if (estadistica.containsKey(entrada.getSesion().getPelicula())) {

                estadistica.put(entrada.getSesion().getPelicula(),
                        estadistica.get(entrada.getSesion().getPelicula()) + EntradaDTO.getPrecio());

            } else {
                estadistica.put(entrada.getSesion().getPelicula(), EntradaDTO.getPrecio());
            }

        }
        return estadistica;
    }
    
  

}
