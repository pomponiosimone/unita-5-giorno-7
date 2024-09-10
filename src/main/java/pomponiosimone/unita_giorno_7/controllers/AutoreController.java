package pomponiosimone.unita_giorno_7.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pomponiosimone.unita_giorno_7.entities.Autore;
import pomponiosimone.unita_giorno_7.services.AutoreService;

import java.util.List;
@RestController
@RequestMapping("/autore")
public class AutoreController {
    @Autowired
    private AutoreService autoreService;

    //Ritorna lista autori
    @GetMapping()
    private List<Autore> getAll() {
        return autoreService.findAll() ;

    }

    //Creazione autore
    @PostMapping()
    public Autore CreateAutore(@RequestBody Autore body) {
        return autoreService.saveAutore(body);

    }
}
