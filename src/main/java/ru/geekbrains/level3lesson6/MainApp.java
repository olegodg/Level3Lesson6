package ru.geekbrains.level3lesson6;

public class MainApp {
        public static void main(String[] args) {
            final int[] array = pullOut(new int[]{1, 2, 3, 4, 5, 6, 7, 8});
            System.out.println(array);
            final boolean result = CheckArray(new int[]{1, 1, 1, 1, 1});
            System.out.println(result);
        }

        public static int[] pullOut(int[] input) {
            int[] backArray = new int[2];
            if(input.length == 0) {
                System.out.println("В массиве нет элементов");
                return input;
            }
            for (int i = input.length - 3; i >= 0 ; i--) {
                if(input[i] == 4) {
                    System.arraycopy(input, (i+1), backArray,0,2);
                    return backArray;
                }
            }
            throw new RuntimeException("В массиве нет ни одной 4-ки после которой были бы числа");
        }
        public static boolean CheckArray(int [] in) {
            boolean one = false;
            boolean four = false;
            for (int i: in) {
                if(i != 1 && i!=4) throw new RuntimeException("Неверное значение");
                if(i == 1) one = true;
                if(i == 4) four = true;
            }
            return one && four;
        }
    }
