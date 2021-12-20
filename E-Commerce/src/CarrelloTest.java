import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class CarrelloTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testCarrello() {
		Carrello carrello= new Carrello();
		int expected=0;
		assertEquals(expected,carrello.getamount());
		
	}

	@Test
	public void testGetamount() {
		
	}

	@Test
	public void testInsertOneProduct() {
		Carrello carrello=new Carrello();
		int expected=3;
		carrello.insertOneProduct();
		carrello.insertOneProduct();
		carrello.insertOneProduct();
		assertEquals(expected, carrello.getamount());
		
 	}

	@Test
	public void testRemoveOneProduct() {
		Carrello carrello= new Carrello();
		int expected=1;
		carrello.insertOneProduct();
		carrello.insertOneProduct();
		carrello.removeOneProduct();
		assertEquals(expected, carrello.getamount());
		System.out.println("Esempio di commit");
		System.out.println("MODIFICA LOCALE");



		System.out.println("Un bug-fix sul branch master");
	}
	}
	
