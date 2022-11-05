package com.example.bobocodejpa.controller;

import com.example.bobocodejpa.entity.Note;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
@Slf4j
public class BasicController {
    @GetMapping
    public List<Note> findAll() {
        log.info("BasicController");

        return List.of(Note.builder().id(1L).body("BasicController").build(), Note.builder().id(2L).body("note 2").build(),Note.builder().id(3L).body("note 3").build());
    }
}
