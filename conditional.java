// import java.util.*;
// public class conditional {
//     public static void main(String[] args) {

//         Scanner sc = new Scanner(System.in);

//         System.out.println("Enter the number: ");
//         int num = sc.nextInt();
//         if (num > 0) {
//             System.out.println("number is positive");
//         } else if (num < 0) {
//             System.out.println("number is negative");
//         } else {
//             System.out.println("number is zero");
//         }

//     }
// }

// question-2 to check whether the given angles of traingle is valid or not

// import java.util.*;

// public class conditional {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         System.out.println("enter the all angle of angles");
//         int angle1 = sc.nextInt();
//         int angle2 = sc.nextInt();
//         int angle3 = sc.nextInt();

//         if (angle1 + angle2 + angle3 == 180) {
//             System.out.println("given angles are of traingle");
//         } else {
//             System.out.println("given angles are not of traingle");
//         }

//     }
// }

// question 3 check if number is multiple of 5

// import java.util.*;
// public class conditional{
//     public static void main(String[] args) {
//         Scanner sc= new Scanner(System.in);

//         System.out.println("enter the number you want to check");
//         int num = sc.nextInt();

//          if(num%5==0){
//             System.out.println(num+" is a multiple of 5");
//          }
//          else{
//             System.out.println("number is not multiple of 5");
//          }
//     }
// }

// question 4 check if number is odd or even

// import java.util.*;

// public class conditional{
//     public static void main(String[] args) {
//         Scanner sc= new Scanner(System.in);

//         System.out.println("enter the number you want to check");
//         int num=sc.nextInt();

//         if(num%2==0){
//             System.out.println("number is even");
//         }else{
//             System.out.println("number is odd");
//         }
//     }
// }

// question 5 to check that give traingle is equilateral, isosceles or scalene

// import java.util.*;

// public class conditional {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         System.out.println("enter the sides of the traingle");

//         int a = sc.nextInt();
//         int b=sc.nextInt();
//         int c =sc.nextInt();

//         if (a==b && a==c){
//             System.out.println("given sides are of equilateral traingle");

//         }
//         else if(a==b || b==c || c==a){
//             System.out.println("given sides are of isosceles traingle");
//         }
//         else{
//             System.out.println("given sides are of scalene traingle");
//         }

//     }
// }

// question 6 to calculate the percentage and grade of the students

import java.util.*;

public class conditional {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the marks of 5 subjects of the students");
        int sub1 = sc.nextInt();
        int sub2 = sc.nextInt();
        int sub3 = sc.nextInt();
        int sub4 = sc.nextInt();
        int sub5 = sc.nextInt();

        int total= sub1+sub2+sub3+sub4+sub5;
        double percentage = (total/500.0)*100;
        System.out.println("percentage of the student is: "+percentage);

        if(percentage>=90){
            System.out.println("grade of the student is A");
        }
        else if(percentage>=80){
            System.out.println("grade of the student is B");
        }
        else if(percentage>=70){
            System.out.println("grade of the student is C");
        }
        else if(percentage>=60){
            System.out.println("grade of the student is D");
        }
        else{
            System.out.println("grade of the student is E");
        }
        
    }
}