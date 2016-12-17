package lab2_1;

import static org.junit.Assert.*;

import org.junit.Test;

import edu.iis.mto.bsearch.BinarySearch;
import edu.iis.mto.bsearch.SearchResult;

public class BinarySearchSekwencjaTest {

	@Test
	public void matchingKeyShouldBeFoundInSingleElementSequence(){
		int key = 4;
		int[] seq = {4};

		SearchResult searchResult = BinarySearch.search(key, seq);
		int i = searchResult.getPosition();

		assertTrue(searchResult.isFound());
		assertEquals(key, seq[i]);
}
	
	
		
	
}
