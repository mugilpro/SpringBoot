package org.mugil.validation;

import org.mugil.topic.Topic;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class ValidPassengerCountValidator implements ConstraintValidator<ValidPassengerCount,Topic> {
    @Override
    public void initialize(ValidPassengerCount validPassengerCount) {

    }

    @Override
    public boolean isValid(Topic topic, ConstraintValidatorContext constraintValidatorContext) {
        return false;
    }
}
