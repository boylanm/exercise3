package com.boylan.csci;

import java.util.Scanner;
//made by Michael Boylan 2/4/2019
public class Main {

    public static int Low (int u){
        int LT = 9/5 * (u -32);

        return LT ;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("please input a temperature");
        int ask = input.nextInt();
        int centi = Low(ask);
        System.out.println(centi + "  is the temperature in Celsius ");
        if(ask >= -460){
            while(ask >=-460) {
                System.out.println("please input a temperature");
                ask = input.nextInt();
                centi = Low(ask);
                System.out.println(centi + "  is the temperature in Celsius ");
            }
        }
    }
}