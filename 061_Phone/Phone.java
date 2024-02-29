public class Phone
  {
    private boolean isOn;
    private String connectionType;
    private int charge;
    private String color;
    private String phoneBrand;
    private String phoneModel;

    public Phone(boolean isOn, String connectionTypeIPhone, int currentCharge, String color, String iPhoneBrand, String iPhoneModel)
    {
      this.isOn = isOn;
      this.connectionType = connectionType;
      this.charge= charge;
      this.color = color;
      this.phoneBrand = phoneBrand;
      this.phoneModel = phoneModel;
      }
      public PhoneTwo()
        {
          isOn=true;
          connectionType="lightining";
          charge=59;
          color="Pink";
          phoneBrand="Apple";
          phoneModel="14 Pro Max";
        }

      public void onOrOff()
        {
          if(isOn)
          {
            System.out.println("your phonse on");
          }
          else
          {
            System.out.println("your phones on");
          }
        }

      public void charging()
    {
      if(charge<100) // if statemetns to correlate to percentage notifciation
      {
        System.out.println("your phones now charging");
      }
      else
      {
        System.out.println("your ophones at 100%");
      }
    }

    public void description()
    {
      System.out.println("This iphone is a " + color + " " + phoneBrand + " " + phoneModel + " with a " + connectionType + " connection type and is at battery wise " + charge + " percent");
    }
    public void takePhoto()
    {
      System.out.println("Taking a picture");
    }
    public void PlayMusic()
    {
      System.out.println("its playing music ");
    }
    public void call911()
    {
      System.out.println("calling 9-1-1");
    }
  }
