package pro.darkgod.springbooterrorhandling.error;

import pro.darkgod.springbooterrorhandling.utils.ErrorConstants;

public class EmptyDataException extends Exception {

    static final long serialVersionUID = 1L;

    public EmptyDataException() {
        super(ErrorConstants.EMPTY_DATA);
    }
}