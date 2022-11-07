package com.example.bobocodejpa.controller;

import com.example.bobocodejpa.entity.Note;
import com.example.bobocodejpa.repository.NoteRepository;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/notes")
@AllArgsConstructor
@Slf4j
public class NoteController {
    private NoteRepository noteRepository;

    @GetMapping
    public List<Note> findAll() {
        return noteRepository.findAll();
    }

    @GetMapping("/{id}")
    public Note findById(Long id) {
        return noteRepository.findById(id).orElse(Note.builder().id(100L).body("default note").build());
    }

}
