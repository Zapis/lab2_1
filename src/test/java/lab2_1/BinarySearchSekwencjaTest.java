package lab2_1;

import static org.junit.Assert.*;

import org.hamcrest.Matcher;
import org.junit.Test;
import static org.hamcrest.CoreMatchers.*;
import edu.iis.mto.bsearch.BinarySearch;
import edu.iis.mto.bsearch.SearchResult;

public class BinarySearchSekwencjaTest {

	/*@Test
	public void KeyFoundInSec(){
		int key = 4;
		int[] seq = {4};

		SearchResult searchResult = BinarySearch.search(key, seq);
		int i = searchResult.getPosition();

		assertTrue(searchResult.isFound());
		assertEquals(key, seq[i]);
}*/
	/*@Test
	public void KeyNotFoundInSec(){
		int key = 6;
		int[] seq = {4};

		SerchResult searchResult = BinarySearch.search(key, seq);
		int i = searchResult.getPosition();

		assertFalse(searchResult.isFound());
		assertEquals(-1, i);
}
	@Test
	public void KeyFirstInSec(){
		int key = 1;
		int[] seq = {1,3,4,5,9};
		
		SearchResult searchResult =BinarySearch.search(key,seq);
		int i = searchResult.getPosition();
		assertTrue(searchResult.isFound());
		assertEquals(key, seq[i]);
		}
	*/
	@Test
	public void KeyLastInSec(){
		int key = 5;
		int[] seq = {5,2,1,4,3};
		SearchResult searchResult =BinarySearch.search(key,seq);
		int i = searchResult.getPosition();
		assertTrue(searchResult.isFound());
		assertEquals(key,seq[i]);
		}
	
	@Test
		public void KeyLastInSecHeu(){
		int key = 1;
		int[] seq={5,2,1,4,3};
		assertThat(key,is(seq[3]));
	}
	/*
	@Test
	public void KeyInTheMiddleInSec(){
		int key = 4;
		int[] seq = {1,3,4,5,6};
		SearchResult searchResult =BinarySearch.search(key,seq);
		int i = searchResult.getPosition();
		assertTrue(searchResult.isFound());
		assertEquals(key,seq[i]);
		}
	
	@Test
	public void KeyNotInSec(){
		int key = 2;
		int[] seq = {1,3,4,5,6};
		SearchResult searchResult =BinarySearch.search(key,seq);
		int i = searchResult.getPosition();
		assertTrue(searchResult.isFound());
		assertEquals(key,seq[i]);
		}
	*/


	}

