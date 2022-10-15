import java.util.Scanner;

public class QuizGame {
    public static void main(String[] args) {
        Scanner Scan = new Scanner(System.in);
        System.out.println("welcome to Quiz Game ");
        System.out.println("enter Y to Start Game");
        char a = Scan.next().trim().charAt(0),b;
        int Score=0;
        if (a == 'Y') {
            System.out.println("lets start the game");
            System.out.println("cpu stands for :");
            b=Scan.nextLine().charAt(0);
            if(b == 'Central')
            {
                Score+=1;
            }

        }
        Scan.close();
    }

}
