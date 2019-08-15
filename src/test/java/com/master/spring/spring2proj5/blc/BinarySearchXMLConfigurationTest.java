package com.master.spring.spring2proj5.blc;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import com.master.spring.spring2proj6.blc.BinarySearchImpl;
import com.master.spring.spring2proj6.main.Spring2proj6Application;

@RunWith(SpringRunner.class)
@ContextConfiguration(classes = Spring2proj6Application.class)
public class BinarySearchXMLConfigurationTest {

	@Autowired
	BinarySearchImpl binarySearch;

	@Test
	public void testBinarySearch() {
		int result = binarySearch.binarySearch(new int[] {}, 3);
		assertEquals(3, result);
	}

}
