package edu.course.lab01;

/**
 * Небольшие методы для первой лабораторной работы.
 */
public final class CourseToolkit {

    private CourseToolkit() {
        // Утилитарный класс не должен иметь экземпляров.
    }

    /**
     * Возвращает true, если число четное.
     */
    public static boolean isEven(int number) {
        return number % 2 == 0;
    }

    public static boolean isPrime(int number) {
        if (number < 2) {
            return false;
        }
        for (int i = 2; i * i <= number; i = i + 1) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean isPalindrome(String text) {
        if (text == null) {
            throw new IllegalArgumentException("Текст пустойй");
        }
        int check = 0;
        int left = 0;
        int right = (text.length() -1);
        while (left < right) {
            char leftchar = text.charAt(left);
            char rightchar = text.charAt(right);
            if (leftchar != rightchar){
                return  false;
            }
            left = left + 1;
            right = right - 1;
        }
        return true;
    }
}
