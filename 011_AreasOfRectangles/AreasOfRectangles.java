public class AreasOfRectangles 
{
    public static void main(String[] args)  
    {
    double rec1Width = 5.5;
    double rec1length = 7.8;
    double rec2Width = 99.4;
    double rec2Length = 500.32; 
    double rec3Width = 75;
    double rec3Length = 800; 
    double rec4Width = 500029.75;
    double rec4Length = 90029384;
    double rec5Width = 60000;
    double rec5length = 83434491034.0;
   //above was the meausuremnt for the lenghts and widths.. below is formulas to switch the units of measurements 
    double inchesToCm= 2.54;
    double cmToYards = 91.44;
    



    double rec1AreaInInches = rec1Width * rec1length;
    double rec2AreaInCentimeters = rec2Width * rec2Length;
    double rec3AreaInCentimeters = (rec3Width * inchesToCm) * rec3Length;
    double rec4AreaInCentimeters = rec4Width * (rec4Length/inchesToCm) ;
    double rec5AreaInYards = (rec5Width/cmToYards) * rec5Length; 
    System.out.println("The areas of rectangle 1, 2, 3, 4, and 5, are " + rec1AreaInInches + "," + rec2AreaInCentimeters + "," + rec3AreaInCentimeters + "," + rec4AreaInCentimeters + ", and " + rec5AreaInYards + " respectively.");
    }
}

