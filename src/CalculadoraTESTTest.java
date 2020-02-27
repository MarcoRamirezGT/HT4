import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculadoraTESTTest {

	@Test
	public void sumar() {
		double a = 5.3; 
		double b = 5.3; 
		Calculadora test = new Calculadora();
		double res = test.sumar(a,b);
		assertEquals(res,10.6);
		
		
	}

}
