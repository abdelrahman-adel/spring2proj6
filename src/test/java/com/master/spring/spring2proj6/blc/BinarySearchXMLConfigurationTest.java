package com.master.spring.spring2proj6.blc;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import com.master.spring.spring2proj6.blc.BinarySearchImpl;

@RunWith(SpringRunner.class)
@ContextConfiguration(locations = { "/testContext.xml" })
public class BinarySearchXMLConfigurationTest {

	@Autowired
	BinarySearchImpl binarySearch;

	@Test
	public void testBinarySearch() {
		int result = binarySearch.binarySearch(new int[] {}, 3);
		assertEquals(3, result);
	}

}
