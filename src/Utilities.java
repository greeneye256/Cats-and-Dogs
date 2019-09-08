public class Utilities {

    public static double divideIntegers(int number1, int number2){
        return (double)number1/number2;
    }
    public static double roundToThirdDecimal(double number){
        return Math.round(number*1000)/1000D;
    }
    public static double roundToNDecimals(double input, int decimals){

        return Math.floor(input*Math.pow(10,decimals))/Math.pow(10,decimals);

    }

    public static double round(double input, int decimals){
        double power = Math.pow(10,decimals);
        double floor = Math.floor(input*power);
        double result = floor/power;
        return result;
    }

}
