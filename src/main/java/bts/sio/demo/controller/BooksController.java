package bts.sio.demo.controller;

import bts.sio.demo.model.Auteur;
import bts.sio.demo.model.Livre;
import bts.sio.demo.service.AuteurService;
import bts.sio.demo.service.LivreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BooksController {

    @Autowired
    private AuteurService auteurService;
    @Autowired
    private LivreService livreService;

    @GetMapping("/api/auteurs")
    public List<Auteur> getAuteurs() {
        return auteurService.getAuteurs();
    }

    @PostMapping("/api/auteurs")
    public Auteur addAuteur(@RequestBody String auteurName) {
        return auteurService.saveAuteur(new Auteur(null, auteurName));
    }

    @GetMapping("/api/auteur/{id}")
    public Auteur getAuteurById(@PathVariable int id) {
        return auteurService.getAuteurById(id);
    }

    @DeleteMapping("/api/auteurs/{id}")
    public void deleteAuteurById(@PathVariable int id) {
        auteurService.deleteAuteur(id);
    }


    @GetMapping("/api/livres")
    public List<Livre> getLivres() {
        return livreService.getLivres();
    }

    @PostMapping("/api/livres")
    public Livre addLivre(@RequestBody String livreName, @RequestBody int price, @RequestBody int auteurId ) {
        Auteur auteur = auteurService.getAuteurById(auteurId);
        return livreService.saveLivre(new Livre(null, livreName, price, auteur));
    }

    @GetMapping("/api/livre/{id}")
    public Livre getLivreById(@PathVariable int id) {
        return livreService.getLivreById(id);
    }

    @DeleteMapping("/api/livres/{id}")
    public void deleteLivreById(@PathVariable int id) {
        livreService.deleteLivre(id);
    }

}
