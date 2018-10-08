package pro.darkgod.springbooterrorhandling.error;

import pro.darkgod.springbooterrorhandling.utils.ErrorConstants;

public class EntityNotFoundException extends Exception {

    static final long serialVersionUID = 1L;

    public EntityNotFoundException() {
        super(ErrorConstants.NOT_FOUND);
    }
}