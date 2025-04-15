package it.epicode.blogging.autori;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AutoreService {

    @Autowired
    private AutoreRepository autoreRepository;

    public Autore save(Autore autore) {
        return autoreRepository.save(autore);
    }
    public Autore update(Long id, Autore autore) {
        Autore existingAutore = autoreRepository.findById(id).orElse(null);
        if (existingAutore != null) {
            autore.setId(id);
            return autoreRepository.save(autore);
        }
        return null;
    }
    public void deleteById(Long id) {
        autoreRepository.deleteById(id);
    }
    public Autore findById(Long id) {
        return autoreRepository.findById(id).orElse(null);
    }
    public List<Autore> findAll() {
        return autoreRepository.findAll();
    }
}
