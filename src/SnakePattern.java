package src;
import java.util.Scanner;
public class SnakePattern {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        for(int i = 1; i <= num; i++){

            if(i % 2 != 0){
                int k = (num * (i - 1)) + 1;
                for(int j = 1; j <= num; j++){
                    System.out.print(k +"\t");
                    k++;
                }
            } else{
                int k = (num * i);
                for(int j = 1; j <= num; j++){
                    System.out.print(k + "\t");
                    k--;
                }
            }
            System.out.println();
        }

    }
}
