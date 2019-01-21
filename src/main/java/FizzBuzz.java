import com.sun.xml.internal.ws.util.StringUtils;

public class FizzBuzz {
    public static Object getResult(int zahl) {
        String result = "";
        result = result+getFizz(zahl);
        result = getBuzz(zahl, result);
        return result.equals("") ?
                zahl :
                result;

    }

    private static String getBuzz(int zahl, String result) {
        if (zahl % 5 == 0) {
            result = result + "Buzz";
        }
        return result;
    }

    private static String getFizz(int zahl) {
        String result="";
        if (zahl % 3 == 0) {
            result = result + "Fizz";
        }
        return result;
    }
}
