package mx.com.sidors;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import mx.com.sidors.method.factory.TVFactory;
import mx.com.sidors.method.factory.TVFactoryMethod;
import mx.com.sidors.method.factory.modelo.TVBase;

/**
 * Unit test for simple App.
 */
public class AppTest extends TestCase {
	
	private static final String DESCRIPCION="Descripcion: 40 pulgadas, 256 M. Colores Tipo de pantalla: lcd Color: Negro";
	/**
	 * Create the test case
	 *
	 * @param testName
	 *            name of the test case
	 */
	public AppTest(String testName) {
		super(testName);
	}

	/**
	 * @return the suite of tests being tested
	 */
	public static Test suite() {
		return new TestSuite(AppTest.class);
	}

	/**
	 * Rigourous Test :-)
	 */
	public void testApp() {
		TVFactoryMethod tvMethod = new TVFactory();
		TVBase tv = tvMethod.obtenerTV("Negro", "40 pulgadas, 256 M. Colores", "lcd");
		System.out.println(tv.verDescripcion());
		assertTrue(DESCRIPCION.equals(tv.verDescripcion()));
	}
}
