package com.company;
import java.util.Scanner;
import java.lang.Math;


public class Main {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите версию 1 \n");
        String str1="";
        str1 = in.nextLine();
        //String str1 = "8.1.13.41";
        // String str2 = "8.1.009.125";
        System.out.println("Введите версию 2 \n");
        String str2="";
        str2 = in.nextLine();

        String[] subStr;
        String[] subStr2;
        String delimeter = "."; // Разделитель

        // Разделение строки
        System.out.println("\n");
        delimeter = "\\."; // Разделитель
        subStr = str1.split(delimeter);
        subStr2 = str2.split(delimeter);
        boolean f = true;
        for(int i = 0; i < subStr.length; i++) { //subStr и subStr2 имеют одинаковое количество элементов
            int k = Integer.parseInt(subStr[i]);
            int l = Integer.parseInt(subStr2[i]);
            if (k<l) { i=subStr.length; System.out.printf("Версия 1 старее \n%s", str1); f=false; }
            else if (k>l) { i=subStr.length; System.out.printf("Версия 2 старее \n%s", str2); f=false; }

        }
        if (f) System.out.printf("Версии одинаковые \n%s", str1);

    }
}