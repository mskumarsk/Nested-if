package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter your number:");
        int no= scan.nextInt();
        if (no>0){
            System.out.println(no+" This number is positive.");
            if (no%2==0){
                System.out.println(no+" This number is even.");
            }else {
                System.out.println(no+" This number is odd.");
            }
        }else {
            System.out.println(no+" This number is negative.");
            if (no%2==0){
                System.out.println(no+" This number is even.");
            }else {
                System.out.println(no+" This number is odd.");
            }
        }
    }
}
