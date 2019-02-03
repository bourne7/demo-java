package CommonTest;

import Reflect.Car;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CarTest {
    Car car = new Car("Honda", 180);

    @Before
    public void before() throws Exception {
    }

    @After
    public void after() throws Exception {
    }

    /**
     * Method: getName()
     */
    @Test
    public void testGetName() throws Exception {
        String name = car.getName();
        Assert.assertEquals("Honda", name);
    }

    /**
     * Method: setName(String name)
     */
    @Test
    public void testSetName() throws Exception {
        car.setName("Honda2");
    }

    /**
     * Method: getSpeed()
     * 这里就会报错。
     */
    @Test
    public void testGetSpeed() throws Exception {
        int speed = car.getSpeed();
        Assert.assertEquals(181, speed);
    }

    /**
     * Method: setSpeed(int speed)
     */
    @Test
    public void testSetSpeed() throws Exception {
        car.setSpeed(99);
    }

    /**
     * Method: info()
     */
    @Test
    public void testInfo() throws Exception {
        System.out.println(car.info());
    }


} 
