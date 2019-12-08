/** Итоговая задача №2
 * Написать программу сортировки по возрастанию заданного пользователем массива чисел.
 * Пользователь программы должен задавать размер массива и наполнять его числами.
 * Использовать одну из следующих сортировок: прямого выбора, вставки, быстрая, Шелла.
 */

import java.io.IOException;
import java.util.Scanner;

public class Final2 {
    public static void main (String [] args ) throws IOException{
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите размер массива: ");
        int size = scanner.nextInt();
        int[] array = new int[size];
        System.out.println("Введите элементы массива:");
        for (int i = 0; i < size; i++) array[i] = scanner.nextInt();

        //Сортировка 
        for (int left = 0; left < array.length; left++) {
            int value = array[left];
            int i = left - 1;
            while (i >= 0) {
                if (value < array[i]) array[i + 1] = array[i];
                else break;
                i--;
            }
            array[i + 1] = value;
        }
        System.out.println("Результат сортировки по возрастанию:");
        for (int i = 0; i < size; i++) System.out.print(array[i] + "\t");
    }
}
