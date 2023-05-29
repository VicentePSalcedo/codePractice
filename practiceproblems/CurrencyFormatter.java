import java.io.*;
import java.text.NumberFormat;
import java.util.*;

public class CurrencyFormatter{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double payment = sc.nextDouble();
        sc.close();

        NumberFormat dollar = NumberFormat.getCurrencyInstance(Locale.US);
        String us = dollar.format(payment);

        NumberFormat rupee = NumberFormat.getCurrencyInstance(new Locale("en", "IN"));
        String india = rupee.format(payment);

        NumberFormat rinminbi = NumberFormat.getCurrencyInstance(Locale.CHINA);
        String china = rinminbi.format(payment);
        
        NumberFormat euro = NumberFormat.getCurrencyInstance(Locale.FRANCE);
        String france = euro.format(payment);

        System.out.println("US: " + us);
        System.out.println("India: " + india);
        System.out.println("China: " + china);
        System.out.println("France: " + france);
    }
}
