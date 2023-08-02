package Dz2.EX3;

import java.util.Scanner;

import Dz2.EX2.DivisionByZeroException;

public class Ex3 {
/*
 * Задача3:
 * Напишите программу, которая запрашивает у пользователя три числа и выполняет
 * следующие проверки:
 * 
 * Если первое число больше 100, выбросить исключение NumberOutOfRangeException
 * с сообщением "Первое число вне допустимого диапазона".
 * Если второе число меньше 0, выбросить исключение NumberOutOfRangeException с
 * сообщением "Второе число вне допустимого диапазона".
 * Если сумма первого и второго чисел меньше 10, выбросить исключение
 * NumberSumException с сообщением "Сумма первого и второго чисел слишком мала".
 * Если третье число равно 0, выбросить исключение DivisionByZeroException с
 * сообщением "Деление на ноль недопустимо".
 * В противном случае, программа должна выводить сообщение
 * "Проверка пройдена успешно".
 * - необходимо создать 3 класса собвстенных исключений
 */
    public static void main(String[] args) {
        ex3();
    }

    public static void ex3(){
        Scanner inp = new Scanner(System.in);
        try{
            System.out.print("Введите первое число: ");
            int number1 = inp.nextInt();
            System.out.print("Введите второе число: ");
            int number2 = inp.nextInt();
            System.out.print("Введите третье число: ");
            int number3 = inp.nextInt();
            inp.close();
            
            if(number1 > 100){
                throw new NumberOutOfRangeException("Первое число вне допустимого диапазона");
            }
            if(number2 < 0){
                throw new NumberOutOfRangeException("Второе число вне допустимого диапазона");
            }
            if(number1 + number2 < 10){
                throw new NumberSumException("Сумма первого и второго чисел слишком мала");
            }
            if(number3 == 0){
                throw new DivisionByZeroException();
            }
            System.out.println("Проверка пройдена успешно");
        }catch (NumberOutOfRangeException e){
            System.out.println("Ошибка: " + e.getClass().getSimpleName() + " Сообщение: " + e.getMessage());
        }catch (NumberSumException e){
            System.out.println("Ошибка: " + e.getClass().getSimpleName() + " Сообщение: " + e.getMessage());
        }catch (DivisionByZeroException e){
            System.out.println("Ошибка: " + e.getClass().getSimpleName() + " Сообщение: " + e.getMessage());
        }catch (Exception e){
            System.out.println("Неверный ввод");
        }
    }
}
