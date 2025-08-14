package cat.itacademy.barcelonactiva.bustamante.gabriela.s04.t02.n01.S04T02N01BustamanteGabriela.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(FrutaNotFoundException.class)
    public ResponseEntity<String> handleFrutaNotFoundException(FrutaNotFoundException ex) {
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(ex.getMessage());
    }

    // Aquí irían otros manejadores de excepciones si fuese necesario

}
