package com.userragistration;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
    public void validFirstName(){
        Pattern pattern = Pattern.compile("^[A-Z]+[a-zA-Z]{2,}[0-9]*$");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your First Name");
        String firstName=sc.nextLine();

        Matcher matcher=pattern.matcher(firstName);
        if (matcher.matches()){
            System.out.println("First Name is Valid");
        }else {
            System.out.println("First Name is not valid");
        }

    }

    public static void main(String[] args) {
        UserRegistration ur = new UserRegistration();
        ur.validFirstName();
    }
}
