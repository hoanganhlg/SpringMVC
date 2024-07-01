package org.example.util;

import org.apache.commons.validator.routines.EmailValidator;

import java.time.LocalDate;

public class EmployeeHandler {
    public static Boolean checkUsername(String username){
//        System.out.println("checkname: " + (username.length() <= 255));
        return username.length() <= 255;
    }
    public static Boolean checkPhonenumber(String phoneNumber){
//        System.out.println("checkPhone:" + (phoneNumber.matches("\\d+") && phoneNumber.length() == 10));
        return phoneNumber.matches("\\d+") && phoneNumber.length() == 10;
    }
    public static Boolean checkDate(LocalDate startDate, LocalDate Birthday ){
//        System.out.println("checkDate:" + ((startDate.isBefore(LocalDate.now()) || startDate.isEqual(LocalDate.now())) &&
//                (Birthday.isBefore(LocalDate.now()) || Birthday.isEqual(LocalDate.now()))));
        return (startDate.isBefore(LocalDate.now()) || startDate.isEqual(LocalDate.now())) &&
                (Birthday.isBefore(LocalDate.now()) || Birthday.isEqual(LocalDate.now()));

    }
    public static Boolean checkEmail(String email){
//        System.out.println("emai: " + email);
//        System.out.println("checkMail:" + (email.length() <= 255 && EmailValidator.getInstance().isValid(email)));
        return email.length() <= 255 && EmailValidator.getInstance().isValid(email) ;
    }
}
