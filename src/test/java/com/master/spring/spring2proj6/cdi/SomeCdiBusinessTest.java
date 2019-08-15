package com.master.spring.spring2proj6.cdi;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class SomeCdiBusinessTest {

	@InjectMocks
	SomeCdiBusiness someCdiBusiness;

	@Mock
	SomeCdiDao someCdiDao;

	@Test
	public void testFindGreatest_BasicScenario() {
		when(someCdiDao.getData()).thenReturn(new int[] { 2, 4 });
		assertEquals(4, someCdiBusiness.findGreatest());
	}

	@Test
	public void testFindGreatest_NoElements() {
		when(someCdiDao.getData()).thenReturn(new int[] {});
		assertEquals(Integer.MIN_VALUE, someCdiBusiness.findGreatest());
	}

	@Test
	public void testFindGreatest_EqualElements() {
		when(someCdiDao.getData()).thenReturn(new int[] { 2, 2 });
		assertEquals(2, someCdiBusiness.findGreatest());
	}

}
