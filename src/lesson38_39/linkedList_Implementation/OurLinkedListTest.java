package lesson38_39.linkedList_Implementation;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OurLinkedListTest {

    private OurLinkedList<Integer> list;

    @BeforeEach
    public void init() {
        list = new OurLinkedList<>();
    }

    @Test
    public void testAppendGet_emptyList_addsOneElement() {
        list.append(5);

        assertEquals(5, list.get(0));
    }

    @Test
    public void testAppendGet_emptyList_addsSeveralElts() {

        Integer[] expected = {2, 3, -1, 4, 23, 1, 3, 4, 5, 6, -17, 22, 26, 65, 15, 21};
        for (int i = 0; i < expected.length; i++) {
            list.append(expected[i]);
        }

        for (int i = 0; i < expected.length; i++) {
            assertEquals(expected[i], list.get(i));
        }
    }

    @Test
    public void testSize_emptyList_appendsOne(){
            list.append(5);

            assertEquals(1, list.size());
    }

    @Test
    public void testSize_emptyList_addsSeveralElts() {

        Integer[] expected = {2, 3, -1, 4, 23, 1, 3, 4, 5, 6, -17, 22, 26, 65, 15, 21};
        for (int i = 0; i < expected.length; i++) {
            list.append(expected[i]);
        }
            assertEquals(expected.length, list.size());
    }

    @Test
    public void testSet_oneElement_swapsElement(){
        list.append(0);
        list.set(10, 0);
        assertEquals(10, list.get(0));
    }

    @Test
    public void testSet_severalElements_swapFirstLasrMiddleElts(){
        Integer[] source = {1, 2, -17, 18, 6};
        for (int i = 0; i < source.length; i++) {
            list.append(source[i]);
        }
        list.set(10,0);
        list.set(100,4);
        list.set(-1000,2);

        Integer[] expected = {10, 2, -1000, 18, 100};

        for (int i = 0; i < expected.length; i++) {
            assertEquals(expected[i], list.get(i));
        }
    }

    @Test
    public void testRemoveById_nonEmptyList_removeFirst(){
        Integer[] source = {1, 2, -17, 18, 6};
        for (int i = 0; i < source.length; i++) {
            list.append(source[i]);
        }
        Integer val = list.removeByID(0);
        assertEquals(1, val);

        Integer[] expected = {2, -17, 18, 6};
        for (int i = 0; i < expected.length; i++) {
            assertEquals(expected[i], list.get(i));
        }

        assertEquals(4, list.size());
    }

    @Test
    public void testRemoveById_nonEmptyList_removeMiddle(){
        Integer[] source = {1, 2, -17, 18, 6};
        for (int i = 0; i < source.length; i++) {
            list.append(source[i]);
        }
        Integer val = list.removeByID(2);
        assertEquals(-17, val);

        Integer[] expected = {1, 2, 18, 6};
        for (int i = 0; i < expected.length; i++) {
            assertEquals(expected[i], list.get(i));
        }

        assertEquals(4, list.size());
    }

    @Test
    public void testRemoveById_nonEmptyList_removeLast(){
        Integer[] source = {1, 2, -17, 18, 6};
        for (int i = 0; i < source.length; i++) {
            list.append(source[i]);
        }
        Integer val = list.removeByID(4);
        assertEquals(6, val);

        Integer[] expected = {1, 2, -17, 18};
        for (int i = 0; i < expected.length; i++) {
            assertEquals(expected[i], list.get(i));
        }

        assertEquals(4, list.size());
    }
    @Test
    public void testRemove_nonEmptyList_removeLast(){
        Integer[] source = {1, 2, -17, 18, 6};
        for (int i = 0; i < source.length; i++) {
            list.append(source[i]);
        }

        boolean removed = list.remove(6);
        assertTrue(removed);

        Integer[] expected = {1, 2, -17, 18};
        for (int i = 0; i < expected.length; i++) {
            assertEquals(expected[i], list.get(i));
        }

        assertEquals(4, list.size());
    }

    @Test
    public void testRemove_nonEmptyList_removeMiddle(){
        Integer[] source = {1, 2, -17, 18, 6};
        for (int i = 0; i < source.length; i++) {
            list.append(source[i]);
        }

        boolean removed = list.remove(-17);
        assertTrue(removed);

        Integer[] expected = {1, 2, 18, 6};
        for (int i = 0; i < expected.length; i++) {
            assertEquals(expected[i], list.get(i));
        }

        assertEquals(4, list.size());
    }

    @Test
    public void testRemove_nonEmptyList_removeFirst(){
        Integer[] source = {1, 2, -17, 18, 6};
        for (int i = 0; i < source.length; i++) {
            list.append(source[i]);
        }

        boolean removed = list.remove(1);
        assertTrue(removed);

        Integer[] expected = {2, -17, 18, 6};
        for (int i = 0; i < expected.length; i++) {
            assertEquals(expected[i], list.get(i));
        }

        assertEquals(4, list.size());
    }

    @Test
    public void testContains_nonEmptyList_containsElts(){
        Integer[] source = {1, 2, -17, 18, 6};
        for (int i = 0; i < source.length; i++) {
            list.append(source[i]);
        }
        assertTrue(list.contains(1));
        assertTrue(list.contains(2));
        assertTrue(list.contains(-17));
        assertTrue(list.contains(18));
        assertTrue(list.contains(6));

    }

    @Test
    public void testNotContains_nonEmptyList_containsElts(){
        Integer[] source = {1, 2, -17, 18, 6};
        for (int i = 0; i < source.length; i++) {
            list.append(source[i]);
        }
        assertFalse(list.contains(11));
        assertFalse(list.contains(12));
        assertFalse(list.contains(-117));
        assertFalse(list.contains(118));
        assertFalse(list.contains(16));

    }


}