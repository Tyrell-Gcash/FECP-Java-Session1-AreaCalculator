package org.example;
import java.util.*;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.printf("Enter membership status (Regular, VIP, Premium): ");
        String userMembership = scanner.nextLine();
        userMembership = userMembership.toUpperCase();

        System.out.printf("Enter age: ");
        int userAge = scanner.nextInt();

        float membershipPrice = 0;

        switch(userMembership){
            case "REGULAR":

                if (userAge < 18){
                    membershipPrice = 50.0f;
                }
                else if (userAge >= 18 && userAge <= 64){
                    membershipPrice = 100.0f;
                }
                else if (userAge >64){
                    membershipPrice = 75.0f;
                }

                break;
            case "VIP":

                if (userAge < 18){
                    membershipPrice = 75.0f;
                }
                else if (userAge >= 18 && userAge <= 64){
                    membershipPrice = 150.0f;
                }
                else if (userAge >64){
                    membershipPrice = 112.5f;
                }

                break;
            case "PREMIUM":

                if (userAge < 18){
                    membershipPrice = 100.0f;
                }
                else if (userAge >= 18 && userAge <= 64){
                    membershipPrice = 200.0f;
                }
                else if (userAge >64){
                    membershipPrice = 150.0f;
                }

                break;
            default:
                System.out.printf("Invalid membership status entered.");
                scanner.close();
                return;
        }

        System.out.printf("Price: $%.2f", membershipPrice);
    }
}