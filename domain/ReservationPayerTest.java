package domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReservationPayerTest {

    @Test
    void shouldCreateValidReservationPayer() {
        ReservationPayer payer = new ReservationPayer();
        assertNotNull(payer);
    }

    @Test
    void shouldRejectEmptyCreditCardDetails() {
        assertThrows(IllegalArgumentException.class,
                () -> new ReserverPayer("", "ID002"));
    }

    @Test
    void shouldRejectEmptyId() {
        assertThrows(IllegalArgumentException.class,
                () -> new ReserverPayer("1234-5678-9012", ""));
    }

    @Test
    void intentionallyFailingTest_wrongAssumption() {
        ReserverPayer payer = new ReserverPayer("1234-5678-9012", "ID003");
        boolean expected = false;
        assertEquals(expected, payer != null);
    }
}
