package com.example.Test_demo;

import com.example.Test_demo.model.Booking;
import org.junit.jupiter.api.Test;

import jakarta.validation.Validation;
import jakarta.validation.Validator;
import jakarta.validation.ValidatorFactory;
import java.time.LocalDateTime;

import static org.assertj.core.api.Assertions.assertThat;

class BookingValidationTest {

    private final Validator validator;

    public BookingValidationTest() {
        ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
        this.validator = factory.getValidator();
    }

    @Test
    void shouldFailValidationWhenNameIsBlank() {
        Booking booking = new Booking();
        booking.setName("");
        booking.setPhone("123567890");
        booking.setAppointmentDate(LocalDateTime.now().plusDays(1));

        var violations = validator.validate(booking);

        assertThat(violations).isNotEmpty();
        assertThat(violations).anyMatch(violation -> violation.getMessage().equals("Le nom est obligatoire."));
    }
}