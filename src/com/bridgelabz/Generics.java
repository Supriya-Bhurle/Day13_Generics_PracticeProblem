package com.bridgelabz;

public class Generics {
    static void maximum_variables(Float num1, Float num2, Float num3){
        if(num1.compareTo(num2) > 0){
            if(num1.compareTo(num3) > 0){
                System.out.println( num1 + " is Maximum of three float numbers ");
            }else {
                System.out.println( num3 + " is Maximum of three float numbers ");
            }
        }else{
            if(num2.compareTo(num3) > 0){
                System.out.println( num2 + " is Maximum of three float numbers ");
            }else{
                System.out.println( num3 + " is Maximum of three float numbers ");
            }
        }
    }

    static void maximum_variables(String str1, String str2, String str3){
        if(str1.compareTo(str2) > 0){
            if(str1.compareTo(str3) > 0){
                System.out.println( str1 + " is Maximum of three string ");
            }else {
                System.out.println( str3 + " is Maximum of three string ");
            }
        }else{
            if(str2.compareTo(str3) > 0){
                System.out.println( str2 + " is Maximum of three string ");
            }else{
                System.out.println( str3 + " is Maximum of three string ");
            }
        }
    }

    static void maximum_variables(Integer num1, Integer num2, Integer num3){
        if(num1.compareTo(num2) > 0){
            if(num1.compareTo(num3) > 0){
                System.out.println( num1 + " is Maximum of three numbers ");
            }else {
                System.out.println( num3 + " is Maximum of three numbers ");
            }
        }else{
            if(num2.compareTo(num3) > 0){
                System.out.println( num2 + " is Maximum of three numbers ");
            }else{
                System.out.println( num3 + " is Maximum of three numbers ");
            }
        }
    }

    public static void main(String[] args) {
        maximum_variables(1.4f, 1.8f, 2.5f);
        maximum_variables("mango","Strawberry","orange");
        maximum_variables(38,700,60);
    }
}
