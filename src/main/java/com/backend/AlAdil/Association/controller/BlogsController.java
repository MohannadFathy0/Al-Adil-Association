package com.backend.AlAdil.Association.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.backend.AlAdil.Association.entity.Blogs;
import com.backend.AlAdil.Association.repository.BlogsRepository;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/blogs")
public class BlogsController {

    @Autowired
    private BlogsRepository blogsRepository;

    // Get all blogs
    @CrossOrigin
    @GetMapping
    public ResponseEntity<List<Blogs>> getAllBlogs() {
        List<Blogs> blogs = blogsRepository.findAll();
        return ResponseEntity.ok(blogs);
    }

    // Get a blog by ID
    @CrossOrigin
    @GetMapping("/{id}")
    public ResponseEntity<Blogs> getBlogById(@PathVariable Long id) {
        Optional<Blogs> optionalBlog = blogsRepository.findById(id);
        return optionalBlog.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    // Create a new blog
    @CrossOrigin
    @PostMapping
    public ResponseEntity<Blogs> createBlog(@RequestBody Blogs blog) {
        Blogs createdBlog = blogsRepository.save(blog);
        return ResponseEntity.ok(createdBlog);
    }

    // Update an existing blog
    @CrossOrigin
    @PutMapping("/{id}")
    public ResponseEntity<Blogs> updateBlog(@PathVariable Long id, @RequestBody Blogs updatedBlog) {
        Optional<Blogs> optionalBlog = blogsRepository.findById(id);

        if (optionalBlog.isPresent()) {
            Blogs blog = optionalBlog.get();
            // Update properties of the existing blog with the properties of updatedBlog
            blog.setImagePath(updatedBlog.getImagePath());
            blog.setTitle(updatedBlog.getTitle());
            blog.setDescription(updatedBlog.getDescription());
            blog.setDate(updatedBlog.getDate());

            Blogs savedBlog = blogsRepository.save(blog);
            return ResponseEntity.ok(savedBlog);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    // Delete a blog by ID
    @CrossOrigin
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteBlog(@PathVariable Long id) {
        if (blogsRepository.existsById(id)) {
            blogsRepository.deleteById(id);
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}

