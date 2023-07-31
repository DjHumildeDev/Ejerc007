package cic.es.Ejerc007;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import cic.es.Ejerc007.Controller.TaquillaController;
import cic.es.Ejerc007.DTO.SesionDTO;



class TaquillaControllerTest {
    private SesionDTO sesion;
    
    @BeforeEach
    void setUp() throws Exception{

    }

    @Test
    void testVenderEntrada(){
        TaquillaController taquilla = new TaquillaController();
        taquilla.vender(5, " sesion 1");
    }   
    
    
    
    

}
