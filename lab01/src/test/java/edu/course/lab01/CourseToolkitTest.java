package edu.course.lab01;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CourseToolkitTest {

    @Test
    void returnsTrueForEvenNumber() {
        boolean result = CourseToolkit.isEven(8);

        assertTrue(result);
    }

    @Test
    void returnsFalseForOddNumber() {
        boolean result = CourseToolkit.isEven(7);

        assertFalse(result);
    }
    @Test
    void returnsTrueForNegativeEvenNumber() {
        boolean result = CourseToolkit.isEven(-8);
        assertTrue(result);
    }

    @Test
    void returnsFalseForNubmersLessTwo() {
        boolean result = CourseToolkit.isPrime(1);
        assertFalse(result);
        result = CourseToolkit.isPrime(0);
        assertFalse(result);
        result = CourseToolkit.isPrime(-1);
        assertFalse(result);
    }

    @Test
    void returnsTrueForSimpleNumbers() {
        boolean result = CourseToolkit.isPrime(2);
        assertTrue(result);
        result = CourseToolkit.isPrime(13);
        assertTrue(result);
        result = CourseToolkit.isPrime(19);
        assertTrue(result);
    }
    @Test
    public void returnsFalseForCompositeNumbers() {
        boolean result = CourseToolkit.isPrime(6);
        assertFalse(result);
        result = CourseToolkit.isPrime(12);
        assertFalse(result);
    }

    @Test
    public void returnsFalseForSquares() {
        boolean result = CourseToolkit.isPrime(144);
        assertFalse(result);
        result = CourseToolkit.isPrime(25);
        assertFalse(result);
    }

    @Test
    public  void returnsTrueForValidPalindrome() {
        boolean result = CourseToolkit.isPalindrome("анна");
        assertTrue(result);
    }

    @Test
    public void returnsFalsForInvalidPalindrome() {
        boolean result = CourseToolkit.isPalindrome("тестик");
        assertFalse(result);
    }

    @Test
    public void returnsIllegalArgumentExceptionForNullPalindrome() {
        assertThrows(IllegalArgumentException.class, () -> CourseToolkit.isPalindrome(null));
    }

    @Test
    public void returnsCorrectAverageForPositiveValues(){
        int[] values = {2, 4, 6, 8};
        double result = CourseToolkit.average(values);
        assertEquals(5.0, result, 0.001);

    }
    @Test
    public void returnsCorrectAverageForNegativeValues(){
        int[] values = {-5, 0, 5, -10};
        double result = CourseToolkit.average(values);
        assertEquals(-2.5, result, 0.001);

    }

    @Test
    public void throwIllegalArgumentException() {
        assertThrows(IllegalArgumentException.class,() -> CourseToolkit.average(new int[]{}));
        assertThrows(IllegalArgumentException.class,() -> CourseToolkit.average(null));
    }

}
