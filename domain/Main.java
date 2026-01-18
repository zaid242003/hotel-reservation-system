package domain;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        // System context creation
        HotelChain chain = new HotelChain("Urban Stay Group");

        // Hotel setup
        Hotel cityHotel = new Hotel("Downtown Residency");
        chain.addHotel(cityHotel);

        // Infrastructure preparation
        Room firstRoom = new Room(201);
        Room secondRoom = new Room(202);
        cityHotel.addRoom(firstRoom);
        cityHotel.addRoom(secondRoom);

        // Customer arrives in system
        Guest arrivingGuest = new Guest(
                "Hamza Khalid",
                "Model Town, Lahore"
        );

        // Reservation request scenario
        LocalDate checkInDate = LocalDate.now().plusDays(1);
        LocalDate checkOutDate = checkInDate.plusDays(3);

        Reservation request = new Reservation(
                checkInDate,
                checkOutDate,
                1
        );

        // Reservation processed by chain
        Reservation confirmed = chain.makeReservation(cityHotel, request);

        // Business decision: assign room and check in
        if (!firstRoom.isOccupied()) {
            chain.checkInGuest(firstRoom, arrivingGuest);
        }

        // Final state reporting
        System.out.println("Reservation active: " + (confirmed != null));
        System.out.println("Guest checked into room: " + firstRoom.getNumber());
        System.out.println("Room occupied status: " + firstRoom.isOccupied());
        System.out.println("Any room available in hotel: " + cityHotel.available());
    }
}