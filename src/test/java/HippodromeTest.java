import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

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
        Hippodrome hippodrome = new Hippodrome(horses);
        assertEquals(horses, hippodrome.getHorses());
    }

    @Test
    void move() {
        List<Horse> horses1 = new ArrayList<>();
        for (int i = 0; i < 50; i++) {
            horses1.add(Mockito.mock(Horse.class));
        }
        Hippodrome hippodrome = new Hippodrome(horses1);

        hippodrome.move();

        for (Horse horse: horses1) {
            Mockito.verify(horse).move();
        }
    }

    @Test
    void getWinner() {
        Horse horse = new Horse("1", 1, 2);
        Horse horse1 = new Horse("2", 2, 43);
        Horse horse2 = new Horse("3", 22, 2342);

        Hippodrome hippodrome = new Hippodrome(List.of(horse, horse1, horse2));

        assertSame(horse2, hippodrome.getWinner());
    }
}