package domain;

import java.util.ArrayList;
import java.util.List;

public class HotelChain {

    private final String name;
    private final List<Hotel> hotels = new ArrayList<>();

    public HotelChain(String name) {
        if (name == null || name.isBlank())
            throw new IllegalArgumentException("Chain name required");
        this.name = name;
    }

    public void addHotel(Hotel hotel) {
        if (hotel == null)
            throw new IllegalArgumentException("Hotel cannot be null");
        hotels.add(hotel);
    }

    public Reservation makeReservation(Hotel hotel, Reservation reservation) {
        return hotel.createReservation(reservation);
    }

    public void cancelReservation() {

    }

    public void checkInGuest(Room room, Guest guest) {
        room.createGuest(guest);
    }

    public void checkOutGuest(Room room) {
        
    }
}
