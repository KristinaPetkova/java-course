package com.lectures.lecture06;

//public class MainHomework06 {
//    public static void main(String[] args) {
//        getNumberOfDays(8);
//    }
//
//    private static void getNumberOfDays(int dayNumber) {
//        String dayName;
//        int numberOfDays = 7;
//
//        switch (dayNumber) {
//            case 1:
//                dayName = "Monday";
//                dayNumber = 1;
//                break;
//
//            case 2:
//                dayName = "Tuesday";
//                dayNumber = 2;
//                break;
//
//            case 3:
//                dayName = "Wednesday";
//                dayNumber = 3;
//                break;
//
//            case 4:
//                dayName = "Thursday";
//                dayNumber = 4;
//                break;
//
//            case 5:
//                dayName = "Friday";
//                dayNumber = 5;
//                break;
//
//            case 6:
//                dayName = "Saturday";
//                dayNumber = 6;
//                break;
//
//            case 7:
//                dayName = "Sunday";
//                dayNumber = 7;
//                break;
//
//            default:
//                System.out.println("default case1");
//                dayName = "Unknown";
//
//        }
//        System.out.println("You entered " + dayNumber + ", so the week day is " + dayName + ".");
//
//        }
//}



//public class MainHomework06 {
//
//    public static void main(String args[]) {
//        {
//            float b = 10, h = 3, surface;
//            surface = (b * h) / 2;
//            System.out.println("The surface of triangle is: " + surface + " cm.");
//        }
//    }
//}





//public class MainHomework06 {
//
//    public static void main(String args[]) {
//        {
//            float b = 10, h = 3, surface;
//            surface = (b * h) / 2;
//            System.out.println("The surface of triangle is: " + surface + " cm.");
//        }
//    }
//}





//public class MainHomework06 {
//
//    public static void main(String args[]) {
//        {
//            float a = 1, b = 2, c = 3, perimeter;
//            perimeter = a + b + c;
//            System.out.println("The perimeter of triangle is: " + perimeter + " cm.");
//        }
//    }
//}





//public class MainHomework06 {
//
//    public static void main(String args[]) {
//        {
//            int number = -1122334455;
//            if (number > 0) {
//                System.out.println(number + " is a positive number.");
//            } else if (number < 0) {
//                System.out.println(number + " is a negative number.");
//            } else {
//                System.out.println(number + " is neither positive, nor negative number.");
//            }
//        }
//    }
//}


import com.sun.deploy.security.SelectableSecurityManager;

class Homework06 {

    public static void main(String args[]) {
        int number1 = -50;
        int number2 = -55;
        int number3 = -60;
        if (number1 >= number2 && number1 >= number3)
            System.out.println(number1 + " is the largest number.");
        else if (number2 >= number1 && number2 >= number3)
            System.out.println(number2 + " is the largest number.");
        else
            System.out.println(number3 + " is the largest number.");
        }
    }