
import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.Collectors;

public class LimitedNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> List = new ArrayList<>();
        
        while (true){
            int input = Integer.valueOf(scanner.nextLine());
            
            if(input < 0){
                break;
            }
            List.add(input);
        }
        
        ArrayList<Integer> numsBetweenOneAndFive = List.stream()
                .filter(i -> (i >= 1) && (i <= 5))
                .collect(Collectors.toCollection(ArrayList::new));
        
        
        numsBetweenOneAndFive.stream()
                .forEach(i -> System.out.println(i));
                

    }
}