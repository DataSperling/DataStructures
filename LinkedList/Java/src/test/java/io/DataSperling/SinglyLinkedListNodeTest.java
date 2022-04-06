package io.DataSperling;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assumptions.assumeTrue;

import org.junit.jupiter.api.*;
import org.junit.jupiter.api.condition.EnabledOnOs;
import org.junit.jupiter.api.condition.OS;

import java.util.Arrays;
import java.util.NoSuchElementException;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
@DisplayName("When running SinglyLinkedListTests")
class SinglyLinkedListNodeTest {

    SinglyLinkedList<String> singlyLinkedList;
    TestInfo testInfo;
    TestReporter testReporter;

    @BeforeAll
    void beforeAll() { System.out.println("This needs to run before all");
    }

    @BeforeEach
    void init(TestInfo testInfo, TestReporter testReporter) {
        this.testInfo = testInfo;
        this.testReporter = testReporter;
        testReporter.publishEntry(
                "Running " + testInfo.getDisplayName() +
                     " with tags " + testInfo.getTags()
                );
        System.out.println(" creating new SinglyLinkedList ...");
        singlyLinkedList = new SinglyLinkedList();
    }

    /*
    * inner class for node tests
     */
    @Nested
    @DisplayName("SLLNode pointers")
    @Tag("node")
    class nodeTest {

        @Test
        @DisplayName(" test empty node")
        void testNullPointersEmptyList() {
            assertNull(singlyLinkedList.getHead());
            assertNull(singlyLinkedList.getTail());
            assertEquals(singlyLinkedList.getSize(), 0, " SLL size should be zero as empty");
        }
    }

    /*
    * inner class to test addToFront()
    */
    @Nested
    @DisplayName("addToFront()")
    @Tag("addToList")
    class addToFrontTest {

        @Test
        @DisplayName("When adding to FRONT of an empty SinglyLinkedList")
        void testAddToFrontEmpty() {
            singlyLinkedList.addToFront("www.ineos.no");

            assertThrows(IllegalArgumentException.class, () -> singlyLinkedList.addToFront(null));
            assertEquals(singlyLinkedList.getSize(), 1);
            assertEquals(singlyLinkedList.getHead().getData(), "www.ineos.no");
            assertEquals(singlyLinkedList.getTail().getData(), "www.ineos.no");
            assertNull(singlyLinkedList.getHead().getNext());
            assertNull(singlyLinkedList.getTail().getNext());
        }

        @Test
        @DisplayName("When adding to FRONT of a SinglyLinkedList with one or more nodes")
        void testAddToFrontOneOrMoreNodes() {
            singlyLinkedList.addToFront("www.ineos.no");
            singlyLinkedList.addToFront("www.zollsoft.de");

            assertEquals(singlyLinkedList.getSize(), 2);
            assertEquals(singlyLinkedList.getHead().getData(), "www.zollsoft.de");
            assertEquals(singlyLinkedList.getTail().getData(), "www.ineos.no");
            assertEquals(singlyLinkedList.getHead().getNext().getData(), singlyLinkedList.getTail().getData() );
            assertNull(singlyLinkedList.getTail().getNext());
        }
    }

    /*
    * inner class to test addToBack()
    */
    @Nested
    @DisplayName("addToBack()")
    @Tag("addToList")
    class addToBackTest {

        @Test
        @DisplayName("When adding to BACK of empty SLL")
        void testAddToBackEmpty() {
            singlyLinkedList.addToBack("www.stackoverflow.com");

            assertThrows(IllegalArgumentException.class, () -> singlyLinkedList.addToBack(null));
            assertEquals(singlyLinkedList.getSize(), 1);
            assertEquals(singlyLinkedList.getHead().getData(), "www.stackoverflow.com");
            assertEquals(singlyLinkedList.getTail().getData(), "www.stackoverflow.com");
            assertNull(singlyLinkedList.getHead().getNext());
            assertNull(singlyLinkedList.getTail().getNext());

        }

        @Test
        @DisplayName("When adding to BACK of a SinglyLinkedList with one or more nodes")
        void testAddToBackOneOrMoreNodes() {
            singlyLinkedList.addToBack("www.stackoverflow.com");
            singlyLinkedList.addToBack("www.github.com");

            assertEquals(singlyLinkedList.getSize(), 2);
            assertEquals(singlyLinkedList.getHead().getData(), "www.stackoverflow.com");
            assertEquals(singlyLinkedList.getTail().getData(), "www.github.com");
            assertEquals(singlyLinkedList.getHead().getNext().getData(), singlyLinkedList.getTail().getData() );
            assertNull(singlyLinkedList.getTail().getNext());
        }
    }

    /*
    * inner class to test addBefore()
    */
    @Nested
    @DisplayName("addBefore()")
    @Tag("addToList")
    class testAddBefore {

        @Test
        @DisplayName("When adding BEFORE on empty SLL")
        void testAddBefore() {

            assertThrows(IllegalArgumentException.class, () ->
                    singlyLinkedList.addBefore("www.askubuntu.com", null));

            assertThrows(NoSuchElementException.class, () ->
                    singlyLinkedList.addBefore("www.askubuntu.com", "www.code.google.com"));

        assertEquals(singlyLinkedList.getSize(), 0);
        }

        @Test
        @DisplayName("When adding BEFORE last node")
        void testAddBeforeLastNode() {

            singlyLinkedList.addToBack("www.ibm.com");
            singlyLinkedList.addToBack("www.kdnuggets.com");
            singlyLinkedList.addToBack("www.cran.r-project.org");
            singlyLinkedList.addToBack("www.knime.com");
            singlyLinkedList.addToBack("www.oracle.com");
            singlyLinkedList.addToBack("www.superuser.com");
            singlyLinkedList.addBefore("www.superuser.com", "www.intel.com");

            SinglyLinkedListNode current = singlyLinkedList.getHead();
            while (current.getNext().getData() != "www.superuser.com") {
                current = current.getNext();
            }
            assertEquals(current.getData(), "www.intel.com");
            assertEquals(singlyLinkedList.getHead().getData(), "www.ibm.com");
            assertEquals(singlyLinkedList.getTail().getData(), "www.superuser.com");
            assertEquals(singlyLinkedList.getSize(), 7);




        }
    }

}