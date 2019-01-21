import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

public class FizzBuzzTest {


    @Test
    public void eingabe1(){
        int testinput=1;
        Object ex=1;

        Object result=FizzBuzz.getResult(testinput);

        Assert.assertEquals(ex,result);
    }

    @Test
    public void eingabe3(){
        int testinput=3;
        Object ex="Fizz";

        Object result=FizzBuzz.getResult(testinput);

        Assert.assertEquals(ex,result);
    }



    @Test
    public void wennEingabe15_DannKommtFizzBuzz(){
        int testinput=15;
        Object ex="FizzBuzz";

        Object result=FizzBuzz.getResult(testinput);

        Assert.assertEquals(ex,result);
    }


    @Test
    public void wennEingabe10_DannKommtBuzz(){
        int testinput=10;
        Object ex="Buzz";

        Object result=FizzBuzz.getResult(testinput);

        Assert.assertEquals(ex,result);
    }
}
