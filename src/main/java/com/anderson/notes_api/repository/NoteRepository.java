package com.anderson.notes_api.repository;

import com.anderson.notes_api.model.Note;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NoteRepository extends JpaRepository<Note, Long> {
}
