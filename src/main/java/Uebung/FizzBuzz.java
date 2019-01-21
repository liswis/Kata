package Uebung;

import javafx.util.converter.IntegerStringConverter;

public class FizzBuzz {
    public static Object getResult(int zahl) {
        boolean isDreiModulo=zahl % 3 == 0;
        boolean isFuenfModulo=zahl % 5 == 0;
        if(!( isDreiModulo|| isFuenfModulo)){
            return zahl;
        }
        if (isDreiModulo && isFuenfModulo) {
            return "FizzBuzz";
        }
        if (isDreiModulo) {
            return "Fizz";
        }
        if (isFuenfModulo) {
            return "Buzz";
        }
        throw new IllegalArgumentException(String.format("Die \"zahl\" gleich %s ist nicht erlaub", zahl));
    }

    public static Object getResult(String testInput) {
        return getResult(new IntegerStringConverter().fromString(testInput));
    }
}
