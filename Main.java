// Online Java Compiler
// Use this editor to write, compile, and run your Java code online
//util library
import java.util.Scanner;
//the class
public class Main {
    //main method
    public static void main(String[] args) {
        //creating scanner
        Scanner scan = new Scanner (System.in);
        //prompting the user to enter the present value
        System.out.println("enter the present value:");
        double presentValue = scan.nextDouble();
        //asking the user for the interest rate
        System.out.println("enter the annual rate in decimal;");
        double annualRate = scan.nextDouble();
        //prompting the user for the number of times the interest rate is compounded per year
        System.out.println("enter the number of times your interest rate is compounded per year:");
        double numberOfTimes = scan.nextDouble();
        //prompting the user to enter the amount of time in years
        System.out.println("enter amount of time in years:");
        double amountOfYears = scan.nextDouble();
        //values in the formula
       double P = presentValue;
       double r = annualRate;
       double t = amountOfYears;
       double n = numberOfTimes;
       //using the formula to calculate
      double A = P * Math.pow(1+r/n, n*t);
       System.out.println("Future value is:"+ A);
