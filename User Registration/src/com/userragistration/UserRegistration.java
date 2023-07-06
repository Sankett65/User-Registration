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
    public void validLastName(){
        Pattern pattern = Pattern.compile("^[A-Z]+[a-zA-Z]{2,}[0-9]*$");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Last Name");
        String lastName=sc.nextLine();

        Matcher matcher=pattern.matcher(lastName);
        if (matcher.matches()){
            System.out.println("Last Name is Valid");
        }else {
            System.out.println("Last Name is not valid");
        }
    }

    public void validKeyName() {
        Pattern pattern = Pattern.compile("^[a-z]*.[a-z]+@[a-z]+.[a-z]{2,3}(.[a-z]{2})*$");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your mail");
        String mail = sc.nextLine();

        Matcher matcher = pattern.matcher(mail);
        if (matcher.matches()) {
            System.out.println("Mail is valid");
        } else {
            System.out.println("Mail is not valid");
        }
    }

        public void validMobileNumber(){
        Pattern pattern=Pattern.compile("^[9][1]\\s[6-9][0-9]{9}$");
        Scanner sc = new Scanner(System.in);
            System.out.println("Enter Mobile Number");
            String mobileNo=sc.nextLine();

            Matcher matcher = pattern.matcher(mobileNo);
            if (matcher.matches()){
                System.out.println("Valid Mobile Number");
            }else {
                System.out.println("Mobile number is not Valid");
            }
        }

        public void validPassword(){
        Pattern pattern=Pattern.compile("^[a-z]{8,}$");
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter Password ");
            String password=sc.nextLine();

            Matcher matcher = pattern.matcher(password);
            if (matcher.matches()){
                System.out.println("Valid Password ");
            }else {
                System.out.println("Password is not Valid");
            }
        }


    public static void main(String[] args) {
        UserRegistration ur = new UserRegistration();
        ur.validFirstName();
        ur.validLastName();
        ur.validKeyName();
        ur.validMobileNumber();
    }


}
