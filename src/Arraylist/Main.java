package Arraylist;

import Arraylist.AppArraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> number = new ArrayList<Integer>();

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of arraylist");
        int size = sc.nextInt();
        System.out.println("Enter number");
        for (int i = 0; i < size; i++) {
            int array = sc.nextInt();
            number.add(array);
        }

        AppArraylist appArraylist = new AppArraylist();
        appArraylist.getArrayList(number);

    }
}
