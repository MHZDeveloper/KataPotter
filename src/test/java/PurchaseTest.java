import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;


public class PurchaseTest {

    private Purchase purchase = new Purchase();

    @Test
    public void should_return_cost_for_five_different_books(){

        purchase.getBooks().add(2);
        purchase.getBooks().add(2);
        purchase.getBooks().add(2);
        purchase.getBooks().add(1);
        purchase.getBooks().add(1);

        double actualValue = purchase.cost();

        Assert.assertNotNull(actualValue);
        Assert.assertEquals(51.2, actualValue, 0);
    }

    @Test
    public void should_return_cost_for_one_book(){

        purchase.getBooks().add(1);
        purchase.getBooks().add(0);
        purchase.getBooks().add(0);
        purchase.getBooks().add(0);
        purchase.getBooks().add(0);

        double actualValue = purchase.cost();

        Assert.assertNotNull(actualValue);
        Assert.assertEquals(8, actualValue, 0);
    }

    @Test
    public void should_return_cost_for_two_same_books(){

        purchase.getBooks().add(2);
        purchase.getBooks().add(0);
        purchase.getBooks().add(0);
        purchase.getBooks().add(0);
        purchase.getBooks().add(0);

        double actualValue = purchase.cost();

        Assert.assertNotNull(actualValue);
        Assert.assertEquals(16, actualValue, 0);
    }

    @Test
    public void should_return_cost_for_two_different_books(){

        purchase.getBooks().add(1);
        purchase.getBooks().add(1);
        purchase.getBooks().add(0);
        purchase.getBooks().add(0);
        purchase.getBooks().add(0);

        double actualValue = purchase.cost();

        Assert.assertNotNull(actualValue);
        Assert.assertEquals(15.2, actualValue, 0);
    }
}
