public class PowerAttackk
{
    public static void main(String args[])
    {
        int dSixMax = 6;
        int dSixMin = 1;
        int dSixRange = dSixMax - dSixMin + 1;
        int dSixRand = (int) (Math.random() * dSixRange + dSixMin + 3);
        System.out.print(dSixRand);
    }
}


      