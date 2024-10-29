package bts.sio.demo.service;

import bts.sio.demo.model.Livre;
import bts.sio.demo.repository.LivreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LivreService {
    @Autowired
    private LivreRepository livreRepository;

    public List<Livre> getLivres() {
        return livreRepository.findAll();
    }

    public Livre getLivreById(int id) {
        return livreRepository.findById(id).get();
    }

    public Livre saveLivre(Livre livre) {
        return livreRepository.save(livre);
    }
    public Livre updateLivre(Livre livre) {
        return livreRepository.save(livre);
    }
    public void deleteLivre(int id) {
        livreRepository.deleteById(id);
    }
    public Livre getLivreByName(String name) {
        return livreRepository.getLivreByNom(name);
    }

}
