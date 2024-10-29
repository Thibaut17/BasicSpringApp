package bts.sio.demo.repository;

import bts.sio.demo.model.Auteur;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuteurRepository extends JpaRepository<Auteur, Integer> {
    Auteur getAuteurByNom(String nom);
}