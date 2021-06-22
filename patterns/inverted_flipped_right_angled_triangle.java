import java.util.*;

public class inverted_flipped_right_angled_triangle{
    public static void main(String[] args){

        int n = Integer.parseInt(args[0]);

        for (int i = n; i > 0; i--){
            for (int j = n; j > i; j--){
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}