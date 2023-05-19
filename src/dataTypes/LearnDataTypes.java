package dataTypes;

public class LearnDataTypes {
    public static void main(String[] args) {
        LearnString.learnString();

    }
}

//int
class LearnIntegers {

    // get min and max value in integers
    public static void getRange() {
        System.out.println("Integer Data Type");
        int minValue = Integer.MIN_VALUE;
        int maxValue = Integer.MAX_VALUE;
        System.out.println("int range: "+minValue + " : " + maxValue);
        System.out.println("size : "+Integer.SIZE);
    }

    //integer wraparounds
    public static void wraparounds() {
        int underFlowedInt = Integer.MIN_VALUE - 1;
        int overflowedInt = Integer.MAX_VALUE + 1;
        int numaricLiteral = 2_147_483_647;
        System.out.println("Integer.MAX_VALUE (2147483647) + 1 = " + overflowedInt);
        System.out.println("Integer.MIN_VALUE (-2147483648) - 1 = " + underFlowedInt);
    }

}

class LearnBytes{
    public static void getRange() {
        System.out.println("Byte Data Type");
        int minValue = Byte.MIN_VALUE;
        int maxValue = Byte.MAX_VALUE;
        System.out.println("Byte range : "+minValue + " to " + maxValue);
        System.out.println("size : "+Byte.SIZE);
    }
}

class LearnShort{
    public static void getRange() {
        System.out.println("Short Data Type");
        int minValue = Short.MIN_VALUE;
        int maxValue = Short.MAX_VALUE;
        System.out.println("Byte range : "+minValue + " to " + maxValue);
        System.out.println("size : "+Short.SIZE);
    }
}

class LearnLong{
    public static void getRange() {
        System.out.println("Long Data Type");
        long minValue = Long.MIN_VALUE;
        long maxValue = Long.MAX_VALUE;
        System.out.println("Byte range : "+minValue + " to " + maxValue);
        System.out.println("size : "+Long.SIZE);
    }
}

class LearnCasting{
    public static void cast() {
        int minValue = Integer.MIN_VALUE;
        int finalValue = minValue/2;

        byte minByteValue = Byte.MIN_VALUE;

        byte newByteValue = (byte) (minByteValue/2);

        System.out.println(newByteValue);
    }
}

class learnFloat{
    public static void learnFloat(){

        float floatValue = 5.25f;
        System.out.println(floatValue);
    }

    public static void floatDivision(){
        int i = 5 / 2;
        float f = 5 / 2f;
        double d = 5 / 2d;
        System.out.println(i);
        System.out.println(f);
        System.out.println(d);
    }
}

class LearnString{
    public static void learnString(){
        String numString="250.55";
        numString=numString+"49.45";
        System.out.println(numString); // output -> 250.5549.45

        String secondString ="10";
        int num=50;
        System.out.println(secondString+num);

    }
}

