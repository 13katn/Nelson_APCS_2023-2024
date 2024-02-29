public class HandTwo
{
  public static void main(String[] args)
  {
    PhoneTwo iPhone= new PhoneTwo(true, "lightining", 59.0, "14 Pro Max", "Pink", "Apple");
    iPhone.onOrOff();
    iPhone.description();
    iPhone.PlayMusic();
    iPhone.chrgining();
    iPhone.call911();
    iPhone.takePhoto();
    System.out.println(iPhone);
  }
}