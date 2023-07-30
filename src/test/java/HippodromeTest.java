import org.junit.jupiter.api.Test;

import java.util.Collections;

import static org.junit.jupiter.api.Assertions.*;

class HippodromeTest {
    @Test
    public void isNull() {
        assertThrows(IllegalArgumentException.class,
                () -> new Hippodrome(null));
    }
    @Test
    public void horsesCannotBeNull() {
        try {
            new Hippodrome(null);
        } catch (IllegalArgumentException e) {
            assertEquals("Horses cannot be null.", e.getMessage());
        }
    }
    @Test
    public void isEmptyList() {
        assertThrows(IllegalArgumentException.class,
                () -> new Hippodrome(Collections.emptyList()));
    }

    @Test
    void getHorses() {
    }

    @Test
    void move() {
    }

    @Test
    void getWinner() {
    }
}