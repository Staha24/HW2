package HW2;

import java.util.Scanner;
import java.util.InputMismatchException;




public class Main {
    public static void main(String[] args) {
        // Задача 1:
        //Напишите программу, которая запрашивает у пользователя число и проверяет,
        // является ли оно положительным. Если число отрицательное или равно нулю, программа
        // должна выбрасывать исключение InvalidNumberException с сообщением "Некорректное число".
        // В противном случае, программа должна выводить сообщение "Число корректно".

        Scanner sc = new Scanner(System.in);
        class InvalidNumberException extends Exception { //класс пользовательский, который наследуется от
            // класса Exception
            public InvalidNumberException(String message) throws InvalidNumberException {//создаем конструктор,
                // в кот.вызываем механизм базового класса при помощи super, message это аргумент типа стринг
                super(message);//и передаем ему сообщение об ошибке

                //}
                //}

                try {
                    System.out.print("Введите целое число: ");
                    int number = sc.nextInt();
                    checkNumber(number);
                } catch (InputMismatchException ex) {
                    System.out.println("Некорректный ввод! Вводите целые числа!");
                }
                sc.nextLine();
                System.out.println();
            }

            private static void checkNumber(int number) {

            }
        }
    }
}
