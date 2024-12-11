package com.example.Test_demo;

import com.example.Test_demo.model.Booking;
import com.example.Test_demo.repository.BookingRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDateTime;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class BookingIntegrationTest {

    @Autowired
    private BookingRepository bookingRepository;

    @Test
    void shouldSaveAndRetrieveBooking() {
        Booking booking = new Booking();
        booking.setName("NADIA");
        booking.setPhone("0698743210");
        booking.setAppointmentDate(LocalDateTime.now().plusDays(2));

        bookingRepository.save(booking);

        Booking foundBooking = bookingRepository.findAll().get(0);
            assertThat(foundBooking.getName()).isEqualTo("NADIA");
    }
}