package ru.vsu.cs.suvorov_d_a;

class Main {
    public static void main(String[] args) {
        Test testResult = new Test();

        if (!testResult.testProgram()) {
            System.out.println("Error! Test isn't completed");
            return;
        } else {
            System.out.println("All tests completed!");
        }

        int[] array = ArrayUtils.readIntArrayFromConsole("'A' from integers");
        int result = FindingMaxQuantity.countMaxNumberOfRepeatingElements(array);

        printAnswer(result);
    }

    private static void printAnswer(int result) {
        System.out.print("Maximum number of repeated elements in the array 'A' = " + result);
    }
}