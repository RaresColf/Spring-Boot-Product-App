package ro.sda.product_app.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import ro.sda.product_app.exception.custom_exceptions.AlreadyExistedException;
import ro.sda.product_app.exception.custom_exceptions.NonFoundException;
import ro.sda.product_app.exception.model.ClientError;

@RestControllerAdvice
public class AppExceptionHandler {
    @ResponseStatus(HttpStatus.NOT_ACCEPTABLE)
    @ExceptionHandler(AlreadyExistedException.class)
    public ClientError clientError(){
       return new ClientError("Already existent in the database", 406);
    }


    @ResponseStatus(HttpStatus.NOT_FOUND)
    @ExceptionHandler(NonFoundException.class)
    public ClientError notFound(){
        return new ClientError("The product was not found", 404);
    }
}

