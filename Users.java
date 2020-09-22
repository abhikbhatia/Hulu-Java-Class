package java;

import java.util.Scanner;

public class HuluLogin {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String user, pass;

        System.out.print("Enter your username: ");
        user = input.nextLine();

        System.out.print("Enter your password: ");
        pass = input.nextLine();

        if(user.equals("admin") && (pass.equals("password"))){
            System.out.println("Welcome to Hulu! What would you like to watch?");
        }else {
            System.out.println("Incorrect login information provided. Please try again!");
        }
    }
}