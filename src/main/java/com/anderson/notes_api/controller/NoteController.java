package com.anderson.notes_api.controller;

import com.anderson.notes_api.model.Note;
import com.anderson.notes_api.service.INoteService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("notes-api")
public class NoteController {

    private final INoteService noteService;

    public NoteController(INoteService noteService) {
        this.noteService = noteService;
    }


    @GetMapping("/notes")
    public List<Note> findAll() {
        return noteService.findAll();
    }

    @GetMapping("/notes/{id}")
    public Note findById(@PathVariable Long id) {
        return noteService.findById(id);
    }

    @PostMapping("/notes")
    public Note save(@RequestBody Note note) {
        return noteService.save(note);
    }

    @DeleteMapping("/notes/{id}")
    public void deleteById(@PathVariable Long id) {
        noteService.deleteById(id);
    }
}
