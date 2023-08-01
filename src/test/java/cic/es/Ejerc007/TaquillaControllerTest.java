package cic.es.Ejerc007;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import cic.es.Ejerc007.Controller.TaquillaController;
import cic.es.Ejerc007.DTO.SesionDTO;
import cic.es.Ejerc007.Service.TaquillaService;
import cic.es.Ejerc007.Service.TaquillaServiceImp;




@SpringBootTest
@AutoConfigureMockMvc
class TaquillaControllerTest {
    

    @Autowired
    private TaquillaService taquillaService;

    @Autowired
    private MockMvc moc;
    
    @Autowired
    private MockMvc mockMvc;


    private TaquillaController taquillaController;
    
    @BeforeEach
    void setUp() throws Exception{
        
    
    }

    @Test
    void testMostrarSalas() throws Exception {
        TaquillaServiceImp taquillaServiceImp = new TaquillaServiceImp();
        when(taquillaController.mostrarSalas()).thenReturn(taquillaServiceImp.mostrarSalas());
        mockMvc.perform(get("/taquilla"))
               .andExpect(status().isOk())
               .andExpect(content().string(taquillaServiceImp.mostrarSalas()));
    }



    void Abierta() throws Exception {
        moc.perform(MockMvcRequestBuilders.get("/"))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(content().string("Hola la taquilla esta abierta"));
    }



    // @Test
    // void testVenderEntrada(){
    //     TaquillaController taquilla = new TaquillaController();
    //     taquilla.vender(5, 1);
    // }   
    
    
    


       
}
