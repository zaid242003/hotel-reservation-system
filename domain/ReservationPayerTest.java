package domain;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ReserverPayerTest {

    @Test
    void shouldCreateValidReserverPayer() {
        ReserverPayer payer = new ReserverPayer("1234-5678-9012", "ID001");
        assertNotNull(payer);
    }

    @Test
    void shouldRejectInvalidCardDetails() {
        assertThrows(IllegalArgumentException.class,
                () -> new ReserverPayer("", "ID002"));
    }
}
