// Transaction Report:
// -Methods:
// --Tally transaction totalCost, totalSalePrice, totalProfit, and totalMargin.
// --Allow user to get each amount on request from the Transaction Report.

public class ForEachItem {
    //Make an array of dogs named kennel, put three dogs in it.
    Item[] report = {new Item("noodle", "angel hair pasta", 8.50, 2.50, 6.50, 20.0), new Item("noodle", "angel hair pasta", 8.50, 2.50, 6.50, 20.0), new Item("noodle", "angel hair pasta", 8.50, 2.50, 6.50, 20.0)};
    public static void main(String[] args) {
        ForEachItem fed = new ForEachItem();
        fed.printAllItemInfo(fed.report);
    }
    public void printAllDogInfo(Item[] arr) {
        /* This method should take in a dog array, feed each dog one pound of food,
        and then print all the info on each dog in that array in one sentence. */
        for(Item item:arr) {
            System.out.println(item.getName() + " " + item.getDescription() + " " + item.getWeight());
        }
    }
}