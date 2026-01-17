package domain;

public class ReserverPayer {

    private final String creditCardDetails;
    private final String id;

    public ReserverPayer(String creditCardDetails, String id) {
        if (creditCardDetails == null || creditCardDetails.isBlank())
            throw new IllegalArgumentException("Card details required");
        if (id == null || id.isBlank())
            throw new IllegalArgumentException("ID required");

        this.creditCardDetails = creditCardDetails;
        this.id = id;
    }
}
