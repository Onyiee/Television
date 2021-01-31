package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter productName: ");
        String myTv = input.nextLine();
        Television newTv = new Television(myTv);
        System.out.println("Do you wish to turn on the Tv? Enter 1 for Yes, enter 2 for No: ");
        int userInput = input.nextInt();
        if(userInput == 1) {
            newTv.toggleSwitch();
            int check = 1;
            while (check != 100) {
                System.out.println("Main menu \n " +
                        "1. set channel manually \n" +
                        "2. set volume manually \n " +
                        "3. increase volume \n " +
                        "4. decrease volume \n" +
                        "5. change channel(forward) \n" +
                        "6. change channel(backward) \n" +
                        "7. exit \n ");

                userInput = input.nextInt();
                switch (userInput) {
                    case 1: {
                        System.out.println("enter channel number: ");
                        userInput = input.nextInt();
                        newTv.setChannel(userInput);
                        break;
                    }
                    case 2: {
                        System.out.println("enter new volume: ");
                        userInput = input.nextInt();
                        newTv.setVolume(userInput);
                        break;
                    }
                    case 3: {
                        newTv.increaseVolume();
                        break;
                    }
                    case 4: {
                        newTv.decreaseVolume();
                        break;
                    }
                    case 5: {
                        newTv.increaseChannel();
                        break;
                    }
                    case 6: {
                        newTv.decreaseChannel();
                        break;
                    }
                    case 7: {
                        System.out.println("turning off");
                        check = 100;
                        break;
                    }
                    default:{
                        System.out.println("invalid input given");
                        break;
                    }
                }
            }
        } else if(userInput == 2) {
            System.out.println("turning off....");
        } else {
            System.out.println("Invalid input exiting ....");
        }
    }
}
