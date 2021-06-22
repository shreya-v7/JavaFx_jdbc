import java.util.*;

public class triangle{
    public static void main(String[] args){

        int n = Integer.parseInt(args[0]);

        for (int i = n; i > 0; i--){
            for (int j = i; j > 0; j--){
                System.out.print(" ");
            }
            for (int j = 0; j <= n - i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}