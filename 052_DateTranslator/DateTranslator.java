Public class DateTranslator
import java.util.Scanner;

class Main {
  public static void main(String[] args) {
  Scanner scan=new Scanner(System.in);
  int day = 0;
  int month = 0;
  int year = 0;
  String americanOrEuropean = "";

    System.out.println("whats the day");
    day=scan.nextInt();
    System.out.println("Whats the month:");
    month=scan.nextInt();
    System.out.println("Whats the year:");
    year=scan.nextInt();
    

    System.out.println("Would you like to enter the date in American or European format?");
    americanOrEuropean=scan.nextLine();
    scan.close();
// elif statement to determine order based on input user gave if they want european or amreican
    if(americanOrEuropean.equals("American")) {
      printAmerican(day, month, year);
    }
    else if(americanOrEuropean.equals("European")) {
      printEuropean(day, month, year);
    }
  }
  public static void printAmerican(int day, int month, int year){
      System.out.println(month+"/"+day+"/"+year);
    }
    
    public static void printEuropean(int day, int month, int year) {
      System.out.println(day+"/"+month+"/"+year);
    }
}

/*

-Looks close, but it doesn't compile.

2/3 - Compile/Content
1/1 - Formatting
1/1 - Comments

*/