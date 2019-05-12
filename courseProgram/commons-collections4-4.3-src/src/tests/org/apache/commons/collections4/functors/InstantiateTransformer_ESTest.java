/*
 * This file was automatically generated by EvoSuite
 * Sat Apr 27 03:55:44 GMT 2019
 */

package org.apache.commons.collections4.functors;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.lang.reflect.Array;
import org.apache.commons.collections4.Transformer;
import org.apache.commons.collections4.functors.InstantiateTransformer;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class InstantiateTransformer_ESTest extends InstantiateTransformer_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Class<Object>[] classArray0 = (Class<Object>[]) Array.newInstance(Class.class, 8);
      Object[] objectArray0 = new Object[3];
      // Undeclared exception!
      try { 
        InstantiateTransformer.instantiateTransformer((Class<?>[]) classArray0, objectArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Parameter types must match the arguments
         //
         verifyException("org.apache.commons.collections4.functors.InstantiateTransformer", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      InstantiateTransformer<String> instantiateTransformer0 = new InstantiateTransformer<String>((Class<?>[]) null, (Object[]) null);
      Class<String> class0 = String.class;
      String string0 = instantiateTransformer0.transform(class0);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Class<String>[] classArray0 = (Class<String>[]) Array.newInstance(Class.class, 1);
      Class<String> class0 = String.class;
      classArray0[0] = class0;
      InstantiateTransformer<Integer> instantiateTransformer0 = new InstantiateTransformer<Integer>(classArray0, classArray0);
      Class<Integer> class1 = Integer.class;
      // Undeclared exception!
      try { 
        instantiateTransformer0.transform(class1);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Class<Object>[] classArray0 = (Class<Object>[]) Array.newInstance(Class.class, 10);
      InstantiateTransformer<Object> instantiateTransformer0 = new InstantiateTransformer<Object>(classArray0, classArray0);
      // Undeclared exception!
      try { 
        instantiateTransformer0.transform(classArray0[0]);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // InstantiateTransformer: Input object was not an instanceof Class, it was a null object
         //
         verifyException("org.apache.commons.collections4.functors.InstantiateTransformer", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Class<Integer> class0 = Integer.class;
      InstantiateTransformer<Object> instantiateTransformer0 = new InstantiateTransformer<Object>((Class<?>[]) null, (Object[]) null);
      // Undeclared exception!
      try { 
        instantiateTransformer0.transform(class0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // InstantiateTransformer: The constructor must exist and be public 
         //
         verifyException("org.apache.commons.collections4.functors.InstantiateTransformer", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Class<Object>[] classArray0 = (Class<Object>[]) Array.newInstance(Class.class, 10);
      Transformer<Class<? extends Integer>, Integer> transformer0 = InstantiateTransformer.instantiateTransformer((Class<?>[]) classArray0, (Object[]) classArray0);
      assertNotNull(transformer0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Class<Object>[] classArray0 = (Class<Object>[]) Array.newInstance(Class.class, 0);
      Object[] objectArray0 = new Object[5];
      // Undeclared exception!
      try { 
        InstantiateTransformer.instantiateTransformer((Class<?>[]) classArray0, objectArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Parameter types must match the arguments
         //
         verifyException("org.apache.commons.collections4.functors.InstantiateTransformer", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Class<Object>[] classArray0 = (Class<Object>[]) Array.newInstance(Class.class, 0);
      Transformer<Class<? extends String>, String> transformer0 = InstantiateTransformer.instantiateTransformer((Class<?>[]) classArray0, (Object[]) classArray0);
      assertNotNull(transformer0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Transformer<Class<? extends String>, String> transformer0 = InstantiateTransformer.instantiateTransformer((Class<?>[]) null, (Object[]) null);
      assertNotNull(transformer0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Object[] objectArray0 = new Object[12];
      // Undeclared exception!
      try { 
        InstantiateTransformer.instantiateTransformer((Class<?>[]) null, objectArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Parameter types must match the arguments
         //
         verifyException("org.apache.commons.collections4.functors.InstantiateTransformer", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Class<Object>[] classArray0 = (Class<Object>[]) Array.newInstance(Class.class, 0);
      // Undeclared exception!
      try { 
        InstantiateTransformer.instantiateTransformer((Class<?>[]) classArray0, (Object[]) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Parameter types must match the arguments
         //
         verifyException("org.apache.commons.collections4.functors.InstantiateTransformer", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Transformer<Class<? extends Class<String>>, Class<String>> transformer0 = InstantiateTransformer.instantiateTransformer();
      assertNotNull(transformer0);
  }
}
