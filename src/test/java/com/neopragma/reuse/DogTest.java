package com.neopragma.reuse;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class DogTest {
	
	private Dog dog;
	
	@Before
	public void beforeEach() {
		dog = new Dog("Fido", Breed.MUTT);
	}
	
	@Test
	public void itSaysWoof() {
		assertEquals("Woof!", dog.bark());
	}
	
	@Test
	public void itCanWalkFiftyStepsAndBeReadyForAction() {
		dog.walk(50);
		assertTrue(dog.isReadyForAction());
	}
	
	@Test
	public void after100StepsItMustRecuperate() {
		dog.walk(100);
		assertFalse(dog.isReadyForAction());
	}
	
	@Test
	public void afterItDrinksItCanPlayAgain() {
		dog.walk(100);
		dog.drink(34);
		assertTrue(dog.isReadyForAction());
	}

}
