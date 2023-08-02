package Dz2.EX2;

import java.util.Scanner;

public class Ex2 {
/*
Задача 2:
Напишите программу, которая запрашивает у пользователя два числа и выполняет
их деление. Если второе число равно нулю, программа должна выбрасывать
исключение DivisionByZeroException с сообщением
"Деление на ноль недопустимо". В противном случае, программа должна выводить
результат деления.
*/

    public static void main(String[] args) {
        ex2();
    }

    public static void ex2(){
        Scanner inp = new Scanner(System.in);
        try{
            System.out.print("Введите первое число: ");
            int number1 = inp.nextInt();
            System.out.print("Введите второе число: ");
            int number2 = inp.nextInt();
            inp.close();
            if(number2 == 0){
                throw new DivisionByZeroException();
            }
            System.out.println("Число "+ number1 + " / " + number2 + " = " + number1 / (double)number2);
        }catch (DivisionByZeroException e){
            System.out.println("Ошибка: " + e.getClass().getSimpleName() + " Сообщение: " + e.getMessage());
        }catch (Exception e){
            System.out.println("Неверный ввод");
        }
    }
}
