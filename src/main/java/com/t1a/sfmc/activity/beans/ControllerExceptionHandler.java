package com.t1a.sfmc.activity.beans;

import com.t1a.sfmc.activity.model.exception.ExceptionData;
import com.t1a.sfmc.activity.model.exception.MyHardException;
import com.t1a.sfmc.activity.model.exception.MySoftException;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
@AllArgsConstructor
@Slf4j
public class ControllerExceptionHandler extends ResponseEntityExceptionHandler {

    private ExceptionData generateMyExData(Exception exception) {
        ExceptionData result = new ExceptionData();
        result.setStatus("ERROR");
        result.setErrorDesc(exception.getMessage());
        return result;
    }

    @ExceptionHandler(MyHardException.class)
    protected ResponseEntity<ExceptionData> handleHardError(MyHardException exception) {
        log.error("Handling hard exception");
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(generateMyExData(exception));
    }

    @ExceptionHandler(MySoftException.class)
    protected ResponseEntity<ExceptionData> handleSoftError(MySoftException exception) {
        log.error("Handling soft exception");
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(generateMyExData(exception));
    }

}
