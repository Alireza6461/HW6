package Linklist;

import java.util.LinkedList;
import java.util.Scanner;

public class Applinklist {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        PrintMenu();
        boolean flag = true;
        try {
            while (flag) {
                Scanner in = new Scanner(System.in);
                int number = in.nextInt();
                switch (number) {
                    case 1:
                        if (linkedList.isEmpty())
                            System.out.println("This link list is empty");
                        else
                            System.out.println("This not empty");
                        PrintMenu();
                        break;
                    case 2:
                        System.out.println("if you want add 1 else enter 2");
                        boolean flag2 = true;
                        try {
                            while (flag2) {
                                int number2 = in.nextInt();
                                if (number2 == 1){
                                    System.out.println("Enter your number:");
                                    int num3 = in.nextInt();
                                    linkedList.add(num3);
                                    System.out.println("if you want add 1 else enter 2");
                                }
                                else if(number2 ==2){
                                    PrintMenu();
                                    flag2 = false;
                                }
                            }
                        } catch (Exception e) {
                            System.out.println("incorrect number");
                        }
                        break;
                    case 3:
                        System.out.println("if you want remove element enter 1 else enter 2");
                        boolean flag3 = true;
                        try{
                            while (flag3){
                                int number3 = in.nextInt();
                                if (number3 == 1){
                                    if (!linkedList.isEmpty()){
                                        System.out.println("what index?");
                                        int numIndex = in.nextInt();
                                        linkedList.remove(numIndex);
                                        System.out.println("Index "+numIndex+" is remove"+
                                                "\nif you want remove element enter 1 else enter 2");
                                    }
                                    else
                                        System.out.println("Your list is empty!");
                                }
                                else if (number3 ==2) {
                                    PrintMenu();
                                    flag3 = false;
                                }
                            }
                        }catch (Exception e){
                            System.out.println("incorrect number");
                        }
                        break;
                    case 4:
                        System.out.println("Enter the number you want to search:");
                        int numOfSearch = in.nextInt();
                        if(linkedList.contains(numOfSearch)){
                            System.out.println("there is number");
                            PrintMenu();
                        }
                        else {
                            System.out.println("not found");
                            PrintMenu();
                        }
                        break;
                    case 5:
                        System.out.println("bye");
                        flag = false;
                        break;
                    default:
                        throw new RuntimeException();
                }
            }
        } catch (Exception e) {
            System.out.println("incorrect number!!!");
        }
    }
    public static void PrintMenu(){
        System.out.println("1)\tchecked empty, 2)\tadd, 3)\tremove, 4)\tsearch into linked list, 5)\texit ");

    }
}
