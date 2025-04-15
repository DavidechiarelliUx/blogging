package it.epicode.blogging.autori;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "autori")

public class Autore {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    @Column(length = 20, nullable = false, name = "nome")
    private String nome;

    @Column(length = 20, nullable = false, name = "cognome")
    private String cognome;

    @Column(length = 50, nullable = false, name = "email")
    private String email;

    @Column(length = 100, nullable = false, name = "avatar")
    private String avatar = "https://ui-avatars.com/api/?name= Mario + Rossi "; ;

}
