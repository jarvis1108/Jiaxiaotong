/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Sat Apr 27 04:32:19 GMT 2019
 */

package org.apache.commons.collections4.map;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

@EvoSuiteClassExclude
public class AbstractMapDecorator_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "org.apache.commons.collections4.map.AbstractMapDecorator"; 
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
  } 

  @Before 
  public void initTestCase(){ 
    threadStopper.storeCurrentThreads();
    threadStopper.startRecordingTime();
    org.evosuite.runtime.jvm.ShutdownHookHandler.getInstance().initHandler(); 
    org.evosuite.runtime.sandbox.Sandbox.goingToExecuteSUTCode(); 
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
 
    /*No java.lang.System property to set*/
  }

  private static void initializeClasses() {
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(AbstractMapDecorator_ESTest_scaffolding.class.getClassLoader() ,
      "org.apache.commons.collections4.map.AbstractLinkedMap",
      "org.apache.commons.collections4.iterators.AbstractIteratorTest",
      "org.apache.commons.collections4.KeyValue",
      "org.apache.commons.collections4.functors.NullPredicate",
      "org.apache.commons.collections4.map.PassiveExpiringMap",
      "org.apache.commons.collections4.functors.OnePredicate",
      "org.apache.commons.collections4.functors.WhileClosure",
      "org.apache.commons.collections4.BulkTest",
      "org.apache.commons.collections4.bidimap.TreeBidiMap$Node",
      "org.apache.commons.collections4.bidimap.AbstractDualBidiMap$BidiMapIterator",
      "org.apache.commons.collections4.map.ReferenceIdentityMap",
      "org.apache.commons.collections4.map.MultiValueMap$ReflectionFactory",
      "org.apache.commons.collections4.map.ListOrderedMap",
      "org.apache.commons.collections4.map.AbstractHashedMap",
      "org.apache.commons.collections4.map.AbstractHashedMap$KeySetIterator",
      "org.apache.commons.collections4.functors.PredicateTransformer",
      "org.apache.commons.collections4.functors.IfTransformer",
      "org.apache.commons.collections4.trie.AbstractPatriciaTrie$RangeEntrySet",
      "org.apache.commons.collections4.trie.KeyAnalyzer",
      "org.apache.commons.collections4.map.AbstractReferenceMap$ReferenceValuesIterator",
      "org.apache.commons.collections4.functors.NonePredicate",
      "org.apache.commons.collections4.map.SingletonMap",
      "org.apache.commons.collections4.functors.ComparatorPredicate$Criterion",
      "org.apache.commons.collections4.bidimap.AbstractDualBidiMap$MapEntry",
      "org.apache.commons.collections4.bidimap.TreeBidiMap$InverseEntryView",
      "org.apache.commons.collections4.functors.TruePredicate",
      "org.apache.commons.collections4.map.ReferenceMap",
      "org.apache.commons.collections4.Trie",
      "org.apache.commons.collections4.map.AbstractReferenceMap$ReferenceKeySetIterator",
      "org.apache.commons.collections4.functors.NotNullPredicate",
      "org.apache.commons.collections4.map.AbstractReferenceMap$WeakRef",
      "org.apache.commons.collections4.map.PassiveExpiringMap$ConstantTimeToLiveExpirationPolicy",
      "org.apache.commons.collections4.map.AbstractHashedMap$ValuesIterator",
      "org.apache.commons.collections4.functors.DefaultEquator",
      "org.apache.commons.collections4.iterators.ObjectGraphIteratorTest$Leaf",
      "org.apache.commons.collections4.bidimap.UnmodifiableOrderedBidiMap",
      "org.apache.commons.collections4.functors.ChainedTransformer",
      "org.apache.commons.collections4.functors.PrototypeFactory",
      "org.apache.commons.collections4.functors.AndPredicate",
      "org.apache.commons.collections4.bidimap.DualTreeBidiMap$BidiOrderedMapIterator",
      "org.apache.commons.collections4.trie.AbstractPatriciaTrie$KeySet",
      "org.apache.commons.collections4.bidimap.TreeBidiMap$ViewIterator",
      "org.apache.commons.collections4.map.ReferenceMapTest$AccessibleEntry",
      "org.apache.commons.collections4.map.ListOrderedMap$ListOrderedMapIterator",
      "org.apache.commons.collections4.map.AbstractHashedMap$HashEntry",
      "org.apache.commons.collections4.map.TransformedSortedMap",
      "org.apache.commons.collections4.trie.UnmodifiableTrie",
      "org.apache.commons.collections4.functors.NullIsFalsePredicate",
      "org.apache.commons.collections4.bidimap.AbstractSortedBidiMapDecorator",
      "org.apache.commons.collections4.functors.InstanceofPredicate",
      "org.apache.commons.collections4.map.AbstractMapDecorator",
      "org.apache.commons.collections4.functors.IdentityPredicate",
      "org.apache.commons.collections4.keyvalue.DefaultMapEntry",
      "org.apache.commons.collections4.functors.FalsePredicate",
      "org.apache.commons.collections4.map.AbstractReferenceMap",
      "org.apache.commons.collections4.OrderedMap",
      "org.apache.commons.collections4.functors.OrPredicate",
      "org.apache.commons.collections4.map.AbstractMapTest",
      "org.apache.commons.collections4.map.UnmodifiableSortedMap",
      "org.apache.commons.collections4.bidimap.AbstractOrderedBidiMapDecorator",
      "org.apache.commons.collections4.map.TransformedMap",
      "org.apache.commons.collections4.OrderedMapIterator",
      "org.apache.commons.collections4.bidimap.TreeBidiMap$ValueView",
      "org.apache.commons.collections4.bidimap.TreeBidiMap$View",
      "org.apache.commons.collections4.IterableMap",
      "org.apache.commons.collections4.IterableGet",
      "org.apache.commons.collections4.map.LRUMapTest$MockLRUMapSubclass",
      "org.apache.commons.collections4.Predicate",
      "org.apache.commons.collections4.bidimap.TreeBidiMap$DataElement",
      "org.apache.commons.collections4.functors.IfClosure",
      "org.apache.commons.collections4.trie.AbstractPatriciaTrie$TrieEntry",
      "org.apache.commons.collections4.trie.AbstractPatriciaTrie$Reference",
      "org.apache.commons.collections4.keyvalue.UnmodifiableMapEntry",
      "org.apache.commons.collections4.map.MultiValueMap",
      "org.apache.commons.collections4.bidimap.TreeBidiMap$KeyView",
      "org.apache.commons.collections4.bidimap.TreeBidiMap$EntryView",
      "org.apache.commons.collections4.BidiMap",
      "org.apache.commons.collections4.keyvalue.DefaultKeyValue",
      "org.apache.commons.collections4.Unmodifiable",
      "org.apache.commons.collections4.bidimap.AbstractDualBidiMap",
      "org.apache.commons.collections4.bidimap.TreeBidiMap",
      "org.apache.commons.collections4.map.MultiKeyMap",
      "org.apache.commons.collections4.functors.InvokerTransformer",
      "org.apache.commons.collections4.trie.AbstractPatriciaTrie$RangeMap",
      "org.apache.commons.collections4.ResettableIterator",
      "org.apache.commons.collections4.bidimap.DualTreeBidiMap$ViewMap",
      "org.apache.commons.collections4.keyvalue.AbstractMapEntryDecorator",
      "org.apache.commons.collections4.map.IdentityMap$IdentityEntry",
      "org.apache.commons.collections4.map.UnmodifiableEntrySet$UnmodifiableEntry",
      "org.apache.commons.collections4.OrderedIterator",
      "org.apache.commons.collections4.SortedBidiMap",
      "org.apache.commons.collections4.map.AbstractReferenceMap$ReferenceMapIterator",
      "org.apache.commons.collections4.trie.AbstractBitwiseTrie",
      "org.apache.commons.collections4.functors.ExceptionPredicate",
      "org.apache.commons.collections4.functors.ClosureTransformer",
      "org.apache.commons.collections4.ClosureUtilsTest$MockClosure",
      "org.apache.commons.collections4.functors.EqualPredicate",
      "org.apache.commons.collections4.map.AbstractInputCheckedMapDecorator$MapEntry",
      "org.apache.commons.collections4.multimap.AbstractMultiValuedMap$MultiValuedMapEntry",
      "org.apache.commons.collections4.bidimap.TreeBidiMap$ViewMapIterator",
      "org.apache.commons.collections4.trie.AbstractBitwiseTrie$BasicEntry",
      "org.apache.commons.collections4.functors.TransformerPredicate",
      "org.apache.commons.collections4.map.PassiveExpiringMap$ExpirationPolicy",
      "org.apache.commons.collections4.functors.PrototypeFactory$PrototypeSerializationFactory",
      "org.apache.commons.collections4.OrderedBidiMap",
      "org.apache.commons.collections4.functors.PredicateDecorator",
      "org.apache.commons.collections4.functors.AnyPredicate",
      "org.apache.commons.collections4.functors.CloneTransformer",
      "org.apache.commons.collections4.Transformer",
      "org.apache.commons.collections4.multimap.AbstractMultiValuedMap$KeysMultiSet$MapEntryTransformer",
      "org.apache.commons.collections4.trie.AbstractPatriciaTrie$Values",
      "org.apache.commons.collections4.functors.NOPClosure",
      "org.apache.commons.collections4.keyvalue.TiedMapEntry",
      "org.apache.commons.collections4.map.FixedSizeMap",
      "org.apache.commons.collections4.map.AbstractIterableMapTest",
      "org.apache.commons.collections4.trie.AbstractPatriciaTrie$RangeEntryMap",
      "org.apache.commons.collections4.trie.AbstractPatriciaTrie$EntrySet",
      "org.apache.commons.collections4.map.UnmodifiableMap",
      "org.apache.commons.collections4.map.AbstractReferenceMap$ReferenceBaseIterator",
      "org.apache.commons.collections4.MapIterator",
      "org.apache.commons.collections4.bidimap.AbstractBidiMapDecorator",
      "org.apache.commons.collections4.map.ListOrderedMap$ListOrderedMapEntry",
      "org.apache.commons.collections4.functors.SwitchTransformer",
      "org.apache.commons.collections4.map.LinkedMap",
      "org.apache.commons.collections4.trie.PatriciaTrie",
      "org.apache.commons.collections4.functors.NOPTransformer",
      "org.apache.commons.collections4.Closure",
      "org.apache.commons.collections4.trie.AbstractPatriciaTrie$TrieIterator",
      "org.apache.commons.collections4.bidimap.AbstractOrderedBidiMapDecoratorTest$TestOrderedBidiMap",
      "org.apache.commons.collections4.iterators.ObjectGraphIteratorTest$Forest",
      "org.apache.commons.collections4.FunctorException",
      "org.apache.commons.collections4.map.AbstractLinkedMap$LinkIterator",
      "org.apache.commons.collections4.map.AbstractIterableMap",
      "org.apache.commons.collections4.Factory",
      "org.apache.commons.collections4.functors.NotPredicate",
      "org.apache.commons.collections4.functors.ChainedClosure",
      "org.apache.commons.collections4.functors.SwitchClosure",
      "org.apache.commons.collections4.map.AbstractSortedMapDecorator",
      "org.apache.commons.collections4.map.HashedMap",
      "org.apache.commons.collections4.functors.TransformedPredicate",
      "org.apache.commons.collections4.functors.AllPredicate",
      "org.apache.commons.collections4.functors.ConstantFactory",
      "org.apache.commons.collections4.map.AbstractReferenceMap$ReferenceStrength",
      "org.apache.commons.collections4.map.AbstractHashedMap$HashIterator",
      "org.apache.commons.collections4.MultiMap",
      "org.apache.commons.collections4.map.AbstractInputCheckedMapDecorator",
      "org.apache.commons.collections4.trie.AbstractPatriciaTrie$TrieMapIterator",
      "org.apache.commons.collections4.functors.NullIsExceptionPredicate",
      "org.apache.commons.collections4.keyvalue.AbstractMapEntry",
      "org.apache.commons.collections4.map.AbstractReferenceMap$SoftRef",
      "org.apache.commons.collections4.functors.MapTransformer",
      "org.apache.commons.collections4.collection.PredicatedCollectionBuilderTest$OddPredicate",
      "org.apache.commons.collections4.map.StaticBucketMap$Node",
      "org.apache.commons.collections4.map.LRUMap",
      "org.apache.commons.collections4.Equator",
      "org.apache.commons.collections4.map.LRUMapTest$MockLRUMapSubclassBlocksRemove",
      "org.apache.commons.collections4.Get",
      "org.apache.commons.collections4.functors.TransformerClosure",
      "org.apache.commons.collections4.functors.ComparatorPredicate",
      "org.apache.commons.collections4.map.AbstractHashedMap$Values",
      "org.apache.commons.collections4.iterators.ObjectGraphIteratorTest$Tree",
      "org.apache.commons.collections4.IterableSortedMap",
      "org.apache.commons.collections4.map.LRUMapTest$MockLRUMapSubclassFirstBlocksRemove",
      "org.apache.commons.collections4.functors.InstantiateFactory",
      "org.apache.commons.collections4.map.AbstractReferenceMap$ReferenceEntrySetIterator",
      "org.apache.commons.collections4.collection.TransformedCollectionTest$StringToInteger",
      "org.apache.commons.collections4.bidimap.TreeBidiMap$ViewMapEntryIterator",
      "org.apache.commons.collections4.functors.CatchAndRethrowClosure",
      "org.apache.commons.collections4.keyvalue.MultiKey",
      "org.apache.commons.collections4.map.AbstractOrderedMapTest",
      "org.apache.commons.collections4.trie.AbstractPatriciaTrie",
      "org.apache.commons.collections4.map.LazySortedMap",
      "org.apache.commons.collections4.map.LRUMapTest",
      "org.apache.commons.collections4.bidimap.DualTreeBidiMap",
      "org.apache.commons.collections4.map.AbstractReferenceMap$ReferenceEntrySet",
      "org.apache.commons.collections4.map.AbstractReferenceMap$ReferenceEntry",
      "org.apache.commons.collections4.ClosureUtilsTest",
      "org.apache.commons.collections4.iterators.ObjectGraphIteratorTest$Branch",
      "org.apache.commons.collections4.iterators.ObjectGraphIteratorTest$LeafFinder",
      "org.apache.commons.collections4.bidimap.UnmodifiableSortedBidiMap",
      "org.apache.commons.collections4.functors.NullIsTruePredicate",
      "org.apache.commons.collections4.map.AbstractReferenceMap$ReferenceValues",
      "org.apache.commons.collections4.map.DefaultedMap",
      "org.apache.commons.collections4.map.AbstractHashedMap$KeySet",
      "org.apache.commons.collections4.keyvalue.AbstractKeyValue",
      "org.apache.commons.collections4.map.AbstractOrderedMapDecorator",
      "org.apache.commons.collections4.functors.ExceptionFactory",
      "org.apache.commons.collections4.functors.UniquePredicate",
      "org.apache.commons.collections4.map.PassiveExpiringMapTest$TestExpirationPolicy",
      "org.apache.commons.collections4.bidimap.TreeBidiMap$InverseViewMapIterator",
      "org.apache.commons.collections4.trie.AbstractPatriciaTrie$PrefixRangeMap",
      "org.apache.commons.collections4.bidimap.TreeBidiMap$Inverse",
      "org.apache.commons.collections4.map.AbstractHashedMap$EntrySet",
      "org.apache.commons.collections4.ClosureUtilsTest$MockTransformer",
      "org.apache.commons.collections4.trie.analyzer.StringKeyAnalyzer",
      "org.apache.commons.collections4.trie.AbstractPatriciaTrie$PrefixRangeEntrySet",
      "org.apache.commons.collections4.map.FixedSizeSortedMap",
      "org.apache.commons.collections4.map.AbstractReferenceMap$ReferenceKeySet",
      "org.apache.commons.collections4.functors.AbstractQuantifierPredicate",
      "org.apache.commons.collections4.bidimap.TreeBidiMap$InverseViewMapEntryIterator",
      "org.apache.commons.collections4.functors.ExceptionClosure",
      "org.apache.commons.collections4.functors.FactoryTransformer",
      "org.apache.commons.collections4.functors.ForClosure",
      "org.apache.commons.collections4.map.LRUMapTest$SingleHashCode",
      "org.apache.commons.collections4.functors.StringValueTransformer",
      "org.apache.commons.collections4.iterators.ObjectGraphIteratorTest",
      "org.apache.commons.collections4.functors.InstantiateTransformer",
      "org.apache.commons.collections4.functors.PrototypeFactory$PrototypeCloneFactory",
      "org.apache.commons.collections4.functors.ConstantTransformer",
      "org.apache.commons.collections4.functors.ExceptionTransformer",
      "org.apache.commons.collections4.map.PredicatedSortedMap",
      "org.apache.commons.collections4.BoundedMap",
      "org.apache.commons.collections4.collection.IndexedCollectionTest$IntegerTransformer",
      "org.apache.commons.collections4.Put",
      "org.apache.commons.collections4.AbstractObjectTest",
      "org.apache.commons.collections4.map.IdentityMap",
      "org.apache.commons.collections4.map.PredicatedMap",
      "org.apache.commons.collections4.map.AbstractHashedMap$EntrySetIterator",
      "org.apache.commons.collections4.map.AbstractLinkedMap$LinkEntry",
      "org.apache.commons.collections4.map.UnmodifiableOrderedMap",
      "org.apache.commons.collections4.map.LazyMap"
    );
  } 

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(AbstractMapDecorator_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "org.apache.commons.collections4.map.AbstractIterableMap",
      "org.apache.commons.collections4.map.AbstractMapDecorator"
    );
  }
}