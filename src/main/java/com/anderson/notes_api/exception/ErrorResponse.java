package com.anderson.notes_api.exception;


import java.time.LocalDateTime;

public record ErrorResponse(
        String message,
        int status,
        String path,
        LocalDateTime timestamp
){
}
