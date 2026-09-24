import java.util.Scanner;

public class FeedbackAverage {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int rating[] = new int[5];
        int sum=0;

        System.out.println("Enter 5 Ratings:");

        for(int i=0;i<5;i++)
        {
            rating[i]=sc.nextInt();
            sum+=rating[i];
        }

        double average=(double)sum/5;

        System.out.println("Average Rating = "+average);
    }
}
