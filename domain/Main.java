package domain;

public class Main {
    public static void main(String[] args) {

        HotelChain chain = new HotelChain("Global Hotels");
        Hotel hotel = new Hotel("City Inn");
        Room room = new Room(101);

        hotel.addRoom(room);
        chain.addHotel(hotel);

        Guest guest = new Guest("Ali", "Lahore");
        chain.checkInGuest(room, guest);

        System.out.println("Hotel available: " + hotel.available());
    }
}
