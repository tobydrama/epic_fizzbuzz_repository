package fizzbuzz;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class testFizz {
	

	@Test	
	void try3() {
		fizzbuzz fizz 	= new fizzbuzz();
		assertEquals("fizz",fizz.fizz(3));
	}
	@Test
	void tryTurningOneToString() {
		fizzbuzz fizz 	= new fizzbuzz();
		assertEquals("1",fizz.fizz(1));
		
	}
	@Test
	void try5() {
		fizzbuzz fizz 	= new fizzbuzz();
		assertEquals("buzz",fizz.fizz(5)); 
	}
	@Test
	void tryThreeAndFive() {
		fizzbuzz fizz 	= new fizzbuzz();
		assertEquals("fizzbuzz",fizz.fizz(15));
		assertEquals("fizzbuzz",fizz.fizz(30));
		}
	void try0() {
		fizzbuzz fizz 	= new fizzbuzz();
		assertEquals("0",fizz.fizz(0));		
	}
	

}
