
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int count = 0;
        while(true) {
            int input = Integer.valueOf(scanner.nextLine());
            if (input == 0) {
                if(sum > 0) {
                    System.out.println(avg(sum, count));
                } else {
                    System.out.println("Cannot calculate the average");
                }
                break;
            }
            if (input > 0) {     
                sum = sum + input;
                count+=1;
            }
        }
        
    }
    
    public static double avg(int sum, int count) {
        double average = 0;
        average = (double) sum / count;
        return average;
    }
}
