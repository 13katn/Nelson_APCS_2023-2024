import java.util.Scanner;
public class Transaction{
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);

        System.out.println("What is the items name ");
        String itemName = scan.nextLine();

            
        System.out.println("What is the item description");
        String itemCost = scan.nextLine();

            
        System.out.println("What is the item cost ");
        String itemDescriptions = scan.nextLine();

            
        System.out.println("What is the items profit ");
        String itemProfit = scan.nextLine();


String[] transactionVariables = new String[]{itemName, itemDescription, itemCost, itemSalePrice, itemProfit};
for(int i=0; i<transactionVariables.length; i++){ // for loop that pritns the classes to only a certain amt of times like as muhc as the lengt so it dosnt repeat
    System.out.println("this tri my classes are " + transactionVariables[i]);
        }
        scan.close();
    }
}
    