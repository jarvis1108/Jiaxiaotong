/*
 * This file was automatically generated by EvoSuite
 * Sat Apr 27 03:08:20 GMT 2019
 */

package org.apache.commons.collections4.multimap;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileDescriptor;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PushbackInputStream;
import java.util.AbstractMap;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Set;
import java.util.TreeSet;
import java.util.Vector;
import org.apache.commons.collections4.MapIterator;
import org.apache.commons.collections4.MultiSet;
import org.apache.commons.collections4.MultiValuedMap;
import org.apache.commons.collections4.Predicate;
import org.apache.commons.collections4.Transformer;
import org.apache.commons.collections4.functors.AllPredicate;
import org.apache.commons.collections4.functors.ComparatorPredicate;
import org.apache.commons.collections4.functors.ConstantTransformer;
import org.apache.commons.collections4.functors.MapTransformer;
import org.apache.commons.collections4.functors.NullIsTruePredicate;
import org.apache.commons.collections4.functors.NullPredicate;
import org.apache.commons.collections4.functors.OnePredicate;
import org.apache.commons.collections4.functors.PredicateTransformer;
import org.apache.commons.collections4.functors.UniquePredicate;
import org.apache.commons.collections4.multimap.AbstractMultiValuedMap;
import org.apache.commons.collections4.multimap.ArrayListValuedHashMap;
import org.apache.commons.collections4.multimap.HashSetValuedHashMap;
import org.apache.commons.collections4.multimap.TransformedMultiValuedMap;
import org.apache.commons.collections4.multimap.UnmodifiableMultiValuedMap;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.mock.java.io.MockFileInputStream;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class AbstractMultiValuedMap_ESTest extends AbstractMultiValuedMap_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      ArrayListValuedHashMap<Integer, Integer> arrayListValuedHashMap0 = new ArrayListValuedHashMap<Integer, Integer>(0);
      HashMap<Integer, Integer> hashMap0 = new HashMap<Integer, Integer>();
      Integer integer0 = new Integer(1087);
      Integer integer1 = hashMap0.put(integer0, integer0);
      hashMap0.put(integer1, integer1);
      boolean boolean0 = arrayListValuedHashMap0.putAll((Map<? extends Integer, ? extends Integer>) hashMap0);
      assertFalse(arrayListValuedHashMap0.isEmpty());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      HashMap<Predicate<Object>, Integer> hashMap0 = new HashMap<Predicate<Object>, Integer>();
      HashSetValuedHashMap<Predicate<Object>, Integer> hashSetValuedHashMap0 = new HashSetValuedHashMap<Predicate<Object>, Integer>(hashMap0);
      Predicate<Object> predicate0 = UniquePredicate.uniquePredicate();
      AbstractMultiValuedMap.WrappedCollection abstractMultiValuedMap_WrappedCollection0 = hashSetValuedHashMap0.new WrappedCollection(predicate0);
      PriorityQueue<Integer> priorityQueue0 = new PriorityQueue<Integer>();
      boolean boolean0 = abstractMultiValuedMap_WrappedCollection0.addAll(priorityQueue0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      HashMap<String, Predicate<Object>> hashMap0 = new HashMap<String, Predicate<Object>>();
      ArrayListValuedHashMap<String, Predicate<Object>> arrayListValuedHashMap0 = new ArrayListValuedHashMap<String, Predicate<Object>>(hashMap0);
      AbstractMultiValuedMap.WrappedCollection abstractMultiValuedMap_WrappedCollection0 = arrayListValuedHashMap0.new WrappedCollection("");
      Object[] objectArray0 = abstractMultiValuedMap_WrappedCollection0.toArray();
      assertEquals(0, objectArray0.length);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      HashSetValuedHashMap<AbstractMap.SimpleEntry<Integer, String>, ArrayListValuedHashMap<String, Integer>> hashSetValuedHashMap0 = new HashSetValuedHashMap<AbstractMap.SimpleEntry<Integer, String>, ArrayListValuedHashMap<String, Integer>>(200);
      AbstractMultiValuedMap.WrappedCollection abstractMultiValuedMap_WrappedCollection0 = hashSetValuedHashMap0.new WrappedCollection((AbstractMap.SimpleEntry<Integer, String>) null);
      Collection<ArrayListValuedHashMap<String, Integer>> collection0 = abstractMultiValuedMap_WrappedCollection0.getMapping();
      assertNull(collection0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ArrayListValuedHashMap<LinkedList<Object>, Object> arrayListValuedHashMap0 = new ArrayListValuedHashMap<LinkedList<Object>, Object>();
      Set<LinkedList<Object>> set0 = arrayListValuedHashMap0.keySet();
      assertTrue(set0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ArrayListValuedHashMap<Object, Predicate<Object>> arrayListValuedHashMap0 = new ArrayListValuedHashMap<Object, Predicate<Object>>();
      arrayListValuedHashMap0.clear();
      assertTrue(arrayListValuedHashMap0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      HashMap<BufferedInputStream, Boolean> hashMap0 = new HashMap<BufferedInputStream, Boolean>(1256);
      HashSetValuedHashMap<InputStream, Boolean> hashSetValuedHashMap0 = new HashSetValuedHashMap<InputStream, Boolean>(hashMap0);
      Collection<Boolean> collection0 = hashSetValuedHashMap0.wrappedCollection((InputStream) null);
      assertNotNull(collection0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Object object0 = new Object();
      HashSetValuedHashMap<TransformedMultiValuedMap<String, Object>, Collection<Collection<AbstractMap.SimpleImmutableEntry<Boolean, LinkedList<Object>>>>> hashSetValuedHashMap0 = new HashSetValuedHashMap<TransformedMultiValuedMap<String, Object>, Collection<Collection<AbstractMap.SimpleImmutableEntry<Boolean, LinkedList<Object>>>>>(631, (-784));
      Collection<Collection<Collection<AbstractMap.SimpleImmutableEntry<Boolean, LinkedList<Object>>>>> collection0 = hashSetValuedHashMap0.remove(object0);
      assertNotNull(collection0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ArrayListValuedHashMap<Predicate<Integer>, Predicate<Object>> arrayListValuedHashMap0 = new ArrayListValuedHashMap<Predicate<Integer>, Predicate<Object>>(1256, 1);
      Map<Predicate<Integer>, ? extends Collection<Predicate<Object>>> map0 = arrayListValuedHashMap0.getMap();
      assertEquals(0, map0.size());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      HashSetValuedHashMap<Boolean, Collection<AbstractMap.SimpleImmutableEntry<Boolean, LinkedList<Object>>>> hashSetValuedHashMap0 = new HashSetValuedHashMap<Boolean, Collection<AbstractMap.SimpleImmutableEntry<Boolean, LinkedList<Object>>>>((-1));
      Predicate<Object> predicate0 = UniquePredicate.uniquePredicate();
      PredicateTransformer<LinkedList<Integer>> predicateTransformer0 = new PredicateTransformer<LinkedList<Integer>>(predicate0);
      Boolean boolean0 = predicateTransformer0.transform((LinkedList<Integer>) null);
      Collection<Collection<AbstractMap.SimpleImmutableEntry<Boolean, LinkedList<Object>>>> collection0 = hashSetValuedHashMap0.get(boolean0);
      assertNotNull(collection0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ArrayListValuedHashMap<LinkedList<Boolean>, Collection<AbstractMap.SimpleImmutableEntry<Boolean, LinkedList<Object>>>> arrayListValuedHashMap0 = new ArrayListValuedHashMap<LinkedList<Boolean>, Collection<AbstractMap.SimpleImmutableEntry<Boolean, LinkedList<Object>>>>(0, 0);
      // Undeclared exception!
      try { 
        arrayListValuedHashMap0.doWriteObject((ObjectOutputStream) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.collections4.multimap.AbstractMultiValuedMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      HashSetValuedHashMap<TransformedMultiValuedMap<Integer, Object>, Object> hashSetValuedHashMap0 = new HashSetValuedHashMap<TransformedMultiValuedMap<Integer, Object>, Object>();
      // Undeclared exception!
      try { 
        hashSetValuedHashMap0.doReadObject((ObjectInputStream) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.collections4.multimap.AbstractMultiValuedMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      HashMap<BufferedInputStream, Boolean> hashMap0 = new HashMap<BufferedInputStream, Boolean>(1256);
      HashSetValuedHashMap<InputStream, Boolean> hashSetValuedHashMap0 = new HashSetValuedHashMap<InputStream, Boolean>(hashMap0);
      boolean boolean0 = hashSetValuedHashMap0.putAll((Map<? extends InputStream, ? extends Boolean>) hashMap0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      ArrayListValuedHashMap<LinkedList<Object>, Object> arrayListValuedHashMap0 = new ArrayListValuedHashMap<LinkedList<Object>, Object>();
      LinkedList<Object> linkedList0 = new LinkedList<Object>();
      boolean boolean0 = arrayListValuedHashMap0.put(linkedList0, linkedList0);
      assertFalse(arrayListValuedHashMap0.isEmpty());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      HashSetValuedHashMap<TransformedMultiValuedMap<String, Object>, Collection<Collection<AbstractMap.SimpleImmutableEntry<Boolean, LinkedList<Object>>>>> hashSetValuedHashMap0 = new HashSetValuedHashMap<TransformedMultiValuedMap<String, Object>, Collection<Collection<AbstractMap.SimpleImmutableEntry<Boolean, LinkedList<Object>>>>>(631, (-784));
      ArrayListValuedHashMap<String, String> arrayListValuedHashMap0 = new ArrayListValuedHashMap<String, String>();
      ArrayListValuedHashMap<String, Object> arrayListValuedHashMap1 = new ArrayListValuedHashMap<String, Object>(arrayListValuedHashMap0);
      ConstantTransformer<Object, String> constantTransformer0 = new ConstantTransformer<Object, String>("Qz p7<M");
      TransformedMultiValuedMap<String, Object> transformedMultiValuedMap0 = new TransformedMultiValuedMap<String, Object>(arrayListValuedHashMap1, constantTransformer0, constantTransformer0);
      // Undeclared exception!
      try { 
        hashSetValuedHashMap0.put(transformedMultiValuedMap0, (Collection<Collection<AbstractMap.SimpleImmutableEntry<Boolean, LinkedList<Object>>>>) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal initial capacity: -784
         //
         verifyException("java.util.HashMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      ArrayListValuedHashMap<Boolean, LinkedList<Boolean>> arrayListValuedHashMap0 = new ArrayListValuedHashMap<Boolean, LinkedList<Boolean>>();
      Collection<LinkedList<Boolean>> collection0 = arrayListValuedHashMap0.values();
      assertNotNull(collection0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      HashSetValuedHashMap<AbstractMap.SimpleEntry<Object, String>, TransformedMultiValuedMap<Object, Object>> hashSetValuedHashMap0 = new HashSetValuedHashMap<AbstractMap.SimpleEntry<Object, String>, TransformedMultiValuedMap<Object, Object>>(4);
      int int0 = hashSetValuedHashMap0.size();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      ArrayListValuedHashMap<TransformedMultiValuedMap<Boolean, Integer>, HashSetValuedHashMap<Object, BufferedInputStream>> arrayListValuedHashMap0 = new ArrayListValuedHashMap<TransformedMultiValuedMap<Boolean, Integer>, HashSetValuedHashMap<Object, BufferedInputStream>>(1080);
      Collection<Map.Entry<TransformedMultiValuedMap<Boolean, Integer>, HashSetValuedHashMap<Object, BufferedInputStream>>> collection0 = (Collection<Map.Entry<TransformedMultiValuedMap<Boolean, Integer>, HashSetValuedHashMap<Object, BufferedInputStream>>>)arrayListValuedHashMap0.entries();
      Collection<Map.Entry<TransformedMultiValuedMap<Boolean, Integer>, HashSetValuedHashMap<Object, BufferedInputStream>>> collection1 = (Collection<Map.Entry<TransformedMultiValuedMap<Boolean, Integer>, HashSetValuedHashMap<Object, BufferedInputStream>>>)arrayListValuedHashMap0.entries();
      assertSame(collection1, collection0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      HashSetValuedHashMap<String, Object> hashSetValuedHashMap0 = new HashSetValuedHashMap<String, Object>(hashMap0);
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
      HashMap<String, Collection<AbstractMap.SimpleImmutableEntry<Boolean, LinkedList<Object>>>> hashMap1 = new HashMap<String, Collection<AbstractMap.SimpleImmutableEntry<Boolean, LinkedList<Object>>>>();
      ArrayDeque<AbstractMap.SimpleImmutableEntry<Boolean, LinkedList<Object>>> arrayDeque0 = new ArrayDeque<AbstractMap.SimpleImmutableEntry<Boolean, LinkedList<Object>>>();
      hashMap1.put((String) null, arrayDeque0);
      ArrayListValuedHashMap<String, Collection<AbstractMap.SimpleImmutableEntry<Boolean, LinkedList<Object>>>> arrayListValuedHashMap0 = new ArrayListValuedHashMap<String, Collection<AbstractMap.SimpleImmutableEntry<Boolean, LinkedList<Object>>>>(hashMap1);
      hashSetValuedHashMap0.putAll((MultiValuedMap<? extends String, ?>) arrayListValuedHashMap0);
      ObjectOutputStream objectOutputStream0 = new ObjectOutputStream(byteArrayOutputStream0);
      hashSetValuedHashMap0.doWriteObject(objectOutputStream0);
      assertFalse(hashSetValuedHashMap0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      HashSetValuedHashMap<Predicate<Object>, Boolean> hashSetValuedHashMap0 = new HashSetValuedHashMap<Predicate<Object>, Boolean>(1107);
      Vector<Predicate<Object>> vector0 = new Vector<Predicate<Object>>();
      Predicate<Object> predicate0 = AllPredicate.allPredicate((Collection<? extends Predicate<? super Object>>) vector0);
      AbstractMultiValuedMap.WrappedCollection abstractMultiValuedMap_WrappedCollection0 = hashSetValuedHashMap0.new WrappedCollection(predicate0);
      PredicateTransformer<LinkedList<Integer>> predicateTransformer0 = new PredicateTransformer<LinkedList<Integer>>(predicate0);
      LinkedList<Integer> linkedList0 = new LinkedList<Integer>();
      Boolean boolean0 = predicateTransformer0.transform(linkedList0);
      abstractMultiValuedMap_WrappedCollection0.add(boolean0);
      HashSetValuedHashMap<Boolean, Predicate<Object>> hashSetValuedHashMap1 = new HashSetValuedHashMap<Boolean, Predicate<Object>>();
      boolean boolean1 = hashSetValuedHashMap1.equals(hashSetValuedHashMap0);
      assertFalse(boolean1);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      ArrayListValuedHashMap<Transformer<Object, LinkedList<Object>>, LinkedList<BufferedInputStream>> arrayListValuedHashMap0 = new ArrayListValuedHashMap<Transformer<Object, LinkedList<Object>>, LinkedList<BufferedInputStream>>(0, 1507);
      HashMap<Object, LinkedList<Object>> hashMap0 = new HashMap<Object, LinkedList<Object>>();
      Transformer<Object, LinkedList<Object>> transformer0 = MapTransformer.mapTransformer((Map<? super Object, ? extends LinkedList<Object>>) hashMap0);
      AbstractMultiValuedMap.WrappedCollection abstractMultiValuedMap_WrappedCollection0 = arrayListValuedHashMap0.new WrappedCollection(transformer0);
      String[] stringArray0 = new String[7];
      LinkedList<BufferedInputStream> linkedList0 = new LinkedList<BufferedInputStream>();
      abstractMultiValuedMap_WrappedCollection0.add(linkedList0);
      // Undeclared exception!
      try { 
        abstractMultiValuedMap_WrappedCollection0.toArray(stringArray0);
        fail("Expecting exception: ArrayStoreException");
      
      } catch(ArrayStoreException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      ArrayListValuedHashMap<Integer, Transformer<Object, LinkedList<Object>>> arrayListValuedHashMap0 = new ArrayListValuedHashMap<Integer, Transformer<Object, LinkedList<Object>>>();
      UnmodifiableMultiValuedMap<Integer, Transformer<Object, LinkedList<Object>>> unmodifiableMultiValuedMap0 = UnmodifiableMultiValuedMap.unmodifiableMultiValuedMap((MultiValuedMap<? extends Integer, ? extends Transformer<Object, LinkedList<Object>>>) arrayListValuedHashMap0);
      HashSetValuedHashMap<Integer, Transformer<Object, LinkedList<Object>>> hashSetValuedHashMap0 = new HashSetValuedHashMap<Integer, Transformer<Object, LinkedList<Object>>>(unmodifiableMultiValuedMap0);
      Integer integer0 = new Integer(0);
      AbstractMultiValuedMap.WrappedCollection abstractMultiValuedMap_WrappedCollection0 = hashSetValuedHashMap0.new WrappedCollection(integer0);
      TreeSet<Boolean> treeSet0 = new TreeSet<Boolean>();
      boolean boolean0 = abstractMultiValuedMap_WrappedCollection0.retainAll(treeSet0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      ArrayListValuedHashMap<OnePredicate<Object>, Integer> arrayListValuedHashMap0 = new ArrayListValuedHashMap<OnePredicate<Object>, Integer>(521);
      OnePredicate<Object> onePredicate0 = new OnePredicate<Object>((Predicate<? super Object>[]) null);
      AbstractMultiValuedMap.WrappedCollection abstractMultiValuedMap_WrappedCollection0 = arrayListValuedHashMap0.new WrappedCollection(onePredicate0);
      Vector<Collection<AbstractMap.SimpleImmutableEntry<Boolean, LinkedList<Object>>>> vector0 = new Vector<Collection<AbstractMap.SimpleImmutableEntry<Boolean, LinkedList<Object>>>>();
      boolean boolean0 = abstractMultiValuedMap_WrappedCollection0.removeAll(vector0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      ArrayListValuedHashMap<String, Collection<AbstractMap.SimpleImmutableEntry<Boolean, LinkedList<Object>>>> arrayListValuedHashMap0 = new ArrayListValuedHashMap<String, Collection<AbstractMap.SimpleImmutableEntry<Boolean, LinkedList<Object>>>>();
      AbstractMultiValuedMap.WrappedCollection abstractMultiValuedMap_WrappedCollection0 = arrayListValuedHashMap0.new WrappedCollection("(/l]{=L");
      HashSet<AbstractMap.SimpleImmutableEntry<Boolean, LinkedList<Object>>> hashSet0 = new HashSet<AbstractMap.SimpleImmutableEntry<Boolean, LinkedList<Object>>>();
      abstractMultiValuedMap_WrappedCollection0.add(hashSet0);
      ArrayDeque<Object> arrayDeque0 = new ArrayDeque<Object>();
      boolean boolean0 = abstractMultiValuedMap_WrappedCollection0.removeAll(arrayDeque0);
      assertFalse(abstractMultiValuedMap_WrappedCollection0.isEmpty());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      ArrayListValuedHashMap<Integer, LinkedList<Object>> arrayListValuedHashMap0 = new ArrayListValuedHashMap<Integer, LinkedList<Object>>();
      Integer integer0 = new Integer(3);
      AbstractMultiValuedMap.WrappedCollection abstractMultiValuedMap_WrappedCollection0 = arrayListValuedHashMap0.new WrappedCollection(integer0);
      boolean boolean0 = abstractMultiValuedMap_WrappedCollection0.remove(arrayListValuedHashMap0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      ArrayListValuedHashMap<HashSetValuedHashMap<String, BufferedInputStream>, ArrayListValuedHashMap<InputStream, Integer>> arrayListValuedHashMap0 = new ArrayListValuedHashMap<HashSetValuedHashMap<String, BufferedInputStream>, ArrayListValuedHashMap<InputStream, Integer>>(0, 0);
      HashSetValuedHashMap<String, BufferedInputStream> hashSetValuedHashMap0 = new HashSetValuedHashMap<String, BufferedInputStream>(0);
      AbstractMultiValuedMap.WrappedCollection abstractMultiValuedMap_WrappedCollection0 = arrayListValuedHashMap0.new WrappedCollection(hashSetValuedHashMap0);
      boolean boolean0 = abstractMultiValuedMap_WrappedCollection0.isEmpty();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      ArrayListValuedHashMap<Integer, Integer> arrayListValuedHashMap0 = new ArrayListValuedHashMap<Integer, Integer>(0);
      Integer integer0 = new Integer((-79));
      AbstractMultiValuedMap.WrappedCollection abstractMultiValuedMap_WrappedCollection0 = arrayListValuedHashMap0.new WrappedCollection(integer0);
      ArrayList<String> arrayList0 = new ArrayList<String>(0);
      boolean boolean0 = abstractMultiValuedMap_WrappedCollection0.containsAll(arrayList0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      HashMap<Integer, Predicate<Object>> hashMap0 = new HashMap<Integer, Predicate<Object>>();
      HashSetValuedHashMap<Integer, Predicate<Object>> hashSetValuedHashMap0 = new HashSetValuedHashMap<Integer, Predicate<Object>>(hashMap0);
      Integer integer0 = new Integer((-1));
      AbstractMultiValuedMap.WrappedCollection abstractMultiValuedMap_WrappedCollection0 = hashSetValuedHashMap0.new WrappedCollection(integer0);
      boolean boolean0 = abstractMultiValuedMap_WrappedCollection0.contains(integer0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Predicate<Object> predicate0 = UniquePredicate.uniquePredicate();
      HashMap<Integer, Predicate<Object>> hashMap0 = new HashMap<Integer, Predicate<Object>>();
      HashSetValuedHashMap<Integer, Predicate<Object>> hashSetValuedHashMap0 = new HashSetValuedHashMap<Integer, Predicate<Object>>(hashMap0);
      Integer integer0 = new Integer((-1));
      AbstractMultiValuedMap.WrappedCollection abstractMultiValuedMap_WrappedCollection0 = hashSetValuedHashMap0.new WrappedCollection(integer0);
      abstractMultiValuedMap_WrappedCollection0.add(predicate0);
      boolean boolean0 = abstractMultiValuedMap_WrappedCollection0.contains(integer0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      HashSetValuedHashMap<Predicate<Object>, Boolean> hashSetValuedHashMap0 = new HashSetValuedHashMap<Predicate<Object>, Boolean>(1107);
      Vector<Predicate<Object>> vector0 = new Vector<Predicate<Object>>();
      Predicate<Object> predicate0 = AllPredicate.allPredicate((Collection<? extends Predicate<? super Object>>) vector0);
      AbstractMultiValuedMap.WrappedCollection abstractMultiValuedMap_WrappedCollection0 = hashSetValuedHashMap0.new WrappedCollection(predicate0);
      int int0 = abstractMultiValuedMap_WrappedCollection0.size();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      HashSetValuedHashMap<Predicate<Object>, Boolean> hashSetValuedHashMap0 = new HashSetValuedHashMap<Predicate<Object>, Boolean>(1107);
      Vector<Predicate<Object>> vector0 = new Vector<Predicate<Object>>();
      Predicate<Object> predicate0 = AllPredicate.allPredicate((Collection<? extends Predicate<? super Object>>) vector0);
      AbstractMultiValuedMap.WrappedCollection abstractMultiValuedMap_WrappedCollection0 = hashSetValuedHashMap0.new WrappedCollection(predicate0);
      PredicateTransformer<LinkedList<Integer>> predicateTransformer0 = new PredicateTransformer<LinkedList<Integer>>(predicate0);
      LinkedList<Integer> linkedList0 = new LinkedList<Integer>();
      Boolean boolean0 = predicateTransformer0.transform(linkedList0);
      abstractMultiValuedMap_WrappedCollection0.add(boolean0);
      int int0 = abstractMultiValuedMap_WrappedCollection0.size();
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      HashMap<ArrayListValuedHashMap<Object, Integer>, Collection<AbstractMap.SimpleImmutableEntry<Boolean, LinkedList<Object>>>> hashMap0 = new HashMap<ArrayListValuedHashMap<Object, Integer>, Collection<AbstractMap.SimpleImmutableEntry<Boolean, LinkedList<Object>>>>();
      HashSetValuedHashMap<ArrayListValuedHashMap<Object, Integer>, Collection<AbstractMap.SimpleImmutableEntry<Boolean, LinkedList<Object>>>> hashSetValuedHashMap0 = new HashSetValuedHashMap<ArrayListValuedHashMap<Object, Integer>, Collection<AbstractMap.SimpleImmutableEntry<Boolean, LinkedList<Object>>>>(hashMap0);
      ArrayListValuedHashMap<Object, Integer> arrayListValuedHashMap0 = new ArrayListValuedHashMap<Object, Integer>();
      AbstractMultiValuedMap.WrappedCollection abstractMultiValuedMap_WrappedCollection0 = hashSetValuedHashMap0.new WrappedCollection(arrayListValuedHashMap0);
      Iterator<Collection<AbstractMap.SimpleImmutableEntry<Boolean, LinkedList<Object>>>> iterator0 = abstractMultiValuedMap_WrappedCollection0.iterator();
      assertNotNull(iterator0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      HashSetValuedHashMap<Predicate<InputStream>, Boolean> hashSetValuedHashMap0 = new HashSetValuedHashMap<Predicate<InputStream>, Boolean>(1, 1);
      FileDescriptor fileDescriptor0 = new FileDescriptor();
      MockFileInputStream mockFileInputStream0 = new MockFileInputStream(fileDescriptor0);
      PushbackInputStream pushbackInputStream0 = new PushbackInputStream(mockFileInputStream0, 1);
      Comparator<InputStream> comparator0 = (Comparator<InputStream>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      ComparatorPredicate.Criterion comparatorPredicate_Criterion0 = ComparatorPredicate.Criterion.LESS_OR_EQUAL;
      ComparatorPredicate<InputStream> comparatorPredicate0 = new ComparatorPredicate<InputStream>(pushbackInputStream0, comparator0, comparatorPredicate_Criterion0);
      AbstractMultiValuedMap.WrappedCollection abstractMultiValuedMap_WrappedCollection0 = hashSetValuedHashMap0.new WrappedCollection(comparatorPredicate0);
      Predicate<Object> predicate0 = NullPredicate.nullPredicate();
      NullIsTruePredicate<Object> nullIsTruePredicate0 = new NullIsTruePredicate<Object>(predicate0);
      PredicateTransformer<LinkedList<Integer>> predicateTransformer0 = new PredicateTransformer<LinkedList<Integer>>(nullIsTruePredicate0);
      LinkedList<Integer> linkedList0 = new LinkedList<Integer>();
      Boolean boolean0 = predicateTransformer0.transform(linkedList0);
      abstractMultiValuedMap_WrappedCollection0.add(boolean0);
      Iterator<Boolean> iterator0 = abstractMultiValuedMap_WrappedCollection0.iterator();
      assertNotNull(iterator0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      HashSetValuedHashMap<String, Boolean> hashSetValuedHashMap0 = new HashSetValuedHashMap<String, Boolean>();
      AbstractMultiValuedMap.WrappedCollection abstractMultiValuedMap_WrappedCollection0 = hashSetValuedHashMap0.new WrappedCollection("h.");
      abstractMultiValuedMap_WrappedCollection0.clear();
      assertTrue(abstractMultiValuedMap_WrappedCollection0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      HashSetValuedHashMap<LinkedList<Object>, Integer> hashSetValuedHashMap0 = new HashSetValuedHashMap<LinkedList<Object>, Integer>((-2960));
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      ArrayListValuedHashMap<String, Object> arrayListValuedHashMap0 = new ArrayListValuedHashMap<String, Object>(hashMap0);
      AbstractMultiValuedMap.WrappedCollection abstractMultiValuedMap_WrappedCollection0 = arrayListValuedHashMap0.new WrappedCollection("%%2");
      abstractMultiValuedMap_WrappedCollection0.add(hashSetValuedHashMap0);
      // Undeclared exception!
      try { 
        abstractMultiValuedMap_WrappedCollection0.addAll((Collection<?>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      ArrayListValuedHashMap<Transformer<Object, LinkedList<Object>>, LinkedList<BufferedInputStream>> arrayListValuedHashMap0 = new ArrayListValuedHashMap<Transformer<Object, LinkedList<Object>>, LinkedList<BufferedInputStream>>(0, 1507);
      HashMap<Object, LinkedList<Object>> hashMap0 = new HashMap<Object, LinkedList<Object>>();
      Transformer<Object, LinkedList<Object>> transformer0 = MapTransformer.mapTransformer((Map<? super Object, ? extends LinkedList<Object>>) hashMap0);
      AbstractMultiValuedMap.WrappedCollection abstractMultiValuedMap_WrappedCollection0 = arrayListValuedHashMap0.new WrappedCollection(transformer0);
      LinkedList<BufferedInputStream> linkedList0 = new LinkedList<BufferedInputStream>();
      boolean boolean0 = abstractMultiValuedMap_WrappedCollection0.add(linkedList0);
      boolean boolean1 = abstractMultiValuedMap_WrappedCollection0.add(linkedList0);
      assertTrue(boolean1 == boolean0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      ArrayListValuedHashMap<LinkedList<Object>, Object> arrayListValuedHashMap0 = new ArrayListValuedHashMap<LinkedList<Object>, Object>();
      Object object0 = new Object();
      boolean boolean0 = arrayListValuedHashMap0.equals(object0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      HashSetValuedHashMap<String, String> hashSetValuedHashMap0 = new HashSetValuedHashMap<String, String>(1);
      MapIterator<String, String> mapIterator0 = hashSetValuedHashMap0.mapIterator();
      assertNotNull(mapIterator0);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      HashSetValuedHashMap<String, LinkedList<Object>> hashSetValuedHashMap0 = new HashSetValuedHashMap<String, LinkedList<Object>>();
      Set<LinkedList<Object>> set0 = hashSetValuedHashMap0.get("+Y$OD>#4`");
      LinkedList<LinkedList<Object>> linkedList0 = new LinkedList<LinkedList<Object>>(set0);
      LinkedList<Object> linkedList1 = new LinkedList<Object>();
      linkedList0.add(linkedList1);
      boolean boolean0 = hashSetValuedHashMap0.putAll("g;b _'Yx''I8Fj", (Iterable<? extends LinkedList<Object>>) linkedList0);
      assertFalse(hashSetValuedHashMap0.isEmpty());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      ArrayListValuedHashMap<AbstractMap.SimpleImmutableEntry<String, Object>, Boolean> arrayListValuedHashMap0 = new ArrayListValuedHashMap<AbstractMap.SimpleImmutableEntry<String, Object>, Boolean>(909);
      AbstractMap.SimpleImmutableEntry<String, Object> abstractMap_SimpleImmutableEntry0 = new AbstractMap.SimpleImmutableEntry<String, Object>("}k&O})?yu#=Ot", arrayListValuedHashMap0);
      // Undeclared exception!
      try { 
        arrayListValuedHashMap0.putAll(abstractMap_SimpleImmutableEntry0, (Iterable<? extends Boolean>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // Values must not be null.
         //
         verifyException("org.apache.commons.collections4.multimap.AbstractMultiValuedMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      HashSetValuedHashMap<String, LinkedList<Object>> hashSetValuedHashMap0 = new HashSetValuedHashMap<String, LinkedList<Object>>();
      Set<LinkedList<Object>> set0 = hashSetValuedHashMap0.get("+Y$OD>#4`");
      LinkedList<LinkedList<Object>> linkedList0 = new LinkedList<LinkedList<Object>>(set0);
      boolean boolean0 = hashSetValuedHashMap0.putAll("g;b _'Yx''I8Fj", (Iterable<? extends LinkedList<Object>>) linkedList0);
      assertTrue(hashSetValuedHashMap0.isEmpty());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      HashSetValuedHashMap<String, LinkedList<Object>> hashSetValuedHashMap0 = new HashSetValuedHashMap<String, LinkedList<Object>>();
      MultiSet<String> multiSet0 = hashSetValuedHashMap0.keys();
      assertNotNull(multiSet0);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      ArrayListValuedHashMap<LinkedList<Object>, String> arrayListValuedHashMap0 = new ArrayListValuedHashMap<LinkedList<Object>, String>();
      // Undeclared exception!
      try { 
        arrayListValuedHashMap0.putAll((Map<? extends LinkedList<Object>, ? extends String>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // Map must not be null.
         //
         verifyException("org.apache.commons.collections4.multimap.AbstractMultiValuedMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      HashSetValuedHashMap<AbstractMap.SimpleEntry<BufferedInputStream, Collection<AbstractMap.SimpleImmutableEntry<Boolean, LinkedList<Object>>>>, LinkedList<Object>> hashSetValuedHashMap0 = new HashSetValuedHashMap<AbstractMap.SimpleEntry<BufferedInputStream, Collection<AbstractMap.SimpleImmutableEntry<Boolean, LinkedList<Object>>>>, LinkedList<Object>>();
      boolean boolean0 = hashSetValuedHashMap0.isEmpty();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      HashSetValuedHashMap<Boolean, Collection<AbstractMap.SimpleImmutableEntry<Boolean, LinkedList<Object>>>> hashSetValuedHashMap0 = new HashSetValuedHashMap<Boolean, Collection<AbstractMap.SimpleImmutableEntry<Boolean, LinkedList<Object>>>>((-1));
      Predicate<Object> predicate0 = UniquePredicate.uniquePredicate();
      PredicateTransformer<LinkedList<Integer>> predicateTransformer0 = new PredicateTransformer<LinkedList<Integer>>(predicate0);
      Object object0 = new Object();
      boolean boolean0 = hashSetValuedHashMap0.removeMapping(predicateTransformer0, object0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      HashSetValuedHashMap<String, LinkedList<Object>> hashSetValuedHashMap0 = new HashSetValuedHashMap<String, LinkedList<Object>>();
      hashSetValuedHashMap0.putAll((MultiValuedMap<? extends String, ? extends LinkedList<Object>>) hashSetValuedHashMap0);
      ArrayListValuedHashMap<String, LinkedList<Object>> arrayListValuedHashMap0 = new ArrayListValuedHashMap<String, LinkedList<Object>>(hashSetValuedHashMap0);
      assertTrue(arrayListValuedHashMap0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      ArrayListValuedHashMap<Predicate<Object>, HashSetValuedHashMap<Object, String>> arrayListValuedHashMap0 = new ArrayListValuedHashMap<Predicate<Object>, HashSetValuedHashMap<Object, String>>();
      HashSetValuedHashMap<Integer, Object> hashSetValuedHashMap0 = new HashSetValuedHashMap<Integer, Object>();
      boolean boolean0 = hashSetValuedHashMap0.containsKey(arrayListValuedHashMap0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      HashSetValuedHashMap<Predicate<Object>, AbstractMap.SimpleImmutableEntry<String, Object>> hashSetValuedHashMap0 = new HashSetValuedHashMap<Predicate<Object>, AbstractMap.SimpleImmutableEntry<String, Object>>((-3790));
      Map<Predicate<Object>, Collection<AbstractMap.SimpleImmutableEntry<String, Object>>> map0 = hashSetValuedHashMap0.asMap();
      HashSetValuedHashMap<TransformedMultiValuedMap<Object, InputStream>, String> hashSetValuedHashMap1 = new HashSetValuedHashMap<TransformedMultiValuedMap<Object, InputStream>, String>();
      boolean boolean0 = hashSetValuedHashMap1.containsMapping(map0, hashSetValuedHashMap0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      HashSetValuedHashMap<Integer, Boolean> hashSetValuedHashMap0 = new HashSetValuedHashMap<Integer, Boolean>();
      Map<Integer, Collection<Boolean>> map0 = hashSetValuedHashMap0.asMap();
      Map<Integer, Collection<Boolean>> map1 = hashSetValuedHashMap0.asMap();
      assertSame(map1, map0);
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      HashSetValuedHashMap<Predicate<Object>, Boolean> hashSetValuedHashMap0 = new HashSetValuedHashMap<Predicate<Object>, Boolean>(1107);
      HashSetValuedHashMap<Boolean, Predicate<Object>> hashSetValuedHashMap1 = new HashSetValuedHashMap<Boolean, Predicate<Object>>();
      boolean boolean0 = hashSetValuedHashMap1.equals(hashSetValuedHashMap0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      ArrayListValuedHashMap<Integer, String> arrayListValuedHashMap0 = new ArrayListValuedHashMap<Integer, String>(6, 6);
      Integer integer0 = new Integer(6);
      AbstractMultiValuedMap.WrappedCollection abstractMultiValuedMap_WrappedCollection0 = arrayListValuedHashMap0.new WrappedCollection(integer0);
      String string0 = abstractMultiValuedMap_WrappedCollection0.toString();
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      HashSetValuedHashMap<AbstractMap.SimpleEntry<Object, Object>, ArrayListValuedHashMap<String, Integer>> hashSetValuedHashMap0 = new HashSetValuedHashMap<AbstractMap.SimpleEntry<Object, Object>, ArrayListValuedHashMap<String, Integer>>(2, (-1829));
      hashSetValuedHashMap0.hashCode();
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      HashMap<LinkedList<Object>, Integer> hashMap0 = new HashMap<LinkedList<Object>, Integer>();
      ArrayListValuedHashMap<LinkedList<Object>, Integer> arrayListValuedHashMap0 = new ArrayListValuedHashMap<LinkedList<Object>, Integer>(hashMap0);
      String string0 = arrayListValuedHashMap0.toString();
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      ArrayListValuedHashMap<Object, Predicate<Object>> arrayListValuedHashMap0 = new ArrayListValuedHashMap<Object, Predicate<Object>>();
      Object object0 = new Object();
      arrayListValuedHashMap0.containsValue(object0);
      Collection<Predicate<Object>> collection0 = arrayListValuedHashMap0.values();
      assertNotNull(collection0);
  }
}
