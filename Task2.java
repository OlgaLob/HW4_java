package HW3;

import java.util.*;
import java.util.stream.IntStream;

public class Task2 {
    public static int userInput(String msg) {
        Scanner sc = new Scanner(System.in);
        int inputStr;
        while (true) {
            System.out.print(msg);
            try {
                inputStr = Integer.parseInt(sc.next());
                break;
            } catch (NumberFormatException e) {
                System.out.println("Неверный ввод! Введите целое число!");
            }
        }
        return inputStr;
    }

    public static ArrayList<Integer> arrCreator() {
        ArrayList<Integer> arr = new ArrayList<>();

        int maxVal = userInput("\nВведите максимальное значение элементов списка: ");
        for (int i = 0; i < 10; i++) {
            Random rand = new Random();
            arr.add(rand.nextInt(maxVal + 1));
        }
        System.out.println("Исходный список: " + arr);

        return arr;
    }

    public static void main(String[] args){
        ArrayList<Integer> list = arrCreator();
        System.out.println("Максимальное значение из элементов списка: " + Collections.max(list));
        System.out.println("Минимальное значение из элементов списка: " + Collections.min(list));
        System.out.println("Среднее арифметическое элементов списка: " + list.stream().mapToInt(a->a).average().orElse(0));
    }
}
