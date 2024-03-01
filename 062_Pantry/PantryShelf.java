public class PantryShelf{
    public static void main(String[] args){
        FoodItem foodOne = new FoodItem(6, "Kellog", "goldfish", "Orange");
        foodOne.pantryFoodDescription();
        foodOne.descriptionOfCertainFood();
        foodOne.eatItem();
        foodOne.setNumberOfGoldFish(8);
        foodOne.eatItem();
        FoodItem foodTwo = new FoodItem(9,"kellog", "cheezits", "orange ");
        foodTwo.pantryFoodDescription();
        foodTwo.descriptionOfCertainFood();
        FoodItem foodThree = new FoodItem(12, "club", "crackers", "beige ");
        foodThree.pantryFoodDescription();
        foodThree.descriptionOfCertainFood();
    }
}