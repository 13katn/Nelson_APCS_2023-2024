// Transaction Report:
// -Methods:
// --Tally transaction totalCost, totalSalePrice, totalProfit, and totalMargin.
// --Allow user to get each amount on request from the Transaction Report.

public class ForEachItem {
    //made an array of food and theri descriptions named report
    Item[] report = {new Item("noodle", "thin angel hair pasta", 8.50, 2.50, 6.50, 20.0), new Item("steak", "thick ribeye steak", 27.00, 1.75, 25.25, 20.0 ), new Item("apple", "honey crisp red apple", 1.50, 0.50, 1.00, 20.0)};
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