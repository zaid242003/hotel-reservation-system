package domain;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class HotelChainTest {

    @Test
    void shouldMakeReservationSuccessfully() {
        HotelChain chain = new HotelChain("Global Chain");
        Hotel hotel = new Hotel("City Inn");
        Reservation reservation = new Reservation(
                java.time.LocalDate.now(),
                java.time.LocalDate.now().plusDays(2),
                1
        );
        Reservation result = chain.makeReservation(hotel, reservation);
        assertNotNull(result);
    }

    @Test
    void shouldCheckInGuest() {
        HotelChain chain = new HotelChain("Chain");
        Room room = new Room(301);
        Guest guest = new Guest("Ali", "Karachi");
        chain.checkInGuest(room, guest);
        assertTrue(room.isOccupied());
    }
}
