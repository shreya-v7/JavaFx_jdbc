import java.util.*;

public class flipped_right_angled_triangle{
    public static void main(String[] args){

        int n = Integer.parseInt(args[0]);

        for (int i = 0; i < n; i++){
            for (int j = 2*(n - i); j >= 0; j--){
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++){
                System.out.print("* ");
            } 
            System.out.println();
        }

    }
}