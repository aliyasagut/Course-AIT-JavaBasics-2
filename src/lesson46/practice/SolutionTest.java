package lesson46.practice;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    Solution solution;

    @BeforeEach
    public void setUp() {
        solution = new Solution();
    }

    @Test
    public void test_NotCorrect_oneBracket() {
        char[] chars = {']'};

        assertFalse(solution.areBracketsCorrects(chars));
    }

    @Test
    public void test_correct_twoBrackets() {
        char[] chars = {'[', ']'};

        assertTrue(solution.areBracketsCorrects(chars));
    }

    @Test
    public void test_notCorrect_twoBrackets() {
        char[] chars = {']', '['};

        assertFalse(solution.areBracketsCorrects(chars));
    }

    @Test
    public void test_notCorrect_sameBrackets() {
        char[] chars = {'[', '['};

        assertFalse(solution.areBracketsCorrects(chars));
    }

    @Test
    public void test_correct_manyBrackets() {
        char[] chars = {'{', '}', '(', '[', ']', ')'};

        assertTrue(solution.areBracketsCorrects(chars));
    }

    @Test
    public void test_notCorrect_manyBrackets() {
        char[] chars = {'{', '(', '}', '[', ']', ')'};

        assertFalse(solution.areBracketsCorrects(chars));
    }

}