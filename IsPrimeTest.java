
import static edu.gvsu.dlunit.DLUnit.*;

import org.junit.Assert;
import org.junit.Test;

/**
 * Unit test for 3-bit "isPrime"
 *
 * @author Zachary Kurmas
 */
// Created  8/25/20 at 1:50 PM
// (C) Zachary Kurmas 2020

public class IsPrimeTest {

  @Test
  public void two() {
    setPinUnsigned("Input", 2);    
    run();
    Assert.assertTrue("Checking Sum", readPin("Output"));   
  }

  @Test
  public void three() {
    setPinUnsigned("Input", 3);    
    run();
    Assert.assertTrue("Checking Sum", readPin("Output"));   
  }

  /*  Add your own tests here */

}
