package com.github.diegolovison.testngreporter;

import org.junit.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

@org.junit.Ignore
public class FooTest {

   @BeforeClass(groups = "windows")
   public void prepareTest1() {
   }

   @BeforeClass(groups = "linux")
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

   @Test(groups = "linux", enabled = false)
   public void c() {
      Assert.assertEquals("c", "c");
   }
}
