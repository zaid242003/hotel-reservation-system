package domain;

import java.time.LocalDate;

public class Reservation {

    private final LocalDate startDate;
    private final LocalDate endDate;
    private final int numberOfRooms;

    public Reservation(LocalDate startDate, LocalDate endDate, int numberOfRooms) {
        if (startDate == null || endDate == null)
            throw new IllegalArgumentException("Dates cannot be null");
        if (endDate.isBefore(startDate))
            throw new IllegalArgumentException("End date must be after start date");
        if (numberOfRooms <= 0)
            throw new IllegalArgumentException("Room count must be positive");

        this.startDate = startDate;
        this.endDate = endDate;
        this.numberOfRooms = numberOfRooms;
    }
}
