package com.sidlors.builder.app.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.sidlors.builder.NutritionFacts;

public class NutritionFactsTest {

	@Test
	public void test() {
		NutritionFacts cocaCola = new NutritionFacts.Builder(240, 8).
				calories(100).sodium(35).carbohydrate(27).build();
		
		assertEquals(100,cocaCola.getCalories());
		assertEquals(35,cocaCola.getSodium());
		assertEquals(27,cocaCola.getCarbohydrate());
		
	}

}
