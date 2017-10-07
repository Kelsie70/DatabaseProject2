import static java.lang.System.out;
import static org.junit.Assert.*;

import java.util.Set;
import java.util.SortedMap;
import java.util.HashSet;
import java.util.Map;

import org.junit.Test;

public class BpTreeMapTest {

    /**
     *
     * Creates new Bplus tree for testing purposes
     *
     * @return Bplus tree
     *
     */

    public BpTreeMap createTree(){
	
	BpTreeMap <Integer, Integer> bpt = new BpTreeMap <> (Integer.class, Integer.class);
        
	int keys = 20;
        
        //add key/value pair to tree        
        for (int i = 1; i <= keys; i ++)
	    {
		bpt.put (i, i * 2);
	    }

        return bpt;
    }

    /**
     *
     * Tests the firstKey method
     *
     */

    @Test
	
    public void testFirstKey() {
	
	BpTreeMap <Integer, Integer> bpt = createTree();
	
	assertEquals(1, (int)bpt.firstKey() );
    }

    /**
     *
     * Tests the last key method
     *
     */

    @Test
	
    public void testLastKey() {
	
	BpTreeMap <Integer, Integer> bpt = createTree();
	
	assertEquals(20, (int)bpt.lastKey());
    }
    

    /**
     *
     * Tests the entrySet method 
     *
     */

    @Test
    
    public void testEntrySet() {

	BpTreeMap <Integer, Integer> bpt = createTree();
	Set<Map.Entry<Integer, Integer>> set = bpt.entrySet();
	
	assertEquals(20, set.size());
    }
    
    /**
     *
     * Tests the subMap method which is used in the head and tail map methods
     * as well
     *
     */

    @Test

    public void testSubMap() {

	BpTreeMap <Integer, Integer> bpt = createTree();
	BpTreeMap <Integer, Integer> subbpt = (BpTreeMap) bpt.subMap(3, 7);
	
	assertEquals(null, subbpt.get(2));
	assertEquals(9, (int) subbpt.get(3));
	assertEquals(null, subbpt.get(8));
    }
    
    /**
     *
     * Tests the size method
     *
     */

    @Test
    
    public void testSize() {

	BpTreeMap <Integer, Integer> bpt = createTree();
	
	assertEquals(20, tree.size());
    }

}