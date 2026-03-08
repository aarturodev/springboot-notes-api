package com.anderson.notes_api.service;

import com.anderson.notes_api.model.Note;

import java.util.List;

public interface INoteService {

    List<Note> findAll();
    Note findById(Long id);
    Note save(Note note);
    void deleteById(Long id);

}
