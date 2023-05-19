package dataTypes;
/*
Your challenge is to create four new variables:
        A byte variable, set it to any valid byte number, it doesn't matter.
        A short variable, set it to any valid short number.
        An int variable,  set it to any valid integer number.
        Lastly, create a variable of type long. Make it equal to 50,000 plus 10 times the sum of the values of the first 3 variables (your byte, your short and your int values).  In other words, use the variable names in your expression to calculate the sum.
*/
public class ChallengeOne {
    public static void main(String[] args) {
        System.out.println(challenge());
    }

    public static long challenge() {
        byte numByte = 100;
        short numShort = 8000;
        int numInt = 85000;

        long longSum = 50_000 + 10 * (numByte + numShort + numInt);
        return longSum;
    }
}
