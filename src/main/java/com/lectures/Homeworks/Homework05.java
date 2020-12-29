package com.lectures.Homeworks;

public class Homework05 {

        String string01 = "This is Test!";

        public static void main(String[] args){
            Homework05 homework = new Homework05();
            homework.replaceString();

            System.out.println(homework.areStringsEqual(homework.string01,"This is a Test!"));
            System.out.println("Number of string words is: " + homework.getStringPartsCount());

            homework.concatStrings("String1", "String2");
        }

        private void replaceString(){
            System.out.println("Initial String: " + string01);
            String string2 = string01.replace("Test", "my dog");
            System.out.println("String after replacement: " + string2);
        }

        private boolean areStringsEqual(String str1, String str2){
            return str1.equals(str2);
        }

        private int getStringPartsCount(){
            String [] stringParts = string01.split(" ");
            return stringParts.length;
        }

        private void concatStrings(String str1, String str2){
            System.out.println(str1.concat(str2));
        }

    }