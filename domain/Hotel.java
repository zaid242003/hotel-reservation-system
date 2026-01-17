package domain;

import java.util.ArrayList;
import java.util.List;

public class Hotel {

    private final String name;
    private final List<Room> rooms = new ArrayList<>();

    public Hotel(String name) {
        if (name == null || name.isBlank())
            throw new IllegalArgumentException("Hotel name required");
        this.name = name;
    }

    public void addRoom(Room room) {
        if (room == null)
            throw new IllegalArgumentException("Room cannot be null");
        rooms.add(room);
    }

    public boolean available() {
        return rooms.stream().anyMatch(r -> !r.isOccupied());
    }

    public Reservation createReservation(Reservation reservation) {
        if (reservation == null)
            throw new IllegalArgumentException("Reservation cannot be null");
        return reservation;
    }
}
