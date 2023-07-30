import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

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
    public void horsesCannotBeEmpty() {
        try {
            new Hippodrome(Collections.emptyList());
        } catch (IllegalArgumentException e) {
            assertEquals("Horses cannot be empty.", e.getMessage());
        }
    }

    @Test
    void getHorses() {
        List<Horse> horses = new ArrayList<>();
        for (int i = 0; i < 30; i++) {
            horses.add(new Horse("" + i, i,i));
        }
    }

    @Test
    void move() {
    }

    @Test
    void getWinner() {
    }
}