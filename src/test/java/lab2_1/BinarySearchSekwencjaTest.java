package lab2_1;
import static org.junit.Assert.*;
import org.junit.Test;
import edu.iis.mto.bsearch.BinarySearch;
import edu.iis.mto.bsearch.SearchResult;
import static org.hamcrest.CoreMatchers.*;

public class BinarySearchSekwencjaTest {

	int key = 3;
	int[] seq ={1,2,3,4,5};
	
	@Test
	public void keyFoundInSec2(){
		SearchResult searchResult = BinarySearch.search(key, seq);
		int i = searchResult.getPosition();
		assertThat(key,is(seq[i-1]));
	}
	
	@Test
	public void KeyFoundInSec(){
		SearchResult searchResult = BinarySearch.search(key, seq);
		int i = searchResult.getPosition();
		assertTrue(searchResult.isFound());
		assertEquals(key, seq[i-1]);}
		
		@Test
		public void keyNotFoundInSec2(){
			SearchResult searchResult = BinarySearch.search(key, seq);
			int i = searchResult.getPosition();
			assertThat(key,is(seq[i-1]));
}
	@Test
	public void KeyNotFoundInSec(){
		SearchResult searchResult = BinarySearch.search(key, seq);
		int i = searchResult.getPosition();
		assertFalse(searchResult.isFound());
		assertEquals(-1, seq[i]);
}
	@Test
	public void KeyFirstInSec(){	
		SearchResult searchResult =BinarySearch.search(key,seq);
		int i = searchResult.getPosition();
		assertTrue(searchResult.isFound());
		assertEquals(key, seq[i-1]);
		}
	
	@Test
	public void KeyLastInSec(){
		SearchResult searchResult =BinarySearch.search(key,seq);
		int i = searchResult.getPosition();
		assertTrue(searchResult.isFound());
		assertEquals(key,seq[i-1]);
		}
	
	@Test
	public void KeyInTheMiddleInSec(){
		SearchResult searchResult =BinarySearch.search(key,seq);
		int i = searchResult.getPosition();
		assertTrue(searchResult.isFound());
		assertEquals(key,seq[i-1]);
		}
	
	@Test
		public void KeyNotInSec(){
		SearchResult searchResult =BinarySearch.search(key,seq);
		int i = searchResult.getPosition();
		assertTrue(searchResult.isFound());
		assertEquals(key,seq[i-1]);
		}
	
}
