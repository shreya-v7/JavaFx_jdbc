import java.util.*;

public class inverted_right_angled_triangle{
    public static void main(String[] args){
        
        int n = Integer.parseInt(args[0]);

        for (int i = n; i > 0; i--){
            for (int j = i; j > 0; j--){
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}