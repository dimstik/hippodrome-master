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
    }

    @Test
    void getSpeed() {
    }

    @Test
    void getDistance() {
    }

    @Test
    void move() {
    }

    @Test
    void getRandomDouble() {
    }
}