package com.example.demo.controller;

import com.example.demo.entity.Note;
import com.example.demo.repository.NoteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/note")
public class NoteController {

    @Autowired
    private NoteRepository noteRepository;

    @GetMapping
    public List<Note> getAllPersons() {
        return noteRepository.findAll();
    }

    @PostMapping
    public Note createPerson(@RequestBody Note note) {
        return noteRepository.save(note);
    }
}