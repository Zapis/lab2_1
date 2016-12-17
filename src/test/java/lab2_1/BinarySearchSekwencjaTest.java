package lab2_1;
import static org.junit.Assert.*;
import org.junit.Test;
import edu.iis.mto.bsearch.BinarySearch;
import edu.iis.mto.bsearch.SearchResult;
import static org.hamcrest.CoreMatchers.*;

public class BinarySearchSekwencjaTest {

	int key = 4;
	int[] seq ={1,2,3,4};
	
	@Test
	public void KeyFoundInSec(){
		SearchResult searchResult = BinarySearch.search(key, seq);
		int i = searchResult.getPosition();
		assertTrue(searchResult.isFound());
		assertEquals(key, seq[i]);
}
	@Test
	public void KeyNotFoundInSec(){
		SearchResult searchResult = BinarySearch.search(key, seq);
		int i = searchResult.getPosition();
		assertFalse(searchResult.isFound());
		assertEquals(-1, i);
}
	@Test
	public void KeyFirstInSec(){	
		SearchResult searchResult =BinarySearch.search(key,seq);
		int i = searchResult.getPosition();
		assertTrue(searchResult.isFound());
		assertEquals(key, seq[i]);
		}
	
	@Test
	public void KeyLastInSec(){
		SearchResult searchResult =BinarySearch.search(key,seq);
		int i = searchResult.getPosition();
		assertTrue(searchResult.isFound());
		assertEquals(key,seq[i]);
		}
	
	@Test
	public void KeyInTheMiddleInSec(){
		SearchResult searchResult =BinarySearch.search(key,seq);
		int i = searchResult.getPosition();
		assertTrue(searchResult.isFound());
		assertEquals(key,seq[i]);
		}
	
	@Test
		public void KeyNotInSec(){
		SearchResult searchResult =BinarySearch.search(key,seq);
		int i = searchResult.getPosition();
		assertTrue(searchResult.isFound());
		assertEquals(key,seq[i]);
		}
	
}
