package at.itkollegimst.studentenverwaltung.controller;

import at.itkollegimst.studentenverwaltung.exceptions.ExeptionDTO;
import at.itkollegimst.studentenverwaltung.exceptions.StudentNichtGefunden;
import at.itkollegimst.studentenverwaltung.exceptions.StudentValidierungFehlgeschlagen;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ExeptionController {
    @ExceptionHandler(StudentNichtGefunden.class)
    public ResponseEntity<ExeptionDTO> studentnichtGefunden(StudentNichtGefunden studentNichtGefunden) {
        return new ResponseEntity<>(new ExeptionDTO("1000", studentNichtGefunden.getMessage()), HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler(StudentValidierungFehlgeschlagen.class)
    public ResponseEntity<ExeptionDTO> studentNichtGefunden(StudentValidierungFehlgeschlagen studentValidierungFehlgeschlagen) {
        return new ResponseEntity<>(new ExeptionDTO("1001", studentValidierungFehlgeschlagen.getMessage()), HttpStatus.BAD_REQUEST);
    }
}
