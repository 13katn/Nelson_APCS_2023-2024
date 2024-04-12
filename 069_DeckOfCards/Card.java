public class Card{
    //values for cards and suites
String suits;
String value;
    //method
public Card(String suits, String value){
this.value = value; 
this.suits = suits;
    }
 //getters and setters
public String getSuit(){
    return suits;
} 
public String getValue(){
    return value;
}
public static void main(String [] args){}
}