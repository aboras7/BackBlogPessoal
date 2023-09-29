package com.example.BlogPessoal.controller;

import com.example.BlogPessoal.model.Postagens;
import com.example.BlogPessoal.repository.PostagensRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/postagens")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class PostagensController {

    @Autowired
    private PostagensRepository postagensRepository;

    @GetMapping
    public ResponseEntity<List<Postagens>> getAll() {
        return ResponseEntity.ok(postagensRepository.findAll());
    }
}