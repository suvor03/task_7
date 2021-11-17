package ru.vsu.cs.suvorov_d_a;

public class TestResult {
    TestCase testCase = new TestCase();

    public boolean test() {
        if (FindingMaxQuantity.countMaxNumberOfRepeatingElements(testCase.arr1) != 4) {
            System.out.println("Test isn't completed");
            return false;
        } else if (FindingMaxQuantity.countMaxNumberOfRepeatingElements(testCase.arr2) != 4) {
            System.out.println("Test isn't completed");
            return false;
        } else if (FindingMaxQuantity.countMaxNumberOfRepeatingElements(testCase.arr3) != 2) {
            System.out.println("Test isn't completed");
            return false;
        } else if (FindingMaxQuantity.countMaxNumberOfRepeatingElements(testCase.arr4) != 12) {
            System.out.println("Test isn't completed");
            return false;
        } else if (FindingMaxQuantity.countMaxNumberOfRepeatingElements(testCase.arr5) != 4) {
            System.out.println("Test isn't completed");
            return false;
        } else if (FindingMaxQuantity.countMaxNumberOfRepeatingElements(testCase.arr6) != 1) {
            System.out.println("Test isn't completed");
            return false;
        } else if (FindingMaxQuantity.countMaxNumberOfRepeatingElements(testCase.arr7) != 3) {
            System.out.println("Test isn't completed");
            return false;
        } else if (FindingMaxQuantity.countMaxNumberOfRepeatingElements(testCase.arr8) != 2) {
            System.out.println("Test isn't completed");
            return false;
        } else if (FindingMaxQuantity.countMaxNumberOfRepeatingElements(testCase.arr9) != 6) {
            System.out.println("Test isn't completed");
            return false;
        } else if (FindingMaxQuantity.countMaxNumberOfRepeatingElements(testCase.arr10) != 4) {
            System.out.println("Test isn't completed");
            return false;
        } else {
            return true;
        }
    }
}