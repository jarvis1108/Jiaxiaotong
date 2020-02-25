/*
 * This file was automatically generated by EvoSuite
 * Sat Apr 27 04:34:57 GMT 2019
 */

package org.apache.commons.collections4.iterators;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.AbstractMap;
import java.util.ConcurrentModificationException;
import java.util.HashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import org.apache.commons.collections4.iterators.EntrySetMapIterator;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class EntrySetMapIterator_ESTest extends EntrySetMapIterator_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      HashMap<Integer, Object> hashMap0 = new HashMap<Integer, Object>();
      Integer integer0 = new Integer((-814));
      hashMap0.put(integer0, (Object) null);
      EntrySetMapIterator<Integer, Object> entrySetMapIterator0 = new EntrySetMapIterator<Integer, Object>(hashMap0);
      entrySetMapIterator0.hasNext();
      hashMap0.put(integer0, entrySetMapIterator0);
      entrySetMapIterator0.next();
      String string0 = entrySetMapIterator0.toString();
      entrySetMapIterator0.reset();
      HashMap<Object, Object> hashMap1 = new HashMap<Object, Object>();
      EntrySetMapIterator<Object, Object> entrySetMapIterator1 = new EntrySetMapIterator<Object, Object>(hashMap1);
      entrySetMapIterator1.toString();
      HashMap<AbstractMap.SimpleEntry<Object, Object>, Object> hashMap2 = new HashMap<AbstractMap.SimpleEntry<Object, Object>, Object>();
      EntrySetMapIterator<AbstractMap.SimpleEntry<Object, Object>, Object> entrySetMapIterator2 = new EntrySetMapIterator<AbstractMap.SimpleEntry<Object, Object>, Object>(hashMap2);
      entrySetMapIterator2.setValue(string0);
      HashMap<String, AbstractMap.SimpleImmutableEntry<String, String>> hashMap3 = new HashMap<String, AbstractMap.SimpleImmutableEntry<String, String>>();
      EntrySetMapIterator<String, AbstractMap.SimpleImmutableEntry<String, String>> entrySetMapIterator3 = new EntrySetMapIterator<String, AbstractMap.SimpleImmutableEntry<String, String>>(hashMap3);
      entrySetMapIterator3.remove();
      entrySetMapIterator3.getValue();
      entrySetMapIterator3.getKey();
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      HashMap<String, AbstractMap.SimpleImmutableEntry<String, Object>> hashMap0 = new HashMap<String, AbstractMap.SimpleImmutableEntry<String, Object>>();
      AbstractMap.SimpleImmutableEntry<String, String> abstractMap_SimpleImmutableEntry0 = new AbstractMap.SimpleImmutableEntry<String, String>("*1sM4G<jp`Q|", "*1sM4G<jp`Q|");
      AbstractMap.SimpleEntry<String, String> abstractMap_SimpleEntry0 = new AbstractMap.SimpleEntry<String, String>(abstractMap_SimpleImmutableEntry0);
      AbstractMap.SimpleImmutableEntry<String, Object> abstractMap_SimpleImmutableEntry1 = new AbstractMap.SimpleImmutableEntry<String, Object>(abstractMap_SimpleEntry0);
      abstractMap_SimpleEntry0.setValue("]hZGv#j");
      hashMap0.put("*1sM4G<jp`Q|", abstractMap_SimpleImmutableEntry1);
      hashMap0.replace("*1sM4G<jp`Q|", abstractMap_SimpleImmutableEntry1, (AbstractMap.SimpleImmutableEntry<String, Object>) null);
      AbstractMap.SimpleImmutableEntry<String, Object> abstractMap_SimpleImmutableEntry2 = new AbstractMap.SimpleImmutableEntry<String, Object>(abstractMap_SimpleEntry0);
      hashMap0.replace("@b,IPbPr${&ZUPEs", abstractMap_SimpleImmutableEntry2, abstractMap_SimpleImmutableEntry2);
      EntrySetMapIterator<String, AbstractMap.SimpleImmutableEntry<String, Object>> entrySetMapIterator0 = new EntrySetMapIterator<String, AbstractMap.SimpleImmutableEntry<String, Object>>(hashMap0);
      Consumer<String> consumer0 = (Consumer<String>) mock(Consumer.class, new ViolatedAssumptionAnswer());
      Map.Entry.comparingByKey();
      entrySetMapIterator0.forEachRemaining(consumer0);
      entrySetMapIterator0.setValue(abstractMap_SimpleImmutableEntry1);
      entrySetMapIterator0.remove();
      HashMap<AbstractMap.SimpleImmutableEntry<Object, String>, Integer> hashMap1 = new HashMap<AbstractMap.SimpleImmutableEntry<Object, String>, Integer>();
      HashMap<AbstractMap.SimpleEntry<Object, Object>, Integer> hashMap2 = new HashMap<AbstractMap.SimpleEntry<Object, Object>, Integer>();
      HashMap<AbstractMap.SimpleEntry<Object, String>, String> hashMap3 = new HashMap<AbstractMap.SimpleEntry<Object, String>, String>();
      EntrySetMapIterator<AbstractMap.SimpleEntry<Object, String>, String> entrySetMapIterator1 = new EntrySetMapIterator<AbstractMap.SimpleEntry<Object, String>, String>(hashMap3);
      HashMap<String, Object> hashMap4 = new HashMap<String, Object>();
      EntrySetMapIterator<String, Object> entrySetMapIterator2 = new EntrySetMapIterator<String, Object>(hashMap4);
      entrySetMapIterator2.toString();
      // Undeclared exception!
      try { 
        entrySetMapIterator1.remove();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Iterator remove() can only be called once after next()
         //
         verifyException("org.apache.commons.collections4.iterators.EntrySetMapIterator", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      HashMap<String, AbstractMap.SimpleImmutableEntry<String, Object>> hashMap0 = new HashMap<String, AbstractMap.SimpleImmutableEntry<String, Object>>();
      AbstractMap.SimpleImmutableEntry<String, String> abstractMap_SimpleImmutableEntry0 = new AbstractMap.SimpleImmutableEntry<String, String>("*1sM4G<jp`Q|", "*1sM4G<jp`Q|");
      AbstractMap.SimpleEntry<String, String> abstractMap_SimpleEntry0 = new AbstractMap.SimpleEntry<String, String>(abstractMap_SimpleImmutableEntry0);
      AbstractMap.SimpleImmutableEntry<String, Object> abstractMap_SimpleImmutableEntry1 = new AbstractMap.SimpleImmutableEntry<String, Object>(abstractMap_SimpleEntry0);
      hashMap0.put("*1sM4G<jp`Q|", abstractMap_SimpleImmutableEntry1);
      EntrySetMapIterator<String, AbstractMap.SimpleImmutableEntry<String, Object>> entrySetMapIterator0 = new EntrySetMapIterator<String, AbstractMap.SimpleImmutableEntry<String, Object>>(hashMap0);
      Consumer<String> consumer0 = (Consumer<String>) mock(Consumer.class, new ViolatedAssumptionAnswer());
      Map.Entry.comparingByKey();
      entrySetMapIterator0.forEachRemaining(consumer0);
      hashMap0.clear();
      entrySetMapIterator0.setValue(abstractMap_SimpleImmutableEntry1);
      // Undeclared exception!
      try { 
        entrySetMapIterator0.remove();
        fail("Expecting exception: ConcurrentModificationException");
      
      } catch(ConcurrentModificationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.HashMap$HashIterator", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      HashMap<Integer, Object> hashMap0 = new HashMap<Integer, Object>();
      BiConsumer<Object, Object> biConsumer0 = (BiConsumer<Object, Object>) mock(BiConsumer.class, new ViolatedAssumptionAnswer());
      hashMap0.forEach(biConsumer0);
      Integer integer0 = new Integer((-814));
      hashMap0.put(integer0, (Object) null);
      hashMap0.put((Integer) null, "");
      EntrySetMapIterator<Integer, Object> entrySetMapIterator0 = new EntrySetMapIterator<Integer, Object>(hashMap0);
      entrySetMapIterator0.hasNext();
      entrySetMapIterator0.reset();
      entrySetMapIterator0.next();
      entrySetMapIterator0.toString();
      entrySetMapIterator0.hasNext();
      entrySetMapIterator0.reset();
      HashMap<Object, Object> hashMap1 = new HashMap<Object, Object>();
      EntrySetMapIterator<Object, Object> entrySetMapIterator1 = new EntrySetMapIterator<Object, Object>(hashMap1);
      entrySetMapIterator1.toString();
      HashMap<Integer, AbstractMap.SimpleEntry<Object, String>> hashMap2 = new HashMap<Integer, AbstractMap.SimpleEntry<Object, String>>();
      EntrySetMapIterator<Integer, AbstractMap.SimpleEntry<Object, String>> entrySetMapIterator2 = new EntrySetMapIterator<Integer, AbstractMap.SimpleEntry<Object, String>>(hashMap2);
      AbstractMap.SimpleEntry<Object, String> abstractMap_SimpleEntry0 = new AbstractMap.SimpleEntry<Object, String>((Object) null, "i5-4d");
      HashMap<AbstractMap.SimpleEntry<Object, Object>, Object> hashMap3 = new HashMap<AbstractMap.SimpleEntry<Object, Object>, Object>();
      EntrySetMapIterator<AbstractMap.SimpleEntry<Object, Object>, Object> entrySetMapIterator3 = new EntrySetMapIterator<AbstractMap.SimpleEntry<Object, Object>, Object>(hashMap3);
      // Undeclared exception!
      try { 
        entrySetMapIterator3.setValue((Object) null);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Iterator setValue() can only be called after next() and before remove()
         //
         verifyException("org.apache.commons.collections4.iterators.EntrySetMapIterator", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      HashMap<Integer, Object> hashMap0 = new HashMap<Integer, Object>();
      BiConsumer<Object, Object> biConsumer0 = (BiConsumer<Object, Object>) mock(BiConsumer.class, new ViolatedAssumptionAnswer());
      hashMap0.forEach(biConsumer0);
      Integer integer0 = new Integer((-814));
      hashMap0.put(integer0, (Object) null);
      hashMap0.put((Integer) null, "");
      EntrySetMapIterator<Integer, Object> entrySetMapIterator0 = new EntrySetMapIterator<Integer, Object>(hashMap0);
      entrySetMapIterator0.hasNext();
      entrySetMapIterator0.reset();
      entrySetMapIterator0.next();
      entrySetMapIterator0.getKey();
      entrySetMapIterator0.hasNext();
      entrySetMapIterator0.reset();
      HashMap<Object, Object> hashMap1 = new HashMap<Object, Object>();
      EntrySetMapIterator<Object, Object> entrySetMapIterator1 = new EntrySetMapIterator<Object, Object>(hashMap1);
      entrySetMapIterator1.toString();
      HashMap<Integer, AbstractMap.SimpleEntry<Object, String>> hashMap2 = new HashMap<Integer, AbstractMap.SimpleEntry<Object, String>>();
      EntrySetMapIterator<Integer, AbstractMap.SimpleEntry<Object, String>> entrySetMapIterator2 = new EntrySetMapIterator<Integer, AbstractMap.SimpleEntry<Object, String>>(hashMap2);
      AbstractMap.SimpleEntry<Object, String> abstractMap_SimpleEntry0 = new AbstractMap.SimpleEntry<Object, String>((Object) null, "i5-4d");
      entrySetMapIterator1.toString();
      // Undeclared exception!
      try { 
        entrySetMapIterator2.remove();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Iterator remove() can only be called once after next()
         //
         verifyException("org.apache.commons.collections4.iterators.EntrySetMapIterator", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      HashMap<AbstractMap.SimpleEntry<Object, Integer>, String> hashMap0 = new HashMap<AbstractMap.SimpleEntry<Object, Integer>, String>();
      EntrySetMapIterator<AbstractMap.SimpleEntry<Object, Integer>, String> entrySetMapIterator0 = new EntrySetMapIterator<AbstractMap.SimpleEntry<Object, Integer>, String>(hashMap0);
      entrySetMapIterator0.hasNext();
      HashMap<String, String> hashMap1 = new HashMap<String, String>();
      hashMap1.put((String) null, (String) null);
      EntrySetMapIterator<String, String> entrySetMapIterator1 = new EntrySetMapIterator<String, String>(hashMap1);
      Consumer<Object> consumer0 = (Consumer<Object>) mock(Consumer.class, new ViolatedAssumptionAnswer());
      entrySetMapIterator1.forEachRemaining(consumer0);
      entrySetMapIterator1.getValue();
      HashMap<Object, String> hashMap2 = new HashMap<Object, String>();
      EntrySetMapIterator<Object, String> entrySetMapIterator2 = new EntrySetMapIterator<Object, String>(hashMap2);
      // Undeclared exception!
      try { 
        entrySetMapIterator2.getKey();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Iterator getKey() can only be called after next() and before remove()
         //
         verifyException("org.apache.commons.collections4.iterators.EntrySetMapIterator", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      HashMap<String, AbstractMap.SimpleImmutableEntry<String, Object>> hashMap0 = new HashMap<String, AbstractMap.SimpleImmutableEntry<String, Object>>();
      AbstractMap.SimpleImmutableEntry<String, String> abstractMap_SimpleImmutableEntry0 = new AbstractMap.SimpleImmutableEntry<String, String>("*1sM4G<jp`Q|", "*1sM4G<jp`Q|");
      AbstractMap.SimpleEntry<String, String> abstractMap_SimpleEntry0 = new AbstractMap.SimpleEntry<String, String>(abstractMap_SimpleImmutableEntry0);
      AbstractMap.SimpleImmutableEntry<String, Object> abstractMap_SimpleImmutableEntry1 = new AbstractMap.SimpleImmutableEntry<String, Object>(abstractMap_SimpleEntry0);
      hashMap0.put("*1sM4G<jp`Q|", abstractMap_SimpleImmutableEntry1);
      EntrySetMapIterator<String, AbstractMap.SimpleImmutableEntry<String, Object>> entrySetMapIterator0 = new EntrySetMapIterator<String, AbstractMap.SimpleImmutableEntry<String, Object>>(hashMap0);
      Consumer<String> consumer0 = (Consumer<String>) mock(Consumer.class, new ViolatedAssumptionAnswer());
      Map.Entry.comparingByKey();
      entrySetMapIterator0.forEachRemaining(consumer0);
      entrySetMapIterator0.setValue(abstractMap_SimpleImmutableEntry1);
      entrySetMapIterator0.remove();
      HashMap<AbstractMap.SimpleImmutableEntry<Object, String>, Integer> hashMap1 = new HashMap<AbstractMap.SimpleImmutableEntry<Object, String>, Integer>();
      EntrySetMapIterator<AbstractMap.SimpleImmutableEntry<Object, String>, Integer> entrySetMapIterator1 = new EntrySetMapIterator<AbstractMap.SimpleImmutableEntry<Object, String>, Integer>(hashMap1);
      // Undeclared exception!
      try { 
        entrySetMapIterator1.getKey();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Iterator getKey() can only be called after next() and before remove()
         //
         verifyException("org.apache.commons.collections4.iterators.EntrySetMapIterator", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      BiFunction<Object, Object, String> biFunction0 = (BiFunction<Object, Object, String>) mock(BiFunction.class, new ViolatedAssumptionAnswer());
      hashMap0.merge("", "", biFunction0);
      EntrySetMapIterator<String, String> entrySetMapIterator0 = new EntrySetMapIterator<String, String>(hashMap0);
      hashMap0.values();
      hashMap0.put("", "");
      entrySetMapIterator0.hasNext();
      Consumer<Object> consumer0 = (Consumer<Object>) mock(Consumer.class, new ViolatedAssumptionAnswer());
      entrySetMapIterator0.forEachRemaining(consumer0);
      entrySetMapIterator0.getValue();
      entrySetMapIterator0.getKey();
      EntrySetMapIterator<AbstractMap.SimpleEntry<Object, Object>, AbstractMap.SimpleEntry<Integer, Object>> entrySetMapIterator1 = null;
      try {
        entrySetMapIterator1 = new EntrySetMapIterator<AbstractMap.SimpleEntry<Object, Object>, AbstractMap.SimpleEntry<Integer, Object>>((Map<AbstractMap.SimpleEntry<Object, Object>, AbstractMap.SimpleEntry<Integer, Object>>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.collections4.iterators.EntrySetMapIterator", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      EntrySetMapIterator<String, String> entrySetMapIterator0 = new EntrySetMapIterator<String, String>(hashMap0);
      hashMap0.put("", "");
      // Undeclared exception!
      try { 
        entrySetMapIterator0.next();
        fail("Expecting exception: ConcurrentModificationException");
      
      } catch(ConcurrentModificationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.HashMap$HashIterator", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      HashMap<Integer, Object> hashMap0 = new HashMap<Integer, Object>();
      BiConsumer<Object, Object> biConsumer0 = (BiConsumer<Object, Object>) mock(BiConsumer.class, new ViolatedAssumptionAnswer());
      hashMap0.forEach(biConsumer0);
      Integer integer0 = new Integer((-814));
      hashMap0.put(integer0, (Object) null);
      hashMap0.put((Integer) null, "");
      EntrySetMapIterator<Integer, Object> entrySetMapIterator0 = new EntrySetMapIterator<Integer, Object>(hashMap0);
      entrySetMapIterator0.hasNext();
      entrySetMapIterator0.reset();
      entrySetMapIterator0.next();
      entrySetMapIterator0.hasNext();
      entrySetMapIterator0.reset();
      HashMap<Object, Object> hashMap1 = new HashMap<Object, Object>();
      EntrySetMapIterator<Object, Object> entrySetMapIterator1 = new EntrySetMapIterator<Object, Object>(hashMap1);
      entrySetMapIterator1.toString();
      HashMap<Integer, AbstractMap.SimpleEntry<Object, String>> hashMap2 = new HashMap<Integer, AbstractMap.SimpleEntry<Object, String>>();
      EntrySetMapIterator<Integer, AbstractMap.SimpleEntry<Object, String>> entrySetMapIterator2 = new EntrySetMapIterator<Integer, AbstractMap.SimpleEntry<Object, String>>(hashMap2);
      AbstractMap.SimpleEntry<Object, String> abstractMap_SimpleEntry0 = new AbstractMap.SimpleEntry<Object, String>((Object) null, "i5-4d");
      hashMap2.put((Integer) null, abstractMap_SimpleEntry0);
      // Undeclared exception!
      try { 
        entrySetMapIterator2.remove();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Iterator remove() can only be called once after next()
         //
         verifyException("org.apache.commons.collections4.iterators.EntrySetMapIterator", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      String string0 = "";
      hashMap0.put("", "");
      EntrySetMapIterator<String, Object> entrySetMapIterator0 = new EntrySetMapIterator<String, Object>(hashMap0);
      entrySetMapIterator0.next();
      entrySetMapIterator0.getValue();
      HashMap<String, String> hashMap1 = new HashMap<String, String>();
      Consumer<Object> consumer0 = (Consumer<Object>) mock(Consumer.class, new ViolatedAssumptionAnswer());
      entrySetMapIterator0.forEachRemaining(consumer0);
      EntrySetMapIterator<String, String> entrySetMapIterator1 = new EntrySetMapIterator<String, String>(hashMap1);
      hashMap1.put("4EM*ljw-;GW(P;0", "");
      hashMap1.put(")W[", "");
      // Undeclared exception!
      try { 
        entrySetMapIterator1.setValue("MapIterator[]");
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Iterator setValue() can only be called after next() and before remove()
         //
         verifyException("org.apache.commons.collections4.iterators.EntrySetMapIterator", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      HashMap<Integer, Integer> hashMap0 = new HashMap<Integer, Integer>(3661, 3661);
      EntrySetMapIterator<Integer, Integer> entrySetMapIterator0 = new EntrySetMapIterator<Integer, Integer>(hashMap0);
      Integer integer0 = new Integer(3661);
      Integer integer1 = new Integer(3661);
      hashMap0.put(integer0, integer1);
      entrySetMapIterator0.reset();
      entrySetMapIterator0.next();
      HashMap<AbstractMap.SimpleImmutableEntry<Object, String>, Object> hashMap1 = new HashMap<AbstractMap.SimpleImmutableEntry<Object, String>, Object>();
      EntrySetMapIterator<AbstractMap.SimpleImmutableEntry<Object, String>, Object> entrySetMapIterator1 = new EntrySetMapIterator<AbstractMap.SimpleImmutableEntry<Object, String>, Object>(hashMap1);
      // Undeclared exception!
      try { 
        entrySetMapIterator1.setValue(entrySetMapIterator0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Iterator setValue() can only be called after next() and before remove()
         //
         verifyException("org.apache.commons.collections4.iterators.EntrySetMapIterator", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      HashMap<Object, AbstractMap.SimpleEntry<String, String>> hashMap0 = new HashMap<Object, AbstractMap.SimpleEntry<String, String>>();
      EntrySetMapIterator<Object, AbstractMap.SimpleEntry<String, String>> entrySetMapIterator0 = new EntrySetMapIterator<Object, AbstractMap.SimpleEntry<String, String>>(hashMap0);
      // Undeclared exception!
      try { 
        entrySetMapIterator0.getKey();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Iterator getKey() can only be called after next() and before remove()
         //
         verifyException("org.apache.commons.collections4.iterators.EntrySetMapIterator", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      HashMap<Object, Object> hashMap0 = new HashMap<Object, Object>();
      EntrySetMapIterator<Object, Object> entrySetMapIterator0 = new EntrySetMapIterator<Object, Object>(hashMap0);
      HashMap<AbstractMap.SimpleImmutableEntry<String, Object>, Object> hashMap1 = new HashMap<AbstractMap.SimpleImmutableEntry<String, Object>, Object>();
      EntrySetMapIterator<AbstractMap.SimpleImmutableEntry<String, Object>, Object> entrySetMapIterator1 = new EntrySetMapIterator<AbstractMap.SimpleImmutableEntry<String, Object>, Object>(hashMap1);
      // Undeclared exception!
      try { 
        entrySetMapIterator1.getValue();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Iterator getValue() can only be called after next() and before remove()
         //
         verifyException("org.apache.commons.collections4.iterators.EntrySetMapIterator", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      HashMap<AbstractMap.SimpleEntry<Object, Object>, String> hashMap0 = new HashMap<AbstractMap.SimpleEntry<Object, Object>, String>();
      EntrySetMapIterator<AbstractMap.SimpleEntry<Object, Object>, String> entrySetMapIterator0 = new EntrySetMapIterator<AbstractMap.SimpleEntry<Object, Object>, String>(hashMap0);
      // Undeclared exception!
      try { 
        entrySetMapIterator0.getKey();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Iterator getKey() can only be called after next() and before remove()
         //
         verifyException("org.apache.commons.collections4.iterators.EntrySetMapIterator", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      EntrySetMapIterator<String, Object> entrySetMapIterator0 = new EntrySetMapIterator<String, Object>(hashMap0);
      // Undeclared exception!
      try { 
        entrySetMapIterator0.getValue();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Iterator getValue() can only be called after next() and before remove()
         //
         verifyException("org.apache.commons.collections4.iterators.EntrySetMapIterator", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      EntrySetMapIterator<String, Object> entrySetMapIterator0 = new EntrySetMapIterator<String, Object>(hashMap0);
      entrySetMapIterator0.hasNext();
      HashMap<String, Integer> hashMap1 = new HashMap<String, Integer>();
      HashMap<String, Integer> hashMap2 = new HashMap<String, Integer>(hashMap1);
      String string0 = "]";
      Integer integer0 = new Integer(0);
      hashMap2.putIfAbsent("]", integer0);
      EntrySetMapIterator<String, Integer> entrySetMapIterator1 = new EntrySetMapIterator<String, Integer>(hashMap2);
      entrySetMapIterator1.hasNext();
      HashMap<Object, Integer> hashMap3 = new HashMap<Object, Integer>();
      EntrySetMapIterator<Object, Integer> entrySetMapIterator2 = new EntrySetMapIterator<Object, Integer>(hashMap3);
      // Undeclared exception!
      try { 
        entrySetMapIterator2.remove();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Iterator remove() can only be called once after next()
         //
         verifyException("org.apache.commons.collections4.iterators.EntrySetMapIterator", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      HashMap<Integer, Object> hashMap0 = new HashMap<Integer, Object>();
      EntrySetMapIterator<Integer, Object> entrySetMapIterator0 = new EntrySetMapIterator<Integer, Object>(hashMap0);
      entrySetMapIterator0.hasNext();
      HashMap<AbstractMap.SimpleImmutableEntry<Object, Object>, Integer> hashMap1 = new HashMap<AbstractMap.SimpleImmutableEntry<Object, Object>, Integer>();
      EntrySetMapIterator<AbstractMap.SimpleImmutableEntry<Object, Object>, Integer> entrySetMapIterator1 = new EntrySetMapIterator<AbstractMap.SimpleImmutableEntry<Object, Object>, Integer>(hashMap1);
      Integer integer0 = new Integer((-174));
      // Undeclared exception!
      try { 
        entrySetMapIterator1.setValue(integer0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Iterator setValue() can only be called after next() and before remove()
         //
         verifyException("org.apache.commons.collections4.iterators.EntrySetMapIterator", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      HashMap<AbstractMap.SimpleImmutableEntry<String, Integer>, Integer> hashMap0 = new HashMap<AbstractMap.SimpleImmutableEntry<String, Integer>, Integer>();
      EntrySetMapIterator<AbstractMap.SimpleImmutableEntry<String, Integer>, Integer> entrySetMapIterator0 = new EntrySetMapIterator<AbstractMap.SimpleImmutableEntry<String, Integer>, Integer>(hashMap0);
      Consumer<Object> consumer0 = (Consumer<Object>) mock(Consumer.class, new ViolatedAssumptionAnswer());
      entrySetMapIterator0.forEachRemaining(consumer0);
      entrySetMapIterator0.toString();
      HashMap<String, String> hashMap1 = new HashMap<String, String>();
      EntrySetMapIterator<String, String> entrySetMapIterator1 = new EntrySetMapIterator<String, String>(hashMap1);
      // Undeclared exception!
      try { 
        entrySetMapIterator1.next();
        fail("Expecting exception: NoSuchElementException");
      
      } catch(NoSuchElementException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.HashMap$HashIterator", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      HashMap<AbstractMap.SimpleEntry<Object, Object>, Integer> hashMap0 = new HashMap<AbstractMap.SimpleEntry<Object, Object>, Integer>();
      EntrySetMapIterator<AbstractMap.SimpleEntry<Object, Object>, Integer> entrySetMapIterator0 = new EntrySetMapIterator<AbstractMap.SimpleEntry<Object, Object>, Integer>(hashMap0);
      entrySetMapIterator0.reset();
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      EntrySetMapIterator<String, Object> entrySetMapIterator0 = new EntrySetMapIterator<String, Object>(hashMap0);
      // Undeclared exception!
      try { 
        entrySetMapIterator0.remove();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Iterator remove() can only be called once after next()
         //
         verifyException("org.apache.commons.collections4.iterators.EntrySetMapIterator", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      HashMap<AbstractMap.SimpleEntry<String, Object>, String> hashMap0 = new HashMap<AbstractMap.SimpleEntry<String, Object>, String>();
      EntrySetMapIterator<AbstractMap.SimpleEntry<String, Object>, String> entrySetMapIterator0 = new EntrySetMapIterator<AbstractMap.SimpleEntry<String, Object>, String>(hashMap0);
      // Undeclared exception!
      try { 
        entrySetMapIterator0.setValue("");
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Iterator setValue() can only be called after next() and before remove()
         //
         verifyException("org.apache.commons.collections4.iterators.EntrySetMapIterator", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      HashMap<Object, AbstractMap.SimpleEntry<String, Object>> hashMap0 = new HashMap<Object, AbstractMap.SimpleEntry<String, Object>>();
      EntrySetMapIterator<Object, AbstractMap.SimpleEntry<String, Object>> entrySetMapIterator0 = new EntrySetMapIterator<Object, AbstractMap.SimpleEntry<String, Object>>(hashMap0);
      String string0 = entrySetMapIterator0.toString();
      assertEquals("MapIterator[]", string0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      HashMap<Integer, Object> hashMap0 = new HashMap<Integer, Object>();
      HashMap<Integer, Object> hashMap1 = new HashMap<Integer, Object>(hashMap0);
      EntrySetMapIterator<Integer, Object> entrySetMapIterator0 = new EntrySetMapIterator<Integer, Object>(hashMap1);
      // Undeclared exception!
      try { 
        entrySetMapIterator0.next();
        fail("Expecting exception: NoSuchElementException");
      
      } catch(NoSuchElementException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.HashMap$HashIterator", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      HashMap<AbstractMap.SimpleImmutableEntry<Object, Object>, Integer> hashMap0 = new HashMap<AbstractMap.SimpleImmutableEntry<Object, Object>, Integer>();
      EntrySetMapIterator<AbstractMap.SimpleImmutableEntry<Object, Object>, Integer> entrySetMapIterator0 = new EntrySetMapIterator<AbstractMap.SimpleImmutableEntry<Object, Object>, Integer>(hashMap0);
      boolean boolean0 = entrySetMapIterator0.hasNext();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      hashMap0.put("zwCCHv7A?_NT+mvz^}", "zwCCHv7A?_NT+mvz^}");
      String string0 = null;
      EntrySetMapIterator<String, Integer> entrySetMapIterator0 = null;
      try {
        entrySetMapIterator0 = new EntrySetMapIterator<String, Integer>((Map<String, Integer>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.collections4.iterators.EntrySetMapIterator", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      HashMap<String, AbstractMap.SimpleImmutableEntry<String, Object>> hashMap0 = new HashMap<String, AbstractMap.SimpleImmutableEntry<String, Object>>();
      AbstractMap.SimpleImmutableEntry<String, String> abstractMap_SimpleImmutableEntry0 = new AbstractMap.SimpleImmutableEntry<String, String>("W}BLE!", "W}BLE!");
      AbstractMap.SimpleEntry<String, String> abstractMap_SimpleEntry0 = new AbstractMap.SimpleEntry<String, String>(abstractMap_SimpleImmutableEntry0);
      AbstractMap.SimpleImmutableEntry<String, Object> abstractMap_SimpleImmutableEntry1 = new AbstractMap.SimpleImmutableEntry<String, Object>(abstractMap_SimpleEntry0);
      hashMap0.put("W}BLE!", abstractMap_SimpleImmutableEntry1);
      EntrySetMapIterator<String, AbstractMap.SimpleImmutableEntry<String, Object>> entrySetMapIterator0 = new EntrySetMapIterator<String, AbstractMap.SimpleImmutableEntry<String, Object>>(hashMap0);
      Consumer<String> consumer0 = (Consumer<String>) mock(Consumer.class, new ViolatedAssumptionAnswer());
      entrySetMapIterator0.forEachRemaining(consumer0);
      entrySetMapIterator0.setValue(abstractMap_SimpleImmutableEntry1);
      entrySetMapIterator0.remove();
      HashMap<AbstractMap.SimpleEntry<Object, String>, String> hashMap1 = new HashMap<AbstractMap.SimpleEntry<Object, String>, String>();
      EntrySetMapIterator<AbstractMap.SimpleEntry<Object, String>, String> entrySetMapIterator1 = new EntrySetMapIterator<AbstractMap.SimpleEntry<Object, String>, String>(hashMap1);
      // Undeclared exception!
      try { 
        entrySetMapIterator1.remove();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Iterator remove() can only be called once after next()
         //
         verifyException("org.apache.commons.collections4.iterators.EntrySetMapIterator", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      HashMap<Integer, Object> hashMap0 = new HashMap<Integer, Object>();
      Integer integer0 = new Integer((-814));
      hashMap0.put(integer0, (Object) null);
      EntrySetMapIterator<Integer, Object> entrySetMapIterator0 = new EntrySetMapIterator<Integer, Object>(hashMap0);
      entrySetMapIterator0.hasNext();
      entrySetMapIterator0.next();
      entrySetMapIterator0.toString();
      entrySetMapIterator0.reset();
      HashMap<Object, Object> hashMap1 = new HashMap<Object, Object>();
      HashMap<AbstractMap.SimpleEntry<Object, Object>, Object> hashMap2 = new HashMap<AbstractMap.SimpleEntry<Object, Object>, Object>();
      EntrySetMapIterator<AbstractMap.SimpleEntry<Object, Object>, Object> entrySetMapIterator1 = new EntrySetMapIterator<AbstractMap.SimpleEntry<Object, Object>, Object>(hashMap2);
      // Undeclared exception!
      try { 
        entrySetMapIterator1.setValue("MapIterator[-814=null]");
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Iterator setValue() can only be called after next() and before remove()
         //
         verifyException("org.apache.commons.collections4.iterators.EntrySetMapIterator", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      HashMap<Object, String> hashMap0 = new HashMap<Object, String>();
      EntrySetMapIterator<Object, String> entrySetMapIterator0 = new EntrySetMapIterator<Object, String>(hashMap0);
      entrySetMapIterator0.toString();
      // Undeclared exception!
      try { 
        entrySetMapIterator0.getKey();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Iterator getKey() can only be called after next() and before remove()
         //
         verifyException("org.apache.commons.collections4.iterators.EntrySetMapIterator", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      HashMap<Object, String> hashMap0 = new HashMap<Object, String>();
      EntrySetMapIterator<Object, String> entrySetMapIterator0 = new EntrySetMapIterator<Object, String>(hashMap0);
      // Undeclared exception!
      try { 
        entrySetMapIterator0.getValue();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Iterator getValue() can only be called after next() and before remove()
         //
         verifyException("org.apache.commons.collections4.iterators.EntrySetMapIterator", e);
      }
  }
}