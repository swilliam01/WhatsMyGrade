package me.samuel;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        String yesNo = "";
        do{
            System.out.println("Enter an exam score: ");
            int examScore = input.nextInt();
            if ((examScore<=100)&&(examScore>=98)){
                System.out.println("Good job. Your grade is A+.");
            }
            else if ((examScore<=97)&&(examScore>=93)){
                System.out.println("Good job. Your grade is A.");
            }
            else if ((examScore<=92)&&(examScore>=90)){
                System.out.println("Good job. Your grade is A-.");
            }
            else if ((examScore>=88)&&(examScore<=89)){
                System.out.println("Good job. Your grade is B+.");
            }
            else if ((examScore>=83)&&(examScore<=87)){
                System.out.println("Good job. Your grade is B.");
            }
            else if ((examScore>=80)&&(examScore<=82)){
                System.out.println("Good job. Your grade is B-.");
            }
            else if((examScore>=78)&&(examScore<=79)){
                System.out.println("Good job. Your grade is C+.");
            }
            else if((examScore>=73)&&(examScore<=77)){
                System.out.println("Good job. Your grade is C.");
            }
            else if((examScore>=70)&&(examScore<=72)){
                System.out.println("Good job. Your grade is C-.");
            }
            else if((examScore>=68)&&(examScore<=69)){
                System.out.println("Good job. Your grade is D+. ");
            }
            else if((examScore>=63)&&(examScore<=67)){
                System.out.println("Good job. Your grade is D. ");
            }
            else if((examScore>=60)&&(examScore<=62)){
                System.out.println("Good job. Your grade is D-. ");
            }
            else if ((examScore<60)&&(examScore>0)){
                System.out.println("Sorry, your grade is F. ");
            }
            else{
                System.out.println("That is not a valid exam score.");
            }

            Scanner response = new Scanner(System.in);
            System.out.println("Do you want to enter another score? (Y/N)");
            yesNo = response.nextLine();
            System.out.println("\n");
        }while(yesNo.equalsIgnoreCase("y")||yesNo.equalsIgnoreCase("yes"));

        System.out.println("Study hard!");
    }
}