package Dz2.EX1;

import java.util.Scanner;

public class Ex1{
/*
Задача 1:
Напишите программу, которая запрашивает у пользователя число и проверяет, является ли оно положительным. 
Если число отрицательное или равно нулю, программа должна выбрасывать исключение InvalidNumberException с сообщением "Некорректное число". 
В противном случае, программа должна выводить сообщение "Число корректно".
*/
    public static void main(String[] args) {
        ex1(); 
    }

    public static void ex1(){
        Scanner inp = new Scanner(System.in);
        System.out.print("Введите положительное число: ");
        try{
            int number = inp.nextInt();
            inp.close();
            if(number < 1){
                throw new InvalidNumberException();
            }
            System.out.println("Число корректно");
        }catch (InvalidNumberException e){
            System.out.println("Ошибка: " + e.getClass().getSimpleName() + " Сообщение: " + e.getMessage());
        }catch (Exception e){
            System.out.println("Неверный ввод");
        }
    }
}