package com.master.spring.spring2proj5.blc;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
@Primary
public class QuickSortAlgorithm implements SortAlgorithm {

	@Override
	public int[] sort(int[] numbers) {
		return numbers;
	}
}
