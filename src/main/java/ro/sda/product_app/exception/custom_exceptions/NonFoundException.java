package ro.sda.product_app.exception.custom_exceptions;

import static ro.sda.product_app.utils.AppConstants.NOT_FOUND_MESSAGE;

public class NonFoundException extends ProductAppException{
    public NonFoundException() {
        super(NOT_FOUND_MESSAGE);
    }
}
