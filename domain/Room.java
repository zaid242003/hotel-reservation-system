package domain;

public class Room {

    private final int number;
    private Guest occupiedBy;

    public Room(int number) {
        if (number <= 0)
            throw new IllegalArgumentException("Room number must be positive");
        this.number = number;
    }

    public void createGuest(Guest guest) {
        if (guest == null)
            throw new IllegalArgumentException("Guest cannot be null");
        this.occupiedBy = guest;
    }

    public boolean isOccupied() {
        return occupiedBy != null;
    }

    public int getNumber() {
        return number;
    }
}
