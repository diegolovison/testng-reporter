package com.github.diegolovison.testngreporter;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class FooTest {

   @BeforeClass
   public void prepareTest() {
      throw new NullPointerException();
   }

   @Test
   public void testBar() {
      Foo f = new Foo();
      Assert.assertEquals("a", f.bar("a"));
   }
}
