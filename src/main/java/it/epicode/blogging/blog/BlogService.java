package it.epicode.blogging.blog;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BlogService {

    @Autowired
    private BlogRepository blogRepository;

    public Blog save(Blog blog) {
        return blogRepository.save(blog);
    }
    public Blog update(Long id, Blog blog) {
        Blog existingBlog = blogRepository.findById(id).orElse(null);
        if (existingBlog != null) {
            blog.setId(id);
            return blogRepository.save(blog);
        }
        return null;
    }
    public void deleteById(Long id) {
        blogRepository.deleteById(id);
    }
    public Blog findById(Long id) {
        return blogRepository.findById(id).orElse(null);
    }
    public List<Blog> findAll() {
        return blogRepository.findAll();
    }
}
