public class Main {

    public static void main(String[] args) {

        ChangeArray(); // Задание 1

        MakeArray(); // Задание 2

        ChangeArrayCondition(); // Задание 3

        ChangeDoubleArray(); // Задание 4

        FindArrayMinMax(); // Задание 5

        int[] array_test_6 = {10, 4, 5, 8, 11}; // Задание 6
        CheckBalance(array_test_6);

    }

    /** Задание 1. В целочисленном массиве с помощью цикла и условия заменяет 0 на 1, 1 на 0 */
    static void ChangeArray() {
        int[] array_test_1 = {0, 1, 1, 1, 0, 0, 0, 0, 0, 1};
        for (int i = 0; i < array_test_1.length; i++) {
            if (array_test_1[i] == 0) {
                array_test_1[i] = 1;
            } else if (array_test_1[i] == 1) {
                array_test_1[i] = 0;
            }
        }
        for (int i = 0; i < array_test_1.length; i++) {
            System.out.print(array_test_1[i] + "; ");
        }
        System.out.println();
    }

    /** Задание 2. С помощью цикла заполняет целочисленный массив размером 8 значениями 0 3 6 9 12 15 18 21 */
    static void MakeArray() {
        int[] array_test_2 = new int[8];
        array_test_2[0] = 0;
        for (int i = 1; i < array_test_2.length; i++) {
            array_test_2[i] = array_test_2[i-1] + 3;
        }
        for (int i = 0; i < array_test_2.length; i++) {
            System.out.print(array_test_2[i] + "; ");
        }
        System.out.println();
    }

    /** Задание 3. С помощью цикла в целочисленном массиве числа меньшие 6 умножает на 2 */
    static void ChangeArrayCondition() {
        int[] array_test_3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < array_test_3.length; i++) {
            if (array_test_3[i] < 6) {
                array_test_3[i] = array_test_3[i] * 2;
            }
        }
        for (int i = 0; i < array_test_3.length; i++) {
            System.out.print(array_test_3[i] + "; ");
        }
        System.out.println();
    }

    /** Задание 4. С помощью цикла в квадратном двумерном целочисленном массиве заполняет его диагональные элементы единицами */
    static void ChangeDoubleArray() {
        int[][] array_test_4 = new int[5][5];
        for (int i = 0; i < array_test_4.length; i++) {
            array_test_4[i][i] = 1;
            array_test_4[i][array_test_4.length - 1 - i] = 1;
        }
        for (int i = 0; i < array_test_4.length; i++) {
            for (int j = 0; j < array_test_4.length; j++) {
                System.out.print(array_test_4[i][j] + " ");
            }
            System.out.println();
        }
    }

    /** Задание 5. Ищет минимальный и максимальный элементы в одномерном массиве */
    static void FindArrayMinMax() {
        int[] array_test_5 = {1, 5, 3, 2, 11, 4, 54, 2, 4, 8, 9, 24};
        int min = array_test_5[0];
        int max = array_test_5[0];
        for (int i = 0; i < array_test_5.length; i++) {
            if (array_test_5[i] < min) {
                min = array_test_5[i];
            }
            if (array_test_5[i] > max) {
                max = array_test_5[i];
            }
        }
        System.out.println("Минимальное значение массива = " + min);
        System.out.println("Минимальное значение массива = " + max);
    }

    static void CheckBalance(int[] array_test_6) {
        int sum_left = 0;
        for (int i = 0; i < (array_test_6.length - 1); i++) {
            sum_left += array_test_6[i];
            int sum_right = 0;
            for (int j = i + 1; j < array_test_6.length; j++) {
                sum_right += array_test_6[j];
            }
            if (sum_right == sum_left) {
                System.out.println("Такой случай возможен!");
            }
        }
    }
}