package it.epicode.blogging.blog;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "blogs")

public class Blog {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    @Column(length = 20, nullable = false, name = "categoria")
    private String categoria;

    @Column(length = 50, nullable = false, name = "titolo")
    private String titolo;

    @Column(length = 100, nullable = false, name = "cover")
    private String cover;
    @Column(length = 100, nullable = false, name = "contenuto")
    private String contenuto;

    @Column(length = 20, nullable = false, name = "autore")
    private String autore;

    @Column(nullable = false, name = "tempoDiLettura")
    private Double tempoDiLettura;
}
