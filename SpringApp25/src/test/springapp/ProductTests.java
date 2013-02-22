package test.springapp;

import springapp.domain.Product;
import junit.framework.TestCase;

public class ProductTests extends TestCase {

	private Product product;

	protected void setUp() throws Exception {
		product = new Product();
	}

	public void testSetAndGetDescription() {

		assertNull(product.getDescription());
		String description = "testDescription";
		product.setDescription(description);
		assertEquals("testDescription", product.getDescription());
	}

	public void testSetAndGetPrice() {
		assertEquals(0, 0, 0);
		double testPrice = 100.00;
		product.setPrice(testPrice);
		assertEquals(testPrice, product.getPrice(), 0);
	}
}
