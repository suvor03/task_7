package ru.vsu.cs.suvorov_d_a;

public class Test {
    public boolean testProgram() {
        int[] arr1 = {1, 2, 2, 1, 3, 2, 0, 100, 23, 19, 20, 2, 1};
        if (FindingMaxQuantity.countMaxNumberOfRepeatingElements(arr1) != 4) {
            return false;
        }

        int[] arr2 = {5, 5, 10, 0, -1, -2, -1, -1, -1, 0, 45, 20};
        if (FindingMaxQuantity.countMaxNumberOfRepeatingElements(arr2) != 4) {
            return false;
        }
        int[] arr3 = {10, 20, 30, 40, 21, 20, 10, 11, 13, 15, 5};
        if (FindingMaxQuantity.countMaxNumberOfRepeatingElements(arr3) != 2) {
            return false;
        }
        int[] arr4 = {10, 10, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        if (FindingMaxQuantity.countMaxNumberOfRepeatingElements(arr4) != 12) {
            return false;
        }
        int[] arr5 = {4, 4, 4, 4, 2, 1, 0, -100, -45, 29, 10, 11};
        if (FindingMaxQuantity.countMaxNumberOfRepeatingElements(arr5) != 4) {
            return false;
        }
        int[] arr6 = {1, 2, 3};
        if (FindingMaxQuantity.countMaxNumberOfRepeatingElements(arr6) != 1) {
            return false;
        }
        int[] arr7 = {1, 1, 20, 100, 200, 456, 200, 101, 200, 1};
        if (FindingMaxQuantity.countMaxNumberOfRepeatingElements(arr7) != 3) {
            return false;
        }
        int[] arr8 = {1, 0, 1, 0};
        if (FindingMaxQuantity.countMaxNumberOfRepeatingElements(arr8) != 2) {
            return false;
        }
        int[] arr9 = {2, 22, 222, 2222, 22222, 2, 22, 2, 2, 2, 2};
        if (FindingMaxQuantity.countMaxNumberOfRepeatingElements(arr9) != 6) {
            return false;
        }
        int[] arr10 = {100, 10000, 100, 0, -100, -100, -100, -100};
        if (FindingMaxQuantity.countMaxNumberOfRepeatingElements(arr10) != 4) {
            return false;
        } else {
            return true;
        }
    }
}