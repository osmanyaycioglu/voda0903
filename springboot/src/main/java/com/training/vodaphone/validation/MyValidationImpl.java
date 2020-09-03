package com.training.vodaphone.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class MyValidationImpl implements ConstraintValidator<ValidateStart, String> {

    private String baslangic;

    @Override
    public void initialize(final ValidateStart anno) {
        this.baslangic = anno.baslangic();
    }

    @Override
    public boolean isValid(final String valueParam,
                           final ConstraintValidatorContext contextParam) {
        return valueParam.startsWith(this.baslangic);
    }

}
