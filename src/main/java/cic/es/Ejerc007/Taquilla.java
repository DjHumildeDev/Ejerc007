package cic.es.Ejerc007;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Taquilla {

    // ----------------------------------------------- Atributos

    List<Entrada> entradas;

    // -----------------------------------------------Constructores

    public Taquilla() {

        entradas = new ArrayList<>();
    }

    // --------------------------------------------------Métodos

    /**
     * Creamos el método vender que nos permite vender una entrada en función
     * de la cantidad de entradas deseadas y la sesion indicada
     * 
     * @param cantidad
     * @param sesion
     */
    public boolean venderEntrada(int cantidad, Sesion sesion) {

        if (entradasDisponibles(sesion) >= cantidad) {

            double precioTotal = descuento(cantidad);
            for (int i = 0; i < cantidad; i++) {

                Entrada entrada = new Entrada(sesion, precioTotal / cantidad);
                entradas.add(entrada);
            }
            return true;
        }
        return false;

    }

    /**
     * Método para aplicar el descuento en función de la cantidad de
     * las entradas
     * 
     * @param cantidad
     */
    public double descuento(int cantidad) {

        double total = cantidad * 5;

        if (cantidad >= 5) {

            double descuento = total * 0.10;
            total -= descuento;
        }

        return total;
    }

    public int entradasVendidas(Sesion sesion) {

        int contador = 0;
        for (Entrada entrada : entradas) {

            if (entrada.getSesion() == sesion) {
                contador++;
            }
        }

        return contador;
    }

    public int entradasDisponibles(Sesion sesion) {

        return sesion.getSala().getAsientos() - entradasVendidas(sesion);

    }

    public boolean eliminar(int index) {

        if (entradas.remove(index) != null) {

            return true;

        }

        return false;
    }

    public boolean editar(int index, Entrada nueva) {

        if (entradas.set(index, nueva) != null) {

            return true;

        }

        return false;
    }

    public int entradasTotales() {

        return entradas.size();
    }

    public double ventasTotales() {

        double total = 0;

        for (Entrada entrada : entradas) {

            total += entrada.getPrecio();
        }

        return total;
    }

    public double ventasTotalesPorPelicula(String pelicula) {

        double total = 0;

        for (Entrada entrada : entradas) {

            if (entrada.getSesion().getPelicula().equalsIgnoreCase(pelicula)) {
                total += entrada.getPrecio();
            }
        }

        return total;
    }

    public HashMap<String, Double> ventasTotalesPeliculas() {

        HashMap<String, Double> estadistica = new HashMap<>();
        for (Entrada entrada : entradas) {

            if (estadistica.containsKey(entrada.getSesion().getPelicula())) {

                estadistica.put(entrada.getSesion().getPelicula(),
                        estadistica.get(entrada.getSesion().getPelicula()) + entrada.getPrecio());

            } else {
                estadistica.put(entrada.getSesion().getPelicula(), entrada.getPrecio());
            }

        }
        return estadistica;
    }

}