public class ChargingCable {
  private String brand;
  private double length;
  private String connectionType;
  public ChargingCable(String brand, double length, String connectionType)
  {
    this.brand = brand;
    this.length = length;
    this.connectionType = connectionType;
  }
  public static void main(String[] args){}
  public void charging(String connectionType, String connectionTypeIpad)
  {
    if(connectionType.equals(connectionTypeIpad))
    {
      System.out.println("now charging");
    }
    else
    {
      System.out.println("Not Charging oops ");
    }
  }
  public String getBrand()
  {
    return brand;
  }
  public double getLength()
  {
    return length;
  }
  public String getConnectionType()
  {
    return connectionType;
  }
  }