import java.util.*;
import java.lang.Math;
public class Running_Distance {
    public static void main(String[] args) {
       
        Scanner input = new Scanner(System.in);
        System.out.println("Diagonal cut");
        int diagonal = input.nextInt();
        System.out.println("Enter the length of ground");
        int length = input.nextInt();
        System.out.println("Enter the no of rounds Anuj took");
        int rounds = input.nextInt();


        // first find breadth
        int sub = ((diagonal*diagonal) - (length*length));
        double  breadth = Math.sqrt(sub);
        double area;
        // check round value
        if(rounds == 0){
            System.out.println("Invalid Input");
        }
        else{
            //formula for finding total_running_distance
          area = 2*(length + breadth);
        double total_running_distance = rounds*area;
        System.out.println(area);
        }
       
        }
}
