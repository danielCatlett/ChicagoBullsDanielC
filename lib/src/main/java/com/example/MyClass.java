package com.example;

public class MyClass
{
    public static void main(String[] args)
    {
        double[] pts={6,4,4,13,6,2,7,13,2,2,8,3,11,10};
        double[] threes={33.3,0,0,0,100,0,100,100,0,0,0,0,0,0};
        double[] rebounds={9,0,1,5,2,0,0,3,3,6,6,0,12,4};

        averagePoints(pts);
        int[] topThreeIndex=findTopThree(threes);
        avgRebounds(topThreeIndex, rebounds);
        System.out.println("Jimmy Butler is the better player");
    }

    private static void avgRebounds(int[] topThreeIndex, double[] rebounds)
    {
        double sum=0;
        sum+=rebounds[topThreeIndex[0]]+rebounds[topThreeIndex[1]]+rebounds[topThreeIndex[2]];
        double avg=sum/3.0;
        System.out.println("The average amount of rebounds for the top three 3-Point shooters is "+avg);
    }

    private static int[] findTopThree(double[] threes)
    {
        int[] topThreeIndex={0,1,2};
        for(int i=0; i<14; i++)
        {
            if(threes[i]>threes[topThreeIndex[0]])
            {
                topThreeIndex[2]=topThreeIndex[1];
                topThreeIndex[1]=topThreeIndex[0];
                topThreeIndex[0]=i;
            }
            else if(threes[i]>threes[topThreeIndex[1]])
            {
                topThreeIndex[2]=topThreeIndex[1];
                topThreeIndex[1]=i;
            }
            else if(threes[i]>threes[topThreeIndex[2]])
            {
                topThreeIndex[2]=i;
            }
        }
        return topThreeIndex;
    }

    private static void averagePoints(double[] pts)
    {
        int sum=0;
        for(int i=0; i<14; i++)
            sum+=pts[i];

        double avg=sum/14.0;
        System.out.println("The average points scored by the team is "+avg);
    }
}
