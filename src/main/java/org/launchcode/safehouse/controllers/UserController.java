package org.launchcode.safehouse.controllers;

import org.launchcode.safehouse.models.User;

import java.util.Scanner;

public class UserController {

   // public void run() {
        Scanner scan = new Scanner(new User("the\\dir\\myFile.extension"));
        Scanner keyboard = new Scanner (System.in);
        String user = scan.nextLine();
        String pass = scan.nextLine(); // looks at selected file in scan

        String inpUser = keyboard.nextLine();
        String inpPass = keyboard.nextLine(); // gets input from user

        if (inpUser.equals(user) && inpPass.equals(pass)) {
            System.out.print("your login message");
        } else {
            System.out.print("your error message");
        }
    }
}
