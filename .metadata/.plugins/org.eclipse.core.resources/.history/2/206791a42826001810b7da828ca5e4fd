package test.cst8284.shape;
import cst8284.shape.*;
import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestBasicShape {

	@Test
	void TestInstaceOf() {
		Rectangle c = new Rectangle();
		assertTrue(c instanceof Square);
	}
	
	@Test
	void TestEquals() {
		Circle a = new Circle(3);
		Square b = new Square(3);
		assertFalse(a.equals(b));
	}
	
	@Test
	void TestEqualsII() {
		Circle a = new Circle(3);
		Circle b = new Circle(a);
		assertTrue(a.equals(b));
	}

}
