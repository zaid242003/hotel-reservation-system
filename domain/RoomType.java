package domain;

import java.math.BigDecimal;
import java.util.Objects;

public class RoomType {

    private final String kind;
    private final BigDecimal cost;

    public RoomType(String kind, BigDecimal cost) {
        if (kind == null || kind.isBlank())
            throw new IllegalArgumentException("Room type kind is required");
        if (cost == null || cost.compareTo(BigDecimal.ZERO) <= 0)
            throw new IllegalArgumentException("Cost must be positive");

        this.kind = kind;
        this.cost = cost;
    }

    public String getKind() {
        return kind;
    }

    public BigDecimal getCost() {
        return cost;
    }
}
