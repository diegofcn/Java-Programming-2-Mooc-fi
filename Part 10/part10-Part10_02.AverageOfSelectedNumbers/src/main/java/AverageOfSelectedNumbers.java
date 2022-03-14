
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfSelectedNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // toteuta ohjelmasi tänne
        ArrayList<String> inputs = new ArrayList<>();
        
        
        while(true) {
            String numb = scanner.nextLine();
            if(numb.equals("end")) {
                break;
            }
            
            inputs.add(numb);
        }
        
        double averageOfPositiveNumbers = inputs.stream()
                .mapToInt(s -> Integer.valueOf(s))
                .filter(number -> number > 0)
                .average()
                .getAsDouble();
        
        double averageOfNegativeNumbers = inputs.stream()
                .mapToInt(s -> Integer.valueOf(s))
                .filter(number -> number < 0)
                .average()
                .getAsDouble();
        
        
        System.out.println("Print the average of the negative or the positive numbers? (n/p)");
        String answer = scanner.nextLine();
        if (answer.equals("p")) {
            System.out.println("average of the numbers: " + averageOfPositiveNumbers);
        } else if (answer.equals("n")) {
            System.out.println("average of the numbers: " + averageOfNegativeNumbers);
        }
        

    }
}
