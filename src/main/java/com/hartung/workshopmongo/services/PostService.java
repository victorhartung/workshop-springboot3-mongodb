package com.hartung.workshopmongo.services;

import com.hartung.workshopmongo.domain.Post;
import com.hartung.workshopmongo.repository.PostRepository;
import com.hartung.workshopmongo.services.exception.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PostService {

    @Autowired
    private PostRepository repo;

    public Post findById(String id) {
        Post obj = repo.findOne(id);
        return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado"));
    }





}
