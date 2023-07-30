package cic.es.Ejerc007;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import cic.es.Ejerc007.Controller.TaquillaController;
import cic.es.Ejerc007.DTO.SesionDTO;
import cic.es.Ejerc007.Service.TaquillaService;
import cic.es.Ejerc007.Service.TaquillaServiceImp;


class TaquillaControllerTest {
    private SesionDTO sesion;
    
    @BeforeEach
    void setUp() throws Exception{

    }

    @Test
    void testVenderEntrada(){
        TaquillaController taquilla = new TaquillaController(new TaquillaServiceImp());
        taquilla.vender(5, sesion);
        
    }
    

}
