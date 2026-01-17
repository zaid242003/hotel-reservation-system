package domain;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class GuestTest {

    @Test
    void shouldCreateValidGuest() {
        Guest guest = new Guest("Sara", "Islamabad");
        assertNotNull(guest);
    }

    @Test
    void shouldRejectEmptyName() {
        assertThrows(IllegalArgumentException.class,
                () -> new Guest("", "Address"));
    }
}
