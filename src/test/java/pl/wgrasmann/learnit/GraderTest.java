package pl.wgrasmann.learnit;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GraderTest {

    // testing edge cases
    @Test
    void fiftyNineShouldReturnF() {
        var grader = new Grader();
        assertEquals('F', grader.determineLetterGrade(59));
    }

    @Test
    void zeroShouldReturnF() {
        var grader = new Grader();
        assertEquals('F', grader.determineLetterGrade(0));
    }

    @Test
    void sixtyNineShouldReturnD() {
        var grader = new Grader();
        assertEquals('D', grader.determineLetterGrade(69));
    }

    @Test
    void seventyNineShouldReturnC() {
        var grader = new Grader();
        assertEquals('C', grader.determineLetterGrade(79));
    }

    @Test
    void eightyNineShouldReturnB() {
        var grader = new Grader();
        assertEquals('B', grader.determineLetterGrade(89));
    }

    @Test
    void ninetyShouldReturnA() {
        var grader = new Grader();
        assertEquals('A', grader.determineLetterGrade(90));
    }

    @Test
    void eightyShouldReturnB() {
        var grader = new Grader();
        assertEquals('B', grader.determineLetterGrade(80));
    }

    @Test
    void negativeOneShouldReturnIllegalArgumentException() {
        var grader = new Grader();
        assertThrows(IllegalArgumentException.class,
                () -> {
                    grader.determineLetterGrade(-1);
                });
    }
}