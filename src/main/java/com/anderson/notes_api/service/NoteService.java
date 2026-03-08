package com.anderson.notes_api.service;

import com.anderson.notes_api.exception.ResourceNotFound;
import com.anderson.notes_api.model.Note;
import com.anderson.notes_api.repository.NoteRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NoteService implements INoteService{

    private final NoteRepository noteRepository;

    public NoteService(NoteRepository noteRepository) {
        this.noteRepository = noteRepository;
    }

    @Override
    public List<Note> findAll() {

        return noteRepository.findAll();
    }

    @Override
    public Note findById(Long id) {
        return noteRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFound("Note not found with id: " + id));
    }

    @Override
    public Note save(Note note) {
        return noteRepository.save(note);
    }

    @Override
    public void deleteById(Long id) {
        if(!noteRepository.existsById(id))
            throw new ResourceNotFound("Note not found with id: " + id);

        noteRepository.deleteById(id);
    }
}
