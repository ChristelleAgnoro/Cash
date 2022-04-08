package com.company;
import java.util.Scanner;
public class Main {


    public static void main(String[] args) {
        Scanner change_Owed = new Scanner(System.in);
        int Cent_Count = 0;
        float Change_Amount;
        do {
            System.out.println("The change owed is : ");
            Change_Amount = change_Owed.nextFloat();
        }while (Change_Amount <= 0.00);


        int cents = Math.round(Change_Amount * 100);


        while (cents >= 25)
        { Cent_Count++;
            cents -= 25;
        }
        while (cents >= 10)
        { Cent_Count++;
            cents -= 10;
        }
        while (cents >= 5)
        { Cent_Count++;
            cents -= 5;
        }
        while (cents >= 1)
        { Cent_Count++;
            cents -= 1;
        }


        System.out.println( "Number of coins required: " + Cent_Count);

    }
}