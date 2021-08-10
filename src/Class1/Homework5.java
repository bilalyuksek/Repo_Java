package Class1;

public class Homework5 {
    public static void main(String[] args) {





            double studentScore= 150;
            double maxScore=170;
            double thePercentage = 150*100/170;
            System.out.println(thePercentage);

            if (thePercentage >=91 && thePercentage <=100) {System.out.println("Your Percentage: " + thePercentage + " " + "and your Grade is :A");}
            else if (thePercentage >=81 && thePercentage <=90.99) {System.out.println("Your Percentage: " + thePercentage + " " + "and your Grade is: B");}
            else if (thePercentage >=71 && thePercentage <=80.99) {System.out.println("Your Percentage: " + thePercentage + " " + "and your Grade is: C");}
            else if (thePercentage >=61 && thePercentage <=70.99) {System.out.println("Your Percentage: " + thePercentage + " " + "and your Grade is: D");}
            else if (thePercentage >=51 && thePercentage <=60.99) {System.out.println("Your Percentage: " + thePercentage + " " + "and your Grade is: E");}
            else if (thePercentage <=50.99) {System.out.println("Your Percentage: " + thePercentage + " " + "and your Grade is:F");}




            int  num = 18;


            if (num % 3 ==0) {System.out.println("divisible by 3");}
            else if (num % 5 ==0) {System.out.println("divisible by 5");}
            else if (num % 5 ==0 && num % 3 ==0 ) {System.out.println("divisible by both");}
            else if (num % 3 !=0 && num % 5 !=0 ) {System.out.println(num);}



        }
}
