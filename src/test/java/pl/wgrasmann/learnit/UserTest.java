package pl.wgrasmann.learnit;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

public class UserTest {
    private User wojtek;

    @BeforeEach
    public void setup() {
        wojtek = new User("Wojtek", LocalDate.of(1979, 1, 13));
    }

    @Tag("first")
    @Test
    public void testGetAge_Success() {
        int expected = 43;
        LocalDate refDate = LocalDate.of(2022, 2, 12);

        assertEquals(expected, wojtek.getAge(refDate), "Age as of 1/2/2022");
    }
}
