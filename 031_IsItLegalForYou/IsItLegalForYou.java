import java.util.Scanner;
public class IsItLegalForYou{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int ageVar = 0;
        System.out.println("What is  your age? ");
        ageVar = scan.nextInt();
        scan.close();

        if (ageVar >= 18)
        {
            System.out.println("You can get a driverse license, a job, and go to casinos ");
        }
        if (ageVar >= 21)
        {
            System.out.println("You can buy cigarretes, alcohol, and rent a car ");
        }
        if (ageVar >= 35)
        {
            System.out.println("You can run for president. ");
        }
         if (ageVar >= 65)
        {
            System.out.println("You can enroll for medicare");
        }
        else
        {
            System.out.println("you cant do any of those other things");
            // this line ^^ will run after every age UNLESS ur over 65 and hit every single category, so like 64 would still get "you cant do any of those things" becuase it cant enroll for meidcare
        }
    }
}

        