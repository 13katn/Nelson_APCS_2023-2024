public class PhoneTwo
  {
  private boolean isOn;
  private String connectionTypeIPhone;
  private int currentCharge;
  private String color;
  private String iPhoneBrand;
  private String iPhoneModel;
  public PhoneTwo(boolean isOn, String connectionTypeIPhone, int currentCharge, String color, String iPhoneBrand, String iPhoneModel)
  {
    this.isOn = isOn;
    this.connectionTypeIPhone = connectionTypeIPhone;
    this.currentCharge= currentCharge;
    this.color = color;
    this.iPhoneBrand = iPhoneBrand;
  }
  public PhoneTwo()
    {
      isOn=true;
      connectionTypeIPhone="lightining";
      currentCharge=59;
      color="Pink";
      iPhoneBrand="Apple";
      iPhoneModel="14 Pro Max";
    }
  public void onOrOff()
    {
      if(isOn)
      {
        System.out.println("The phone is on");
      }
      else
      {
        System.out.println("The phone is off");
      }
    }
     public String toString(){
      return "The phone is " + isOn + " and the connection type is " + connectionTypeIPhone + " and the current charge is " + currentCharge + " and the color is " + color + " and the brand is " + iPhoneBrand + " and the model is " + iPhoneModel;
    }
    public void description(){
      System.out.println("The phone is " + isOn + " and the connection type is " + connectionTypeIPhone + " and the current charge is " + currentCharge + " and the color is " + color + " and the brand is " + iPhoneBrand + " and the model is " + iPhoneModel);
    }
    public void PlayMusic(){
      System.out.println("The phone is playing music");
    }
    public void chrgining(){
      System.out.println("The phone is charging");
    }
    public void call911(){
      System.out.println("The phone is calling 911");
    }
    public void takePhoto(){
      System.out.println("The phone is taking a photo");
    }
   
}