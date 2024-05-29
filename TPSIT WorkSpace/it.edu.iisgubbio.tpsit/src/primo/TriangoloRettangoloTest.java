package primo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TriangoloRettangoloTest {

	TriangoloRettangolo ret = new TriangoloRettangolo(3,4);
	
	@Test

	void testarea() {
		assertEquals(6,ret.calcolaArea(),"Regolar area calcolation");
	}
	
	@Test

	void testperimetro() {
		assertEquals(12,ret.ipotenusa(),"Regolar area calcolation");
	}
}
