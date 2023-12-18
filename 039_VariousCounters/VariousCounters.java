public class VariousCounters
{
    public static void main(String args[])
    {
        int i=0;
        // vairables for first cycle ^^
        System.out.println("cpounting one to one hundred:");
        while(i<= 100)
        {
            System.out.println(i);
            i++;
        }

    int endPoint = 2000007;
    int startingPoint = 103437;
    // vairables for second cycle ^^
    while (startingPoint < endPoint){
        if (startingPoint % 7 ==0){
           System.out.println(startingPoint);
        }
        startingPoint ++;
        }

    int numberCycleStart= 1000;
    int numberCycleEnd= 2000;
    // vairables for last cycle ^^
    while(numberCycleStart<numberCycleEnd)
    {
        System.out.println(numberCycleStart);
        numberCycleStart+=7;
        System.out.println(numberCycleStart);
        numberCycleStart-=3;
        System.out.println(numberCycleStart);
        numberCycleStart+=11;
        System.out.println(numberCycleStart);
        numberCycleStart-=2;
        System.out.println(numberCycleStart);

    }
    }
}

//while(103436<= i && i=<2000007);


//x = 103436;
//y = 2000007;

// {
//         int i=103437;
//         System.out.println("cpounting one to one hundred:");
//        // while(i<= 100)
//        while(103436<i & i<2000007 && i%7==0 ){

//         {
//             System.out.println(i);
//             i++;
//         }
//        }
// }

/*

1/1 - Compiles
1/1 - Content
1/1 - Formatting
1/1 - Comments

*/