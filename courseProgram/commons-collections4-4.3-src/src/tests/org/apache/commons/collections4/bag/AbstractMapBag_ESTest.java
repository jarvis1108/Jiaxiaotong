/*
 * This file was automatically generated by EvoSuite
 * Sat Apr 27 02:57:44 GMT 2019
 */

package org.apache.commons.collections4.bag;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.ByteArrayOutputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Array;
import java.util.AbstractMap;
import java.util.Collection;
import java.util.Comparator;
import java.util.ConcurrentModificationException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;
import org.apache.commons.collections4.Bag;
import org.apache.commons.collections4.Equator;
import org.apache.commons.collections4.Predicate;
import org.apache.commons.collections4.SortedBag;
import org.apache.commons.collections4.Transformer;
import org.apache.commons.collections4.bag.AbstractMapBag;
import org.apache.commons.collections4.bag.CollectionBag;
import org.apache.commons.collections4.bag.CollectionSortedBag;
import org.apache.commons.collections4.bag.HashBag;
import org.apache.commons.collections4.bag.PredicatedBag;
import org.apache.commons.collections4.bag.PredicatedSortedBag;
import org.apache.commons.collections4.bag.SynchronizedSortedBag;
import org.apache.commons.collections4.bag.TransformedSortedBag;
import org.apache.commons.collections4.bag.TreeBag;
import org.apache.commons.collections4.bag.UnmodifiableBag;
import org.apache.commons.collections4.functors.ConstantFactory;
import org.apache.commons.collections4.functors.EqualPredicate;
import org.apache.commons.collections4.functors.ExceptionTransformer;
import org.apache.commons.collections4.functors.FactoryTransformer;
import org.apache.commons.collections4.functors.FalsePredicate;
import org.apache.commons.collections4.functors.InstanceofPredicate;
import org.apache.commons.collections4.functors.NotNullPredicate;
import org.apache.commons.collections4.functors.SwitchTransformer;
import org.apache.commons.collections4.functors.UniquePredicate;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class AbstractMapBag_ESTest extends AbstractMapBag_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      HashBag<String> hashBag0 = new HashBag<String>();
      Object[] objectArray0 = new Object[4];
      hashBag0.toArray(objectArray0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      AbstractMapBag.MutableInteger abstractMapBag_MutableInteger0 = new AbstractMapBag.MutableInteger((-301));
      AbstractMapBag.MutableInteger abstractMapBag_MutableInteger1 = new AbstractMapBag.MutableInteger(503);
      abstractMapBag_MutableInteger1.equals(abstractMapBag_MutableInteger0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      TreeBag<InstanceofPredicate> treeBag0 = new TreeBag<InstanceofPredicate>();
      Class<String> class0 = String.class;
      InstanceofPredicate instanceofPredicate0 = new InstanceofPredicate(class0);
      treeBag0.add(instanceofPredicate0, (-4391));
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      TreeBag<CollectionBag<InstanceofPredicate>> treeBag0 = new TreeBag<CollectionBag<InstanceofPredicate>>(comparator0);
      AbstractMapBag.BagIterator<CollectionBag<InstanceofPredicate>> abstractMapBag_BagIterator0 = new AbstractMapBag.BagIterator<CollectionBag<InstanceofPredicate>>(treeBag0);
      abstractMapBag_BagIterator0.hasNext();
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Comparator<String> comparator0 = (Comparator<String>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      TreeBag<String> treeBag0 = new TreeBag<String>(comparator0);
      treeBag0.clear();
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      HashBag<Transformer<Object, InstanceofPredicate>> hashBag0 = new HashBag<Transformer<Object, InstanceofPredicate>>();
      Predicate<Object>[] predicateArray0 = (Predicate<Object>[]) Array.newInstance(Predicate.class, 0);
      hashBag0.toArray(predicateArray0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      HashBag<String> hashBag0 = new HashBag<String>();
      hashBag0.add("+<laP,t$Sv");
      hashBag0.toArray();
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(comparator0).compare(any() , any());
      TreeBag<AbstractMapBag.MutableInteger> treeBag0 = new TreeBag<AbstractMapBag.MutableInteger>(comparator0);
      AbstractMapBag.MutableInteger abstractMapBag_MutableInteger0 = new AbstractMapBag.MutableInteger((-256));
      treeBag0.add(abstractMapBag_MutableInteger0);
      treeBag0.size();
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Comparator<Integer> comparator0 = (Comparator<Integer>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(comparator0).compare(anyInt() , anyInt());
      TreeBag<Integer> treeBag0 = new TreeBag<Integer>(comparator0);
      treeBag0.add((Integer) null);
      treeBag0.getMap();
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      HashBag<SynchronizedSortedBag<InstanceofPredicate>> hashBag0 = new HashBag<SynchronizedSortedBag<InstanceofPredicate>>();
      hashBag0.getMap();
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      TreeBag<String> treeBag0 = new TreeBag<String>();
      treeBag0.add("");
      Set<String> set0 = treeBag0.uniqueSet();
      HashBag<Transformer<InstanceofPredicate, Object>> hashBag0 = new HashBag<Transformer<InstanceofPredicate, Object>>();
      hashBag0.containsAll(set0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      TreeBag<Integer> treeBag0 = new TreeBag<Integer>();
      // Undeclared exception!
      try { 
        treeBag0.toArray((Object[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.collections4.bag.AbstractMapBag", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      HashBag<PredicatedSortedBag<Object>> hashBag0 = new HashBag<PredicatedSortedBag<Object>>();
      Iterator<PredicatedSortedBag<Object>> iterator0 = hashBag0.iterator();
      HashBag<Object> hashBag1 = new HashBag<Object>();
      SynchronizedSortedBag<Object> synchronizedSortedBag0 = new SynchronizedSortedBag<Object>(hashBag1, iterator0);
      Predicate<Object> predicate0 = FalsePredicate.falsePredicate();
      PredicatedSortedBag<Object> predicatedSortedBag0 = PredicatedSortedBag.predicatedSortedBag((SortedBag<Object>) synchronizedSortedBag0, (Predicate<? super Object>) predicate0);
      hashBag0.add(predicatedSortedBag0);
      hashBag1.add((Object) hashBag0);
      // Undeclared exception!
      try { 
        hashBag1.retainAll((Bag<?>) hashBag0);
        fail("Expecting exception: StackOverflowError");
      
      } catch(StackOverflowError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      TreeBag<CollectionSortedBag<InstanceofPredicate>> treeBag0 = new TreeBag<CollectionSortedBag<InstanceofPredicate>>();
      HashBag<AbstractMap.SimpleImmutableEntry<String, Integer>> hashBag0 = new HashBag<AbstractMap.SimpleImmutableEntry<String, Integer>>();
      hashBag0.add((AbstractMap.SimpleImmutableEntry<String, Integer>) null);
      // Undeclared exception!
      try { 
        hashBag0.retainAll((Bag<?>) treeBag0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.TreeMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      TreeBag<InstanceofPredicate> treeBag0 = new TreeBag<InstanceofPredicate>((Comparator<? super InstanceofPredicate>) null);
      // Undeclared exception!
      try { 
        treeBag0.retainAll((Collection<?>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.collections4.bag.AbstractMapBag", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      TreeBag<HashBag<Object>> treeBag0 = new TreeBag<HashBag<Object>>(comparator0);
      TreeBag<Object> treeBag1 = new TreeBag<Object>(treeBag0);
      // Undeclared exception!
      try { 
        treeBag1.remove((Object) null, 0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.TreeMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      TreeBag<CollectionBag<Object>> treeBag0 = new TreeBag<CollectionBag<Object>>(comparator0);
      TreeBag<Object> treeBag1 = new TreeBag<Object>(treeBag0);
      // Undeclared exception!
      try { 
        treeBag1.remove((Object) treeBag0, 0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      TreeBag<Object> treeBag0 = new TreeBag<Object>();
      HashBag<Object> hashBag0 = new HashBag<Object>(treeBag0);
      TreeBag<Transformer<Object, InstanceofPredicate>> treeBag1 = new TreeBag<Transformer<Object, InstanceofPredicate>>();
      // Undeclared exception!
      try { 
        treeBag1.remove((Object) hashBag0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      LinkedList<Integer> linkedList0 = new LinkedList<Integer>();
      TreeBag<Integer> treeBag0 = new TreeBag<Integer>(linkedList0);
      Predicate<Object> predicate0 = UniquePredicate.uniquePredicate();
      Predicate<Predicate<Object>> predicate1 = EqualPredicate.equalPredicate(predicate0, (Equator<Predicate<Object>>) null);
      // Undeclared exception!
      try { 
        treeBag0.getCount(predicate1);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      HashBag<InstanceofPredicate> hashBag0 = new HashBag<InstanceofPredicate>();
      // Undeclared exception!
      try { 
        hashBag0.doWriteObject((ObjectOutputStream) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.collections4.bag.AbstractMapBag", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Comparator<String> comparator0 = (Comparator<String>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      TreeBag<String> treeBag0 = new TreeBag<String>(comparator0);
      // Undeclared exception!
      try { 
        treeBag0.containsAll((Bag<?>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.collections4.bag.AbstractMapBag", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      TreeBag<String> treeBag0 = new TreeBag<String>(comparator0);
      // Undeclared exception!
      try { 
        treeBag0.addAll((Collection<? extends String>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.collections4.bag.AbstractMapBag", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      TreeBag<Transformer<Object, Integer>> treeBag0 = new TreeBag<Transformer<Object, Integer>>();
      Integer integer0 = new Integer(1);
      ConstantFactory<Integer> constantFactory0 = new ConstantFactory<Integer>(integer0);
      FactoryTransformer<Object, Integer> factoryTransformer0 = new FactoryTransformer<Object, Integer>(constantFactory0);
      // Undeclared exception!
      try { 
        treeBag0.add((Transformer<Object, Integer>) factoryTransformer0, 2688);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      TreeBag<String> treeBag0 = new TreeBag<String>();
      // Undeclared exception!
      try { 
        treeBag0.add((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.collections4.bag.TreeBag", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      TreeBag<PredicatedBag<InstanceofPredicate>> treeBag0 = new TreeBag<PredicatedBag<InstanceofPredicate>>((Comparator<? super PredicatedBag<InstanceofPredicate>>) null);
      TreeBag<InstanceofPredicate> treeBag1 = new TreeBag<InstanceofPredicate>();
      Transformer<Object, InstanceofPredicate> transformer0 = ExceptionTransformer.exceptionTransformer();
      TransformedSortedBag<InstanceofPredicate> transformedSortedBag0 = new TransformedSortedBag<InstanceofPredicate>(treeBag1, transformer0);
      Predicate<Object> predicate0 = NotNullPredicate.notNullPredicate();
      PredicatedSortedBag<InstanceofPredicate> predicatedSortedBag0 = new PredicatedSortedBag<InstanceofPredicate>(transformedSortedBag0, predicate0);
      // Undeclared exception!
      try { 
        treeBag0.add((PredicatedBag<InstanceofPredicate>) predicatedSortedBag0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Objects of type class org.apache.commons.collections4.bag.PredicatedSortedBag cannot be added to a naturally ordered TreeBag as it does not implement Comparable
         //
         verifyException("org.apache.commons.collections4.bag.TreeBag", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      HashBag<Integer> hashBag0 = new HashBag<Integer>();
      HashBag<Object> hashBag1 = new HashBag<Object>();
      hashBag1.addAll(hashBag0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      TreeBag<String> treeBag0 = new TreeBag<String>();
      Set<String> set0 = treeBag0.uniqueSet();
      HashBag<PredicatedSortedBag<Object>> hashBag0 = new HashBag<PredicatedSortedBag<Object>>();
      hashBag0.getCount(set0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      AbstractMapBag.MutableInteger abstractMapBag_MutableInteger0 = new AbstractMapBag.MutableInteger(1);
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0).when(comparator0).compare(any() , any());
      TreeBag<Integer> treeBag0 = new TreeBag<Integer>(comparator0);
      treeBag0.add((Integer) null);
      treeBag0.getCount(abstractMapBag_MutableInteger0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      TreeBag<TreeBag<Integer>> treeBag0 = new TreeBag<TreeBag<Integer>>((Comparator<? super TreeBag<Integer>>) null);
      treeBag0.isEmpty();
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      HashBag<Boolean> hashBag0 = new HashBag<Boolean>();
      hashBag0.add((Boolean) null);
      hashBag0.isEmpty();
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      TreeBag<HashBag<String>> treeBag0 = new TreeBag<HashBag<String>>();
      treeBag0.size();
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      HashBag<Transformer<Object, InstanceofPredicate>> hashBag0 = new HashBag<Transformer<Object, InstanceofPredicate>>();
      HashMap<InstanceofPredicate, Transformer<Object, InstanceofPredicate>> hashMap0 = new HashMap<InstanceofPredicate, Transformer<Object, InstanceofPredicate>>();
      Transformer<Object, InstanceofPredicate> transformer0 = SwitchTransformer.switchTransformer((Map<? extends Predicate<? super Object>, ? extends Transformer<? super Object, ? extends InstanceofPredicate>>) hashMap0);
      hashBag0.add(transformer0);
      hashBag0.add((Transformer<Object, InstanceofPredicate>) null);
      hashBag0.toString();
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      TreeBag<PredicatedSortedBag<Object>> treeBag0 = new TreeBag<PredicatedSortedBag<Object>>(comparator0);
      HashBag<PredicatedBag<Object>> hashBag0 = new HashBag<PredicatedBag<Object>>(treeBag0);
      hashBag0.toString();
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      HashBag<Boolean> hashBag0 = new HashBag<Boolean>();
      hashBag0.add((Boolean) null);
      hashBag0.hashCode();
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      TreeBag<Integer> treeBag0 = new TreeBag<Integer>();
      Integer integer0 = new Integer(180);
      treeBag0.add(integer0);
      treeBag0.hashCode();
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      TreeBag<UnmodifiableBag<Object>> treeBag0 = new TreeBag<UnmodifiableBag<Object>>();
      treeBag0.equals((Object) null);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      TreeBag<CollectionBag<Object>> treeBag0 = new TreeBag<CollectionBag<Object>>();
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
      ObjectOutputStream objectOutputStream0 = new ObjectOutputStream(byteArrayOutputStream0);
      treeBag0.doWriteObject(objectOutputStream0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      HashBag<TransformedSortedBag<Object>> hashBag0 = new HashBag<TransformedSortedBag<Object>>();
      HashBag<Object> hashBag1 = new HashBag<Object>(hashBag0);
      hashBag0.containsAll((Bag<?>) hashBag1);
      hashBag1.uniqueSet();
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      TreeBag<Integer> treeBag0 = new TreeBag<Integer>();
      Integer integer0 = new Integer(180);
      treeBag0.add(integer0);
      CollectionSortedBag<Object>[] collectionSortedBagArray0 = (CollectionSortedBag<Object>[]) Array.newInstance(CollectionSortedBag.class, 6);
      // Undeclared exception!
      try { 
        treeBag0.toArray(collectionSortedBagArray0);
        fail("Expecting exception: ArrayStoreException");
      
      } catch(ArrayStoreException e) {
         //
         // java.lang.Integer
         //
         verifyException("org.apache.commons.collections4.bag.AbstractMapBag", e);
      }
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      TreeBag<Object> treeBag0 = new TreeBag<Object>();
      HashBag<Object> hashBag0 = new HashBag<Object>(treeBag0);
      hashBag0.toArray();
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      HashBag<AbstractMapBag.MutableInteger> hashBag0 = new HashBag<AbstractMapBag.MutableInteger>();
      AbstractMapBag.MutableInteger abstractMapBag_MutableInteger0 = new AbstractMapBag.MutableInteger(0);
      hashBag0.add(abstractMapBag_MutableInteger0);
      abstractMapBag_MutableInteger0.value = 755;
      AbstractMapBag.MutableInteger abstractMapBag_MutableInteger1 = new AbstractMapBag.MutableInteger(0);
      hashBag0.add(abstractMapBag_MutableInteger1);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      AbstractMapBag.MutableInteger abstractMapBag_MutableInteger0 = new AbstractMapBag.MutableInteger(0);
      abstractMapBag_MutableInteger0.equals("");
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      HashBag<Boolean> hashBag0 = new HashBag<Boolean>();
      hashBag0.add((Boolean) null);
      HashBag<Object> hashBag1 = new HashBag<Object>(hashBag0);
      hashBag1.retainAll((Bag<?>) hashBag0);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      TreeBag<Integer> treeBag0 = new TreeBag<Integer>();
      LinkedList<String> linkedList0 = new LinkedList<String>();
      linkedList0.add("t+h'eR;vLt!{");
      treeBag0.removeAll(linkedList0);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      HashBag<Transformer<Object, InstanceofPredicate>> hashBag0 = new HashBag<Transformer<Object, InstanceofPredicate>>();
      Comparator<Integer> comparator0 = (Comparator<Integer>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0).when(comparator0).compare(anyInt() , anyInt());
      TreeBag<Integer> treeBag0 = new TreeBag<Integer>(comparator0);
      treeBag0.add((Integer) null);
      treeBag0.remove((Object) hashBag0, 0);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      AbstractMapBag.MutableInteger abstractMapBag_MutableInteger0 = new AbstractMapBag.MutableInteger(3735);
      AbstractMap.SimpleEntry<String, Object> abstractMap_SimpleEntry0 = new AbstractMap.SimpleEntry<String, Object>("", abstractMapBag_MutableInteger0);
      HashBag<String> hashBag0 = new HashBag<String>();
      hashBag0.remove((Object) abstractMap_SimpleEntry0, 0);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      AbstractMapBag.MutableInteger abstractMapBag_MutableInteger0 = new AbstractMapBag.MutableInteger(0);
      HashBag<TransformedSortedBag<Object>> hashBag0 = new HashBag<TransformedSortedBag<Object>>();
      hashBag0.remove((Object) abstractMapBag_MutableInteger0);
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      TreeBag<PredicatedBag<Object>> treeBag0 = new TreeBag<PredicatedBag<Object>>(comparator0);
      Comparator<Object> comparator1 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0, 0).when(comparator1).compare(any() , any());
      TreeBag<Object> treeBag1 = new TreeBag<Object>(comparator1);
      treeBag1.add((Object) treeBag0);
      treeBag1.remove((Object) "79&]31irPq1");
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      HashBag<String> hashBag0 = new HashBag<String>();
      hashBag0.add("*)sWoL", 2233);
      TreeBag<String> treeBag0 = new TreeBag<String>(hashBag0);
      assertEquals(2233, hashBag0.size());
      assertFalse(treeBag0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      Comparator<Integer> comparator0 = (Comparator<Integer>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      TreeBag<Integer> treeBag0 = new TreeBag<Integer>(comparator0);
      TreeBag<String> treeBag1 = new TreeBag<String>();
      treeBag1.add("");
      Set<String> set0 = treeBag1.uniqueSet();
      boolean boolean0 = treeBag0.retainAll(set0);
      assertEquals(1, treeBag1.size());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      TreeBag<String> treeBag0 = new TreeBag<String>(comparator0);
      boolean boolean0 = treeBag0.add((String) null, 0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      HashBag<Object> hashBag0 = new HashBag<Object>();
      AbstractMapBag.MutableInteger abstractMapBag_MutableInteger0 = new AbstractMapBag.MutableInteger(5);
      hashBag0.add((Object) abstractMapBag_MutableInteger0);
      AbstractMapBag.BagIterator<Object> abstractMapBag_BagIterator0 = new AbstractMapBag.BagIterator<Object>(hashBag0);
      abstractMapBag_BagIterator0.next();
      assertEquals(1, hashBag0.size());
      
      abstractMapBag_BagIterator0.remove();
      HashBag<String> hashBag1 = new HashBag<String>();
      boolean boolean0 = hashBag1.equals(hashBag0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      HashBag<Object> hashBag0 = new HashBag<Object>();
      AbstractMapBag.BagIterator<Object> abstractMapBag_BagIterator0 = new AbstractMapBag.BagIterator<Object>(hashBag0);
      // Undeclared exception!
      try { 
        abstractMapBag_BagIterator0.remove();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.collections4.bag.AbstractMapBag$BagIterator", e);
      }
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      HashBag<Boolean> hashBag0 = new HashBag<Boolean>();
      HashBag<Object> hashBag1 = new HashBag<Object>(hashBag0);
      AbstractMapBag.BagIterator<Object> abstractMapBag_BagIterator0 = new AbstractMapBag.BagIterator<Object>(hashBag1);
      hashBag1.add((Object) null);
      // Undeclared exception!
      try { 
        abstractMapBag_BagIterator0.next();
        fail("Expecting exception: ConcurrentModificationException");
      
      } catch(ConcurrentModificationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.collections4.bag.AbstractMapBag$BagIterator", e);
      }
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      Comparator<Integer> comparator0 = (Comparator<Integer>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0, 0, 0, 0).when(comparator0).compare(anyInt() , anyInt());
      TreeBag<Integer> treeBag0 = new TreeBag<Integer>(comparator0);
      TreeBag<String> treeBag1 = new TreeBag<String>();
      Integer integer0 = new Integer(1479);
      treeBag0.add(integer0);
      treeBag0.add((Integer) null);
      Set<String> set0 = treeBag1.uniqueSet();
      boolean boolean0 = treeBag0.retainAll(set0);
      assertFalse(treeBag0.contains(1479));
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      TreeBag<Integer> treeBag0 = new TreeBag<Integer>();
      Integer integer0 = new Integer(888);
      treeBag0.add(integer0);
      HashBag<AbstractMapBag.MutableInteger> hashBag0 = new HashBag<AbstractMapBag.MutableInteger>();
      boolean boolean0 = hashBag0.containsAll((Bag<?>) treeBag0);
      assertFalse(treeBag0.isEmpty());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      TreeBag<Object> treeBag0 = new TreeBag<Object>((Comparator<? super Object>) null);
      TreeBag<SynchronizedSortedBag<Integer>> treeBag1 = new TreeBag<SynchronizedSortedBag<Integer>>((Comparator<? super SynchronizedSortedBag<Integer>>) null);
      boolean boolean0 = treeBag1.containsAll(treeBag0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      HashBag<PredicatedBag<String>> hashBag0 = new HashBag<PredicatedBag<String>>();
      hashBag0.add((PredicatedBag<String>) null);
      boolean boolean0 = hashBag0.contains((Object) null);
      assertFalse(hashBag0.isEmpty());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      HashBag<PredicatedBag<String>> hashBag0 = new HashBag<PredicatedBag<String>>();
      boolean boolean0 = hashBag0.contains((Object) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      TreeBag<Integer> treeBag0 = new TreeBag<Integer>();
      HashBag<Transformer<Object, InstanceofPredicate>> hashBag0 = new HashBag<Transformer<Object, InstanceofPredicate>>();
      boolean boolean0 = treeBag0.retainAll(hashBag0);
      assertFalse(boolean0);
      assertTrue(hashBag0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      HashBag<AbstractMapBag.MutableInteger> hashBag0 = new HashBag<AbstractMapBag.MutableInteger>();
      AbstractMapBag.MutableInteger abstractMapBag_MutableInteger0 = new AbstractMapBag.MutableInteger(0);
      hashBag0.add(abstractMapBag_MutableInteger0);
      AbstractMapBag.MutableInteger abstractMapBag_MutableInteger1 = new AbstractMapBag.MutableInteger(0);
      boolean boolean0 = hashBag0.add(abstractMapBag_MutableInteger1);
      assertFalse(hashBag0.isEmpty());
      assertFalse(boolean0);
  }
}
