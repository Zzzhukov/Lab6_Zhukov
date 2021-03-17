package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Lab6_Zhukov {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[][] array;
        System.out.println("Input size :");
        int size = in.nextInt();
        array = new int[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.println("Input element :");
                array[i][j] = in.nextInt();
            }
        }
        System.out.println("Исходная матрица:");
        for (int i = 0; i < size; i++) {
            System.out.println(Arrays.toString(array[i]));
        }
        int[] array1 = new int[size];
        System.out.println("Побочная отсортированная диагональ:");
        for (int j = 0; j < size; j++) {
            array1[j] = array[j][size - j - 1]; //Побочная диагональ
        }
        sort(array1);
        for (int j = 0; j < size; j++) {
            array[j][size - j - 1] = array1[j]; // Элементы побочной диагонали меняются на элменты отсортированного массива
            System.out.println(Arrays.toString(array[j])); // ГОТОВАЯ МАТРИЦА
        }
    }

    public static void sort(int[] array1) {
        for (int i = 0; i < array1.length; i++) {
            int pos = i;
            int min = array1[i];
// цикл выбора наименьшего элемента
            for (int j = i + 1; j < array1.length; j++) {
                if (array1[j] < min) {
                    pos = j; // pos - индекс наименьшего элемента
                    min = array1[j];
                }
            }
            array1[pos] = array1[i];
            array1[i] = min; // меняем местами наименьший с array[i]
        }
        System.out.println(Arrays.toString(array1)); //Отсортированная побочная диагональ
        System.out.println("Матрица с отсортированной побочной диагональю:");
    }
}