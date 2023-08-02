package HW2;

import java.util.InputMismatchException;
import java.util.Scanner;


public class DivisionByZeroException extends Throwable {


    public static void main(String[] args) {


        private static void divide (int a, int b){
            //Напишите программу, которая запрашивает у пользователя два числа и выполняет
            // их деление. Если второе число равно нулю, программа должна выбрасывать исключение
            // DivisionByZeroException с сообщением "Деление на ноль недопустимо". В противном случае,
            // программа должна выводить результат деления.

            Scanner sc = new Scanner(System.in);

            try {
                System.out.print("Введите первое целое число: ");
                int a = sc.nextInt();
                System.out.print("Введите второе целое число: ");
                int b = sc.nextInt();
                divide(a, b);
            } catch (InputMismatchException e1) {
                System.out.println("Ошибка: некорректный ввод. Вводите целые числа!");
            } catch (DivisionByZeroException e2) {
                System.out.println(e2.getMessage());
            }
            sc.nextLine();
            System.out.println();
        }
    }
}
