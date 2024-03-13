public class Hand
  {
    public static void main(String[] args)
    {
      Phone iPhone= new Phone(true, "lightining", 50, "15 S", "blue", "samsung");
      iPhone.onOrOff();
      //iPhone.typeCharge();
      iPhone.charging();
      iPhone.description();
      iPhone.takePhoto();
      iPhone.PlayMusic();
      iPhone.call911();
    
    }
  }