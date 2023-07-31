package cic.es.Ejerc007.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cic.es.Ejerc007.DTO.SesionDTO;
import cic.es.Ejerc007.Exceptions.VentaException;
import cic.es.Ejerc007.Service.TaquillaService;

@RestController
@RequestMapping("/")
public class TaquillaController {
    

    @Autowired
    private TaquillaService taquillaService;

    
  

    public TaquillaController() {
    }

    @GetMapping
    @RequestMapping("/")
    public String Abierta() {
        return "Hola la taquilla esta abierta";
    }

    @GetMapping
    @RequestMapping("/taquilla")
    public String mostrarSalas() {
        return taquillaService.mostrarSalas();
    }



    @PostMapping(path = "/taquilla/vender/{cantidad}/{id}")
    public String vender(@PathVariable("cantidad") int cantidad,@PathVariable("id") int id){
        List<SesionDTO> sesiones = taquillaService.getSesiones();

        SesionDTO sesion = (SesionDTO) sesiones.stream().filter(x -> x.getId() == id);

        if(taquillaService.venderEntrada(cantidad, id))
            return cantidad +" Entradas vendidas  para la sesion "+sesion.getPelicula() + "de las: " + sesion.getHora();
        
        else
            throw new VentaException("No hay butacas disponibles para la sesion");
    }


    @GetMapping
    @RequestMapping(path = "/taquilla/vendidas/{sesion}")
    public String VendidasSesion(@PathVariable("sesion") SesionDTO sesion){

        int cantidad = taquillaService.entradasVendidas(sesion);

        return "Entradas vendidas: " + cantidad;     
    }

}