import org.junit.jupiter.api.Test;

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