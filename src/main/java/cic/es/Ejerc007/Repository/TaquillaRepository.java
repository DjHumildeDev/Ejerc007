package cic.es.Ejerc007.Repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import cic.es.Ejerc007.DTO.SalaDTO;

@Repository
public class TaquillaRepository {
    private static List<SalaDTO> salas = new ArrayList<SalaDTO>();

    static {
        salas.add(new SalaDTO(100, "Sala 1"));
        salas.add(new SalaDTO(100, "Sala 2"));
        salas.add(new SalaDTO(100, "Sala 3"));

    }


    public List<SalaDTO> getSalas(){
        return salas;
    }
}
