import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestCalc {
    private Calc calc;
    @Before
    public void CreateCalc()
    {
        calc = new Calc();
    }

    @Test
    public void Sum(){

        int sum = calc.Sum(4, 5);
        Assert.assertEquals(9,sum);
    }

    @Test
    public void Min(){

        int min = calc.Min(9, 5);
        Assert.assertEquals(4,min);
    }
    @Test
    public void Div(){

        int div = calc.Div(10, 2);
        Assert.assertEquals(5,div);
    }
    @Test
    public void Mult(){

        int mult = calc.Mult(9, 5);
        Assert.assertEquals(45,mult);
    }
}
