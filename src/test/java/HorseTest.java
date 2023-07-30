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