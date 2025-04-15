package it.epicode.blogging.autori;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class AutoreRunner implements CommandLineRunner {

    @Autowired
    private AutoreRepository autoreRepository;

    @Override
    public void run(String... args) throws Exception {
        System.out.println("AutoreRunner");
       Autore autore = new Autore();
       autore.setNome("Mario");
       autore.setCognome("Rossi");
       autore.setEmail("mario.rossi@example.com");
       autore.setAvatar("https://example.com/avatar.jpg");

       autoreRepository.save(autore);

        Autore autore2 = new Autore();
        autore2.setNome("Luigi");
        autore2.setCognome("Verdi");
        autore2.setEmail("luigi.verdi@example.com");
        autore2.setAvatar("https://example.com/avatar.jpg");

        autoreRepository.save(autore2);
    }
}
