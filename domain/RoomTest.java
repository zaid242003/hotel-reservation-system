package domain;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class RoomTest {

    @Test
    void shouldCreateRoomWithValidNumber() {
        Room room = new Room(101);
        assertFalse(room.isOccupied());
    }

    @Test
    void shouldAssignGuestToRoom() {
        Room room = new Room(102);
        Guest guest = new Guest("Ali", "Lahore");

        room.createGuest(guest);

        assertTrue(room.isOccupied());
    }

    @Test
    void shouldRejectInvalidRoomNumber() {
        assertThrows(IllegalArgumentException.class, () -> new Room(0));
    }

    @Test
    void intentionallyFailingTest_missingException() {
    Room room = new Room(10);
    assertThrows(IllegalArgumentException.class, () -> {
        room.createGuest(new Guest("Ali", "Lahore"));
    });
}

}

