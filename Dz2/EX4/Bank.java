package Dz2.EX4;

import java.util.Scanner;

public class Bank extends Thread{

    @Override
    public void run() {
        Scanner inp = new Scanner(System.in);
        BankAccount account = new BankAccount(inp);
        while(true){
            
            try{
                
                System.out.println("1. пополнить\n2.снять \n3.посмотреть счёт\n4.выйти");
                System.out.print("Введите номер операции: ");
                int number = inp.nextInt();
                
                if(number == 1){
                    account.replenishment();
                }
                else if(number == 2){
                    account.withdrawMoney();
                }
                else if(number == 3){
                    account.printBalance();
                }
                else if(number == 4){
                    break;
                }
                else{
                    System.out.println("неверный ввод");
                }
            }catch (Exception e){
                System.out.println("Ошибка: " + e.getClass().getSimpleName() + " Сообщение: " + e.getMessage());
            }
        }
        inp.close();
    }

}
