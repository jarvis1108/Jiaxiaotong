/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Sat Apr 27 03:29:38 GMT 2019
 */

package org.apache.commons.collections4;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

import static org.evosuite.shaded.org.mockito.Mockito.*;
@EvoSuiteClassExclude
public class SetUtils_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "org.apache.commons.collections4.SetUtils"; 
    org.evosuite.runtime.GuiSupport.initialize(); 
    org.evosuite.runtime.RuntimeSettings.maxNumberOfThreads = 100; 
    org.evosuite.runtime.RuntimeSettings.maxNumberOfIterationsPerLoop = 10000; 
    org.evosuite.runtime.RuntimeSettings.mockSystemIn = true; 
    org.evosuite.runtime.RuntimeSettings.sandboxMode = org.evosuite.runtime.sandbox.Sandbox.SandboxMode.RECOMMENDED; 
    org.evosuite.runtime.sandbox.Sandbox.initializeSecurityManagerForSUT(); 
    org.evosuite.runtime.classhandling.JDKClassResetter.init();
    setSystemProperties();
    initializeClasses();
    org.evosuite.runtime.Runtime.getInstance().resetRuntime(); 
    try { initMocksToAvoidTimeoutsInTheTests(); } catch(ClassNotFoundException e) {} 
  } 

  @AfterClass 
  public static void clearEvoSuiteFramework(){ 
    Sandbox.resetDefaultSecurityManager(); 
    java.lang.System.setProperties((java.util.Properties) defaultProperties.clone()); 
  } 

  @Before 
  public void initTestCase(){ 
    threadStopper.storeCurrentThreads();
    threadStopper.startRecordingTime();
    org.evosuite.runtime.jvm.ShutdownHookHandler.getInstance().initHandler(); 
    org.evosuite.runtime.sandbox.Sandbox.goingToExecuteSUTCode(); 
    setSystemProperties(); 
    org.evosuite.runtime.GuiSupport.setHeadless(); 
    org.evosuite.runtime.Runtime.getInstance().resetRuntime(); 
    org.evosuite.runtime.agent.InstrumentingAgent.activate(); 
  } 

  @After 
  public void doneWithTestCase(){ 
    threadStopper.killAndJoinClientThreads();
    org.evosuite.runtime.jvm.ShutdownHookHandler.getInstance().safeExecuteAddedHooks(); 
    org.evosuite.runtime.classhandling.JDKClassResetter.reset(); 
    resetClasses(); 
    org.evosuite.runtime.sandbox.Sandbox.doneWithExecutingSUTCode(); 
    org.evosuite.runtime.agent.InstrumentingAgent.deactivate(); 
    org.evosuite.runtime.GuiSupport.restoreHeadlessMode(); 
  } 

  public static void setSystemProperties() {
 
    java.lang.System.setProperties((java.util.Properties) defaultProperties.clone()); 
    java.lang.System.setProperty("file.encoding", "GBK"); 
    java.lang.System.setProperty("java.awt.headless", "true"); 
    java.lang.System.setProperty("java.io.tmpdir", "C:\\Users\\Dell\\AppData\\Local\\Temp\\"); 
    java.lang.System.setProperty("user.country", "CN"); 
    java.lang.System.setProperty("user.dir", "D:\\myProjects\\courseProgram\\commons-collections4-4.3-src"); 
    java.lang.System.setProperty("user.home", "C:\\Users\\Dell"); 
    java.lang.System.setProperty("user.language", "zh"); 
    java.lang.System.setProperty("user.name", "Dell"); 
    java.lang.System.setProperty("user.timezone", "Asia/Shanghai"); 
  }

  private static void initializeClasses() {
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(SetUtils_ESTest_scaffolding.class.getClassLoader() ,
      "org.apache.commons.collections4.IteratorUtils",
      "org.apache.commons.collections4.iterators.EmptyListIterator",
      "org.apache.commons.collections4.functors.ExceptionPredicate",
      "org.apache.commons.collections4.functors.ComparatorPredicate$1",
      "org.apache.commons.collections4.iterators.FilterIterator",
      "org.apache.commons.collections4.functors.InstanceofPredicate",
      "org.apache.commons.collections4.Equator",
      "org.apache.commons.collections4.SetUtils$6",
      "org.apache.commons.collections4.functors.EqualPredicate",
      "org.apache.commons.collections4.SetUtils$5",
      "org.apache.commons.collections4.SetUtils$4",
      "org.apache.commons.collections4.SetUtils$3",
      "org.apache.commons.collections4.SetUtils$2",
      "org.apache.commons.collections4.set.TransformedSet",
      "org.apache.commons.collections4.functors.ComparatorPredicate",
      "org.apache.commons.collections4.SetUtils$1",
      "org.apache.commons.collections4.set.AbstractSerializableSetDecorator",
      "org.apache.commons.collections4.set.PredicatedSortedSet",
      "org.apache.commons.collections4.set.ListOrderedSet$OrderedSetIterator",
      "org.apache.commons.collections4.iterators.EmptyOrderedMapIterator",
      "org.apache.commons.collections4.set.UnmodifiableNavigableSet",
      "org.apache.commons.collections4.functors.TransformerPredicate",
      "org.apache.commons.collections4.functors.FalsePredicate",
      "org.apache.commons.collections4.functors.PredicateDecorator",
      "org.apache.commons.collections4.collection.TransformedCollection",
      "org.apache.commons.collections4.Transformer",
      "org.apache.commons.collections4.iterators.UnmodifiableIterator",
      "org.apache.commons.collections4.set.AbstractSortedSetDecorator",
      "org.apache.commons.collections4.OrderedMapIterator",
      "org.apache.commons.collections4.iterators.EmptyIterator",
      "org.apache.commons.collections4.collection.AbstractCollectionDecorator",
      "org.apache.commons.collections4.ClosureUtilsTest",
      "org.apache.commons.collections4.iterators.EmptyMapIterator",
      "org.apache.commons.collections4.set.PredicatedNavigableSet",
      "org.apache.commons.collections4.iterators.EmptyOrderedIterator",
      "org.apache.commons.collections4.set.UnmodifiableSet",
      "org.apache.commons.collections4.functors.NullIsTruePredicate",
      "org.apache.commons.collections4.set.PredicatedSet",
      "org.apache.commons.collections4.MapIterator",
      "org.apache.commons.collections4.iterators.IteratorChain",
      "org.apache.commons.collections4.set.TransformedNavigableSet",
      "org.apache.commons.collections4.functors.UniquePredicate",
      "org.apache.commons.collections4.set.UnmodifiableSortedSet",
      "org.apache.commons.collections4.functors.ComparatorPredicate$Criterion",
      "org.apache.commons.collections4.Predicate",
      "org.apache.commons.collections4.set.ListOrderedSet",
      "org.apache.commons.collections4.iterators.AbstractEmptyMapIterator",
      "org.apache.commons.collections4.SetUtils$SetView",
      "org.apache.commons.collections4.functors.TruePredicate",
      "org.apache.commons.collections4.ClosureUtilsTest$MockTransformer",
      "org.apache.commons.collections4.iterators.AbstractEmptyIterator",
      "org.apache.commons.collections4.CollectionUtils",
      "org.apache.commons.collections4.functors.NotNullPredicate",
      "org.apache.commons.collections4.set.TransformedSortedSet",
      "org.apache.commons.collections4.SetUtils",
      "org.apache.commons.collections4.FunctorException",
      "org.apache.commons.collections4.Unmodifiable",
      "org.apache.commons.collections4.iterators.AbstractIteratorDecorator",
      "org.apache.commons.collections4.functors.NotPredicate",
      "org.apache.commons.collections4.collection.PredicatedCollection",
      "org.apache.commons.collections4.set.AbstractSetDecorator",
      "org.apache.commons.collections4.functors.TransformedPredicate",
      "org.apache.commons.collections4.ResettableIterator",
      "org.apache.commons.collections4.ResettableListIterator",
      "org.apache.commons.collections4.OrderedIterator",
      "org.apache.commons.collections4.iterators.AbstractUntypedIteratorDecorator",
      "org.apache.commons.collections4.functors.NullIsExceptionPredicate",
      "org.apache.commons.collections4.set.AbstractNavigableSetDecorator"
    );
  } 
  private static void initMocksToAvoidTimeoutsInTheTests() throws ClassNotFoundException { 
    mock(Class.forName("java.util.Comparator", false, SetUtils_ESTest_scaffolding.class.getClassLoader()));
    mock(Class.forName("org.apache.commons.collections4.Transformer", false, SetUtils_ESTest_scaffolding.class.getClassLoader()));
  }

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(SetUtils_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "org.apache.commons.collections4.collection.AbstractCollectionDecorator",
      "org.apache.commons.collections4.set.AbstractSetDecorator",
      "org.apache.commons.collections4.set.AbstractSortedSetDecorator",
      "org.apache.commons.collections4.set.UnmodifiableSortedSet",
      "org.apache.commons.collections4.SetUtils",
      "org.apache.commons.collections4.SetUtils$1",
      "org.apache.commons.collections4.SetUtils$SetView",
      "org.apache.commons.collections4.SetUtils$2",
      "org.apache.commons.collections4.SetUtils$3",
      "org.apache.commons.collections4.SetUtils$4",
      "org.apache.commons.collections4.SetUtils$5",
      "org.apache.commons.collections4.SetUtils$6",
      "org.apache.commons.collections4.functors.IdentityPredicate",
      "org.apache.commons.collections4.collection.PredicatedCollection",
      "org.apache.commons.collections4.set.PredicatedSet",
      "org.apache.commons.collections4.set.PredicatedSortedSet",
      "org.apache.commons.collections4.set.PredicatedNavigableSet",
      "org.apache.commons.collections4.collection.TransformedCollection",
      "org.apache.commons.collections4.set.TransformedSet",
      "org.apache.commons.collections4.set.TransformedSortedSet",
      "org.apache.commons.collections4.set.TransformedNavigableSet",
      "org.apache.commons.collections4.iterators.AbstractEmptyIterator",
      "org.apache.commons.collections4.iterators.EmptyIterator",
      "org.apache.commons.collections4.iterators.EmptyListIterator",
      "org.apache.commons.collections4.iterators.EmptyOrderedIterator",
      "org.apache.commons.collections4.iterators.AbstractEmptyMapIterator",
      "org.apache.commons.collections4.iterators.EmptyMapIterator",
      "org.apache.commons.collections4.iterators.EmptyOrderedMapIterator",
      "org.apache.commons.collections4.IteratorUtils",
      "org.apache.commons.collections4.iterators.FilterIterator",
      "org.apache.commons.collections4.iterators.UnmodifiableIterator",
      "org.apache.commons.collections4.iterators.IteratorChain",
      "org.apache.commons.collections4.CollectionUtils",
      "org.apache.commons.collections4.set.AbstractSerializableSetDecorator",
      "org.apache.commons.collections4.set.UnmodifiableSet",
      "org.apache.commons.collections4.functors.EqualPredicate",
      "org.apache.commons.collections4.functors.FalsePredicate",
      "org.apache.commons.collections4.functors.NotPredicate",
      "org.apache.commons.collections4.functors.NullIsTruePredicate",
      "org.apache.commons.collections4.set.AbstractNavigableSetDecorator",
      "org.apache.commons.collections4.set.UnmodifiableNavigableSet",
      "org.apache.commons.collections4.ClosureUtilsTest$MockTransformer",
      "org.apache.commons.collections4.functors.DefaultEquator",
      "org.apache.commons.collections4.functors.ComparatorPredicate",
      "org.apache.commons.collections4.functors.ComparatorPredicate$1",
      "org.apache.commons.collections4.set.ListOrderedSet",
      "org.apache.commons.collections4.functors.InstanceofPredicate",
      "org.apache.commons.collections4.functors.TransformedPredicate",
      "org.apache.commons.collections4.functors.AbstractQuantifierPredicate",
      "org.apache.commons.collections4.functors.NonePredicate",
      "org.apache.commons.collections4.functors.FunctorUtils",
      "org.apache.commons.collections4.functors.OnePredicate",
      "org.apache.commons.collections4.functors.AnyPredicate",
      "org.apache.commons.collections4.functors.AllPredicate",
      "org.apache.commons.collections4.functors.OrPredicate",
      "org.apache.commons.collections4.functors.NullIsExceptionPredicate",
      "org.apache.commons.collections4.functors.NotNullPredicate",
      "org.apache.commons.collections4.functors.AndPredicate",
      "org.apache.commons.collections4.functors.ExceptionPredicate",
      "org.apache.commons.collections4.functors.TruePredicate",
      "org.apache.commons.collections4.functors.NullPredicate",
      "org.apache.commons.collections4.functors.TransformerPredicate",
      "org.apache.commons.collections4.functors.NullIsFalsePredicate",
      "org.apache.commons.collections4.iterators.AbstractUntypedIteratorDecorator",
      "org.apache.commons.collections4.iterators.AbstractIteratorDecorator",
      "org.apache.commons.collections4.set.ListOrderedSet$OrderedSetIterator",
      "org.apache.commons.collections4.FunctorException",
      "org.apache.commons.collections4.functors.UniquePredicate",
      "org.apache.commons.collections4.functors.ComparatorPredicate$Criterion"
    );
  }
}
