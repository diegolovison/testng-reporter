package com.github.diegolovison.testngreporter;

import org.junit.Assert;
import org.testng.SkipException;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class FooTest {

   @BeforeClass
   public void prepareTest1() {
   }

   @BeforeClass
   public void prepareTest2() {
   }

   @Test(groups = "windows")
   public void a() {
      Foo f = new Foo();
      Assert.assertEquals("a", f.foo("a"));
   }

   @Test(groups = "linux")
   public void b() {
      Assert.assertEquals(true, !false);
   }
}
