package com.example.bobocodejpa.controller;

import com.example.bobocodejpa.entity.Note;
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
    //  private NoteRepository noteRepository;

    @GetMapping
    public List<Note> findAll() {
        log.info("Getting notes");

        return List.of(Note.builder().id(1L).body("note 1").build(), Note.builder().id(2L).body("note 2").build());
    }

}
