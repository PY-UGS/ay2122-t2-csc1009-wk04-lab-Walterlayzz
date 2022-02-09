import java.util.Scanner;

public class BMICalculator {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter weight in pounds: ");
        float weightPounds = input.nextFloat();
        System.out.print("Enter height in inches: ");
        float heightInches = input.nextFloat();
        BMI user = new BMI(weightPounds, heightInches);
        System.out.println("BMI is " + user.getBMIvalue());
        user.BMIRange(user.getBMIvalue());
    }
}
