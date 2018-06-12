package com.github.diegolovison.testngreporter;

import org.junit.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BarTest {

   @BeforeMethod
   public void setup() {
      //throw new NullPointerException();
   }

   @Test
   public void a() {
      Bar b = new Bar();
      Assert.assertEquals("a", b.bar("a"));
   }
}
