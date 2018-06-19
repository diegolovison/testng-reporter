package com.github.diegolovison.testngreporter;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ParamTest {

   @DataProvider(name = "test1")
   public static Object[][] createDataProvider() {
      return new Object[][] {{"a", "a"}, {"b", "b"}, {"c", "c"}, {"d", "d"}};
   }

   @Test(dataProvider = "test1")
   public void testAssertEquals(String expected, String value) {
      Assert.assertEquals(expected, value);
   }
}
