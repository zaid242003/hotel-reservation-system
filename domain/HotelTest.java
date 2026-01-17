package domain;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class HotelTest {

    @Test
    void shouldCreateHotelAndAddRoom() {
        Hotel hotel = new Hotel("City Inn");
        Room room = new Room(201);
        hotel.addRoom(room);
        assertTrue(hotel.available());
    }

    @Test
    void shouldRejectNullRoom() {
        Hotel hotel = new Hotel("City Inn");
        assertThrows(IllegalArgumentException.class,
                () -> hotel.addRoom(null));
    }
}
