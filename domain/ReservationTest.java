package domain;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class ReservationTest {

    @ParameterizedTest
    @ValueSource(ints = {1, 2, 3})
    void shouldCreateReservationWithValidRoomCount(int rooms) {
        Reservation reservation = new Reservation(
                LocalDate.now(),
                LocalDate.now().plusDays(1),
                rooms
        );
        assertNotNull(reservation);
    }

    @Test
    void shouldRejectEndDateBeforeStartDate() {
        assertThrows(IllegalArgumentException.class, () ->
                new Reservation(
                        LocalDate.now(),
                        LocalDate.now().minusDays(1),
                        1
                ));
    }

    @Test
    void shouldRejectInvalidRoomCount() {
        assertThrows(IllegalArgumentException.class, () ->
                new Reservation(
                        LocalDate.now(),
                        LocalDate.now().plusDays(1),
                        0
                ));
    }
}
