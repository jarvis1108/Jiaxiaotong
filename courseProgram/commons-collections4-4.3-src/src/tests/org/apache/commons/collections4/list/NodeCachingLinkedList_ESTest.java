/*
 * This file was automatically generated by EvoSuite
 * Sat Apr 27 04:20:33 GMT 2019
 */

package org.apache.commons.collections4.list;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.SequenceInputStream;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;
import org.apache.commons.collections4.list.AbstractLinkedList;
import org.apache.commons.collections4.list.CursorableLinkedList;
import org.apache.commons.collections4.list.NodeCachingLinkedList;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.mock.java.io.MockPrintStream;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class NodeCachingLinkedList_ESTest extends NodeCachingLinkedList_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      NodeCachingLinkedList<String> nodeCachingLinkedList0 = new NodeCachingLinkedList<String>();
      nodeCachingLinkedList0.addLast("org.apache.commons.collections4.list.NodeCachingLinkedList");
      nodeCachingLinkedList0.removeAllNodes();
      NodeCachingLinkedList<Integer> nodeCachingLinkedList1 = new NodeCachingLinkedList<Integer>(611);
      nodeCachingLinkedList1.clear();
      nodeCachingLinkedList1.isCacheFull();
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      NodeCachingLinkedList<Integer> nodeCachingLinkedList0 = new NodeCachingLinkedList<Integer>((-589));
      byte[] byteArray0 = new byte[1];
      byteArray0[0] = (byte)0;
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, 647, 718);
      DataInputStream dataInputStream0 = new DataInputStream(byteArrayInputStream0);
      nodeCachingLinkedList0.equals(dataInputStream0);
      nodeCachingLinkedList0.getMaximumCacheSize();
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      NodeCachingLinkedList<String> nodeCachingLinkedList0 = new NodeCachingLinkedList<String>((-2530));
      NodeCachingLinkedList<Object> nodeCachingLinkedList1 = new NodeCachingLinkedList<Object>(nodeCachingLinkedList0);
      nodeCachingLinkedList1.shrinkCacheToMaximumSize();
      nodeCachingLinkedList1.spliterator();
      nodeCachingLinkedList1.shrinkCacheToMaximumSize();
      Consumer<Object> consumer0 = (Consumer<Object>) mock(Consumer.class, new ViolatedAssumptionAnswer());
      nodeCachingLinkedList1.forEach(consumer0);
      nodeCachingLinkedList1.getMaximumCacheSize();
      // Undeclared exception!
      nodeCachingLinkedList0.shrinkCacheToMaximumSize();
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      NodeCachingLinkedList<Integer> nodeCachingLinkedList0 = new NodeCachingLinkedList<Integer>();
      nodeCachingLinkedList0.setMaximumCacheSize(1);
      NodeCachingLinkedList<InputStream> nodeCachingLinkedList1 = new NodeCachingLinkedList<InputStream>();
      nodeCachingLinkedList1.shrinkCacheToMaximumSize();
      NodeCachingLinkedList<String> nodeCachingLinkedList2 = new NodeCachingLinkedList<String>((-1));
      nodeCachingLinkedList2.isCacheFull();
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      NodeCachingLinkedList<Object> nodeCachingLinkedList0 = new NodeCachingLinkedList<Object>();
      nodeCachingLinkedList0.stream();
      nodeCachingLinkedList0.setMaximumCacheSize(0);
      nodeCachingLinkedList0.addNodeToCache((AbstractLinkedList.Node<Object>) null);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      NodeCachingLinkedList<Integer> nodeCachingLinkedList0 = new NodeCachingLinkedList<Integer>();
      AbstractLinkedList.Node<Integer> abstractLinkedList_Node0 = new AbstractLinkedList.Node<Integer>();
      Integer integer0 = new Integer((-1));
      AbstractLinkedList.Node<Integer> abstractLinkedList_Node1 = new AbstractLinkedList.Node<Integer>(abstractLinkedList_Node0, abstractLinkedList_Node0, integer0);
      AbstractLinkedList.Node<Integer> abstractLinkedList_Node2 = abstractLinkedList_Node1.getPreviousNode();
      AbstractLinkedList.Node<Integer> abstractLinkedList_Node3 = abstractLinkedList_Node2.getNextNode();
      nodeCachingLinkedList0.removeNode(abstractLinkedList_Node3);
      NodeCachingLinkedList<Locale.LanguageRange> nodeCachingLinkedList1 = new NodeCachingLinkedList<Locale.LanguageRange>((-1));
      nodeCachingLinkedList1.removeAllNodes();
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      LinkedList<Integer> linkedList0 = new LinkedList<Integer>();
      NodeCachingLinkedList<Integer> nodeCachingLinkedList0 = new NodeCachingLinkedList<Integer>(linkedList0);
      linkedList0.removeAll(nodeCachingLinkedList0);
      nodeCachingLinkedList0.createHeaderNode();
      AbstractLinkedList.Node<Integer> abstractLinkedList_Node0 = new AbstractLinkedList.Node<Integer>();
      AbstractLinkedList.Node<Integer> abstractLinkedList_Node1 = new AbstractLinkedList.Node<Integer>();
      AbstractLinkedList.Node<Integer> abstractLinkedList_Node2 = abstractLinkedList_Node1.next;
      linkedList0.pollFirst();
      AbstractLinkedList.Node<Integer> abstractLinkedList_Node3 = abstractLinkedList_Node2.getPreviousNode();
      abstractLinkedList_Node0.setPreviousNode(abstractLinkedList_Node3);
      AbstractLinkedList.Node<Integer> abstractLinkedList_Node4 = abstractLinkedList_Node0.getNextNode();
      nodeCachingLinkedList0.addNodeToCache(abstractLinkedList_Node4);
      NodeCachingLinkedList<Object> nodeCachingLinkedList1 = new NodeCachingLinkedList<Object>();
      nodeCachingLinkedList1.setMaximumCacheSize(804);
      nodeCachingLinkedList1.getNodeFromCache();
      nodeCachingLinkedList0.removeAllNodes();
      nodeCachingLinkedList1.removeAllNodes();
      NodeCachingLinkedList<Locale.LanguageRange> nodeCachingLinkedList2 = new NodeCachingLinkedList<Locale.LanguageRange>(0);
      nodeCachingLinkedList2.getNodeFromCache();
      nodeCachingLinkedList2.setMaximumCacheSize(0);
      nodeCachingLinkedList0.createNode((Integer) null);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      NodeCachingLinkedList<String> nodeCachingLinkedList0 = new NodeCachingLinkedList<String>();
      nodeCachingLinkedList0.getNodeFromCache();
      AbstractLinkedList.LinkedSubList<String> abstractLinkedList_LinkedSubList0 = new AbstractLinkedList.LinkedSubList<String>(nodeCachingLinkedList0, 0, 0);
      abstractLinkedList_LinkedSubList0.add(") less than zero.");
      abstractLinkedList_LinkedSubList0.add("org.apache.commons.collections4.list.NodeCachingLinkedList");
      nodeCachingLinkedList0.createSubListListIterator(abstractLinkedList_LinkedSubList0, 0);
      nodeCachingLinkedList0.createNode("org.apache.commons.collections4.list.NodeCachingLinkedList");
      NodeCachingLinkedList<Object> nodeCachingLinkedList1 = new NodeCachingLinkedList<Object>();
      nodeCachingLinkedList1.getNodeFromCache();
      NodeCachingLinkedList<InputStream> nodeCachingLinkedList2 = new NodeCachingLinkedList<InputStream>();
      nodeCachingLinkedList2.removeAllNodes();
      nodeCachingLinkedList2.removeAllNodes();
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      NodeCachingLinkedList<String> nodeCachingLinkedList0 = new NodeCachingLinkedList<String>((-1));
      AbstractLinkedList.Node<String> abstractLinkedList_Node0 = new AbstractLinkedList.Node<String>();
      abstractLinkedList_Node0.setValue("e-nt]c>.+F7");
      AbstractLinkedList.Node<String> abstractLinkedList_Node1 = new AbstractLinkedList.Node<String>(abstractLinkedList_Node0, abstractLinkedList_Node0, "");
      nodeCachingLinkedList0.removeNode(abstractLinkedList_Node1);
      NodeCachingLinkedList<Object> nodeCachingLinkedList1 = null;
      try {
        nodeCachingLinkedList1 = new NodeCachingLinkedList<Object>(nodeCachingLinkedList0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Couldn't get the node: index (0) greater than the size of the list (-1).
         //
         verifyException("org.apache.commons.collections4.list.AbstractLinkedList", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      NodeCachingLinkedList<InputStream> nodeCachingLinkedList0 = new NodeCachingLinkedList<InputStream>((-1));
      nodeCachingLinkedList0.setMaximumCacheSize(0);
      nodeCachingLinkedList0.shrinkCacheToMaximumSize();
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      NodeCachingLinkedList<String> nodeCachingLinkedList0 = new NodeCachingLinkedList<String>((-1531));
      AbstractLinkedList.Node<String> abstractLinkedList_Node0 = new AbstractLinkedList.Node<String>();
      nodeCachingLinkedList0.addNodeToCache(abstractLinkedList_Node0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      NodeCachingLinkedList<Object> nodeCachingLinkedList0 = new NodeCachingLinkedList<Object>(679);
      AbstractLinkedList.Node<Object> abstractLinkedList_Node0 = new AbstractLinkedList.Node<Object>();
      nodeCachingLinkedList0.addNodeToCache(abstractLinkedList_Node0);
      nodeCachingLinkedList0.shrinkCacheToMaximumSize();
      nodeCachingLinkedList0.setMaximumCacheSize(20);
      nodeCachingLinkedList0.getNodeFromCache();
      int int0 = 0;
      NodeCachingLinkedList<String> nodeCachingLinkedList1 = new NodeCachingLinkedList<String>(0);
      nodeCachingLinkedList1.add("g");
      nodeCachingLinkedList1.setMaximumCacheSize(20);
      AbstractLinkedList.Node<String> abstractLinkedList_Node1 = new AbstractLinkedList.Node<String>("");
      AbstractLinkedList.Node<String> abstractLinkedList_Node2 = new AbstractLinkedList.Node<String>();
      AbstractLinkedList.Node<String> abstractLinkedList_Node3 = abstractLinkedList_Node2.getNextNode();
      abstractLinkedList_Node1.previous = abstractLinkedList_Node3;
      nodeCachingLinkedList1.addNodeToCache(abstractLinkedList_Node1);
      NodeCachingLinkedList<Integer> nodeCachingLinkedList2 = new NodeCachingLinkedList<Integer>();
      nodeCachingLinkedList2.removeAllNodes();
      Integer integer0 = new Integer(679);
      nodeCachingLinkedList2.createNode(integer0);
      nodeCachingLinkedList0.setMaximumCacheSize(1);
      NodeCachingLinkedList<Locale.LanguageRange> nodeCachingLinkedList3 = new NodeCachingLinkedList<Locale.LanguageRange>();
      nodeCachingLinkedList3.getNodeFromCache();
      nodeCachingLinkedList1.getNodeFromCache();
      try { 
        nodeCachingLinkedList0.getNode((-1531), true);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Couldn't get the node: index (-1531) less than zero.
         //
         verifyException("org.apache.commons.collections4.list.AbstractLinkedList", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      int int0 = 957;
      NodeCachingLinkedList<Object> nodeCachingLinkedList0 = new NodeCachingLinkedList<Object>(957);
      NodeCachingLinkedList<String> nodeCachingLinkedList1 = new NodeCachingLinkedList<String>();
      nodeCachingLinkedList1.removeAllNodes();
      AbstractLinkedList.Node<Object> abstractLinkedList_Node0 = nodeCachingLinkedList0.createHeaderNode();
      nodeCachingLinkedList0.addNodeToCache(abstractLinkedList_Node0);
      AbstractLinkedList.Node<Object> abstractLinkedList_Node1 = nodeCachingLinkedList0.createNode(nodeCachingLinkedList1);
      // Undeclared exception!
      try { 
        nodeCachingLinkedList0.addNode(abstractLinkedList_Node0, abstractLinkedList_Node1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.collections4.list.AbstractLinkedList", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      CursorableLinkedList<Integer> cursorableLinkedList0 = new CursorableLinkedList<Integer>();
      NodeCachingLinkedList<Integer> nodeCachingLinkedList0 = new NodeCachingLinkedList<Integer>(cursorableLinkedList0);
      cursorableLinkedList0.addAll((Collection<? extends Integer>) nodeCachingLinkedList0);
      nodeCachingLinkedList0.listIterator();
      nodeCachingLinkedList0.spliterator();
      nodeCachingLinkedList0.getNodeFromCache();
      nodeCachingLinkedList0.getNodeFromCache();
      NodeCachingLinkedList<Locale.LanguageRange> nodeCachingLinkedList1 = null;
      try {
        nodeCachingLinkedList1 = new NodeCachingLinkedList<Locale.LanguageRange>((Collection<? extends Locale.LanguageRange>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.collections4.list.AbstractLinkedList", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      NodeCachingLinkedList<Object> nodeCachingLinkedList0 = new NodeCachingLinkedList<Object>(16);
      NodeCachingLinkedList<String> nodeCachingLinkedList1 = new NodeCachingLinkedList<String>();
      nodeCachingLinkedList1.removeAllNodes();
      NodeCachingLinkedList<Integer> nodeCachingLinkedList2 = new NodeCachingLinkedList<Integer>();
      AbstractLinkedList.Node<Integer> abstractLinkedList_Node0 = new AbstractLinkedList.Node<Integer>((Integer) null);
      int int0 = (-207);
      Integer integer0 = new Integer((-207));
      AbstractLinkedList.Node<Integer> abstractLinkedList_Node1 = new AbstractLinkedList.Node<Integer>(abstractLinkedList_Node0, abstractLinkedList_Node0, integer0);
      nodeCachingLinkedList2.addNodeToCache(abstractLinkedList_Node1);
      LinkedList<Locale.LanguageRange> linkedList0 = new LinkedList<Locale.LanguageRange>();
      CursorableLinkedList<Locale.LanguageRange> cursorableLinkedList0 = new CursorableLinkedList<Locale.LanguageRange>(linkedList0);
      NodeCachingLinkedList<Locale.LanguageRange> nodeCachingLinkedList3 = new NodeCachingLinkedList<Locale.LanguageRange>(cursorableLinkedList0);
      nodeCachingLinkedList3.setMaximumCacheSize(16);
      nodeCachingLinkedList3.shrinkCacheToMaximumSize();
      nodeCachingLinkedList2.shrinkCacheToMaximumSize();
      nodeCachingLinkedList0.getNodeFromCache();
      // Undeclared exception!
      try { 
        nodeCachingLinkedList0.removeNode((AbstractLinkedList.Node<Object>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.collections4.list.AbstractLinkedList", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      NodeCachingLinkedList<Object> nodeCachingLinkedList0 = new NodeCachingLinkedList<Object>(0);
      assertNotNull(nodeCachingLinkedList0);
      assertFalse(nodeCachingLinkedList0.contains(0));
      assertTrue(nodeCachingLinkedList0.isEmpty());
      assertEquals(0, nodeCachingLinkedList0.size());
      
      NodeCachingLinkedList<String> nodeCachingLinkedList1 = new NodeCachingLinkedList<String>(0);
      assertNotNull(nodeCachingLinkedList1);
      assertEquals(0, nodeCachingLinkedList1.size());
      assertTrue(nodeCachingLinkedList1.isEmpty());
      
      Integer integer0 = new Integer(0);
      assertNotNull(integer0);
      assertEquals(0, (int)integer0);
      
      Predicate<String> predicate0 = Predicate.isEqual((Object) integer0);
      assertNotNull(predicate0);
      
      Predicate<String> predicate1 = predicate0.negate();
      assertNotNull(predicate1);
      assertFalse(predicate1.equals((Object)predicate0));
      
      Predicate<String> predicate2 = predicate1.or(predicate0);
      assertNotNull(predicate2);
      assertFalse(predicate0.equals((Object)predicate1));
      assertFalse(predicate1.equals((Object)predicate0));
      assertFalse(predicate2.equals((Object)predicate0));
      assertFalse(predicate2.equals((Object)predicate1));
      
      Predicate<String> predicate3 = predicate1.or(predicate0);
      assertNotNull(predicate3);
      assertNotSame(predicate3, predicate2);
      assertFalse(predicate0.equals((Object)predicate2));
      assertFalse(predicate0.equals((Object)predicate1));
      assertFalse(predicate1.equals((Object)predicate2));
      assertFalse(predicate1.equals((Object)predicate0));
      assertFalse(predicate3.equals((Object)predicate0));
      assertFalse(predicate3.equals((Object)predicate1));
      assertFalse(predicate3.equals((Object)predicate2));
      
      Predicate<Object> predicate4 = (Predicate<Object>) mock(Predicate.class, new ViolatedAssumptionAnswer());
      Predicate<String> predicate5 = predicate3.and(predicate4);
      assertNotNull(predicate5);
      assertNotSame(predicate3, predicate2);
      assertFalse(predicate0.equals((Object)predicate3));
      assertFalse(predicate0.equals((Object)predicate1));
      assertFalse(predicate0.equals((Object)predicate2));
      assertFalse(predicate1.equals((Object)predicate3));
      assertFalse(predicate1.equals((Object)predicate2));
      assertFalse(predicate1.equals((Object)predicate0));
      assertFalse(predicate3.equals((Object)predicate0));
      assertFalse(predicate3.equals((Object)predicate1));
      assertFalse(predicate3.equals((Object)predicate2));
      assertFalse(predicate5.equals((Object)predicate2));
      assertFalse(predicate5.equals((Object)predicate3));
      assertFalse(predicate5.equals((Object)predicate1));
      assertFalse(predicate5.equals((Object)predicate0));
      
      Predicate<String> predicate6 = predicate5.negate();
      assertNotNull(predicate6);
      assertNotSame(predicate1, predicate6);
      assertNotSame(predicate3, predicate2);
      assertNotSame(predicate6, predicate1);
      assertFalse(predicate0.equals((Object)predicate3));
      assertFalse(predicate0.equals((Object)predicate1));
      assertFalse(predicate0.equals((Object)predicate2));
      assertFalse(predicate0.equals((Object)predicate5));
      assertFalse(predicate1.equals((Object)predicate3));
      assertFalse(predicate1.equals((Object)predicate2));
      assertFalse(predicate1.equals((Object)predicate5));
      assertFalse(predicate1.equals((Object)predicate0));
      assertFalse(predicate3.equals((Object)predicate0));
      assertFalse(predicate3.equals((Object)predicate1));
      assertFalse(predicate3.equals((Object)predicate2));
      assertFalse(predicate3.equals((Object)predicate5));
      assertFalse(predicate5.equals((Object)predicate2));
      assertFalse(predicate5.equals((Object)predicate3));
      assertFalse(predicate5.equals((Object)predicate1));
      assertFalse(predicate5.equals((Object)predicate0));
      assertFalse(predicate6.equals((Object)predicate2));
      assertFalse(predicate6.equals((Object)predicate5));
      assertFalse(predicate6.equals((Object)predicate0));
      assertFalse(predicate6.equals((Object)predicate1));
      assertFalse(predicate6.equals((Object)predicate3));
      
      boolean boolean0 = nodeCachingLinkedList1.removeIf(predicate5);
      assertNotSame(predicate1, predicate6);
      assertNotSame(predicate3, predicate2);
      assertFalse(boolean0);
      assertFalse(predicate0.equals((Object)predicate3));
      assertFalse(predicate0.equals((Object)predicate6));
      assertFalse(predicate0.equals((Object)predicate1));
      assertFalse(predicate0.equals((Object)predicate2));
      assertFalse(predicate0.equals((Object)predicate5));
      assertFalse(predicate1.equals((Object)predicate6));
      assertFalse(predicate1.equals((Object)predicate3));
      assertFalse(predicate1.equals((Object)predicate2));
      assertFalse(predicate1.equals((Object)predicate5));
      assertFalse(predicate1.equals((Object)predicate0));
      assertFalse(predicate3.equals((Object)predicate0));
      assertFalse(predicate3.equals((Object)predicate1));
      assertFalse(predicate3.equals((Object)predicate2));
      assertFalse(predicate3.equals((Object)predicate5));
      assertFalse(predicate3.equals((Object)predicate6));
      assertFalse(predicate5.equals((Object)predicate6));
      assertFalse(predicate5.equals((Object)predicate2));
      assertFalse(predicate5.equals((Object)predicate3));
      assertFalse(predicate5.equals((Object)predicate1));
      assertFalse(predicate5.equals((Object)predicate0));
      assertEquals(0, nodeCachingLinkedList1.size());
      assertTrue(nodeCachingLinkedList1.isEmpty());
      
      String string0 = "org.apache.commons.collections4.list.NodeCachingLinkedList";
      AbstractLinkedList.Node<String> abstractLinkedList_Node0 = nodeCachingLinkedList1.createNode("org.apache.commons.collections4.list.NodeCachingLinkedList");
      assertNotNull(abstractLinkedList_Node0);
      assertFalse(nodeCachingLinkedList1.contains(string0));
      assertEquals(0, nodeCachingLinkedList1.size());
      assertTrue(nodeCachingLinkedList1.isEmpty());
      
      int int0 = nodeCachingLinkedList0.getMaximumCacheSize();
      assertFalse(nodeCachingLinkedList0.contains(0));
      assertEquals(0, int0);
      assertTrue(nodeCachingLinkedList0.isEmpty());
      assertEquals(0, nodeCachingLinkedList0.size());
      
      int int1 = (-1684);
      // Undeclared exception!
      nodeCachingLinkedList1.setMaximumCacheSize((-1684));
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      NodeCachingLinkedList<String> nodeCachingLinkedList0 = new NodeCachingLinkedList<String>((-4847));
      assertNotNull(nodeCachingLinkedList0);
      assertEquals(0, nodeCachingLinkedList0.size());
      assertTrue(nodeCachingLinkedList0.isEmpty());
      
      // Undeclared exception!
      nodeCachingLinkedList0.setMaximumCacheSize((-4847));
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      NodeCachingLinkedList<String> nodeCachingLinkedList0 = new NodeCachingLinkedList<String>();
      assertNotNull(nodeCachingLinkedList0);
      assertTrue(nodeCachingLinkedList0.isEmpty());
      assertEquals(0, nodeCachingLinkedList0.size());
      
      CursorableLinkedList<Integer> cursorableLinkedList0 = new CursorableLinkedList<Integer>();
      assertNotNull(cursorableLinkedList0);
      assertEquals(0, cursorableLinkedList0.size());
      assertTrue(cursorableLinkedList0.isEmpty());
      
      CursorableLinkedList<Integer> cursorableLinkedList1 = new CursorableLinkedList<Integer>(cursorableLinkedList0);
      assertNotNull(cursorableLinkedList1);
      assertTrue(cursorableLinkedList1.equals((Object)cursorableLinkedList0));
      assertEquals(0, cursorableLinkedList0.size());
      assertTrue(cursorableLinkedList0.isEmpty());
      assertTrue(cursorableLinkedList1.isEmpty());
      assertEquals(0, cursorableLinkedList1.size());
      
      NodeCachingLinkedList<Integer> nodeCachingLinkedList1 = new NodeCachingLinkedList<Integer>(cursorableLinkedList1);
      assertNotNull(nodeCachingLinkedList1);
      assertTrue(cursorableLinkedList0.equals((Object)cursorableLinkedList1));
      assertTrue(cursorableLinkedList1.equals((Object)cursorableLinkedList0));
      assertEquals(0, cursorableLinkedList0.size());
      assertTrue(cursorableLinkedList0.isEmpty());
      assertTrue(cursorableLinkedList1.isEmpty());
      assertEquals(0, cursorableLinkedList1.size());
      assertTrue(nodeCachingLinkedList1.isEmpty());
      assertEquals(0, nodeCachingLinkedList1.size());
      
      int int0 = nodeCachingLinkedList1.getMaximumCacheSize();
      assertNotSame(cursorableLinkedList0, cursorableLinkedList1);
      assertNotSame(cursorableLinkedList1, cursorableLinkedList0);
      assertFalse(cursorableLinkedList0.contains(int0));
      assertFalse(cursorableLinkedList1.contains(int0));
      assertFalse(nodeCachingLinkedList1.contains(int0));
      assertEquals(20, int0);
      assertTrue(cursorableLinkedList0.equals((Object)cursorableLinkedList1));
      assertTrue(cursorableLinkedList1.equals((Object)cursorableLinkedList0));
      assertEquals(0, cursorableLinkedList0.size());
      assertTrue(cursorableLinkedList0.isEmpty());
      assertTrue(cursorableLinkedList1.isEmpty());
      assertEquals(0, cursorableLinkedList1.size());
      assertTrue(nodeCachingLinkedList1.isEmpty());
      assertEquals(0, nodeCachingLinkedList1.size());
      
      NodeCachingLinkedList<Object> nodeCachingLinkedList2 = new NodeCachingLinkedList<Object>(31);
      assertNotNull(nodeCachingLinkedList2);
      assertFalse(nodeCachingLinkedList2.contains(31));
      assertTrue(nodeCachingLinkedList2.isEmpty());
      assertEquals(0, nodeCachingLinkedList2.size());
      
      nodeCachingLinkedList2.setMaximumCacheSize(31);
      assertFalse(nodeCachingLinkedList2.contains(31));
      assertTrue(nodeCachingLinkedList2.isEmpty());
      assertEquals(0, nodeCachingLinkedList2.size());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      NodeCachingLinkedList<String> nodeCachingLinkedList0 = new NodeCachingLinkedList<String>();
      assertNotNull(nodeCachingLinkedList0);
      assertTrue(nodeCachingLinkedList0.isEmpty());
      assertEquals(0, nodeCachingLinkedList0.size());
      
      AbstractLinkedList.Node<String> abstractLinkedList_Node0 = new AbstractLinkedList.Node<String>();
      assertNotNull(abstractLinkedList_Node0);
      
      AbstractLinkedList.Node<String> abstractLinkedList_Node1 = abstractLinkedList_Node0.getPreviousNode();
      assertNotNull(abstractLinkedList_Node1);
      assertSame(abstractLinkedList_Node0, abstractLinkedList_Node1);
      assertSame(abstractLinkedList_Node1, abstractLinkedList_Node0);
      
      nodeCachingLinkedList0.addNodeToCache(abstractLinkedList_Node1);
      assertSame(abstractLinkedList_Node0, abstractLinkedList_Node1);
      assertSame(abstractLinkedList_Node1, abstractLinkedList_Node0);
      assertTrue(nodeCachingLinkedList0.isEmpty());
      assertEquals(0, nodeCachingLinkedList0.size());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      CursorableLinkedList<Locale.LanguageRange> cursorableLinkedList0 = new CursorableLinkedList<Locale.LanguageRange>();
      assertNotNull(cursorableLinkedList0);
      assertEquals(0, cursorableLinkedList0.size());
      assertTrue(cursorableLinkedList0.isEmpty());
      
      NodeCachingLinkedList<Locale.LanguageRange> nodeCachingLinkedList0 = new NodeCachingLinkedList<Locale.LanguageRange>(cursorableLinkedList0);
      assertNotNull(nodeCachingLinkedList0);
      assertEquals(0, cursorableLinkedList0.size());
      assertTrue(cursorableLinkedList0.isEmpty());
      assertEquals(0, nodeCachingLinkedList0.size());
      assertTrue(nodeCachingLinkedList0.isEmpty());
      
      CursorableLinkedList<String> cursorableLinkedList1 = new CursorableLinkedList<String>();
      assertNotNull(cursorableLinkedList1);
      assertEquals(0, cursorableLinkedList1.size());
      assertTrue(cursorableLinkedList1.isEmpty());
      
      List<String> list0 = Locale.filterTags((List<Locale.LanguageRange>) nodeCachingLinkedList0, (Collection<String>) cursorableLinkedList1);
      assertNotNull(list0);
      assertEquals(0, cursorableLinkedList0.size());
      assertTrue(cursorableLinkedList0.isEmpty());
      assertEquals(0, nodeCachingLinkedList0.size());
      assertTrue(nodeCachingLinkedList0.isEmpty());
      assertEquals(0, cursorableLinkedList1.size());
      assertTrue(cursorableLinkedList1.isEmpty());
      assertTrue(list0.isEmpty());
      assertEquals(0, list0.size());
      
      NodeCachingLinkedList<String> nodeCachingLinkedList1 = new NodeCachingLinkedList<String>(list0);
      assertNotNull(nodeCachingLinkedList1);
      assertEquals(0, cursorableLinkedList0.size());
      assertTrue(cursorableLinkedList0.isEmpty());
      assertEquals(0, nodeCachingLinkedList0.size());
      assertTrue(nodeCachingLinkedList0.isEmpty());
      assertEquals(0, cursorableLinkedList1.size());
      assertTrue(cursorableLinkedList1.isEmpty());
      assertTrue(list0.isEmpty());
      assertEquals(0, list0.size());
      assertEquals(0, nodeCachingLinkedList1.size());
      assertTrue(nodeCachingLinkedList1.isEmpty());
      
      NodeCachingLinkedList<Object> nodeCachingLinkedList2 = new NodeCachingLinkedList<Object>(nodeCachingLinkedList0);
      assertNotNull(nodeCachingLinkedList2);
      assertEquals(0, cursorableLinkedList0.size());
      assertTrue(cursorableLinkedList0.isEmpty());
      assertEquals(0, nodeCachingLinkedList0.size());
      assertTrue(nodeCachingLinkedList0.isEmpty());
      assertTrue(nodeCachingLinkedList2.isEmpty());
      assertEquals(0, nodeCachingLinkedList2.size());
      
      // Undeclared exception!
      try { 
        nodeCachingLinkedList2.addNodeToCache((AbstractLinkedList.Node<Object>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.collections4.list.NodeCachingLinkedList", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      NodeCachingLinkedList<Integer> nodeCachingLinkedList0 = new NodeCachingLinkedList<Integer>(2435);
      assertNotNull(nodeCachingLinkedList0);
      assertFalse(nodeCachingLinkedList0.contains(2435));
      assertEquals(0, nodeCachingLinkedList0.size());
      assertTrue(nodeCachingLinkedList0.isEmpty());
      
      Integer integer0 = new Integer(2435);
      assertNotNull(integer0);
      assertEquals(2435, (int)integer0);
      
      AbstractLinkedList.Node<Integer> abstractLinkedList_Node0 = nodeCachingLinkedList0.createNode(integer0);
      assertNotNull(abstractLinkedList_Node0);
      assertFalse(nodeCachingLinkedList0.contains(2435));
      assertEquals(0, nodeCachingLinkedList0.size());
      assertTrue(nodeCachingLinkedList0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      NodeCachingLinkedList<String> nodeCachingLinkedList0 = new NodeCachingLinkedList<String>(2202);
      assertNotNull(nodeCachingLinkedList0);
      assertTrue(nodeCachingLinkedList0.isEmpty());
      assertEquals(0, nodeCachingLinkedList0.size());
      
      AbstractLinkedList.Node<String> abstractLinkedList_Node0 = nodeCachingLinkedList0.getNodeFromCache();
      assertNull(abstractLinkedList_Node0);
      assertTrue(nodeCachingLinkedList0.isEmpty());
      assertEquals(0, nodeCachingLinkedList0.size());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      NodeCachingLinkedList<String> nodeCachingLinkedList0 = new NodeCachingLinkedList<String>(756);
      assertNotNull(nodeCachingLinkedList0);
      assertEquals(0, nodeCachingLinkedList0.size());
      assertTrue(nodeCachingLinkedList0.isEmpty());
      
      int int0 = nodeCachingLinkedList0.getMaximumCacheSize();
      assertEquals(756, int0);
      assertEquals(0, nodeCachingLinkedList0.size());
      assertTrue(nodeCachingLinkedList0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Locale locale0 = new Locale("ufm", "ufm");
      assertNotNull(locale0);
      assertEquals("", locale0.getVariant());
      assertEquals("UFM", locale0.getCountry());
      assertEquals("ufm", locale0.getISO3Language());
      assertEquals("ufm_UFM", locale0.toString());
      assertEquals("ufm", locale0.getLanguage());
      
      Set<String> set0 = locale0.getUnicodeLocaleAttributes();
      assertNotNull(set0);
      assertFalse(set0.contains("ufm"));
      assertEquals("", locale0.getVariant());
      assertEquals("UFM", locale0.getCountry());
      assertEquals("ufm", locale0.getISO3Language());
      assertEquals("ufm_UFM", locale0.toString());
      assertEquals("ufm", locale0.getLanguage());
      assertTrue(set0.isEmpty());
      assertEquals(0, set0.size());
      
      NodeCachingLinkedList<String> nodeCachingLinkedList0 = new NodeCachingLinkedList<String>(set0);
      assertNotNull(nodeCachingLinkedList0);
      assertFalse(set0.contains("ufm"));
      assertFalse(nodeCachingLinkedList0.contains("ufm"));
      assertEquals("", locale0.getVariant());
      assertEquals("UFM", locale0.getCountry());
      assertEquals("ufm", locale0.getISO3Language());
      assertEquals("ufm_UFM", locale0.toString());
      assertEquals("ufm", locale0.getLanguage());
      assertTrue(set0.isEmpty());
      assertEquals(0, set0.size());
      assertEquals(0, nodeCachingLinkedList0.size());
      assertTrue(nodeCachingLinkedList0.isEmpty());
      
      AbstractLinkedList.Node<String> abstractLinkedList_Node0 = nodeCachingLinkedList0.header;
      assertNotNull(abstractLinkedList_Node0);
      
      nodeCachingLinkedList0.removeNode(abstractLinkedList_Node0);
      assertFalse(set0.contains("ufm"));
      assertEquals("", locale0.getVariant());
      assertEquals("UFM", locale0.getCountry());
      assertEquals("ufm", locale0.getISO3Language());
      assertEquals("ufm_UFM", locale0.toString());
      assertEquals("ufm", locale0.getLanguage());
      assertTrue(set0.isEmpty());
      assertEquals(0, set0.size());
      assertFalse(nodeCachingLinkedList0.isEmpty());
      assertEquals((-1), nodeCachingLinkedList0.size());
      
      NodeCachingLinkedList<Locale.LanguageRange> nodeCachingLinkedList1 = new NodeCachingLinkedList<Locale.LanguageRange>();
      assertNotNull(nodeCachingLinkedList1);
      assertTrue(nodeCachingLinkedList1.isEmpty());
      assertEquals(0, nodeCachingLinkedList1.size());
      
      boolean boolean0 = nodeCachingLinkedList1.isCacheFull();
      assertFalse(boolean0);
      assertTrue(nodeCachingLinkedList1.isEmpty());
      assertEquals(0, nodeCachingLinkedList1.size());
      
      NodeCachingLinkedList<Integer> nodeCachingLinkedList2 = new NodeCachingLinkedList<Integer>();
      assertNotNull(nodeCachingLinkedList2);
      assertEquals(0, nodeCachingLinkedList2.size());
      assertTrue(nodeCachingLinkedList2.isEmpty());
      
      nodeCachingLinkedList2.removeAllNodes();
      assertEquals(0, nodeCachingLinkedList2.size());
      assertTrue(nodeCachingLinkedList2.isEmpty());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      NodeCachingLinkedList<Locale.LanguageRange> nodeCachingLinkedList0 = new NodeCachingLinkedList<Locale.LanguageRange>();
      assertNotNull(nodeCachingLinkedList0);
      assertEquals(0, nodeCachingLinkedList0.size());
      assertTrue(nodeCachingLinkedList0.isEmpty());
      
      int int0 = nodeCachingLinkedList0.getMaximumCacheSize();
      assertEquals(20, int0);
      assertEquals(0, nodeCachingLinkedList0.size());
      assertTrue(nodeCachingLinkedList0.isEmpty());
      
      NodeCachingLinkedList<SequenceInputStream> nodeCachingLinkedList1 = new NodeCachingLinkedList<SequenceInputStream>();
      assertNotNull(nodeCachingLinkedList1);
      assertTrue(nodeCachingLinkedList1.isEmpty());
      assertEquals(0, nodeCachingLinkedList1.size());
      
      AbstractLinkedList.Node<SequenceInputStream> abstractLinkedList_Node0 = nodeCachingLinkedList1.createNode((SequenceInputStream) null);
      assertNotNull(abstractLinkedList_Node0);
      assertTrue(nodeCachingLinkedList1.isEmpty());
      assertEquals(0, nodeCachingLinkedList1.size());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      int int0 = (-650);
      NodeCachingLinkedList<Object> nodeCachingLinkedList0 = new NodeCachingLinkedList<Object>((-650));
      assertNotNull(nodeCachingLinkedList0);
      assertFalse(nodeCachingLinkedList0.contains((-650)));
      assertTrue(nodeCachingLinkedList0.isEmpty());
      assertEquals(0, nodeCachingLinkedList0.size());
      
      // Undeclared exception!
      nodeCachingLinkedList0.setMaximumCacheSize((-650));
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      NodeCachingLinkedList<Locale.LanguageRange> nodeCachingLinkedList0 = new NodeCachingLinkedList<Locale.LanguageRange>();
      nodeCachingLinkedList0.iterator();
      nodeCachingLinkedList0.shrinkCacheToMaximumSize();
      NodeCachingLinkedList<Integer> nodeCachingLinkedList1 = new NodeCachingLinkedList<Integer>(3443);
      AbstractLinkedList.Node<Integer> abstractLinkedList_Node0 = nodeCachingLinkedList1.createHeaderNode();
      AbstractLinkedList.Node<Integer> abstractLinkedList_Node1 = abstractLinkedList_Node0.getPreviousNode();
      nodeCachingLinkedList1.addNode(abstractLinkedList_Node1, abstractLinkedList_Node0);
      int int0 = (-2296);
      nodeCachingLinkedList1.removeAllNodes();
      Integer integer0 = new Integer((-2296));
      nodeCachingLinkedList1.createNode(integer0);
      NodeCachingLinkedList<String> nodeCachingLinkedList2 = new NodeCachingLinkedList<String>(3443);
      nodeCachingLinkedList2.removeAllNodes();
      CursorableLinkedList<InputStream> cursorableLinkedList0 = new CursorableLinkedList<InputStream>();
      CursorableLinkedList.Cursor<InputStream> cursorableLinkedList_Cursor0 = new CursorableLinkedList.Cursor<InputStream>(cursorableLinkedList0, 0);
      AbstractLinkedList<InputStream> abstractLinkedList0 = cursorableLinkedList_Cursor0.parent;
      AbstractLinkedList.LinkedSubList<InputStream> abstractLinkedList_LinkedSubList0 = null;
      try {
        abstractLinkedList_LinkedSubList0 = new AbstractLinkedList.LinkedSubList<InputStream>(abstractLinkedList0, (-3705), 0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // fromIndex = -3705
         //
         verifyException("org.apache.commons.collections4.list.AbstractLinkedList$LinkedSubList", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      NodeCachingLinkedList<Object> nodeCachingLinkedList0 = new NodeCachingLinkedList<Object>(0);
      NodeCachingLinkedList<SequenceInputStream> nodeCachingLinkedList1 = new NodeCachingLinkedList<SequenceInputStream>(0);
      nodeCachingLinkedList1.shrinkCacheToMaximumSize();
      NodeCachingLinkedList<String> nodeCachingLinkedList2 = new NodeCachingLinkedList<String>(0);
      AbstractLinkedList.Node<String> abstractLinkedList_Node0 = nodeCachingLinkedList2.header;
      nodeCachingLinkedList2.removeNode(abstractLinkedList_Node0);
      NodeCachingLinkedList<Integer> nodeCachingLinkedList3 = new NodeCachingLinkedList<Integer>(0);
      // Undeclared exception!
      try { 
        nodeCachingLinkedList2.set(0, "FL1%kvLPAy<V?U`");
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Couldn't get the node: index (0) greater than the size of the list (-1).
         //
         verifyException("org.apache.commons.collections4.list.AbstractLinkedList", e);
      }
  }
}
