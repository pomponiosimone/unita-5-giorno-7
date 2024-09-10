package pomponiosimone.unita_giorno_7.services;

import org.springframework.stereotype.Service;
import pomponiosimone.unita_giorno_7.entities.Autore;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Service
public class AutoreService {


    public List<Autore> autoreList = new ArrayList<>();

    // tutti gli autori
    public List<Autore> findAll() {
        return this.autoreList;
    }
    //Salvataggio creazione

public Autore saveAutore(Autore body) {
    Random rndm = new Random();
    body.setId(rndm.nextInt(1, 100));
  //  body.setNome("Simone");
   // body.setCognome("Rossi");
   // body.setEmail("rossi@gmail.com");
   // body.setAvatar("https://ui-avatars.com/api/?name=Mario+Rossi");
   // body.setDataDiNascita("10/10/2003");
    this.autoreList.add(body);
    return body;
}

// Trova tramite id
    
}

