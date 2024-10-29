package bts.sio.demo.repository;

import bts.sio.demo.model.Auteur;
import bts.sio.demo.model.Livre;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LivreRepository extends JpaRepository<Livre, Integer> {
    Livre getLivreByNom(String nom);
}