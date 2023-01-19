package ro.sda.product_app.exception.custom_exceptions;

import static ro.sda.product_app.utils.AppConstants.ALREADY_EXISTENT_MESSAGE;

public class AlreadyExistedException extends ProductAppException{
    public AlreadyExistedException() {
        super(ALREADY_EXISTENT_MESSAGE);
    }
}
