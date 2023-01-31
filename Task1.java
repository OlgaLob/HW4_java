package HW3;

import java.util.*;

public class Task1 {
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

    public static ArrayList<Integer> oddListCreator(ArrayList<Integer> arrayList) {
        for (Iterator<Integer> iterator = arrayList.iterator(); iterator.hasNext(); ) {
            Integer number = iterator.next();
            if (number % 2 == 0) iterator.remove();
        }
        System.out.println("Список нечетных элементов: " + arrayList);
        return arrayList;
    }

    public static void main(String[] args) {
        ArrayList<Integer> arr = arrCreator();
        oddListCreator(arr);
    }
}
