package domain;

public class Guest {

    private final String name;
    private final String addressDetails;

    public Guest(String name, String addressDetails) {
        if (name == null || name.isBlank())
            throw new IllegalArgumentException("Guest name required");
        if (addressDetails == null || addressDetails.isBlank())
            throw new IllegalArgumentException("Address required");

        this.name = name;
        this.addressDetails = addressDetails;
    }
}
