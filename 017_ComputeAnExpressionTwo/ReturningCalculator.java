public class ReturningCalculator
{
    public static void main(String[] args)
    {

    }
    double ninePointFive = 9.5;
    double fourPointFive = 4.5;
    double twoPointFive = 2.5;
    double three = 3.0;
    double threePointFive = 3.5; 
    double fortyFivePointFive = 45.5;
   // System.out.println((ninePointFive * fourPointFive - twoPointFive * three) / (fortyFivePointFive - threePointFive));
   //  i split the above probelm into three main parts in PEMDAS order and then multiplied the firs tpart to second part than diveded by third part

    ReturningCalculator calc = new ReturningCalculator();

    double firstPart = calc.doubleMultiplier(ninePointFive, fourPointFive);
    double secondPart = calc.doubleMultiplier(twoPointFive, three);
    double thirdPart = calc.doubleMultiplier(fortyFivePointFive, threePointFive);
    double firstPartMinusSecondPart = calc.doubleSubtractor(firstPart, secondPart);
    double firstPartMinusSecondPartDividedByThirdPart = calc.divider(firstPartMinusSecondPart, thirdPart);







    public int integerAdder(int x, int y)
    {
        return x+y;
    }

    public double doubleAdder(double x, double y)
    {
        return x+y;
    }
    
    public int integerSubtractor(int x, int y)
    {
        return x-y;
    }

    public double doubleSubtractor(double x, double y)
    {
        return x-y;
    }

    
    public int integerMultiplier(int x, int y)
    {
        return x*y;
    }

    public double doubleMultiplier(double x, double y)
    {
        return x*y;
    }

    public double divider(double x, double y)
    {
        return x/y;
    }
}