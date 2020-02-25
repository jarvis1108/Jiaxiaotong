/*
 * This file was automatically generated by EvoSuite
 * Sat Apr 27 04:21:38 GMT 2019
 */

package org.apache.commons.collections4.functors;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.lang.reflect.Array;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import org.apache.commons.collections4.Closure;
import org.apache.commons.collections4.Predicate;
import org.apache.commons.collections4.Transformer;
import org.apache.commons.collections4.functors.AndPredicate;
import org.apache.commons.collections4.functors.ChainedClosure;
import org.apache.commons.collections4.functors.ConstantTransformer;
import org.apache.commons.collections4.functors.DefaultEquator;
import org.apache.commons.collections4.functors.EqualPredicate;
import org.apache.commons.collections4.functors.ExceptionClosure;
import org.apache.commons.collections4.functors.ExceptionTransformer;
import org.apache.commons.collections4.functors.ForClosure;
import org.apache.commons.collections4.functors.IdentityPredicate;
import org.apache.commons.collections4.functors.IfClosure;
import org.apache.commons.collections4.functors.IfTransformer;
import org.apache.commons.collections4.functors.InstanceofPredicate;
import org.apache.commons.collections4.functors.NOPClosure;
import org.apache.commons.collections4.functors.NonePredicate;
import org.apache.commons.collections4.functors.OnePredicate;
import org.apache.commons.collections4.functors.PredicateTransformer;
import org.apache.commons.collections4.functors.SwitchClosure;
import org.apache.commons.collections4.functors.SwitchTransformer;
import org.apache.commons.collections4.functors.TransformedPredicate;
import org.apache.commons.collections4.functors.TransformerClosure;
import org.apache.commons.collections4.functors.UniquePredicate;
import org.apache.commons.collections4.functors.WhileClosure;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ChainedClosure_ESTest extends ChainedClosure_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      ChainedClosure<IfClosure<String>> chainedClosure0 = new ChainedClosure<IfClosure<String>>((Closure<? super IfClosure<String>>[]) null);
      Closure<? super IfClosure<String>>[] closureArray0 = chainedClosure0.getClosures();
      assertNull(closureArray0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Closure<Object>[] closureArray0 = (Closure<Object>[]) Array.newInstance(Closure.class, 5);
      ChainedClosure<NOPClosure<String>> chainedClosure0 = new ChainedClosure<NOPClosure<String>>(closureArray0);
      Closure<? super NOPClosure<String>>[] closureArray1 = chainedClosure0.getClosures();
      assertEquals(5, closureArray1.length);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Closure<Integer>[] closureArray0 = (Closure<Integer>[]) Array.newInstance(Closure.class, 1);
      Closure<Integer> closure0 = ExceptionClosure.exceptionClosure();
      closureArray0[0] = closure0;
      ChainedClosure<Integer> chainedClosure0 = new ChainedClosure<Integer>(closureArray0);
      Integer integer0 = new Integer(0);
      // Undeclared exception!
      try { 
        chainedClosure0.execute(integer0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // ExceptionClosure invoked
         //
         verifyException("org.apache.commons.collections4.functors.ExceptionClosure", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Closure<Object>[] closureArray0 = (Closure<Object>[]) Array.newInstance(Closure.class, 8);
      Predicate<Object>[] predicateArray0 = (Predicate<Object>[]) Array.newInstance(Predicate.class, 6);
      UniquePredicate<Object> uniquePredicate0 = new UniquePredicate<Object>();
      predicateArray0[0] = (Predicate<Object>) uniquePredicate0;
      OnePredicate<Object> onePredicate0 = new OnePredicate<Object>(predicateArray0);
      predicateArray0[1] = (Predicate<Object>) onePredicate0;
      IdentityPredicate<Object> identityPredicate0 = new IdentityPredicate<Object>(onePredicate0);
      Transformer<Object, Boolean> transformer0 = PredicateTransformer.predicateTransformer((Predicate<? super Object>) identityPredicate0);
      NonePredicate<Object> nonePredicate0 = new NonePredicate<Object>(predicateArray0);
      Transformer<Object, String> transformer1 = ConstantTransformer.constantTransformer("Six");
      Transformer<Object, String> transformer2 = IfTransformer.ifTransformer((Predicate<? super Object>) nonePredicate0, (Transformer<? super Object, ? extends String>) transformer1, (Transformer<? super Object, ? extends String>) transformer1);
      Closure<Object> closure0 = TransformerClosure.transformerClosure((Transformer<? super Object, ?>) transformer2);
      closureArray0[0] = closure0;
      closureArray0[1] = closure0;
      ChainedClosure<TransformerClosure<Integer>> chainedClosure0 = new ChainedClosure<TransformerClosure<Integer>>(closureArray0);
      TransformerClosure<Integer> transformerClosure0 = new TransformerClosure<Integer>(transformer0);
      // Undeclared exception!
      chainedClosure0.execute(transformerClosure0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ChainedClosure<Boolean> chainedClosure0 = new ChainedClosure<Boolean>((Closure<? super Boolean>[]) null);
      Predicate<Object>[] predicateArray0 = (Predicate<Object>[]) Array.newInstance(Predicate.class, 4);
      Class<String> class0 = String.class;
      InstanceofPredicate instanceofPredicate0 = new InstanceofPredicate(class0);
      predicateArray0[0] = (Predicate<Object>) instanceofPredicate0;
      AndPredicate<Object> andPredicate0 = new AndPredicate<Object>(predicateArray0[0], predicateArray0[0]);
      predicateArray0[3] = (Predicate<Object>) andPredicate0;
      PredicateTransformer<Predicate<String>> predicateTransformer0 = new PredicateTransformer<Predicate<String>>(predicateArray0[3]);
      HashMap<Predicate<Object>, Transformer<Object, String>> hashMap0 = new HashMap<Predicate<Object>, Transformer<Object, String>>();
      Transformer<Object, String> transformer0 = SwitchTransformer.switchTransformer((Map<? extends Predicate<? super Object>, ? extends Transformer<? super Object, ? extends String>>) hashMap0);
      Predicate<String> predicate0 = TransformedPredicate.transformedPredicate((Transformer<? super String, ? extends String>) transformer0, (Predicate<? super String>) instanceofPredicate0);
      Boolean boolean0 = predicateTransformer0.transform(predicate0);
      // Undeclared exception!
      try { 
        chainedClosure0.execute(boolean0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.collections4.functors.ChainedClosure", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Closure<Object>[] closureArray0 = (Closure<Object>[]) Array.newInstance(Closure.class, 7);
      // Undeclared exception!
      try { 
        ChainedClosure.chainedClosure((Closure<? super Object>[]) closureArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // The closure array must not contain a null closure, index 0 was null
         //
         verifyException("org.apache.commons.collections4.functors.FunctorUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Closure<Integer>[] closureArray0 = (Closure<Integer>[]) Array.newInstance(Closure.class, 1);
      HashMap<Predicate<Integer>, Closure<Integer>> hashMap0 = new HashMap<Predicate<Integer>, Closure<Integer>>();
      Closure<Integer> closure0 = SwitchClosure.switchClosure((Map<Predicate<Integer>, Closure<Integer>>) hashMap0);
      closureArray0[0] = closure0;
      ChainedClosure<Integer> chainedClosure0 = new ChainedClosure<Integer>(closureArray0);
      Integer integer0 = new Integer(648);
      chainedClosure0.execute(integer0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      // Undeclared exception!
      try { 
        ChainedClosure.chainedClosure((Collection<? extends Closure<? super Object>>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // Closure collection must not be null
         //
         verifyException("org.apache.commons.collections4.functors.ChainedClosure", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      LinkedList<Closure<Object>> linkedList0 = new LinkedList<Closure<Object>>();
      Closure<Object> closure0 = ChainedClosure.chainedClosure((Collection<? extends Closure<? super Object>>) linkedList0);
      linkedList0.add(closure0);
      Closure<NOPClosure<Transformer<Object, Object>>> closure1 = ChainedClosure.chainedClosure((Collection<? extends Closure<? super NOPClosure<Transformer<Object, Object>>>>) linkedList0);
      assertNotNull(closure1);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Closure<Object>[] closureArray0 = (Closure<Object>[]) Array.newInstance(Closure.class, 0);
      Closure<Integer> closure0 = ChainedClosure.chainedClosure((Closure<? super Integer>[]) closureArray0);
      assertNotNull(closure0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Closure<Object>[] closureArray0 = (Closure<Object>[]) Array.newInstance(Closure.class, 5);
      Transformer<Object, Object> transformer0 = ExceptionTransformer.exceptionTransformer();
      Closure<Object> closure0 = TransformerClosure.transformerClosure((Transformer<? super Object, ?>) transformer0);
      closureArray0[0] = closure0;
      ForClosure<Object> forClosure0 = new ForClosure<Object>(4, closure0);
      closureArray0[1] = (Closure<Object>) forClosure0;
      DefaultEquator<Object> defaultEquator0 = DefaultEquator.defaultEquator();
      EqualPredicate<Object> equalPredicate0 = new EqualPredicate<Object>(closure0, defaultEquator0);
      WhileClosure<Object> whileClosure0 = new WhileClosure<Object>(equalPredicate0, closure0, false);
      closureArray0[2] = (Closure<Object>) whileClosure0;
      closureArray0[3] = closure0;
      closureArray0[4] = closureArray0[0];
      Closure<Predicate<Object>> closure1 = ChainedClosure.chainedClosure((Closure<? super Predicate<Object>>[]) closureArray0);
      assertNotNull(closure1);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Closure<Object>[] closureArray0 = (Closure<Object>[]) Array.newInstance(Closure.class, 0);
      ChainedClosure<TransformerClosure<Object>> chainedClosure0 = new ChainedClosure<TransformerClosure<Object>>(closureArray0);
      Closure<? super TransformerClosure<Object>>[] closureArray1 = chainedClosure0.getClosures();
      assertEquals(0, closureArray1.length);
  }
}