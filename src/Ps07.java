import java.util.Scanner;
public class Ps07 {





        public static void main (String[] args)
        {
            Scanner keyboard = new Scanner(System.in);


            System.out.println("== BMI Calculator ==");
            System.out.println("Step 1: Enter height");
            System.out.println("Feet:");
            double feet = keyboard.nextDouble();

            System.out.println("Inches:");
            Double inch = keyboard.nextDouble();

            System.out.println("Step 2: Enter weight");
            System.out.println("Pounds:");
            double weight = keyboard.nextDouble();

            double height = (feet * 12.0) + inch;
            double total = Math.pow(height, 2);
            double bmi =(weight * 703.0) / (total);

            if (bmi > 30.0){
                System.out.printf("BMI: %02.1f\nyou are obese.\n", bmi);
            }
            else if (bmi <= 29.9 && bmi >= 25.0)
            {
                System.out.printf("BMI: %02.1f\nyou are overweight.\n", bmi);
            }
            else if (bmi <= 24.9 && bmi >= 18.5)
            {
                System.out.printf("BMI: %02.1f\nyou are normal.\n", bmi);
            }
            else if (bmi < 18.4)
            {
                System.out.printf("BMI: %02.1f\nyou are underweight.\n", bmi);
            }
        }
    }


