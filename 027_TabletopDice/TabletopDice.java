public class TabletopDice
{
    public static void main(String[] args){
        // d four below 
        int dFourMax = 4;
        int dFourMin = 1;
        int dFourRange = dFourMax - dFourMin + 1;
        int dFourRand = (int) (Math.random() * dFourRange + dFourMin);
        System.out.println("The random roll for the d4 was " + dFourRand);

        // d six below
        int dSixMax = 6;
        int dSixMin = 1;
        int dSixRange = dSixMax - dSixMin + 1;
        int dSixRand = (int) (Math.random() * dSixRange + dSixMin);
        System.out.println("The random roll for the d6 was " + dSixRand);

        //d10 below 
        int dTenMax = 10;
        int dTenMin = 1;
        int dTenRange = dTenMax - dTenMin + 1;
        int dTenRand = (int) (Math.random() * dTenRange + dTenMin);
        System.out.println("The random roll for the d10 was " + dTenRand);

        int dTwelveMax = 12;
        int dTwelveMin = 1;
        int dTwelveRange = dTwelveMax - dTwelveMin + 1;
        int dTwelveRand = (int) (Math.random() * dTwelveRange + dTwelveMin);
        System.out.println("The random roll for the d12 was " + dTwelveRand);

        int dPercentileMax = 10;
        int dPercentileMin = 1;
        int dPercentileRange = dPercentileMax - dPercentileMin + 1;
        int dPercentileRand = (int) (Math.random() * dPercentileRange + dPercentileMin);
        int dPercentileRandTwo = (int) (Math.random() * dPercentileRange + dPercentileMin);
        System.out.println("The first roll for the percentile dice was  " + dPercentileRand);
        System.out.println("The second roll for the percentile dice was  " + dPercentileRand);
        System.out.println(" Together that means your roll was " + String.valueOf(dPercentileRand) + String.valueOf(dPercentileRandTwo ));
        // changed the ints to strings so that it would do the math (ex: 1+1=2) but rather just see them as words and putd them together (ex: 1+1=11)

    }
}

/*

1/1 - Compiles
1/1 - Content
1/1 - Formatting
1/1 - Comments

*/