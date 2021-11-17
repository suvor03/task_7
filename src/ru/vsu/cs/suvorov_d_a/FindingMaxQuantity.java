package ru.vsu.cs.suvorov_d_a;

public class FindingMaxQuantity {
    public static int countMaxNumberOfRepeatingElements(int[] array) {
        int numberOfRepeatingElements = 0;
        int max = 0;

        for (int i = 0; i < array.length; i++) {
            for (int j = i; j < array.length; j++) {
                if (array[i] == array[j])
                    numberOfRepeatingElements++;
            }
            if (max < numberOfRepeatingElements) {
                max = numberOfRepeatingElements;
            }
            numberOfRepeatingElements = 0;
        }
        return max;
    }
}