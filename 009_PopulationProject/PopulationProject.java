public class PopulationProject
{
    public static void main(String[] args)  
    {
        int secondsInAYear = 31104000;
        int birthsPerInputSecond= 7;
        int birthsInAYear = secondsInAYear / birthsPerInputSecond;
        int oneDeathPerInputSecond = 13;
        int deathsInAYear = secondsInAYear / oneDeathPerInputSecond;
        int newImmigrantPerInputSecond = 45;
        int newImmigrantInAYear = secondsInAYear / newImmigrantPerInputSecond;
        int currentPopulation = 312032486;
        // this one below is the master code that adds up the old pop. plus all the new immagrants deaths and births 
        int newPopulationOfOneYear = currentPopulation + newImmigrantInAYear + deathsInAYear + birthsInAYear;
        // this one adds it all up but thats for ONE year, below i will multiply it by fove toget the next five years, though I couldve just done that up there
        int newPopulationOfFiveYears = newPopulationOfOneYear +  currentPopulation + newPopulationOfOneYear + newPopulationOfOneYear + newPopulationOfOneYear + newPopulationOfOneYear;
        System.out.println("The  population of the United States after five years should be  " + newPopulationOfFiveYears + " people, according to the US Census Bureau.");
        // we arent counting half of a person so our number wont be accurate 
        // my answer is definitly waaaaay off but im not sure whyyyy
    }
}

/*

1/1 - Compiles
1/1 - Content
1/1 - Formatting
1/1 - Comments

*/