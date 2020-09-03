package com.training.vodaphone;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class RestAdvice {

    @ExceptionHandler(IllegalStateException.class)
    public ResponseEntity<VodaphoneError> handleException(final IllegalStateException exp) {
        VodaphoneError errorLoc = new VodaphoneError("IT",
                                                     "CRM",
                                                     "MernisCheck",
                                                     "validation error : " + exp.getMessage(),
                                                     100);
        ResponseEntity<VodaphoneError> entityLoc = ResponseEntity.status(HttpStatus.BAD_REQUEST)
                                                                 .body(errorLoc);
        return entityLoc;
    }

    @ExceptionHandler(Exception.class)
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    public VodaphoneError handleException(final Exception exp) {
        VodaphoneError errorLoc = new VodaphoneError("IT",
                                                     "CRM",
                                                     "MernisCheck",
                                                     "bir hata oluştu : " + exp.getMessage(),
                                                     100);
        return errorLoc;
    }

    @ExceptionHandler(MethodArgumentNotValidException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public VodaphoneError handleValidationException(final MethodArgumentNotValidException exp) {
        VodaphoneError errorLoc = new VodaphoneError("IT",
                                                     "CRM",
                                                     "MernisCheck",
                                                     "Validation Error",
                                                     100);

        List<ObjectError> allErrorsLoc = exp.getBindingResult()
                                            .getAllErrors();
        for (ObjectError objectErrorLoc : allErrorsLoc) {
            VodaphoneError subError = new VodaphoneError("IT",
                                                         "CRM",
                                                         "MernisCheck",
                                                         objectErrorLoc.getCode()
                                                                        + " "
                                                                        + objectErrorLoc.getDefaultMessage()
                                                                        + " "
                                                                        + objectErrorLoc.getObjectName()
                                                                        + " "
                                                                        + objectErrorLoc.getArguments(),
                                                         120);
            errorLoc.addSubError(subError);
        }
        return errorLoc;
    }


}
