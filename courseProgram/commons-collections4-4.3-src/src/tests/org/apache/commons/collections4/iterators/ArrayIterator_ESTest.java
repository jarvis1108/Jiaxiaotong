/*
 * This file was automatically generated by EvoSuite
 * Sat Apr 27 04:33:11 GMT 2019
 */

package org.apache.commons.collections4.iterators;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.collections4.iterators.ArrayIterator;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ArrayIterator_ESTest extends ArrayIterator_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ArrayIterator<Object> arrayIterator0 = null;
      try {
        arrayIterator0 = new ArrayIterator<Object>((Object) null, 1085, 1085);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.lang.reflect.Array", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      ArrayIterator<String> arrayIterator0 = null;
      try {
        arrayIterator0 = new ArrayIterator<String>("6F#f2iaob&<Z4", 2903, 2903);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Argument is not an array
         //
         verifyException("java.lang.reflect.Array", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      ArrayIterator<Object> arrayIterator0 = null;
      try {
        arrayIterator0 = new ArrayIterator<Object>((Object) null, (-8));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.lang.reflect.Array", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      ArrayIterator<Object> arrayIterator0 = null;
      try {
        arrayIterator0 = new ArrayIterator<Object>((Object) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.lang.reflect.Array", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Object object0 = new Object();
      ArrayIterator<Integer> arrayIterator0 = null;
      try {
        arrayIterator0 = new ArrayIterator<Integer>(object0, 0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Argument is not an array
         //
         verifyException("java.lang.reflect.Array", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      ArrayIterator<Object> arrayIterator0 = null;
      try {
        arrayIterator0 = new ArrayIterator<Object>("");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Argument is not an array
         //
         verifyException("java.lang.reflect.Array", e);
      }
  }
}
