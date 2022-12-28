package com.bridgelabz;

public class Generics {
    static <P extends Comparable> void maximum_variables( P str1, P str2, P str3){

        if(str1.compareTo(str2) > 0){
            if(str1.compareTo(str3) > 0){
                System.out.println( str1 + " is Maximum of three given inputs ");
            }else {
                System.out.println( str3 + " is Maximum of three given inputs  ");
            }
        }else{
            if(str2.compareTo(str3) > 0){
                System.out.println( str2 + " is Maximum of three given inputs  ");
            }else{
                System.out.println( str3 + " is Maximum of three given inputs  ");
            }
        }
    }

    public static void main(String[] args) {
        maximum_variables(1.4f, 1.8f, 2.5f);
        maximum_variables("mango","Strawberry","orange");
        maximum_variables(38,700,60);
    }
}
