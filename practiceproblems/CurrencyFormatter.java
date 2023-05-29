import java.io.*;
import java.text.NumberFormat;
import java.util.*;

public class CurrencyFormatter{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double payment = sc.nextDouble();
        sc.close();

        NumberFormat usFormat = NumberFormat.getCurrencyInstance(usa);
        double us = usFormat.format(payment);
        double india = payment;
        double china = payment;
        double france = payment;

        System.out.println("US: " + us);
        System.out.println("India: " + india);
        System.out.println("China: " + china);
        System.out.println("France: " + france);
    }
}
