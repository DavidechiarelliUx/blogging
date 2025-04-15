package it.epicode.blogging.autori;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/autori")
public class AutoreController {

    @Autowired
    private AutoreService autoreService;

    @GetMapping
    public List<Autore> findAll() {
        return autoreService.findAll();
    }
    @GetMapping("/{id}")
    public Autore findById(Long id) {
        return autoreService.findById(id);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Autore save(Autore autore) {
        return autoreService.save(autore);
    }

    @PutMapping("/{id}")
    public Autore update(@PathVariable Long id, @RequestBody Autore autore) {
        return autoreService.update(id, autore);
    }
    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteById(Long id) {
        autoreService.deleteById(id);
    }
}
