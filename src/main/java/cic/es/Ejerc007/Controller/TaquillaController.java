package cic.es.Ejerc007.Controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cic.es.Ejerc007.Service.TaquillaService;

@RestController
@RequestMapping("/")
public class TaquillaController {
    

    @Autowired
    private TaquillaService taquillaService;

    @GetMapping
    @RequestMapping("/taquilla")
    public TaquillaService getService(){
        return this.taquillaService;
    }

    

}
