import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class HorseTest {
    @Test
    public void isNull() {
        assertThrows(IllegalArgumentException.class,
                () -> new Horse(null, 1, 1)
        );
    }
    @Test
    public void NameCannotBeNull() {
        try {
            new Horse(null, 1,1);
        } catch (Exception e) {
            assertEquals("Name cannot be null.", e.getMessage());
        }
    }
    @ParameterizedTest
    @ValueSource(strings = {"", " ", "\t", "\n", "\r", "\f"})
    public void illegalArgumentException(String s) {
        assertThrows(IllegalArgumentException.class,
                () -> new Horse(s, 1, 1));
    }
    @ParameterizedTest
    @ValueSource(strings = {"", " ", "\t", "\n", "\r", "\f"})
    public void NameCannotBeBlank(String s) {
        try {
            new Horse(s, 1, 1);
        } catch (IllegalArgumentException e) {
            assertEquals("Name cannot be blank.", e.getMessage());
        }
    }
    @Test
    public void negativeSpeed() {
        assertThrows(IllegalArgumentException.class,
                () -> new Horse("Вишня",Integer.MIN_VALUE, 1));
    }
    @Test
    public void speedCannotBeNegative() {
        IllegalArgumentException e = assertThrows(IllegalArgumentException.class,
                () -> new Horse("name", Integer.MIN_VALUE, 1));
        assertEquals("Speed cannot be negative.", e.getMessage());
    }
    @Test
    public void negativeDistance() {
        assertThrows(IllegalArgumentException.class,
                () -> new Horse("Вишня",1, Integer.MIN_VALUE));
    }
    @Test
    public void distanceCannotBeNegative() {
        IllegalArgumentException e = assertThrows(IllegalArgumentException.class,
                () -> new Horse("name", 1, Integer.MIN_VALUE));
        assertEquals("Distance cannot be negative.", e.getMessage());
    }
    @Test
    void getName() {
        String expected = Horse.class.getName();
        String actual = Horse.class.getName();
        assertEquals(expected, actual);
    }

    @Test
    void getSpeed() {
        Horse horse1 = new Horse("Name", 1, 1);
        assertEquals(1, horse1.getSpeed());
    }

    @Test
    void getDistance() {
        Horse horse1 = new Horse("Name", 1, 1);
        Horse horse2 = new Horse("Name", 2);
        assertEquals(1, horse1.getDistance());
        assertEquals(0, horse2.getDistance());
    }
    @ParameterizedTest
    @ValueSource(doubles = {0.2,0.9})
    void move() {
    }

    @Test
    void getRandomDouble() {
    }
}