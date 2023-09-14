package lesson42.hashmap_implementation;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OurHashMapTest {

    @Test
    public void testSizePut_emptyMap_newElements() {
        OurMap<Integer, String> newMap = new OurHashMap<>();
        newMap.put(3, "a");
        newMap.put(2, "b");
        newMap.put(1, "c");

        assertEquals(3, newMap.size());
    }

    @Test
    public void testSizePut_emptyMap_noElements() {
        OurMap<Integer, String> newMap = new OurHashMap<>();

        assertEquals(0, newMap.size());
    }

    @Test
    public void testSizePut_NotemptyMap_nonExistKey() {
        OurMap<Integer, String> newMap = new OurHashMap<>();
        newMap.put(3, "a");
        newMap.put(2, "b");
        newMap.put(1, "c");

        assertEquals(3, newMap.size());

        newMap.put(6, "d");
        assertEquals(4, newMap.size());
    }

    @Test
    public void testSizePut_NotemptyMap_existKey() {
        OurMap<Integer, String> newMap = new OurHashMap<>();
        newMap.put(3, "a");
        newMap.put(2, "b");
        newMap.put(1, "c");

        assertEquals(3, newMap.size());

        newMap.put(2, "d");
        assertEquals(3, newMap.size());
    }

    @Test
    public void testGet_NotemptyMap_existKey() {
        OurMap<Integer, String> newMap = new OurHashMap<>();
        newMap.put(3, "a");
        newMap.put(2, "b");
        newMap.put(1, "c");

        assertEquals("a", newMap.get(3));
        assertEquals("b", newMap.get(2));
        assertEquals("c", newMap.get(1));
    }

    @Test
    public void testGet_NotemptyMap_NonExistKey() {
        OurMap<Integer, String> newMap = new OurHashMap<>();
        newMap.put(3, "a");
        newMap.put(2, "b");
        newMap.put(1, "c");

        assertNull(newMap.get(4));
    }

    @Test
    public void testGet_emptyMap_NonExistKey() {
        OurMap<Integer, String> newMap = new OurHashMap<>();

        assertNull(newMap.get(4));
    }

    @Test
    public void testRemove_NotemptyMap_existKey() {
        OurMap<Integer, String> newMap = new OurHashMap<>();
        newMap.put(3, "a");
        newMap.put(2, "b");
        newMap.put(1, "c");
        assertEquals(3, newMap.size());
        newMap.remove(2);
        assertNull(newMap.get(2));
        assertEquals(2, newMap.size());
    }

    @Test
    public void testRemove_NotemptyMap_NonExistKey() {
        OurMap<Integer, String> newMap = new OurHashMap<>();
        newMap.put(3, "a");
        newMap.put(2, "b");
        newMap.put(1, "c");
        assertEquals(3, newMap.size());
        newMap.remove(4);
        assertNull(newMap.get(4));
        assertEquals(3, newMap.size());
    }
}