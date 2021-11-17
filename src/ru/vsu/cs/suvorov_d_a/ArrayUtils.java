package ru.vsu.cs.suvorov_d_a;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class ArrayUtils {
    public static int[] readIntArrayFromConsole(String arrName) {
        Scanner scan = new Scanner(System.in);
        while (true) {
            try {
                if (arrName == null || arrName.length() == 0) {
                    arrName = "";
                } else {
                    arrName = " " + arrName;
                }
                System.out.printf("Enter an array%s:%n", arrName);
                String line = scan.nextLine();
                return toIntArray(line);
            }
            catch(Exception e) {
                System.out.print("You are wrong, try again! ");
            }
        }
    }

    public static int[] toIntArray(String str) {
        Scanner scan = new Scanner(str);
        scan.useLocale(Locale.ROOT);
        scan.useDelimiter("(\\s|[,;])+");
        List<Integer> list = new ArrayList<>();
        while (scan.hasNext()) {
            list.add(scan.nextInt());
        }
        // из List<Integer> можно получить Integer[]
        Integer[] arr = list.toArray(new Integer[0]);
        // Integer[] -> int[]
        return ArrayUtils.toPrimitive(arr);
    }

    public static int[] toPrimitive(Integer[] arr) {
        if (arr == null) {
            return null;
        }
        int[] result = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            // автоматическая распаковка из объекта
            result[i] = arr[i];
        }
        return result;
    }
}