import Uebung.FizzBuzz;
import org.junit.Assert;
import org.junit.Test;

public class FizzBuzzTest {
    @Test
    public void eingabe1() {
        int testInput=1;
        Assert.assertEquals(1, FizzBuzz.getResult(testInput));
    }

    @Test
    public void eingabeX() {
        //prepare
        int testInput=61;
        Object expected=61;
        //act
        Object result=FizzBuzz.getResult(testInput);
        //verify
        Assert.assertEquals(expected,result );
    }


    @Test
    public void eingabe3() {
        int testInput=3;
        Assert.assertEquals("Fizz", FizzBuzz.getResult(testInput));
    }

    @Test
    public void eingabe5 () {
        int testInput=5;
        Assert.assertEquals("Buzz", FizzBuzz.getResult(testInput));
    }

    @Test
    public void eingabe15 () {
        int testInput=15;
        Assert.assertEquals("FizzBuzz", FizzBuzz.getResult(testInput));
    }
    @Test
    public void wennZeichen15Ist_DannWirdFizzBuzzZurueckgegeben () {
        //prepare
        String testInput="15";
        Object expected="FizzBuzz";
        //act
        Object result=FizzBuzz.getResult(testInput);
        //verify
        Assert.assertEquals(expected,result );
    }


}
