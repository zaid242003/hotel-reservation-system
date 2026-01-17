package domain;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

class RoomTypeTest {

    @Test
    void shouldCreateValidRoomType() {
        RoomType type = new RoomType("Deluxe", BigDecimal.valueOf(5000));
        assertNotNull(type);
    }

    @ParameterizedTest
    @ValueSource(strings = {"", " ", "\t"})
    void shouldRejectInvalidRoomKind(String kind) {
        assertThrows(IllegalArgumentException.class,
                () -> new RoomType(kind, BigDecimal.valueOf(1000)));
    }

    @Test
    void shouldRejectNegativeCost() {
        assertThrows(IllegalArgumentException.class,
                () -> new RoomType("Standard", BigDecimal.valueOf(-1)));
    }
}
