public class FoodItem{
    private int numberOfItem;
    private String foodBrand;
    private String foodType;
    private String foodColor;
    public FoodItem(int numberOfItem, String foodBrand, String foodType, String foodColor){
        this.numberOfItem = numberOfItem;
        this.foodBrand = foodBrand;
        this.foodType = foodType;
    }
    public void pantryFoodDescription(){
        System.out.println("there are " + numberOfItem + " food items in my pantrty currently");
    }
    public void descriptionOfCertainFood() {
        System.out.println("The " + foodType + " is " + foodColor + " and its brand is " + foodBrand);
    }
    public void eatItem(){
    System.out.println(" I want to eat " + numberOfItem);
    for(int i=numberOfItem; i>= numberOfItem; i--) {
        i--;
        System.out.println("im eating " + i + " " +  foodType);
    }
}
public void setNumberOfGoldFish(int newNumberOfItem){
    this.numberOfItem=newNumberOfItem;
}
public int getNumberOfItem(){
    return numberOfItem;
}
}