package org.patros.gsisclient;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.Validator;
import javax.faces.validator.ValidatorException;

public class AfmValidator implements Validator {

    @Override
    public void validate(FacesContext facesContext, UIComponent uicomponent, Object value)
            throws ValidatorException {
        Utils utils = new Utils();
        if (!utils.checkAFM((String) value)){
            throw new ValidatorException(new FacesMessage(
                    FacesMessage.SEVERITY_ERROR, "Ο ΑΦΜ δεν είναι έγκυρος!!", null));
        }
    }
}