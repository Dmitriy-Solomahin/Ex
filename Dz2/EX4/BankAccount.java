package Dz2.EX4;

import java.util.Scanner;

public class BankAccount {
    private double balance;
    private int maxReplenishment = 100000;
    private int minInvoiceAmount = 0;
    private Scanner inp;

    public BankAccount(Scanner inp){
        this.balance = 0.0;
        this.inp = inp;
    }
    public void replenishment(){
        
        try {
            System.out.print("введите сумму для зачесления: ");
            double number = inp.nextDouble();
            
            if (number + this.balance > maxReplenishment) {
                throw new MaxBalanceExceededException("вы пытаетесь положить слишком много");
            }
            this.balance += number;

        } catch (Exception e) {
            System.out.println("Ошибка: " + e.getClass().getSimpleName() + " Сообщение: " + e.getMessage());
        }finally{
            printBalance();
        }
    }
    public void withdrawMoney(){
        
        try {
            System.out.print("введите сумму для снятия: ");
            double number = inp.nextDouble();
            
            if (this.balance - number < minInvoiceAmount) {
                throw new MaxBalanceExceededException("вы пытаетесь снять слишком много");
            }
            this.balance -= number;

        } catch (Exception e) {
            System.out.println("Ошибка: " + e.getClass().getSimpleName() + " Сообщение: " + e.getMessage());
        }finally{
            printBalance();
        }
    }

    public void printBalance(){
        System.out.println("баланс: "+ balance);
    }
}
