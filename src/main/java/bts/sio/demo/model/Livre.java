package bts.sio.demo.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "livre", schema = "books")
public class Livre {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "nom", nullable = false, length = 245)
    private String nom;

    @Column(name = "prix")
    private Integer prix;

    @ManyToOne(fetch = FetchType.EAGER, optional = false)
    @JoinColumn(name = "auteur", nullable = false)
    private Auteur auteur;

}