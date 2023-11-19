import java.util.Scanner;

public class ScoreToGradeActivity{
    public static void main(String[] args) {

        Scanner scanner = new Scanner (System.in);
            System.out.print("Enter score here: ");

        int score = scanner.nextInt();
        if (score >= 90){ //If score is 90-100, Grade A
            System.out.println("Grade: A");
        }
        else if (score>=80 & score<90){ //If score is 80-89, Grade B
            System.out.println("Grade: B");
        }
        else if (score>=70 & score < 80){ //If score is 70-79, Grade C
            System.out.println("Grade: C");
        }
        else if (score>=60 & score < 70){ //If score is 60-69, Grade D
            System.out.println("Grade: D");
        }
        else{
            System.out.println("Grade: F"); //If score is below 60, Grade F
        }
    }
}