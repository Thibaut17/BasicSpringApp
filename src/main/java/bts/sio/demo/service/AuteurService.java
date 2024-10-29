package bts.sio.demo.service;

import bts.sio.demo.model.Auteur;
import bts.sio.demo.repository.AuteurRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AuteurService {
    @Autowired
    private AuteurRepository auteurRepository;

    public List<Auteur> getAuteurs() {
        return auteurRepository.findAll();
    }

    public Auteur getAuteurById(int id) {
        return auteurRepository.findById(id).get();
    }

    public Auteur saveAuteur(Auteur auteur) {
        return auteurRepository.save(auteur);
    }
    public Auteur updateAuteur(Auteur auteur) {
        return auteurRepository.save(auteur);
    }
    public void deleteAuteur(int id) {
        auteurRepository.deleteById(id);
    }
    public Auteur getAuteurByName(String name) {
        return auteurRepository.getAuteurByNom(name);
    }

}
